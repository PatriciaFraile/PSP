import java.io.IOException;

public class Entrada extends Thread {
    private Padre padre;


    public Entrada(Padre padre) {
        this.padre = padre;
    }

    public void correr() {
        try {
            System.out.println("Hola " + padre.getNombre() + " bienvenidos al generador " +
                    "de contraseñas del DNI electrónico");
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

    public static void main(String[] args){
        Entrada entrada1 = new Entrada(new Padre("Jaimito , Pepito y Andrea"));
        entrada1.start();
    }
}