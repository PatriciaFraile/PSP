import java.io.IOException;
import java.util.Scanner;

public class Entrada extends Thread {
    private Padre padre;
    private String line;

    public Entrada(Padre padre) {
        this.padre = padre;
    }

    public void correr() {
        try {
            System.out.println("Hola " + padre.getNombre() + " bienvenido al generador " +
                    "de contraseñas del DNI electónico");
            Thread.sleep(10);
            ProcessBuilder padre1 = new ProcessBuilder("java", "src/Padre.java");
            padre1.inheritIO();
            Process process = padre1.start();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        correr();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = scanner.next();
        Padre padre1 = new Padre(nombre);
        Entrada entrada = new Entrada(padre1);
        entrada.start();


    }
}
