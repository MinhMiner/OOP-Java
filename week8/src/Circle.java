import java.awt.Color;
import java.awt.Graphics;
import java.util.Objects;

public class Circle extends Shape {
    protected int radius;

    /** Default constructor. */
    public Circle() {

    }

    public Circle(Circle other) {
        super(other);
        this.topLeft = other.topLeft;
        this.radius = other.radius;
    }

    /** Constructor with radius. */
    public Circle(int radius) {
        this.radius = radius;
    }

    /** Constructor with radius and Shape variables. */
    public Circle(int radius, Color color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Constructor with radius and Shape variables. */
    public Circle(int radius, Color color, boolean filled, Point topLeft, Velocity velocity) {
        super(color, filled, topLeft, velocity);
        this.radius = radius;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    /** Get the area of the circle. */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Get the perimeter of the circle. */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Draw method. */
    public void draw(Graphics g) {
        g.setColor(color);
        if (filled) {
            g.fillOval(topLeft.getPointX(), topLeft.getPointY(), radius * 2, radius * 2);
        } else {
            g.drawOval(topLeft.getPointX(), topLeft.getPointY(), radius * 2, radius * 2);
        }
    }

    /** Check if this circle contains a position. */
    public boolean contains(int mx, int my) {
        Point center = new Point(topLeft.getPointX() + radius, topLeft.getPointY() + radius);
        Point temp = new Point(mx, my);
        return center.distance(temp) <= radius;
    }

    /** Get hitbox width. */
    public int getWidth() {
        return radius * 2;
    }

    /** Get hitbox height. */
    public int getHeight() {
        return radius * 2;
    }

    /** toString() method. */
    public String toString() {
        return String.format("Circle[topLeft=%s,radius=%.1f,color=%s,filled=%b]",
            topLeft.toString(), radius, color, filled);
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

        Circle temp = (Circle) o;
        return (this.radius - temp.radius < 0.001);
    }

    /** Override hashCode(). */
    public int hashCode() {
        return Objects.hash(color, filled, radius);
    }

    public Circle clone() {
        return new Circle(this);
    }
}
