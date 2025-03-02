import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class show {

    //result of data
    public static Object[][] table(String name) {
        try{
            
            Connection con = Connections.connect();
            int c=0;
            String query = "CREATE OR REPLACE VIEW stu AS SELECT * FROM sql12718054.patientdata WHERE first_name = ?";
            String q2 = "select count(*) from stu";
            String q3 = "select * from stu";
            
            // creating view table 
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.executeUpdate();

            // counting no of row int the table
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(q2);

            while(res.next()){
                c = res.getInt(1);
            }

            // create an Object 2D array to store the rows 
            Statement stm1 =con.createStatement();
            ResultSet ress = stm1.executeQuery(q3);
            Object [][] data = new Object[c][];
            int i=0;
            while(ress.next()){
                Object[] temp={
                    ress.getInt("id"),
                    ress.getString("first_name"),
                    ress.getString("last_name"),
                    ress.getString("gender"),
                    ress.getObject("Height"),
                    ress.getObject("Weight"),
                    ress.getObject("Sugar"),
                    ress.getInt("BP"),
                    ress.getString("Activity"),
                    ress.getString("email"),
                };
                data[i++] = temp;
            }
            return data;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    // default data
    public static Object[][] table(){
        String qu = "select count(*) from sql12718054.patientdata";
        String qu1 = "select * from sql12718054.patientdata";
        try{
            Connection con = Connections.connect();
            
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(qu);
            
            
            // counting the no of rows 
            int c=0;
            while(res.next()){
                c=res.getInt(1);
            }
            
            
            // inserting the rows
            Object[][] data = new Object[c][];
            ResultSet ress = stm.executeQuery(qu1);
            int i=0;
            while(ress.next()){
                Object[] temp={
                    ress.getInt("id"),
                    ress.getString("first_name"),
                    ress.getString("last_name"),
                    ress.getString("gender"),
                    ress.getObject("Height"),
                    ress.getObject("Weight"),
                    ress.getObject("Sugar"),
                    ress.getInt("BP"),
                    ress.getString("Activity"),
                    ress.getString("email"),
                };
                data[i++] = temp;
            }
            return data;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // public static void main(String[] args) {
    //     Object[][] d = table();
    //     System.out.println(Arrays.toString(d[0]));
    //     System.out.println(Arrays.toString(d[1]));
    //     System.out.println(Arrays.toString(d[2]));        
    // }
}
