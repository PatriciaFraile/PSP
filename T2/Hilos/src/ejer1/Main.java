package ejer1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador(100);
        HiloA hiloA = new HiloA("HILOA", contador);
        HiloB hiloB = new HiloB("HILOB", contador);
        hiloA.start();
        hiloA.join();
        hiloB.start();
    }
}
