import java.util.Objects;

public class Velocity {
    private int velocityX;
    private int velocityY;

    /** Constructor velocity. */
    public Velocity(int velocityX, int velocityY) {
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    /** Invert velocityX. */
    public void invertX() {
        velocityX = - velocityX;
    }

    /** Invert velocityY. */
    public void invertY() {
        velocityY = - velocityY;
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

        Velocity temp = (Velocity) o;
        return (this.velocityX == temp.velocityX) && (this.velocityY == temp.velocityY);
    }

    /** toString() method. */
    public String toString() {
        return String.format("(%.1f,%.1f)", velocityX, velocityY);
    }

    /** Override hashCode(). */
    public int hashCode() {
        return Objects.hash(velocityX, velocityY);
    }
}
