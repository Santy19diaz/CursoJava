public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setTanqueEstatico(45);
        Automovil nissan2 = new Automovil("Nissan","370z");

        nissan2.setColor(Color.AZUL);
        nissan2.setCilindrada(3.0);
        nissan2.setTanque(60);
        nissan2.setTipo(TipoAutomovil.DEPORTIVO);

        Automovil.setColorPatente(Color.BLANCO);

        Automovil audi = new Automovil("Audi","A3");

        audi.setColor(Color.GRIS);
        audi.setCilindrada(3.0);
        audi.setTanque(50);
        audi.setTipo(TipoAutomovil.COUPE);

        TipoAutomovil tipo = nissan2.getTipo();
        System.out.println("Tipo nissan: " + tipo.getNombre());
        System.out.println("Descripcion nissan: " + tipo.getDescripcion());
        System.out.println("NUmero de puertas nissan: " + tipo.getNumpuertas());

        tipo = audi.getTipo();

        switch (tipo){

            case CONVERTIBLE ->
                System.out.println("El Automovil es deportivo y descapotable");

            case COUPE ->
                System.out.println("El automovil es compacto, ademas de ser la version de 2 puertas de los sedan");

            case SEDAN->
                System.out.println("El automovil suele ser de uso ejecutivo o de uso diario, tiene 4 puertas y comodidades");

            case PICKUP->
                System.out.println("El automovil es una camioneta de carga y trabajo");

            case DEPORTIVO->
                System.out.println("Los autos deportivos son mas potentes y divertidos");

            case HATCHBACK->
                System.out.println("Este tipo de auto se caracteriza por ser una version reducida, sin llegar a coupe");

            case STATION_WAGON->
                System.out.println("Este es un auto que por lo general tiene 3 filas de asientos");

        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.println(ta + "->" + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumpuertas() + "\n");
        }

    }
}