import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTres {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            /*InetSocketAddress addr = new InetSocketAddress("127.0.0.1",9999);
            serverSocket.bind(addr);*/
            Socket cliente = serverSocket.accept();
            ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
            Persona persona = new Persona("Juan");
            outObjeto.writeObject(persona);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
