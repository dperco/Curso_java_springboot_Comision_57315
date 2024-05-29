public class Coche extends Vehiculo {
    // Variable de instancia private
    private int numeroDePuertas;

    // Constructor
    public Coche(String marca, String numeroChasis, int numeroDePuertas) {
        super(marca, numeroChasis);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Método público para mostrar toda la información del coche
    public void mostrarInformacion() {
        mostrarMarca(); // Acceso permitido a método protected
        mostrarInfoChasis(); // Acceso permitido a método público que accede a uno private
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}