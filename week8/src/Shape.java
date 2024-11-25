import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    protected Color color;
    protected boolean filled;
    protected Point topLeft;
    protected Velocity velocity;

    /** Default constructor. */
    public Shape() {

    }

    public Shape(Shape other) {
        this.color = other.color;
        this.filled = other.filled;
    }

    /** Constructor with color and filled variables. */
    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Constructor with color, filled, topLeft point and velocity fields. */
    public Shape(Color color, boolean filled, Point topLeft, Velocity velocity) {
        this.color = color;
        this.filled = filled;
        this.topLeft = topLeft;
        this.velocity = velocity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();

    public abstract double getPerimeter();

    /** toString() method. */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
    
    public abstract Shape clone();

    public abstract void draw(Graphics g);

    public abstract boolean contains(int mx, int my);

    /** Update position. */
    public void move(int width, int height) {
        topLeft.setPointX(topLeft.getPointX() + velocity.getVelocityX());
        topLeft.setPointY(topLeft.getPointY() + velocity.getVelocityY());

        if (topLeft.getPointX() < 0 || topLeft.getPointX() + getWidth() > width) {
            velocity.invertX();
        }

        if (topLeft.getPointY() < 0 || topLeft.getPointY() + getHeight() > height) {
            velocity.invertY();
        }
    }

    public abstract int getWidth();

    public abstract int getHeight();
}
