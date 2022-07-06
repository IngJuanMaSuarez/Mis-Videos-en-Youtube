public class Jugador extends Personaje {
    //              ^ (Jugador hereda de Personaje)
    //Inserte acá los atributos
    private int numeroBotiquines = 0;

    //Inserte acá el método constructor
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage){
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void moverDerecha(double d){
        setPosicionX(getPosicionX() + d);
    }

    public void moverIzquierda(double d){
        setPosicionX(getPosicionX() - d);
    }

    public void moverArriba(double d){
        setPosicionY(getPosicionY() + d);
    }

    public void moverAbajo(double d){
        setPosicionY(getPosicionY() - d);
    }

    public void recogerBotiquin(){
        numeroBotiquines++;
    }

    public void usarBotiquin(){
        if (numeroBotiquines >= 1){
            if ((getVida() + 5 <= 100)){
                setVida(getVida() + 5);
            }
            else{
                setVida(100);
            }
            numeroBotiquines--;
        }
    }

    public void golpear(Enemigo p){
        double d = calcularDistanciaRespectoPersonaje(p);
        p.setVida(p.getVida() - (getDamage() / d));
        if (p.getVida() < 0){
            p.setVida(0);
        }
        p.evolucionar();
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
}