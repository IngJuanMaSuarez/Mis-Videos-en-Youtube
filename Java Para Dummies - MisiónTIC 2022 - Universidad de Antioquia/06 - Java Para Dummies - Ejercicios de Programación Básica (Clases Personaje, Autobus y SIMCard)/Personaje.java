public class Personaje {

    private String nombre;
    private char sexo;
    private double posicionX = 0;
    private double posicionY = 0;
    private int numeroBotiquines = 0;
    private double vida = 100;

    public Personaje(String nombre, char sexo){
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getNumeroBotiquines(){
        return numeroBotiquines;
    }

    public double getVida(){
        return vida;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public void usarBotiquin(){
        numeroBotiquines -= 1;
        //numeroBotiquines = numeroBotiquines - 1;

        vida += 5;
        //vida = vida + 5;
    }

    public double calcularDistanciaRespectoOrigen(){
        x1 -x2
        return distancia;
    }
}
