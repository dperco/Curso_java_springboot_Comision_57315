import java.util.Random;

public class classRandom {


        public static void main(String[] args) {


            // primer random
            double random = 0.0;
            // Prueba 1
            random = Math.random();
            System.out.println("Random Number:" + random);

            // Prueba 2
            random = Math.random();
            System.out.println("Random Number:" + random);

            // Prueba 3
            random = Math.random();
            System.out.println("Random Number:" + random);

            //usando  Random
            // Crear una instancia de Random
            Random rand = new Random();

            // Generar un número aleatorio entero
            int randomInt = rand.nextInt(100); // Esto generará un número aleatorio entre 0 (inclusive) y 100 (exclusivo)

            // Imprimir el número aleatorio
            System.out.println("Número aleatorio generado: " + randomInt);


            float randomfloat = rand.nextFloat(20000);

            System.out.println("Número aleatorio generado: " + randomfloat);
        }



}
