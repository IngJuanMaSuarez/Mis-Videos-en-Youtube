public class Enemigo extends Personaje {
    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    //Inserte acá el método constructor
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage){
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void evolucionar(){
        if(getVida() <= 30 && evolucionesAplicadas == 0){
            setDamage(getDamage() + 20);
            evolucionesAplicadas++;
        }
        if(getVida() <= 10 && evolucionesAplicadas == 1){
            resistencia++;
            evolucionesAplicadas++;
        }
        if(getVida() <= 10 && evolucionesAplicadas == 0){
            setDamage(getDamage() + 20);
            resistencia++;
            evolucionesAplicadas += 2;
        }
    }

    public void recibirImpacto(double d){
        setVida(getVida() - (d / resistencia));
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}