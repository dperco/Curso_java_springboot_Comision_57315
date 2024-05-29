public class SobrecargaMetodos {

    // Método con un argumento String y un argumento int
    public void mostrarDatos(String texto, int numero) {
        System.out.println("String: " + texto + ", int: " + numero);
    }

    // Método con un argumento int y un argumento String
    public void mostrarDatos(int numero, String texto) {
        System.out.println("int: " + numero + ", String: " + texto);
    }
}
