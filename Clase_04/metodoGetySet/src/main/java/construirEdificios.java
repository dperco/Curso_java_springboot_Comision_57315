public class construirEdificios {

    public static void main(String[] args) {
        Edificio primerEdificio = new Edificio();
        Edificio segundoEdificio = new Edificio();

        // Seteo la variable del priemr edficio
        primerEdificio.setCantidadPisos(4);
        // Seteo la variable del segundo edficio
        segundoEdificio.setCantidadPisos(10);

        // Obtengo la variable del priemr edificio
        System.out.println("Cantidad de pisos primer edificio: " +   primerEdificio.getCantidadPisos());

        // Obtengo la variable del segundo edificio
        System.out.println("Cantidad de pisos segundo edificio: " +   segundoEdificio.getCantidadPisos());
    }

}
