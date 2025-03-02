import java.sql.Connection;
import java.sql.PreparedStatement;

public class Upload {
    public static boolean insert(Patient pt){
        try {
            Connection con = Connections.connect();
            String str = "INSERT INTO sql12718054.patients_datas(first_name, last_name, gender, Height, Weight, Sugar, BP, Activity, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(str);
            pstm.setString(1, pt.getFname());
            pstm.setString(2, pt.getLname());
            pstm.setString(3, pt.getGender());
            pstm.setObject(4, pt.getHeight());
            pstm.setObject(5, pt.getWeight());
            // pstm.setObject(6, pt.getAge());
            pstm.setObject(6, pt.getSugar());
            pstm.setObject(7, pt.getBp());
            pstm.setObject(8, pt.getActivity());
            pstm.setObject(9, pt.getEmail());
            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    public static boolean update(Patient pt, int id){
        try {
            Connection con = Connections.connect();
            String str = "UPDATE sql12718054.patients_datas SET first_name =?, last_name =?, gender =?, Height =?, Weight =?, Sugar =?, BP =?, Activity =?, email =? WHERE id =?;";
            PreparedStatement pstm = con.prepareStatement(str);
            pstm.setString(1, pt.getFname());
            pstm.setString(2, pt.getLname());
            pstm.setString(3, pt.getGender());
            pstm.setObject(4, pt.getHeight());
            pstm.setObject(5, pt.getWeight());
            pstm.setObject(6, pt.getSugar());
            pstm.setObject(7, pt.getBp());
            pstm.setObject(8, pt.getActivity());
            pstm.setObject(9, pt.getEmail());
            pstm.setInt(10, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Patient patient = new Patient(null, null, "", 0, 0, 0, null, 0, 0, "");
        patient.setFname("John");
        patient.setLname("Doe");
        patient.setGender("Male");
        patient.setHeight(170);
        patient.setWeight(70);
        // patient.setAge(30);
        patient.setSugar(100);
        patient.setBp(120);
        patient.setActivity("little or no exercise");
        patient.setEmail("john.doe@example.com");

        Upload.insert(patient);
    }
}