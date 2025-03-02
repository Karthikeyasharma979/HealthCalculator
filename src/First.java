import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

public class First extends JFrame {
     public First() {
        JFrame frame = new JFrame("Patient");
        frame.setSize(2560, 1440);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Create the panel with GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 2, 20, 20));
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        //addicon
        ImageIcon addicon = new ImageIcon("image\\medical.png");
        addicon = createImageIcons(addicon);

        //update icon
        ImageIcon updateicon = new ImageIcon("image\\updated.png");
        updateicon = createImageIcons(updateicon);

        //analysisicon
        ImageIcon  analysisicon= new ImageIcon("image\\analysis.png");
        analysisicon = createImageIcons(analysisicon);

        //datasicon
        ImageIcon datas= new ImageIcon("image\\database-storage.png");
        datas=createImageIcons(datas);
        

        // creation of button : 
        JButton add = new JButton(addicon);
        JButton update = new JButton(updateicon);
        JButton data = new JButton(datas);
        JButton analysis = new JButton(analysisicon);

        // set size of button
        add.setPreferredSize(new java.awt.Dimension(500, 500)); // Consider using preferred size
        update.setPreferredSize(new java.awt.Dimension(500, 500));
        data.setPreferredSize(new java.awt.Dimension(500, 500));
        analysis.setPreferredSize(new java.awt.Dimension(500, 500));

        add.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        update.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        data.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        analysis.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //add to panel 
        panel.add(add);
        panel.add(update);
        panel.add(data);
        panel.add(analysis);


        // action for button
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Details();
            }
        });
        
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Update();
            }
        });
        
        data.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new data_page();
            }
        });
        analysis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DietPlan.plan();
            }
        });
        
        // Add the panel to the frame
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static ImageIcon createImageIcons(ImageIcon icon){
        final int desiredWidth = 250;
        final int desiredHeight = 250;
        Image resizedImage = icon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
        icon = new ImageIcon(resizedImage);
        return icon;
    }
}
