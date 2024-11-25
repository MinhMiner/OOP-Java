public class Point {
    private double pointX;
    private double pointY;

    /** Constructor. */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }
    
    /** Distance with another Point. */
    public double distance(Point other) {
        return Math.sqrt((this.pointX - other.pointX) * (this.pointX - other.pointX)
            + (this.pointY - other.pointY) * (this.pointY - other.pointY));   
    }

    /** Get info. */
    public String getInfo() {
        return String.format("(%.2f,%.2f)", pointX, pointY);
    }
}
