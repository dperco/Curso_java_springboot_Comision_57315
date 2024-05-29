public class metodoEstatic {

        public static void main(String[] args) {
            // Llamada directa a los métodos estáticos de UtilidadMatematica
            int resultadoCuadrado = UtilidadMatematica.cuadrado(5);
            int resultadoSuma = UtilidadMatematica.suma(10, 20);

            System.out.println("El cuadrado de 5 es: " + resultadoCuadrado);
            System.out.println("La suma de 10 y 20 es: " + resultadoSuma);
        }
}

/*
En la clase principal Main, se utilizan los métodos estáticos cuadrado y suma llamándolos a través del
nombre de la clase UtilidadMatematica. No es necesario instanciar UtilidadMatematica para usar estos métodos.

Cuando ejecutes Main, obtendrás la siguiente salida:

El cuadrado de 5 es: 25
La suma de 10 y 20 es: 30
Este ejemplo muestra cómo los métodos estáticos son útiles para realizar operaciones que no dependen
del estado de una instancia de clase, sino que operan solo con los parámetros proporcionados.

 */

