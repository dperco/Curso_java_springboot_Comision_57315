import java.util.ArrayList;
import java.util.List;

public class forClass {

    public static void main(String[] args){
        /*
        int[] list = new int[20];

        for(int j=0; j<=19; j++){
            list[j]= j;
            System.out.println("El contador es: " + list[j] );
        }
       */

        /*
        int[] numeros =
                {1,2,3,4,5};
        for (int elemento : numeros) {
            System.out.println("El contador es: " + elemento);
        }
        */


    //foreach

        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        listaColores.forEach( i -> {
            System.out.println("Color: " + i);
        });




    }




}



