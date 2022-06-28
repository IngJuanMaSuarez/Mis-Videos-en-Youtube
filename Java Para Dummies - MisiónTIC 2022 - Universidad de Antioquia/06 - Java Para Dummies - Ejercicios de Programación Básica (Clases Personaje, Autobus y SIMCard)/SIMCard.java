public class SIMCard {

    //Declaracion de atributos de clase
    private String empresaTelefonia = "HI"; //Se inicializa en HI
    private double saldo = 0; // Se inicializa en 0
    private String numeroTelefono;
    private int saldoDatos = 0;
    private boolean celularApagado = false;

    //Metodo constructor con numeroTelefono de parametro
    public SIMCard(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }

    //SETTERS
    public void setEmpresaTelefonia(String empresaTelefonia){
        this.empresaTelefonia = empresaTelefonia;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public  void setNumeroTelefono(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }

    // GETTERS
    //public TipoDeDato get + "NombreAtributo" ()
    // { return NombreAtributo}
    public String getEmpresaTelefonia(){
        return empresaTelefonia;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    public boolean isCelularApagado(){
        return celularApagado;
    }

    //METODOS
    public void comprarDatos(int c){

        int costo = 0;

        if (c <= 10){
            costo = c * 3000;
        }
        else if (c <= 30){
            costo = 30000 + ((c - 10) * 2500);
        }
        else{
            costo = 60000 + ((c - 20) * 1500);
        }

        saldo = saldo - costo;
        saldoDatos = saldoDatos + c;
    }

    public void gestionarEncendidoCelular(){
        if (celularApagado == true){
            celularApagado = false;
        }
        else{
            celularApagado = true;
        }

        celularApagado = !celularApagado;
    }

}
