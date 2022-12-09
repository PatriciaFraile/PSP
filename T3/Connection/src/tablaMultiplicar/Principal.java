package tablaMultiplicar;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        int num1, num2, num3;
        System.out.println("Introduce numero 1 ");
        num1 = lector.nextInt();
        System.out.println("Introduce numero2");
        num2 = lector.nextInt();
        Operaciones op1 = new Operaciones(num1);
        Operaciones op2 = new Operaciones(num2);
        op1.start();
        op1.interrupt();
        op2.start();
    }
    public static class Operaciones extends Thread{
          private Integer num;
          private int resultado;
          public Operaciones(Integer num){
              this.num = num;
          }
          public void run(){
              try {
                  for (int i = 0; i <= 10; i++) {
                      resultado = num * 1;
                      System.out.println(num + "x" + i + "=" + resultado);
                  }
                  System.out.println("Fin de la tabla " + num);
              }catch (Exception ex){

              }
          }
    }

}
