import java.awt.Dimension;

import javax.swing.*;

public class SplashScreen extends JFrame {

    public SplashScreen() {
        super("Welcome!"); // Set title
        setSize(400, 400); // Set size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close
        setLocationRelativeTo(null); // Center on screen
        setAlwaysOnTop(true); // Keep splash screen on top
        // Add your custom splash screen content (logo/image)
        // src\SplashScreen.java
        JLabel logoLabel = new JLabel(new ImageIcon("lib\\_9a44a9b3-fd83-4fd6-a716-cd50ba7f98a3 (1).jpg")); // Replace with your logo path
        logoLabel.setPreferredSize(new Dimension(100, 100));
        add(logoLabel);
    }
}
