import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9999);
            while(true){
                new Hilo(serverSocket.accept()).start();
                System.out.println("Cliente conectado");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}