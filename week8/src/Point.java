import java.util.Objects;

public class Point {
    private int pointX;
    private int pointY;

    /** Constructor point with coordinates. */
    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    /** Get the distance of two points. */
    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(pointX - newPoint.pointX, 2)
            + Math.pow(pointY - newPoint.pointY, 2));
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

        Point temp = (Point) o;
        return (this.pointX == temp.pointX) && (this.pointY == temp.pointY);
    }

    /** toString() method. */
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }

    /** Override hashCode(). */
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }
}
