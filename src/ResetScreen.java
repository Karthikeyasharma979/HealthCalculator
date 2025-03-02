import javax.swing.*;

public class ResetScreen extends JFrame {

    public ResetScreen() {
        super("Reset successfully gif!"); // Set title
        setSize(400, 300); // Set size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close
        setLocationRelativeTo(null); // Center on screen
        setAlwaysOnTop(true); // Keep splash screen on top
        // Add your custom splash screen content (logo/image)
        JLabel logoLabel = new JLabel(new ImageIcon("image\\resets.gif")); // Replace with your logo path
        add(logoLabel);
    }
    
}
