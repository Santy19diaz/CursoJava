class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarReferenciaDos {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Alejandra");

        System.out.println("inicio del metodo main");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("Antes de llamar a metodo test");
        test(persona);
        System.out.println("Despues de llamar a metodo test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("Fin metodo main con los datos modificados");

    }
    public static void test(Persona persona){
        System.out.println("inicio metodo test ");
        persona.modificarNombre("Hanna");
        System.out.println("finaliza el metodo test ");
    }
}
