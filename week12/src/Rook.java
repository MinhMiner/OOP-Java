public class Rook extends Piece {
    /** Constructor 1. */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /** Constructor 2. */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /** Check if the piece can move to the given coordinates. */
    public boolean canMove(Board board, int x, int y) {
        // Check if horizontal or vertical direction or not.
        if (this.getCoordinatesX() != x && this.getCoordinatesY() != y) {
            return false;
        }

        // Check if the piece at destination square has same color or not.
        Piece destPiece = board.getAt(x, y);
        if (destPiece != null && destPiece.getColor() == this.getColor()) {
            return false;
        }

        // Check if there are pieces in the squares between start and destination.
        if (this.getCoordinatesY() == y) {
            if (this.getCoordinatesX() < x) {
                for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
            } else {
                for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
            }
        } else {
            if (this.getCoordinatesY() < y) {
                for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
            } else {
                for (int i = this.getCoordinatesY() - 1; i > y; i--) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    /** Get the symbol for rook. */
    public String getSymbol() {
        return "R";
    }    
}
