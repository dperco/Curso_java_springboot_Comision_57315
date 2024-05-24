import java.util.ArrayList;
import java.util.Random;

public class listaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        // Llenar la lista con 10 números aleatorios
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100)); // Genera números aleatorios entre 0 y 99
        }
        //ver la lista
        for(int i = 0; i <10; i++) {
            System.out.println("La lista tienen estos numeros: " + list.get(i));
        }

        // Recorrer la lista
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Número en la posición " + i + ": " + list.get(i));
            if (list.get(i) % 3 == 0) {
                System.out.println("Se encontró un número múltiplo de 3: " + list.get(i));

            }
        }
    }
}
