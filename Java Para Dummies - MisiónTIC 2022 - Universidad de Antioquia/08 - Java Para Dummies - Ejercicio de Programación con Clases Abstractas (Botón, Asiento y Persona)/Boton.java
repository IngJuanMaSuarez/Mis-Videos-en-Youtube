public abstract class Boton {

    //Atributos
    private double ancho;
    private double alto;
    private String colorFondo;
    private String texto;

    //Constructor
    public Boton(double ancho, double alto, String colorFondo, String texto){
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
        this.texto = texto;
    }

    //GETTER SETTER
    public double getAncho(){
        return ancho;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    //Metodos
    public abstract void hacerClick();

}
