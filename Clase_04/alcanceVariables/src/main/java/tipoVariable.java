public class tipoVariable {

    // Variable de instancia
    private int instanceVariable;

    // Variable de clase (estática)
    private static int classVariable;

    public tipoVariable(int value) {
        // Asignar valor a la variable de instancia
        this.instanceVariable = value;
    }

    public void showVariableScopes(int methodParameter) {
        // Variable local
        int localVariable = methodParameter;

        // Acceso a la variable de instancia
        System.out.println("Valor de la variable de instancia: " + instanceVariable);

        // Acceso a la variable de clase (estática)
        System.out.println("Valor de la variable de clase: " + classVariable);

        // Acceso a la variable local
        System.out.println("Valor de la variable local: " + localVariable);
    }

    public static void modifyClassVariable(int value) {
        // Modificar la variable de clase
        classVariable = value;
    }

    public static void main(String[] args) {
        // Crear una instancia de VariableScopeExample
        tipoVariable example = new tipoVariable(10);

        // Modificar y mostrar la variable de clase
        modifyClassVariable(20);
        System.out.println("Valor inicial de la variable de clase: " + classVariable);

        // Mostrar el alcance de las variables
        example.showVariableScopes(30);

        // Crear otra instancia de VariableScopeExample
        tipoVariable anotherExample = new tipoVariable(40);

        // Mostrar el alcance de las variables para la nueva instancia
        anotherExample.showVariableScopes(50);

        // La variable de clase es compartida por todas las instancias
        System.out.println("Valor de la variable de clase después de modificar desde otra instancia: " + classVariable);
    }
}


/*
En este código, tenemos:

Una variable de instancia (instanceVariable), que pertenece a una instancia específica de tipoVariable.
Cada objeto de esta clase tendrá su propia copia de esta variable.
Una variable de clase (classVariable), también conocida como variable estática, que es compartida por todas
 las instancias de la clase. No es necesario crear un objeto de la clase para acceder a ella, y se puede acceder
 directamente con el nombre de la clase.
Una variable local (localVariable), que se declara dentro de un método (showVariableScopes). Su alcance está limitado
al bloque de código del método en el que se declara.
Un parámetro de método (methodParameter), que es una variable local que se pasa al método cuando se llama.
El método main crea instancias de VariableScopeExample y muestra cómo el valor de la variable de clase se comparte
 entre las instancias, mientras que cada instancia tiene su propio valor para la variable de instancia. Además, se
 muestra cómo las variables locales solo existen dentro del método donde se declaran.

 */