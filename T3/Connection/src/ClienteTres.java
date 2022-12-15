import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClienteTres {
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("127.0.0.1",9999);
            ObjectInputStream  inputObjeto = new ObjectInputStream(cliente.getInputStream());
            Persona persona = (Persona) inputObjeto.readObject();
            System.out.println(persona.getNombre());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
