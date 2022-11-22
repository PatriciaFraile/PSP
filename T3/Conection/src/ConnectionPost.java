import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectionPost {
    public static void main(String[] args) {
        String datos = "nombre=ddd&edad=66";

        URL url = null;
        try {
            url = new URL("http://localhost/GetPost/examplepost.php");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String inputline;

        HttpURLConnection hc = null;

        try {
            hc = (HttpURLConnection) url.openConnection();
            hc.setRequestMethod("POST");
            hc.setDoOutput(true);
            hc.getOutputStream().write(datos.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}