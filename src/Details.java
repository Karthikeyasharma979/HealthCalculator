import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
@SuppressWarnings("unused")
public class Details {

  static JLabel firstNameLabel; 
  JLabel lastNameLabel;
  JLabel genderLabel; 
  JLabel ageLabel; 
  JLabel heightLabel;
  JLabel weightLabel; 
  JLabel bpLabel; 
  JLabel sugarLabel; 
  JLabel activityLabel; 
  JLabel emailLabel; 

  // Text Fields
  JTextField firstNameField;
  JTextField lastNameField;
  JTextField ageField; 
  JTextField heightField; 
  JTextField weightField; 
  JTextField bpField;
  JTextField sugarField; 
  JTextField emailField; 


  //combo box
  //gender 
  String[] gender; 
  JComboBox<String> genderbox;
  // activity
  String[] activity ;
  JComboBox<String> activitybox; 

  // Buttons
  JButton submitButton ;
  JButton resetButton;
  

  Details() {
    JFrame frame = new JFrame("Patient Details Form");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(2560, 1440);
    JPanel p2 = content();
    frame.add(p2);
    frame.setVisible(true);
  }
public JPanel content(){
  JPanel panel = new JPanel();    
    panel.setLayout(new GridLayout(11, 2, 5, 8)); // Adjust rows, columns, and spacing
    panel.setBackground(new Color(43, 52, 153));
    // Labels
    Font  f1  = new Font(Font.MONOSPACED, Font.PLAIN,  20);
    firstNameLabel = new JLabel("First Name:");
    firstNameLabel.setFont(f1);
    firstNameLabel.setOpaque(true);
    firstNameLabel.setBackground(new Color(91, 188, 255)); 
    
    lastNameLabel = new JLabel("Last Name:");
    lastNameLabel.setFont(f1);
    lastNameLabel.setOpaque(true);
    lastNameLabel.setBackground(new Color(151, 231, 225)); 
   
    genderLabel = new JLabel("Gender:");
    genderLabel.setFont(f1);
    genderLabel.setOpaque(true);
    genderLabel.setBackground(new Color(139, 147, 255)); 
   
    ageLabel = new JLabel("Age:");
    ageLabel.setFont(f1);
    ageLabel.setOpaque(true);
    ageLabel.setBackground(new Color(91, 188, 255)); 
   
    heightLabel = new JLabel("Height (in):");
    heightLabel.setFont(f1);
    heightLabel.setOpaque(true);
    heightLabel.setBackground(new Color(255, 250, 183)); 
   
    weightLabel = new JLabel("Weight (kg):");
    weightLabel.setFont(f1);
    weightLabel.setOpaque(true);
    weightLabel.setBackground(new Color(126, 161, 255)); 
   
    bpLabel = new JLabel("Bp :");
    bpLabel.setFont(f1);
    bpLabel.setOpaque(true);
    bpLabel.setBackground(new Color(255, 235, 178)); 
   
    sugarLabel = new JLabel("sugar :");
    sugarLabel.setFont(f1);
    sugarLabel.setOpaque(true);
    sugarLabel.setBackground(new Color(255, 46, 99)); 
   
    activityLabel = new JLabel("Activity:");
    activityLabel.setFont(f1);
    activityLabel.setOpaque(true);
    activityLabel.setBackground(new Color(91, 188, 255)); 
   
    emailLabel = new JLabel("Email:");
    emailLabel.setFont(f1);
    emailLabel.setOpaque(true);
    emailLabel.setBackground(new Color(255, 209, 227)); 
    

    // Text Fields
     firstNameField = new JTextField(10);
     lastNameField = new JTextField(20);
     ageField = new JTextField(20);
     heightField = new JTextField(20);
     weightField = new JTextField(20);
     bpField = new JTextField(20);
     sugarField = new JTextField(20);
     emailField = new JTextField(20);


    //combo box
    //gender 
    String[] gender ={"select ","male","female"};
    genderbox = new JComboBox<> (gender);
    // activity
    String[] activity = {"select any one ","little or no exercise", "Exercise 1-3 times/week", "Exercise 4-5 times/week", "Daily exercise or intense exercise 3-4 times/week","Intense exercise 6-7 times/week","Very intense exercise daily, or physical job"};
    activitybox = new JComboBox<>(activity);

    

    // Buttons
    JButton submitButton = new JButton("Submit");
    JButton resetButton = new JButton("Reset");

    // Add components to the panel
    panel.add(firstNameLabel);
    panel.add(firstNameField);
    panel.add(lastNameLabel);
    panel.add(lastNameField);
    panel.add(genderLabel);
    panel.add(genderbox);
    panel.add(ageLabel);
    panel.add(ageField);
    panel.add(heightLabel);
    panel.add(heightField);
    panel.add(weightLabel);
    panel.add(weightField);
    panel.add(bpLabel);
    panel.add(bpField);
    panel.add(sugarLabel);
    panel.add(sugarField);
    panel.add(activityLabel);
    panel.add(activitybox);
    panel.add(emailLabel);
    panel.add(emailField);
    panel.add(submitButton);
    panel.add(resetButton);
    

    resetButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          firstNameField.setText(" ");
          lastNameField.setText(" ");
          ageField.setText(" ");
          heightField.setText(" ");
          weightField.setText(" ");
          bpField.setText(" ");
          sugarField.setText(" ");
          emailField.setText(" ");
          activitybox.setSelectedIndex(0);
          genderbox.setSelectedIndex(0);
          

          ResetScreen res = new ResetScreen();
          res.setVisible(true);
 
 
          Timer timer = new Timer(4000, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               res.dispose(); // Close the UpdateScreen
           }
          });
 
           timer.setRepeats(false); // Set the timer to run only once
           timer.start(); // Start the timer
      }
  });

  submitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {   

      if(firstNameField.getText().compareTo("")==0 ||
      lastNameField.getText().compareTo("")==0 ||
      ageField.getText().compareTo("")==0 ||
      heightField.getText().compareTo("")==0 ||
      weightField.getText().compareTo("")==0 ||
      bpField.getText().compareTo("")==0 ||
      sugarField.getText().compareTo("")==0 ||
      emailField.getText().compareTo("")==0 ||
      activityLabel.getText().compareTo("select any one")==0 ||
      genderLabel.getText().compareTo("select")==0
      ){
        CheckScreen res = new CheckScreen();
          res.setVisible(true);
 
 
          Timer timer = new Timer(4000, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               res.dispose(); // Close the UpdateScreen
           }
          });
 
           timer.setRepeats(false); // Set the timer to run only once
           timer.start(); // Start the timer
      
      }

      else{
        
        SubmitedScreen std = new SubmitedScreen();
        std.setVisible(true);
        Timer timer = new Timer(4000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
          std.dispose(); // Close the UpdateScreen
          Patient p1 = new Patient(firstNameField.getText(),lastNameField.getText(),genderbox.getSelectedItem(),Integer.parseInt(ageField.getText()),Double.parseDouble(heightField.getText()),Double.parseDouble(weightField.getText()),emailField.getText(),Integer.parseInt(bpField.getText()),Integer.parseInt(sugarField.getText()),activitybox.getSelectedItem());
           //              Patient(String fname,                       String lname,            String gender,                  int age,                     double height,                         double weight,                          String email,                  int bp ,                   int sugar,                                     String activity)
           new CalculatedScreen(p1);
           Upload.insert(p1); 
          }
        });
         timer.setRepeats(false); // Set the timer to run only once
         timer.start(); // Start the timer
      }
      }
 });
  return panel;
}



}
        

