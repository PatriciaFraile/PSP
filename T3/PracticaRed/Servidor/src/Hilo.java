import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Hilo extends Thread{
    private Socket cliente = null;
    public Hilo(Socket param){
        this.cliente = param;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(cliente.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            out.println("Escribe tu nombre y tu dni (separado por coma)");
            String inputLine = in.readLine();
            System.out.println("Nombre : " +inputLine);
            out.println("Escribe tu dni , por favor "+inputLine);
            BufferedReader in2 = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            String input = in2.readLine();
            System.out.println("DNI : " +input);
            out.println("Hemos recibido tu nombre y tu dni "+inputLine+
                    " ahora te vamos a enviar tu nueva contraseña de tu dni electrónico");
             out.close();
            in.close();
            cliente.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}