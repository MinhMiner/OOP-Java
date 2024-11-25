import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Layer extends JPanel implements KeyListener, MouseListener {
    private List<Shape> shapes = new ArrayList<>();
    private Random random = new Random();

    public Layer() {
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(this);
        addMouseListener(this);

        Timer timer = new Timer(10, e -> {
            for (Shape shape : shapes) {
                shape.move(getWidth(), getHeight());
            }
            repaint();
        });
        timer.start();
    }

    public List<Shape> copyShapes() {
        List<Shape> result = new ArrayList<>();
        for (Shape shape : shapes) {
            result.add(shape.clone());
        }
        return result;
    }

    /** Add a shape to the layer. */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /** Get all shapes info in the layer. */
    public String getInfo() {
        StringBuilder result = new StringBuilder("Layer of crazy shapes:");
        for (Shape s : shapes) {
            result.append("\n" + s.toString());
        }
        return result.toString();
    }

    /** Remove all circles in the layer. */
    public void removeCircles() {
        Iterator<Shape> it = shapes.iterator();
        while (it.hasNext()) {
            Shape temp = it.next();
            if (temp instanceof Circle) {
                it.remove();
            }
        }
    }

    /** Remove all duplicates in the layer. */
    public void removeDuplicates() {
        shapes = new ArrayList<>(new LinkedHashSet<>(shapes));
    }

    /** Paint shapes. */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    /** Add a random shape. */
    private void addRandomShape(char type) {
        int posX = random.nextInt(getWidth() - 200);
        int posY = random.nextInt(getHeight() - 200);
        int delX = random.nextInt(5) + 1;
        int delY = random.nextInt(5) + 1;
        boolean filled = random.nextBoolean();
        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        switch (type) {
            case 'C' -> shapes.add(new Circle(random.nextInt(80) + 20, 
                color, filled, new Point(posX, posY), new Velocity(delX, delY)));

            case 'R' -> shapes.add(new Rectangle(random.nextInt(80) + 20, random.nextInt(60) + 20,
                color, filled, new Point(posX, posY), new Velocity(delX, delY)));

            case 'S' -> shapes.add(new Square(random.nextInt(80) + 20,
                color, filled, new Point(posX, posY), new Velocity(delX, delY)));
        }
    }

    /** Key pressed event. */
    public void keyPressed(KeyEvent e) {
        char key = Character.toUpperCase(e.getKeyChar());
        if (key == 'C' || key == 'R' || key == 'S') {
            addRandomShape(key);
        } else if (key == 'D') {
            removeDuplicates();
        } else if (key == 'X') {
            removeCircles();
        } else if (key == 'P') {
            shapes.clear();
        }
    }

    /** Mouse pressed event. */
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        shapes.removeIf(shape -> shape.contains(mx, my));
        repaint();
    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
