public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setTanqueEstatico(45);
        Automovil nissan2 = new Automovil("Nissan","370z");

        nissan2.setColor(Color.AZUL);
        nissan2.setCilindrada(3.0);
        nissan2.setTanque(60);
        System.out.println("Velocidad maxima permitida en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA + "km/h");
        System.out.println("Velocidad maxima permitida en ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD + "km/h");


        Automovil.setColorPatente(Color.BLANCO);

        Automovil audi = new Automovil("Audi","A3");

        audi.setColor(Color.GRIS);
        audi.setCilindrada(3.0);
        audi.setTanque(50);

        Automovil chevrolet = new Automovil("chevrolet","Camaro zz",Color.AMARILLO,3.5);

        chevrolet.setTanque(90);

        System.out.println(nissan2.verDetalle());
        System.out.println(audi.verDetalle());
        System.out.println(chevrolet.verDetalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litro: " + Automovil.calcularConsumoEstatico(300,60));

    }
}
