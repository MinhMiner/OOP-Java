import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /** Constructor. */
    public Game(Board board) {
        this.board = board;
    }

    /** Move a piece on the board. */
    public void movePiece(Piece piece, int x, int y) {
        if (piece == null) {
            return;
        }

        if (!board.validate(x, y)) {
            return;
        }

        if (!piece.canMove(board, x, y)) {
            return;
        }
        
        int startX = piece.getCoordinatesX();
        int startY = piece.getCoordinatesY();
        Piece killedPiece = board.getAt(x, y);

        if (killedPiece != null) {
            moveHistory.add(new Move(startX, x, startY, y, piece, killedPiece));
            board.removeAt(x, y);
        } else {
            moveHistory.add(new Move(startX, x, startY, y, piece));
        }
        
        piece.setCoordinatesX(x);
        piece.setCoordinatesY(y);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }    
}
