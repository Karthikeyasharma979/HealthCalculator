import java.awt.*;
import javax.swing.*;
@SuppressWarnings("unused")
public class App {

    public static void main(String[] args) {
        // Create a splash screen
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            
        }
        splashScreen.setVisible(false);
        splashScreen.dispose();
        First Main = new First();
        Main.setVisible(true);
       
    }
}