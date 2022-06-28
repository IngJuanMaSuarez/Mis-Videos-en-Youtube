public class Autobus {

    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;

    public Autobus(String nombreConductor){
        this.nombreConductor = nombreConductor;
    }

    //GETTERS
    public String getNombreConductor(){
        return nombreConductor;
    }

    public int getnPasajeros(){
        return nPasajeros;
    }

    public double getCantidadDinero(){
        return cantidadDinero;
    }

    //SETTERS
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    //METODOS
    public void recogerPasajero(int estrato){

        int costo = 0;

        if (estrato <= 2){
            costo = 1500;
        }
        else if (estrato <= 4){
            costo = 2600;
        }
        else{
            costo = 3000;
        }

        //cantidadDinero = cantidadDinero + costo;
        cantidadDinero += costo;
    }
}
