public enum TipoAutomovil {
    SEDAN("Sedan","Auto comun", 5),
    STATION_WAGON("Station wagon","Auto grande", 5),
    HATCHBACK("hatchback","Auto compacto",5),
    PICKUP("Pickup","Auto grande",2),
    COUPE("Coupe","Auto chico",3),
    DEPORTIVO("Deportivo","Auto potente",2),
    CONVERTIBLE("Convertible","Auto deportivo",2);

    TipoAutomovil(String nombre, String descripcion , int numpuertas) {
        this.nombre = nombre;
        this.numpuertas = numpuertas;
        this.descripcion = descripcion;
    }

    private final String nombre;
    private final int numpuertas;
    private final String descripcion;

    public String getNombre() {
        return nombre;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "TipoAutomovil{" +
                "nombre='" + nombre + '\'' +
                ", numpuertas=" + numpuertas +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
