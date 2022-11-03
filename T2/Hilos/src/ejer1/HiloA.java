package ejer1;

public class HiloA extends Thread {
    private Contador contador;

    public HiloA(String n, Contador e) {
        setName(n);
        contador = e;
    }

    @Override
    public void run() {
        synchronized (contador) {
            for (int i = 0; i < 200; i++) {
                contador.incrementar();
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
