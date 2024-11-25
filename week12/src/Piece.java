public abstract class Piece {
    public static final String WHITE = "white";
    public static final String BLACK = "black";
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /** Constructor with coordinates only, default color is white. */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = Piece.WHITE;
    }

    /** Constructor with coordinates and color. */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    /** Check if two pieces have same position. */
    public boolean checkPosition(Piece piece) {
        if (coordinatesX != piece.coordinatesX || coordinatesY != piece.coordinatesY) {
            return false;
        }

        return true;
    }
}
