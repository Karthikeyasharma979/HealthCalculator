public class Patient {
    String fname;
    String lname;
    String gender;
    double height; // height in meters
    double weight;
    String email;
    String activity;
    Object bp;
    int age;
    Object sugar;

    // Constructor
    public Patient(String fname, String lname, Object gender, int age, double height, double weight, String email,
                   Object bp, Object sugar, Object activity) {
        this.fname = fname;
        this.lname = lname;
        this.gender = (String) gender;
        this.age = age;
        this.height = height; // height should be in meters
        this.weight = weight;
        this.email = email;
        this.activity = (String) activity;
        this.bp = bp;
        this.sugar = sugar;
    }

    // Getters and Setters
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Object getBp() {
        return bp;
    }

    public void setBp(Object bp) {
        this.bp = bp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getSugar() {
        return sugar;
    }

    public void setSugar(Object sugar) {
        this.sugar = sugar;
    }

    // Method to convert inches to meters
    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Calorie Needs Calculation
    public static double calorie(double heightInInches, double weight, double age, String gender) {
        double heightInMeters = inchesToMeters(heightInInches); 
        double heightCm = heightInMeters * 100;  
        double res;
        if (gender.equalsIgnoreCase("male")) {
            res = 10 * weight + 6.25 * heightCm - 5 * age + 5;
        } else {
            res = 10 * weight + 6.25 * heightCm - 5 * age - 161;
        }
        return res;
    }

    // Basal Metabolic Rate (BMR) Calculation
    public static double bmr(double heightInInches, double weight, int age, String gender) {
        double heightInMeters = inchesToMeters(heightInInches); 
        double heightCm = heightInMeters * 100;  
        double res;
        if (gender.equalsIgnoreCase("male")) {
            res = 13.397 * weight + 4.799 * heightCm - 5.677 * age + 88.362;
        } else {
            res = 9.247 * weight + 3.098 * heightCm - 4.330 * age + 447.593;
        }
        return res;
    }

    // Healthy Weight Category
    public static String hw(double bmi) {
        String res = "";
        if (bmi < 18.5) {
            res = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            res = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            res = "Overweight";
        } else {
            res = "Obese";
        }
        return res;
    }

    // Daily Fluid Needs
    public static double water(double weight) {
        return 0.03 * weight; 
    }

    // Body Mass Index (BMI)
    public static double bmi(double heightInInches, double weight) {
        double heightInMeters = inchesToMeters(heightInInches); 
        double res = weight / (heightInMeters * heightInMeters); 
        return res;
    }

    // Ideal Body Weight (IBW)
    public static double idw(double heightInInches, String gender) {
        double heightInMeters = inchesToMeters(heightInInches); 
        double heightInCm = heightInMeters * 100;  
        double res;
        if (gender.equalsIgnoreCase("male")) {
            res = 50 + 2.3 * ((heightInCm / 2.54) - 60); 
        } else {
            res = 45.5 + 2.3 * ((heightInCm / 2.54) - 60); 
        }
        return res;
    }
}
