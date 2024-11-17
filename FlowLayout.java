import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {
    public FlowLayout() {
        setTitle("FlowLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Set FlowLayout as layout manager
        setLayout(new FlowLayout());

        // Add multiple buttons, FlowLayout arranges them left to right
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlowLayout());
    }
}
