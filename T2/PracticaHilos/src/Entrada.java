
import java.io.IOException;

public class Entrada extends Thread {
    private Padre padre;


    public Entrada(Padre padre) {
        this.padre = padre;
    }

    public void correr() {
        try {
            System.out.println("Hola " + padre.getNombre() + " bienvenido al generador " +
                    "de contraseñas del DNI electónico");
            Thread.sleep(100);
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

    public static void main(String[] args) throws InterruptedException {
        Entrada entrada1 = new Entrada(new Padre("Jaimito"));
        entrada1.start();
        Thread.sleep(5000);
        Entrada entrada2 = new Entrada(new Padre("Pepito"));
        entrada2.start();
        Thread.sleep(5000);
        Entrada entrada3 = new Entrada(new Padre("Andrea"));
        entrada3.start();



    }
}
