import java.util.ArrayList;
import java.util.Iterator;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    /** Default constructor. */
    public Board() {

    }
    
    /** Add a piece to the board. */
    public void addPiece(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return;
        }

        if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) != null) {
            return;
        }

        pieces.add(piece);
    }

    /** Validate if a coordinate is within the board. */
    public boolean validate(int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }

        return true;
    }

    /** Return a piece at the given coordinates on the board, or null if not exists. */
    public Piece getAt(int x, int y) {
        if (pieces == null) {
            return null;
        }

        if (!validate(x, y)) {
            return null;
        }

        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                return p;
            }
        }

        return null;
    }

    /** Remove a piece at the given coordinates on the board. */
    public void removeAt(int x, int y) {
        if (pieces == null) {
            return;
        }

        if (!validate(x, y)) {
            return;
        }

        Iterator<Piece> i = pieces.iterator();
        while (i.hasNext()) {
            Piece p = i.next();
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                i.remove();
                return;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    } 
}
