public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /** Constructor. */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Get area. */
    public double getArea() {
        return radius * radius * Circle.PI;
    }

    /** Get perimeter. */
    public double getPerimeter() {
        return radius * 2 * Circle.PI;
    }

    /** Get info. */
    public String getInfo() {
        return String.format("Circle[%s,r=%.2f]", 
            center.getInfo(), radius);   
    }
}
