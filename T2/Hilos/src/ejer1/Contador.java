package ejer1;

public class Contador {
    private int i = 0;

    Contador(int i) {
        this.i = i;
    }

    public void incrementar() {
        i = i + 1;
    }

    public void decrementar() {
        i = i - 1;
    }

    public int getValor() {
        return i;
    }
}
