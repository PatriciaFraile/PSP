import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hijo {


    public static void main(String[] args) {
        String leer;
        String[] listar;
        String uno, dos, tres;


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            leer = new String();
            leer = br.readLine();
            listar = leer.split(",");
            uno = listar[0];
            dos = listar[1];
            tres = listar[2];
            for (int i = 0; i < listar.length; i++) {
                System.out.print(listar[i] + " tu contraseña es: " + generarContrasenia() + " , ");
            }

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
