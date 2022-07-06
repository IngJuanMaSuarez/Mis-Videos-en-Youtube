public class Bronce extends Asiento {

    public Bronce(char tipo, String ID){
        super(tipo, ID);
    }

    @Override
    public String imprimirMenuPantalla(){
        return "Bronce";
    }
}
