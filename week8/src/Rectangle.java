import java.awt.Color;
import java.awt.Graphics;
import java.util.Objects;

public class Rectangle extends Shape {
    protected int width;
    protected int height;

    /** Default constructor. */
    public Rectangle() {

    }

    public Rectangle(Rectangle other) {
        super(other);
        this.topLeft = other.topLeft;
        this.width = other.width;
        this.height = other.height;
    }

    /** Constructor with width and height. */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /** Constructor with Shape variables and width and height. */
    public Rectangle(int width, int height, Color color, boolean filled, 
    Point topLeft, Velocity velocity) {
        super(color, filled, topLeft, velocity);
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    /** Get the area of the rectangle. */
    public double getArea() {
        return width * height;
    }

    /** Get the perimeter of the rectangle. */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /** Draw method. */
    public void draw(Graphics g) {
        g.setColor(color);
        if (filled) {
            g.fillRect(topLeft.getPointX(), topLeft.getPointY(), width, height);
        } else {
            g.drawRect(topLeft.getPointX(), topLeft.getPointY(), width, height);
        }
    }

    /** Check if this rectangle contains a position. */
    public boolean contains(int mx, int my) {
        return mx >= topLeft.getPointX()
            && mx <= topLeft.getPointX() + width
            && my >= topLeft.getPointY()
            && my <= topLeft.getPointY() + height;
    }

    /** toString() method. */
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,height=%.1f,color=%s,filled=%b]",
            topLeft.toString(), width, height, color, filled);
    }

    /** Override equals method. */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        Rectangle temp = (Rectangle) o;

        if (this.width - temp.width >= 0.001) {
            return false;
        }

        if (this.height - temp.height >= 0.001) {
            return false;
        }

        return true;
    }

    /** Override hashCode(). */
    public int hashCode() {
        return Objects.hash(color, filled, width, height);
    }

    public Rectangle clone() {
        return new Rectangle(this);
    }
}
