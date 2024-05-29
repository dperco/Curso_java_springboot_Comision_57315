
// Definición de la clase Perro
public class Perro {
    // Variables de instancia
    int tamanio;
    String nombre;
    String raza;

    // Constructor
    public Perro(String nombre, int tamanio, String raza) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.raza = raza;
    }

    // Métodos
    public void ladrar() {
        System.out.println(nombre + " está ladrando!");
    }
    public void tipoperro(){
        System.out.println("El perro " + nombre + " es un " + raza + " de tamanio " + tamanio);

    }

    public void moverCola(){
        System.out.println("El perro " + nombre + " mueve la cola");

    }
}
