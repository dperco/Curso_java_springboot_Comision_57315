import java.util.ArrayList;
import java.util.List;

public class classList {

    public static void main(String[] args) {

    // bucar listas distintas
    /*
        List<String> listaDestino = new ArrayList<>();
        listaDestino.add("Celeste");
        listaDestino.add("Blanco");
        listaDestino.add("negro");
        List<String> listaOrigen = new ArrayList<>();
        listaOrigen.add("Blanco");
        listaOrigen.add("Celeste");
        System.out.println("La lista destino contiene la lista origen?: " + listaDestino.containsAll(listaOrigen));
     */



    //buscar listas iguales
    /*
            List<String> listaDestino = new ArrayList<>();
            listaDestino.add("Celeste");
            listaDestino.add("Blanco");
            List<String> listaOrigen = new ArrayList<>();
            listaOrigen.add("Celeste");
            listaOrigen.add("Blanco");
            System.out.println("La lista destino contiene la lista origen?: " + listaDestino.containsAll(listaOrigen));
   */


     //agregar elemnetos
    /*
        List<String> listaDestino = new ArrayList<>();
        listaDestino.add("Celeste");
        listaDestino.add("Blanco");
        List<String> listaOrigen = new ArrayList<>();
        listaOrigen.add("Azul");
        listaOrigen.add("Verde");
        listaDestino.addAll(listaOrigen);

        for (String color : listaDestino){
            System.out.println("Color: " + color);
        }
    */

    // remover
    /*
        List<String> listaDestino = new ArrayList<>();
        listaDestino.add("Celeste");
        listaDestino.add("Blanco");
        listaDestino.add("Azul");
        listaDestino.add("Verde");
        listaDestino.add("Azul");

        List<String> listaOrigen = new ArrayList<>();
        listaOrigen.add("Azul");
        listaOrigen.add("Verde");

        System.out.println("Collection destino inicial");
        for (String color : listaDestino){
            System.out.println("Color: " + color);
        }

        System.out.println("Collection origen");
        for (String color : listaOrigen){
            System.out.println("Color: " + color);
        }
        listaDestino.removeAll(listaOrigen);

        System.out.println("Collection destino final");
        for (String color : listaDestino){
            System.out.println("Color: " + color);
        }
     */

    // remover
    /*

        List<String> listaDestino = new ArrayList<>();
        listaDestino.add("Celeste");
        listaDestino.add("Blanco");
        listaDestino.add("Azul");
        listaDestino.add("Verde");
        listaDestino.add("Azul");

        List<String> listaOrigen = new ArrayList<>();
        listaOrigen.add("Azul");
        listaOrigen.add("Verde");

        System.out.println("Collection destino inicial");
        for (String color : listaDestino){
            System.out.println("Color: " + color);
        }

        System.out.println("Collection origen");
        for (String color : listaOrigen){
            System.out.println("Color: " + color);
        }
        listaDestino.retainAll(listaOrigen);

        System.out.println("Collection destino final");
        for (String color : listaDestino){
            System.out.println("Color: " + color);
        }
     */

     //clear

    /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Azul");
        listaColores.add("Verde");
        listaColores.add("Azul");

        System.out.println("Collection destino inicial");
        for (String color : listaColores){
            System.out.println("Color: " + color);
        }

        listaColores.clear();

        System.out.println("Collection destino final");
        if(listaColores.isEmpty()){
            System.out.println("la lista no tiene elementos");
        }else {

            for (String color : listaColores) {
                System.out.println("Color: " + color);
            }
        }
      */


    // get

        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Azul");
        listaColores.add("Verde");
        listaColores.add("Azul");

        int pos = 2;
        System.out.println("El color en la posición " + pos + " es: " + listaColores.get(pos));


     //set
    /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");

        for (String color : listaColores){
            System.out.println("Color: " + color);
        }

        listaColores.set(0,"Verde");

        for (String color : listaColores){
            System.out.println("Color: " + color);
        }
     */

     // remove
    /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Verde");

        System.out.println("Lista original");
        for (String color : listaColores){
            System.out.println("Color: " + color);
        }

        listaColores.remove(0);

        System.out.println("Lista final");
        for (String color : listaColores){
            System.out.println("Color: " + color);
        }
     */


    // search
    /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Verde");
        listaColores.add("Celeste");

        String color = "Celeste";
        System.out.println("El color " + color + " esta en la posición " + listaColores.indexOf(color));
    */

     //lastIndex
    /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Verde");
        listaColores.add("Celeste");

        String color = "Celeste";
        System.out.println("La última posición del color " + color + " es " + listaColores.lastIndexOf(color));

     */



    }
}
