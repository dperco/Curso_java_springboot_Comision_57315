public class metodoAbstract {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 5);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}

/*

En la clase principal metodoAbstract, se crean instancias de Circulo y Rectangulo, y se llama al método
 calcularArea()
para cada una. Aunque se utilizan referencias de tipo Figura, en tiempo de ejecución se invocan las
implementaciones específicas de calcularArea() definidas en Circulo y Rectangulo.

Este ejemplo ilustra cómo los métodos abstractos permiten definir un contrato en la clase base que todas
las subclases deben cumplir, proporcionando su propia implementación específica del método.

*/
