import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente{
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        Socket cliente;

        {
            try {
                cliente = new Socket("localhost",9999);
                PrintWriter out = new PrintWriter(cliente.getOutputStream(),true);
                BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                System.out.println(in.readLine());
                String nombre = entradaTeclado.next();
                out.println(nombre);
                System.out.println(in.readLine());
                String dni = entradaTeclado.next();
                out.println(dni);
                BufferedReader in2 = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                System.out.println(in2.readLine());
                BufferedReader in3 = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                System.out.println(in3.readLine());
                out.close();
                in.close();
                cliente.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

