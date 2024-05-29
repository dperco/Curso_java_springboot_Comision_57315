public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación del método abstracto
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
