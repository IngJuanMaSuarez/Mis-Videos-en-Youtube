public class BotonPrueba extends Boton{

    //Constructor
    public BotonPrueba(double ancho, double alto, String colorFondo, String texto){
        super(ancho, alto, colorFondo, texto);
    }

    @Override
    public void hacerClick(){
        setTexto("Hello World");
    }
}
