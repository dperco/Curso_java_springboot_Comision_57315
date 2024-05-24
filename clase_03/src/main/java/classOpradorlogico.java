import java.util.ArrayList;
import java.util.List;

public class classOpradorlogico {

    public static void main(String[] args){

      // and y or
      /*
        int valor1 = 1;
        int valor2 = 2;
        if((valor1 == 1) && (valor2 == 2))
            System.out.println("valor1 es 1 AND valor2 es 2");
        if((valor1 == 1) || (valor2 == 1))
            System.out.println("valor1 es 1 OR valor2 es 1");


       */

      /*
        int[] intArray;
        // Asigna memoria para 5 enteros
        intArray = new int[5];
        // Inicializa el primer elemento
        intArray[0] = 100;
        // Inicializa el segundo elemento
        intArray[1] = 200;
        // continua inicializando el resto de los elementos
        intArray[2] = 300;
        intArray[3] = 400;
        intArray[4] = 500;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Elemento en el indice " + i + ": " + intArray[i]);

        }
      */

     /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        Iterator<String> iterator = listaColores.iterator();

        System.out.println("Cantidad de elementos para iterar: " + listaColores.size());
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println("Color: " + color);
        }

      */

    /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        Iterator<String> iterator = listaColores.iterator();

        System.out.println("Cantidad de elementos para iterar: " + listaColores.size());
        do  {
            String color = iterator.next();
            System.out.println("Color: " + color);

        } while ((iterator.hasNext()));
     */
    /*

        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        for (Iterator<String> iter = listaColores.iterator(); iter.hasNext();){
            String color = iter.next();
            System.out.println("Color: " + color);
        }
     */


    /*
        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        listaColores.forEach( color -> {
            System.out.println("Color: " + color);
        });
     */

    /*

        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        System.out.println("Cantidad de elementos para iterar: " + listaColores.size());

        int indice =0;
        while(indice < listaColores.size()){
            System.out.println("Color: " + listaColores.get(indice));
            indice++;
        }
     */

     /*

        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        System.out.println("Cantidad de elementos para iterar: " + listaColores.size());

        for (int i = 0; i < listaColores.size(); i++){
            System.out.println("Color: " + listaColores.get(i));
        }
     */



    }

}
