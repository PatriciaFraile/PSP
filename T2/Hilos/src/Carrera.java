public class Carrera extends Thread {
    private Tortuga tortuga;
    private Liebre liebre;

    public Carrera(Liebre liebre , Tortuga tortuga){
        this.tortuga = tortuga;
        this.liebre = liebre;

    }


    public void correr(){
        try{
            System.out.println("Empiezan "+tortuga.getNombre()+" y "+liebre.getNombre()+ " la carrera");
            Thread.sleep(tortuga.getVelocidad()*1000);
            Thread.sleep(liebre.getVelocidad()*1000);
            System.out.printf("\n Ha terminado %s la carrera",tortuga.getNombre());
            System.out.printf("\n Ha terminado %s la carrera",liebre.getNombre());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        correr();
    }

    public static void main(String[] args) {
        Tortuga tortuga1 = new Tortuga("P",23);
        Liebre liebre1 = new Liebre("E",12);
        Carrera carrera = new Carrera(liebre1,tortuga1);
        carrera.start();


    }
}
