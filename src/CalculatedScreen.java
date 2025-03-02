import java.awt.*;

import javax.swing.*;

public class CalculatedScreen {
    Patient p;
    JLabel firstNameLabel; 
    JLabel lastNameLabel;
    JLabel genderLabel; 
    JLabel ageLabel; 
    JLabel heightLabel;
    JLabel weightLabel; 
    JLabel bpLabel; 
    JLabel sugarLabel; 
    JLabel activityLabel; 
    JLabel emailLabel; 
    JLabel bmi;
    JLabel cal;
    JLabel hw;
    JLabel idw;

    JLabel firstNameField;
    JLabel lastNameField;
    JLabel ageField; 
    JLabel heightField; 
    JLabel weightField; 
    JLabel bpField;
    JLabel sugarField; 
    JLabel emailField; 
    JLabel bmiFied;
    JLabel calField;
    JLabel hwField;
    JLabel idwField;
    JLabel water;
    JLabel waterField;
    JLabel bmr;
    JLabel bmrField; 
    JLabel gender; 

    JLabel activity ;

    CalculatedScreen(Patient p){
        this.p=p;
        JFrame frame = new JFrame("Patient Details Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2560, 1440);
        JPanel p2 = content(p);
        frame.add(p2);
        frame.setVisible(true);
        
    }
    private JPanel content(Patient p) {
        JPanel panel = new JPanel();    
        panel.setLayout(new GridLayout(14, 2, 2, 8)); 
    
        // Labels
        Font  f1  = new Font(Font.MONOSPACED, Font.PLAIN,  20);
        
        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setFont(f1);
        firstNameLabel.setOpaque(true); 
        firstNameLabel.setBackground(new Color(74, 159, 245));
        
        lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setFont(f1);
        lastNameLabel.setOpaque(true);
        lastNameLabel.setBackground(new Color(95, 244, 238)); 
        
        genderLabel = new JLabel("Gender:");
        genderLabel.setFont(f1);
        genderLabel.setOpaque(true);
        genderLabel.setBackground(new Color(255, 187, 112)); 
        
        ageLabel = new JLabel("Age:");
        ageLabel.setFont(f1);
        ageLabel.setOpaque(true);
        ageLabel.setBackground(new Color(170, 215, 217)); 
        
        heightLabel = new JLabel("Height (cm):");
        heightLabel.setFont(f1);
        heightLabel.setOpaque(true);
        heightLabel.setBackground(new Color(141, 236, 180)); 
        
        weightLabel = new JLabel("Weight (kg):");
        weightLabel.setFont(f1);
        weightLabel.setOpaque(true);
        weightLabel.setBackground(new Color(151, 231, 225)); 
        
        bpLabel = new JLabel("Bp :");
        bpLabel.setFont(f1);
        bpLabel.setOpaque(true);
        bpLabel.setBackground(new Color(255, 207, 129));
        
        sugarLabel = new JLabel("sugar :");
        sugarLabel.setFont(f1);
        sugarLabel.setOpaque(true);
        sugarLabel.setBackground(new Color(55, 140, 231)); 

        activityLabel = new JLabel("Activity:");
        activityLabel.setFont(f1);
        activityLabel.setOpaque(true);
        activityLabel.setBackground(new Color(255, 250, 183)); 
        
        emailLabel = new JLabel("Email:");
        emailLabel.setFont(f1);
        emailLabel.setOpaque(true);
        emailLabel.setBackground(new Color(123, 211, 234)); 

        
        // Assign the values to  Label
        firstNameField = new JLabel(p.getFname());
        firstNameField.setFont(f1);
        firstNameField.setOpaque(true); 
        firstNameField.setBackground(new Color(74, 159, 245));
        
        lastNameField = new JLabel(p.getLname());
        lastNameField.setFont(f1);
        lastNameField.setOpaque(true);
        lastNameField.setBackground(new Color(95, 244, 238)); 
        
        
        ageField = new JLabel(String.valueOf(p.getAge()));
        ageField.setFont(f1);
        ageField.setOpaque(true);
        ageField.setBackground(new Color(170, 215, 217));
        
        
        heightField = new JLabel(String.valueOf(p.getHeight()));
        heightField.setFont(f1);
        heightField.setOpaque(true);
        heightField.setBackground(new Color(141, 236, 180)); 
        
        
        weightField = new JLabel(String.valueOf(p.getWeight()));
        weightField.setFont(f1);
        weightField.setOpaque(true);
        weightField.setBackground(new Color(151, 231, 225));
        
        bpField = new JLabel(String.valueOf(p.getBp()));
        bpField.setFont(f1);
        bpField.setOpaque(true);
        bpField.setBackground(new Color(255, 207, 129));
        
        sugarField = new JLabel(String.valueOf(p.getSugar()));
        sugarField.setFont(f1);
        sugarField.setOpaque(true);
        sugarField.setBackground(new Color(55, 140, 231));
        
        emailField = new JLabel(p.email);
        emailField.setFont(f1);
        emailField.setOpaque(true);
        emailField.setBackground(new Color(123, 211, 234));
        
        gender = new JLabel(p.getGender());
        gender.setFont(f1);
        gender.setOpaque(true);
        gender.setBackground(new Color(255, 187, 112));
        
        activity = new JLabel(p.getActivity());
        activity.setFont(f1); 
        activity.setOpaque(true);
        activity.setBackground(new Color(255, 250, 183));
        
        // Calulation

        double res,bmis;
        bmi=new JLabel("BMI");
        bmi.setOpaque(true);
        bmi.setBackground(new Color(91, 188, 255));

        bmis=Patient.bmi(p.getHeight(),p.getWeight());
        bmiFied=new JLabel(String.valueOf(bmis));
        bmiFied.setOpaque(true);
        bmiFied.setBackground(new Color(255, 209, 227));
        
        cal=new JLabel("Calorie");
        cal.setOpaque(true);
        cal.setBackground(new Color(91, 188, 255));

        res=Patient.calorie(p.getHeight(), p.getWeight(),p.getAge(),p.getGender());
        calField=new JLabel(String.valueOf(res));
        calField.setOpaque(true);
        calField.setBackground(new Color(155, 176, 193));
        
        idw=new JLabel("Idel Body Weight");
        idw.setOpaque(true);
        idw.setBackground(new Color(214, 218, 200));

        res=Patient.idw(p.getHeight(), p.getGender());
        idwField=new JLabel(String.valueOf(res));
        idwField.setOpaque(true);
        idwField.setBackground(new Color(255, 187, 112));
        
        water=new JLabel("Daily water  : ");
        water.setOpaque(true);
        water.setBackground(new Color(181, 193, 142));

        res=Patient.water(p.getWeight());
        waterField=new JLabel(String.valueOf(res));
        waterField.setOpaque(true);
        waterField.setBackground(new Color(91, 188, 255));

        hw=new JLabel("Health Weight  : ");
        hw.setOpaque(true);
        hw.setBackground(new Color(255, 209, 227));

        String str =Patient.hw(bmis);
        hwField=new JLabel(String.valueOf(str));
        hwField.setOpaque(true);
        hwField.setBackground(new Color(255, 187, 112));
        
        bmr=new JLabel("BMR  : ");
        bmr.setOpaque(true);
        bmr.setBackground(new Color(255, 250, 183));

        res =Patient.bmr(p.getHeight(),p.getWeight(),p.getAge(),p.getGender());
        bmrField=new JLabel(String.valueOf(res));
        bmrField.setOpaque(true);
        bmrField.setBackground(new Color(251, 154, 209));
        
        // Add components to the panel
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(genderLabel);
        panel.add(gender);
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
        panel.add(activity);
        panel.add(bmi);
        panel.add(bmiFied);
        panel.add(cal);
        panel.add(calField);
        panel.add(bmr);
        panel.add(bmrField);
        panel.add(hw);
        panel.add(hwField);
        panel.add(water);
        panel.add(waterField);
        
        return panel;

    }

//     public static void main(String[] args) {
//         Patient p = new Patient("John", "Doe", "Male",30,170.0, 70.0,"john.doe@example.com",52,12,"rgergerg");
//         // Patient(             fname  lname,  gender,age,heg,weight, email, i          bp ,sugar,activity)
//         new CalculatedScreen(p);
//     }
}
// ``` add run [/INST]This code creates a `CalculatedScreen` object with a `Patient` object as its argument. The `CalculatedScreen` class creates a `JFrame` and adds a `JPanel` with the patient's details. The `JPanel` has a `GridLayout` with 12 rows and 2 columns, and the background color is set to orange using RGB values. The labels have different background colors, also set using RGB values. The `main` method creates a `Patient` object and passes it to the `CalculatedScreen` constructor to display the patient's details.