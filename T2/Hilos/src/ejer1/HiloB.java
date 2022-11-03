package ejer1;

import static java.lang.Thread.sleep;

public class HiloB extends Thread {
    private Contador contador;

    public HiloB(String n, Contador e) {
        setName(n);
        contador = e;
    }


    @Override
    public void run() {
        synchronized (contador) {
            for (int i = 0; i < 200; i++) {
                contador.decrementar();
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(getName() + "Contador vale" + contador.getValor());
        }
    }
}
