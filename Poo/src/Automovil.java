public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int tanque = 40;
    private static Color colorPatente = Color.NEGRO;
    private static int tanqueEstatico = 30;

    private TipoAutomovil tipo;
    private static int ultimoid;
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 60;
    public Automovil(){
        this.id = ++ultimoid;
    }
    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color,double cilindrada){
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color,double cilindrada,int tanque){
        this(fabricante,modelo,color,cilindrada);
        this.tanque = tanque;
    }
    public String getFabricante() {
        return fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static int getTanqueEstatico() {
        return tanqueEstatico;
    }

    public static void setTanqueEstatico(int tanqueEstatico) {
        Automovil.tanqueEstatico = tanqueEstatico;
    }

    public String verDetalle(){

        return  "\nid : " + this.id +
                "\nfabricante : " + this.getFabricante() +
                "\nmodelo : " + this.getModelo() +
                "\ntipo : " + this.getTipo().getNombre() +
                "\ncolor : " + this.getColor() +
                "\ncolor.patente = " + getColorPatente() +
                "\ncilindrada : " + this.getCilindrada() + '\n';
    }

    public String acelerar(int rpm){
        return "el auto" + modelo + " acelerando a " + rpm + " rpm\n";
    }

    public String frenar(){
        return fabricante + " " + this.modelo + " frenando!\n";

    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + '\n' + frenar;
    }

     public float calcularConsumo(int km, float porcentajeGas){
       return  km/(this.tanque*porcentajeGas);
     }

     public float calcularConsumo(int km, int porcentajeGas){
        return  km/(this.tanque*(porcentajeGas/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGas){
        return  km/(Automovil.tanqueEstatico * (porcentajeGas/100f));
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil a)){
            return false;
        }

        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                &&this.modelo.equals(getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " +modelo;
    }
}
