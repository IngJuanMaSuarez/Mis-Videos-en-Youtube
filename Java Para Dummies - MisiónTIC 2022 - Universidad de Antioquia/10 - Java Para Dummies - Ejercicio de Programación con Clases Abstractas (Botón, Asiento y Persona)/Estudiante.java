public class Estudiante extends Persona {

    public Estudiante(String id, String nombre, String idioma){
        super(id, nombre, idioma);
    }

    @Override
    public void dirigir(){
        String url = getUrl();
        String idiomaNavegador = getIdioma();
        String cadenaFinal = url +"/" + idiomaNavegador + "/" + "estudiante";
        setUrl(cadenaFinal);
    }
}
