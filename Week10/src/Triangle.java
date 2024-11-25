public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /** Constructor. */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        double e1 = p1.distance(p2);
        double e2 = p2.distance(p3);
        double e3 = p3.distance(p1);

        if (e1 == 0 || e2 == 0 || e3 == 0) {
            throw new RuntimeException();
        }

        if (e1 + e2 <= e3 || e2 + e3 <= e1 || e3 + e1 <= e2) {
            throw new RuntimeException();
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    // public void setP1(Point p1) {
    //     this.p1 = p1;
    // }

    public Point getP2() {
        return p2;
    }

    // public void setP2(Point p2) {
    //     this.p2 = p2;
    // }

    public Point getP3() {
        return p3;
    }

    // public void setP3(Point p3) {
    //     this.p3 = p3;
    // }

    /** Get area. */
    public double getArea() {
        double p = getPerimeter() / 2;
        double e1 = p1.distance(p2);
        double e2 = p2.distance(p3);
        double e3 = p3.distance(p1);
        return Math.sqrt(p * (p - e1) * (p - e2) * (p - e3));
    }

    /** Get perimeter. */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /** Get info. */
    public String getInfo() {
        return String.format("Triangle[%s,%s,%s]",
            p1.getInfo(), p2.getInfo(), p3.getInfo());
    }
}
