# Health Calculator - Gym Management System

## 📌 Overview
The **Health Calculator** is a gym management system designed to help users track their health metrics effectively. This system calculates and monitors essential health parameters such as BMI, calorie intake, and workout progress, ensuring users maintain a healthy lifestyle.

## 🚀 Features
- **BMI Calculator**: Computes Body Mass Index based on height and weight.
- **Calorie Tracker**: Estimates daily calorie requirements.
- **Exercise Management**: Suggests workout routines based on user fitness goals.
- **User Authentication**: Secure login and signup system.
- **Data Storage**: Stores user health data for tracking progress.
- **Responsive UI**: Simple and interactive interface for ease of use.

## 🛠️ Technologies Used
- **Programming Languages**: Java, Python
- **Database**: MySQL
- **Frameworks & Libraries**: Java Swing (for Java UI), Streamlit (for Python UI)
- **Tools**: VSCode, MySQL Workbench

## 📂 Project Structure
```
/HealthCalculator
├── .vscode/                   # Visual Studio Code configuration files
├── bin/                       # Compiled binary files
├── image/                     # Image assets
├── lib/                       # External libraries
├── myapp/                     # Application source code
│   ├── Main.java              # Main application entry point
│   └── ...                    # Other Java source files
├── src/                       # Additional source code
│   └── ...                    # Source files
├── README.md                  # Project documentation
├── design.exe                 # Executable file for the application
├── design.jar                 # Java Archive file for the application
├── patients_patientdata.sql   # SQL script for patient data
└── patients_routines.sql      # SQL script for patient routines
```

## 🔧 Setup & Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/Karthikeyasharma979/HealthCalculator.git
   cd HealthCalculator
   ```
2. Setup MySQL database:
   - Import `patients_patientdata.sql` and `patients_routines.sql` into MySQL Workbench.
   - Update database connection settings in the application.
3. Compile and run the Java Swing application:
   ```sh
   javac -d bin src/myapp/*.java
   java -cp bin myapp.Main
   ```
4. (Optional) Run the Streamlit frontend application:
   ```sh
   streamlit run app.py
   ```

## 📌 Usage
1. Sign up or log in to the system.
2. Enter personal health details such as height, weight, and fitness goals.
3. View BMI and suggested calorie intake.
4. Access personalized workout plans.
5. Track progress over time.

## 🤝 Contributing
Contributions are welcome! Feel free to submit issues or pull requests.

## 📞 Contact
- **Developer**: Koratamaddi Karthikeyasharma
- **GitHub**: [@Karthikeyasharma979](https://github.com/Karthikeyasharma979)
- **Email**: karthikeyasharma979@gmail.com

