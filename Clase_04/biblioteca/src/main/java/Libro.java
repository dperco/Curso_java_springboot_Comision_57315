public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Métodos de acceso (getters)
    /*
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    */
    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " por " + autor + " (" + anioPublicacion + ")");
    }
}
