public abstract class Asiento {

    //Atributos
    private char tipo;
    private String ID;
    private boolean pantallaEncendida = false;
    private double inclinacionSilla = 90;

    //Constructor
    public Asiento(char tipo, String ID){
        this.tipo = tipo;
        this.ID = ID;
    }

    //GETTER SETTER
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    //Metodos

    public void aumentarInclinacion(double d){
        inclinacionSilla += d;
        if( inclinacionSilla> 135){
            inclinacionSilla = 135;
        }
    }

    public void disminuirInclinacion(double d){
        if (inclinacionSilla - d < 0){
            inclinacionSilla = 0;
        }
        else{
            inclinacionSilla -= d;
        }
    }

    public abstract String imprimirMenuPantalla();
}
