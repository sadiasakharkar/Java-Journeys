import javax.swing.*;

public class NullLayout extends JFrame {
    public NullLayout() {
        setTitle("Null Layout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Set layout to null
        setLayout(null);

        // Create a button and manually set its position and size
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 150, 30); // x, y, width, height
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NullLayout());
    }
}
