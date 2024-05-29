public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}