import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        BufferedReader b;
            try {
                ServerSocket servidor = new ServerSocket(1234);
                Socket cliente  = servidor.accept();
                b = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                System.out.println(b.readLine());
                //System.out.println( cliente.getPort());
                cliente.close();//siempre hay que cerrar las conexiones
                servidor.close();//siempre hay que cerrar las conexiones
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }

}
