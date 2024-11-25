import javax.swing.JFrame;

public class Client {
    public static void main(String[] args) {
        /**
         * Keybinds:
         * C: Add a new random Circle.
         * R: Add a new random Rectangle.
         * S: Add a new random Square.
         * D: Remove duplicates (Same shape, dimensions, color and filled).
         * X: Remove Circles.
         * P: Remove all Shapes on the screen.
         */
        JFrame frame = new JFrame("Funny shapes");
        Layer panel = new Layer();
        frame.add(panel);
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
