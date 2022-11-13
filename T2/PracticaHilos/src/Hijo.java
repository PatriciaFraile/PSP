import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hijo extends Thread {
    private Contrasenia contrasenia;
    private String leer;

    public Hijo(Padre n, Contrasenia c) {
        setName(String.valueOf(n));
        contrasenia = c;

    }

    @Override
    public void run() {
        synchronized (contrasenia) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                leer = new String();

                leer = " Hola " + br.readLine() + ", tu contraseña de tu dni electrónico es: ";
                System.out.println(leer + contrasenia);

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
