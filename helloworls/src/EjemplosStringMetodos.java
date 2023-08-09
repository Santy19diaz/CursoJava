public class EjemplosStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Santiago";

        System.out.println("nombre.length() = " + nombre.length());//largo
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//mayusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//minusculas
        System.out.println("nombre.equals(\"Santiago\") = " + nombre.equals("Santiago"));//comparar
        System.out.println("nombre.equalsIgnoreCase(\"santiago\") = " + nombre.equalsIgnoreCase("santiago"));
        System.out.println("nombre.compareTo(\"Santiago\") = " + nombre.compareTo("Santiago"));//comparar
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.su = " + nombre.substring(1));
        System.out.println("nombre.su = " + nombre.substring(0 ,5 ));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"tra\") = " + trabalenguas.contains("tra"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());

    }
}

