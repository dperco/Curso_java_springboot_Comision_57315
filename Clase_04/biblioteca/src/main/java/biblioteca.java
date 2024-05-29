public class biblioteca {

    public static void main(String[] args) {
        // Crear instancias de Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);

        // Mostrar la información de cada libro
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}
