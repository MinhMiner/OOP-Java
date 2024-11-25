import java.lang.Math;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = Math.PI;

    /* Default constructor. */
    public Circle() {

    }

    /* Constructor with radius. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /* Constructor with radius and color. */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /* Get radius. */
    public double getRadius() {
        return radius;
    }

    /* Set radius. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /* Get color. */
    public String getColor() {
        return color;
    }

    /* Set color. */
    public void setColor(String color) {
        this.color = color;
    }

    /* Get area. */
    public double getArea() {
        return radius * radius * Circle.PI;
    }

    /* toString() method. */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}