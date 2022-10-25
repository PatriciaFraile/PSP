import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;

public class Hijo {


    public static void main(String[] args) {
        String leer;
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int[] numeros = new int[7];
        int sumaNumeros = 0;
        for (int i = 0; i < 7; i++) {
           sumaNumeros = (int)(Math.random()*8+1);
            numeros[i]=sumaNumeros;
            numeros[i]++;
            System.out.print(numeros[i]);
        }
        Object[][] dniCompleto = new Object[numeros][caracteres];


        try {

// BufferedReader para recibir datos del padre

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            leer = new String();

            leer = br.readLine() + " tu DNI es: "  ;
            System.out.println(leer);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
