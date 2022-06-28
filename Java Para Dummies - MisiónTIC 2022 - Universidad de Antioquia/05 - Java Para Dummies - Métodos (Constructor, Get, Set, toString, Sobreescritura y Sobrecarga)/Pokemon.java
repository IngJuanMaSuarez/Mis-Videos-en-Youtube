public class Pokemon {

    private double numero = 0;
    private String nombre = "";
    private String tipo = "";
    private boolean evolucion = true;

    public Pokemon(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Pokemon(double numero){
        this.numero = numero;
    }

    //GETTERS retorna el valor de un atributo.
    // Se debe poner la palabra reservada return
    public double getNumero(){
        return numero;
    }

    //SETTERS modificar el valor de un atributo
    //No retornan nada, se debe poner la palabra reservada void
    public void setNumero(double numero){
        if (numero <= 150){
            this.numero = numero;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEvolucion() {
        return evolucion;
    }

    public void setEvolucion(boolean evolucion) {
        this.evolucion = evolucion;
    }

    //@Override
    //public String toString() {
    //    return getClass().getName() + "@" + Integer.toHexString(hashCode());
    //}

    public String toString(int num) {
        return "Este es el metodo que recibe un int de entrada";
    }

    public String toString(int num, boolean x) {
        return "Este es el metodo que recibe un int y un bool de entrada";
    }

    public String toString(String name) {
        return "Este es el metodo que recibe un String de entrada";
    }

    public String caminar(int numeroPasos){
        if (numeroPasos <= 0){
            System.out.println("No esta caminando");
            return "Solo es posible caminar hacia adelante";
        }
        else{
            System.out.println("Esta caminando");
            return "Pikachu ha avanzado " + numeroPasos + " pasos";
        }
    }

    public void luchar(Pokemon miPokemon, Pokemon pokemonRival){
        System.out.println(miPokemon.nombre + " ha atacado a " + pokemonRival.nombre + " con un ataque de tipo " + miPokemon.tipo);
    }
}
