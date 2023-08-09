public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int tanque = 40;

    public Automovil(String fabricante, String modelo){

        this.fabricante = fabricante;
        this.modelo = modelo;

    }
    public Automovil(){}

    public String getFabricante() {
        return fabricante;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public String verDetalle(){

        return "\nfabricante : " + this.fabricante +
                "\nmodelo : " + this.modelo +
                "\ncolor : " + this.color +
                "\ncilindrada : " + this.cilindrada;
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
}
