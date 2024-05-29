public class ejemploOverload {
    public static void main(String[] args) {
        SobrecargaMetodos sobrecarga = new SobrecargaMetodos();

        // Invocar el primer método mostrarDatos con String e int
        sobrecarga.mostrarDatos("Prueba", 10);

        // Invocar el segundo método mostrarDatos con int y String
        sobrecarga.mostrarDatos(20, "Ejemplo");
    }
}

/*
En la clase SobrecargaMetodos, se definen dos métodos mostrarDatos. Uno toma un String seguido de un int,
 y el otro toma un int seguido de un String. Aunque tienen el mismo nombre, Java los distingue por sus
 listas de parámetros.

En la clase principal ejemploOverload, se crea una instancia de SobrecargaMetodos y se invocan ambos
 métodos mostrarDatos con los argumentos requeridos.

Cuando ejecutes Main, obtendrás la siguiente salida:

String: Prueba, int: 10
int: 20, String: Ejemplo
Este programa demuestra la sobrecarga de métodos en Java, permitiendo que dos métodos tengan el mismo
 nombre pero se diferencien por sus tipos y orden de parámetros.

 */