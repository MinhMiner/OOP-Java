import java.awt.Color;
import java.util.Objects;

public class Square extends Rectangle {
    /** Default constructor. */
    public Square() {

    }

    public Square(Square other) {
        super(other);
    }

    /** Constructor with side. */
    public Square(int side) {
        this.width = side;
        this.height = side;
    }

    /** Constructor with Shape variables and side, topLeft point. */
    public Square(int side, Color color, boolean filled, Point topLeft, Velocity velocity) {
        super(side, side, color, filled, topLeft, velocity);
    }

    /** Return the side of the square. */
    public int getSide() {
        return width;
    }

    /** Change the side of the square. */
    public void setSide(int side) {
        width = side;
        height = side;
    }

    /** Override Rectangle method. */
    public void setWidth(int side) {
        setSide(side);
    }

    /** Override Rectangle method. */
    public void setLength(int side) {
        setSide(side);
    }

    /** toString() method. */
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%b]",
            topLeft.toString(), width, color, filled);
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

        Square temp = (Square) o;

        if (this.width - temp.width >= 0.001) {
            return false;
        }

        return true;
    }

    /** Override hashCode(). */
    public int hashCode() {
        return Objects.hash(color, filled, width);
    }

    public Square clone() {
        return new Square(this);
    }
}
