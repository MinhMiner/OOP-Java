public class Cylinder extends Circle {
    private double height;

    /* Default constructor. */
    public Cylinder() {

    }

    /* Constructor with height. */
    public Cylinder(double height) {
        this.height = height;
    }

    /* Constructor with radius and height. */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /* Constructor with radius, height and color */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /* Get height. */
    public double getHeight() {
        return height;
    }

    /* Set height. */
    public void setHeight(double height) {
        this.height = height;
    }

    /* Get volume. */
    public double getVolume() {
        return super.getArea() * height;
    }

    /* toString() method. */
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /* Get area. */
    public double getArea() {
        return super.getArea() * 2;
    }
}
