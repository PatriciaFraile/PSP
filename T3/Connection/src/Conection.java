import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Conection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost/exampleget.php?nombre=ddd&edad=66&submit=enviar");
        String inputline;
        URLConnection hc = url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(hc.getInputStream()));
        while((inputline= br.readLine())!=null){
            System.out.println(inputline);
        }
        br.close();
    }
}
