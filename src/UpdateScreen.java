import javax.swing.*;

public class UpdateScreen extends JFrame {

    public UpdateScreen() {
        super("Updated completed !"); // Set title
        setSize(400, 300); // Set size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close
        setLocationRelativeTo(null); // Center on screen
        setAlwaysOnTop(true); // Keep splash screen on top
        // Add your custom splash screen content (logo/image)
        JLabel logoLabel = new JLabel(new ImageIcon("image\\update.gif")); // Replace with your logo path
        add(logoLabel);
    }
    
}
