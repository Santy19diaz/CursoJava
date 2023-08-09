public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil nissan = new Automovil("Nissan","370z");

        nissan.setColor("Plata");
        nissan.setCilindrada(3.0);
        nissan.setTanque(50);

        Automovil chevrolet = new Automovil("chevrolet","Camaro zz");

        chevrolet.setColor ("Amarillo con rayas");
        chevrolet.setCilindrada (3.5);

        Automovil subaru = new Automovil();

        subaru.setFabricante("subaru");
        subaru.setModelo("Impresa");
        subaru.setCilindrada(2.4);
        subaru.setColor("rojo");
        subaru.setTanque(50);

        System.out.println(nissan.verDetalle());
        System.out.println(chevrolet.verDetalle());
        System.out.println(chevrolet.acelerar(3000));
        System.out.println(nissan.acelerar(5000));

        System.out.println("Rendimiento combustible: " + nissan.calcularConsumo(300,0.78f)+'\n');
        System.out.println("Rendimiento combustible: " + nissan.calcularConsumo(300,78));



    }
}
