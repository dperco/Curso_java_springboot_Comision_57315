public class Vehiculo {
    // Variable de instancia protected
    protected String marca;

    // Variable de instancia private
    private String numeroChasis;

    // Constructor
    public Vehiculo(String marca, String numeroChasis) {
        this.marca = marca;
        this.numeroChasis = numeroChasis;
    }

    // Método protected
    protected void mostrarMarca() {
        System.out.println("Marca del vehículo: " + marca);
    }

    // Método private
    private void mostrarNumeroChasis() {
        System.out.println("Número de chasis: " + numeroChasis);
    }

    // Método público que permite acceso al método private
    public void mostrarInfoChasis() {
        mostrarNumeroChasis();
    }
}
