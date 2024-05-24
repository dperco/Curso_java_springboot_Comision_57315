import java.util.ArrayList;
import java.util.Scanner;



public class ejemplosVarios {

    public static void main(String[] args){
    /*
        float numero= 1345.7890006f;
        String formateado= String.format("%.3f", (double)numero);

        System.out.println(formateado);
    */


                // Crear un array de productos
                String[] productos = {"Manzana", "Banana", "Naranja", "Uva"};

                // Crear un array de precios
                double[] precios = {0.5, 0.3, 0.4, 0.7};

                // Crear un ArrayList para almacenar los productos comprados
                ArrayList<String> carrito = new ArrayList<String>();
                ArrayList<Integer> cantidades = new ArrayList<Integer>();

                // Crear un Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in);

                // Pedir al usuario que ingrese los productos que quiere comprar
                System.out.println("Ingrese los productos que quiere comprar y su cantidad (termina con 'fin'):");
                String producto;
                while (!(producto = scanner.nextLine()).equalsIgnoreCase("fin")) {
                    System.out.println("Ingrese la cantidad para " + producto + ":");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    carrito.add(producto);
                    cantidades.add(cantidad);
                }

                // Calcular el total de la compra
                double total = 0;
                for (int j = 0; j < carrito.size(); j++) {
                    for (int i = 0; i < productos.length; i++) {
                        if (carrito.get(j).equalsIgnoreCase(productos[i])) {
                            total += precios[i] * cantidades.get(j);
                        }
                    }
                }

                // Imprimir los productos comprados y el total
                System.out.println("Productos comprados: " + carrito);
                System.out.println("Cantidades: " + cantidades);
                System.out.println("Total: $" + total);




    }
}



