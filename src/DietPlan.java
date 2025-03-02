import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class DietPlan {
    public static void plan()  {
        Desktop d =  Desktop.getDesktop();
        try {
            d.browse(new URI("https://xhhko8nhcibbk99hiqb5mo.streamlit.app/"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}
