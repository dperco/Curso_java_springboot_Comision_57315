


public class claseDog {

    public static void main(String[] args){
        Perro miPerro = new Perro("Firulais", 30, "Labrador");
        Perro perroVecino= new Perro("Brutus",45,"bulldog");
        // Llamar al método ladrar de la instancia de Perro
        miPerro.ladrar();
        miPerro.moverCola();
        miPerro.tipoperro();

        perroVecino.ladrar();
        perroVecino.tipoperro();
    }

}
