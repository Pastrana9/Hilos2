import java.util.Random;

public class Hilos extends numeros {

    int numeros;            //private

    public Hilos(int numeros) {
        this.numeros = 5;
    }

    public void run() {

        for (int i = 0; i == numeros ;
        i++){

            System.out.println("Hilo de numeros " + numeros);
            int numeros;

            numeros = (int) (Math.random() * (8000 - 1000)) + 1000;

            try {

                Thread.sleep(numeros);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hilos" + i + "ha dormido" + numeros + "milisegundos");
        }
    }
}