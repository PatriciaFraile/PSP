import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("Esperando...");
            while (true) {
                new Hilo(serverSocket.accept()).start();
                System.out.println("Cliente conectado");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}