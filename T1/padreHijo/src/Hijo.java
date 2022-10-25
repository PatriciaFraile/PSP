import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hijo {

    public static void main(String[] args) {
        String leer;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            leer = new String();

            leer = " Hola " + br.readLine() + ", tu contraseña de tu dni electrónico es: ";
            System.out.println(leer + generarContrasenia());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
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
