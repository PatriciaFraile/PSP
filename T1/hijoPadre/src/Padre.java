import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Padre {

    public static void main(String args[]) {
        String line;

        try {

// Llamar a la clase Hijo compilada anteriormente

            Process segundo = new ProcessBuilder("java", "Hijo").start();

// Buffer para datos del proceso hijo

            BufferedReader br = new BufferedReader(new InputStreamReader(segundo.getInputStream()));

// Stream salida

            PrintStream ps = new PrintStream(segundo.getOutputStream(), true);

// Buffer que lee de consola

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Escribe tu nombre");

// Enviar mensaje al hijo

            line = in.readLine();

            ps.println(line);

// Recibir información del padre

            line = br.readLine();

            System.out.println(line);

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
