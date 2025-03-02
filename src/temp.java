import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class temp extends JFrame {
    public temp() {
        // Set the look and feel to Nimbus
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the frame properties
        setTitle("Patient");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create the panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Create the icons
        ImageIcon addIcon = new ImageIcon("image/medical.png");
        ImageIcon updateIcon = new ImageIcon("image/updated.png");
        ImageIcon dataIcon = new ImageIcon("image/database-storage.png");
        ImageIcon analysisIcon = new ImageIcon("image/analysis.png");

        // Create the buttons
        JButton addButton = new JButton(addIcon);
        JButton updateButton = new JButton(updateIcon);
        JButton dataButton = new JButton(dataIcon);
        JButton analysisButton = new JButton(analysisIcon);

        // Set the button properties
        addButton.setPreferredSize(new Dimension(200, 200));
        updateButton.setPreferredSize(new Dimension(200, 200));
        dataButton.setPreferredSize(new Dimension(200, 200));
        analysisButton.setPreferredSize(new Dimension(200, 200));

        // Add padding to the buttons
        addButton.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        updateButton.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        dataButton.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        analysisButton.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add action listeners to the buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Details();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Update();
            }
        });

        dataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new data_page();
            }
        });

        analysisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DietPlan.plan();
            }
        });

        // Add the buttons to the panel
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(addButton, c);

        c.gridx = 1;
        panel.add(updateButton, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(dataButton, c);

        c.gridx = 1;
        panel.add(analysisButton, c);

        // Add the panel to the frame
        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new temp();
    }
}