import java.io.IOException;
import java.net.ServerSocket;

public class ServidorDos {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9999);
            while(true){
               new Hilo(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
