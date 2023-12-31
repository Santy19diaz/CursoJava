public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NEGRO("Negro"),
    GRIS("Gris");

    private final String color;
    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;

    }

    public String getColor() {
        return color;

    }
}
