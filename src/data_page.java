import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class data_page {

    static JTextField nametxt;
    static JTextField emailtxt;
    static JTable j;

    data_page() {
        JFrame frame = new JFrame("Database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2850, 1440); // Adjust size as needed
        frame.setLayout(new BorderLayout());

        JPanel panel1 = searchPanel();
        JPanel panel2 = table();

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static JPanel searchPanel() {
        JPanel jp = new JPanel(new FlowLayout());
        JLabel name = new JLabel("name");
        JLabel email = new JLabel("email");
        nametxt = new JTextField(20);
        emailtxt = new JTextField(20);
        JButton search = new JButton("Search");
        JButton reset = new JButton("reset");
        
        jp.add(name);
        jp.add(nametxt);
        jp.add(email);
        jp.add(emailtxt);
        jp.add(search);
        jp.add(reset);
        jp.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[][] data = show.table(nametxt.getText());
                String columnNames[] = {"id","first_name","last_name","gender","Height","Weight","BP","Sugar","Activity","email"};

                // Update the table model instead of creating a new JTable
                DefaultTableModel model = new DefaultTableModel(data, columnNames);
                j.setModel(model);
            }
        });


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[][] data = show.table();
                String columnNames[] = {"id","first_name","last_name","gender","Height","Weight","BP","Sugar","Activity","email"};

                // Update the table model instead of creating a new JTable
                DefaultTableModel model = new DefaultTableModel(data, columnNames);
                j.setModel(model);
            }
        });


        return jp;
    }

    public static JPanel table() {
        JPanel jp = new JPanel(new FlowLayout());
        Object[][] data = show.table();
        String columnNames[] = {"id","first_name","last_name","gender","Height","Weight","BP","Sugar","Activity","email"};

        // Initializing the JTable
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        j = new JTable(model);
        j.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); // Allow columns to be resized
        j.setFillsViewportHeight(true);

        // Set preferred size for the JScrollPane
        JScrollPane sp = new JScrollPane(j);
        sp.setPreferredSize(new Dimension(1280, 400)); // Adjust the width as needed
        jp.add(sp);
        jp.setBorder(BorderFactory.createEmptyBorder(100, 10, 50, 10));
        return jp;
    }
}
