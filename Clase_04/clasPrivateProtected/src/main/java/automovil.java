public class automovil{
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "123ABC", 4);
        coche.mostrarInformacion();
    }
}


/*
En este ejemplo:

La clase Vehiculo tiene una variable marca con acceso protected, lo que significa que puede ser accedida directamente por
cualquier subclase o clase en el mismo paquete. También tiene una variable numeroChasis con acceso private, lo que significa
que solo puede ser accedida dentro de la clase Vehiculo.
La clase Vehiculo también tiene un método mostrarMarca() con acceso protected y un método mostrarNumeroChasis() con acceso
 private. El método mostrarInfoChasis() es public y proporciona un acceso controlado al número de chasis, llamando
 internamente al método private.

La clase Coche extiende Vehiculo y tiene acceso a la variable protected marca y al método protected mostrarMarca().
 No puede acceder directamente a numeroChasis ni a mostrarNumeroChasis() porque son private en la clase padre.

La clase automovil crea una instancia de Coche y llama a su método mostrarInformacion(), que muestra toda la información del coche,
incluyendo la marca y el número de chasis a través de los métodos permitidos.
Recuerda que cada clase debe estar en su propio archivo con el nombre correspondiente a la clase. Por ejemplo, Vehiculo.java
 para la clase Vehiculo, Coche.java para la clase Coche, y Main.java para la clase Main.


 */