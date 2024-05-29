public class VariableModifier {

    // Variable de instancia
    private int number;

    public VariableModifier() {
        // Inicializar la variable de instancia con un valor.
        number = 10;
    }

    // Método para cambiar la variable de instancia a un valor fijo
    public void setNumberToTwenty() {
        number = 20;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase VariableModifier
        VariableModifier modifier = new VariableModifier();

        // Imprimir el valor inicial de la variable de instancia
        System.out.println("Valor inicial: " + modifier.number);

        // Invocar el método para cambiar la variable de instancia
        modifier.setNumberToTwenty();

        // Imprimir el valor después de cambiarlo
        System.out.println("Valor después de cambiar: " + modifier.number);
    }
}

/*
En este código:

La clase VariableModifier tiene una variable de instancia llamada number.
El constructor VariableModifier() inicializa number con el valor 10.
El método setNumberToTwenty() cambia el valor de number a 20.
En el método main, se crea una instancia de VariableModifier, se imprime el valor inicial de number,
se llama a setNumberToTwenty() para cambiar number, y luego se imprime el nuevo valor.
Cuando ejecutes este programa, verás la siguiente salida:

Valor inicial: 10
Valor después de cambiar: 20
Esto demuestra que la variable number se cambia correctamente mediante el método setNumberToTwenty()


 */
