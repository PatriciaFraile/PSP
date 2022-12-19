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
            Thread.sleep(1000);
            String contrasenia = generarContrasenia();
            out.println("Tu contraseña es: "+contrasenia);
            System.out.println("Contraseña dni electrónico: "+contrasenia);
            out.close();
            in.close();
            System.out.println("Cliente desconectado");
            cliente.close();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static String generarContrasenia() {
        char[] mayusculas = {'A', 'B', 'C', 'D', 'F', 'G', 'H'};
        char[] minusculas = {'a', 'b', 'c', 'd', 'f', 'g', 'h'};
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        StringBuilder contenido = new StringBuilder();
        contenido.append(mayusculas);
        contenido.append(minusculas);
        contenido.append(numeros);

        StringBuilder contrasenia = new StringBuilder();
        for (int i = 0; i <= 11; i++) {
            int cantidad = contenido.length();
            int aleatorio = (int) (Math.random() * cantidad);
            contrasenia.append((contenido.toString()).charAt(aleatorio));

        }

        return contrasenia.toString();
    }
}