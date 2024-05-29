public class Incrementar {

    // Variable de instancia
    private int number;

    public Incrementar() {
        // Inicializar la variable de instancia con un valor.
        number = 0;
    }

    // Método para incrementar la variable de instancia
    public void incrementNumber() {
        number++;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Incrementer
        Incrementar incrementer = new Incrementar();

        // Imprimir el valor inicial de la variable de instancia
        System.out.println("Valor inicial: " + incrementer.number);

        // Invocar el método para incrementar la variable de instancia
        incrementer.incrementNumber();

        // Imprimir el valor incrementado de la variable de instancia
        System.out.println("Valor incrementado: " + incrementer.number);
    }
}

/*

En este código:

La clase Incrementer tiene una variable de instancia llamada number.
El constructor Incrementer() inicializa number con el valor 0.
El método incrementNumber() incrementa el valor de number en 1 cada vez que se llama.
En el método main, se crea una instancia de Incrementer, se imprime el valor inicial de number,
se llama a incrementNumber() para incrementar number, y luego se imprime el valor incrementado.
Cuando ejecutes este programa, verás la siguiente salida:

Valor inicial: 0
Valor incrementado: 1
Esto demuestra que la variable number se incrementa correctamente mediante el método incrementNumber().

 */
