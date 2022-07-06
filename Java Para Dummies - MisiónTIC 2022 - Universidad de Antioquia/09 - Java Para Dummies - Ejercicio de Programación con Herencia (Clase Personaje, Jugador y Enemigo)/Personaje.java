public class Personaje {
    //Inserte acá los atributos
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida = 100;

    //Inserte acá el método constructor
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage){
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear(Personaje p){
        double d = calcularDistanciaRespectoPersonaje(p);
        p.vida -= damage / d;
        if (p.vida < 0){
            p.vida = 0;
        }
    }

    public void recibirImpacto(double d){
        vida -= d;
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p){
        return Math.sqrt(Math.pow(posicionX - p.posicionX, 2) + Math.pow(posicionY - p.posicionY, 2));
    }

    //Inserte acá los SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}