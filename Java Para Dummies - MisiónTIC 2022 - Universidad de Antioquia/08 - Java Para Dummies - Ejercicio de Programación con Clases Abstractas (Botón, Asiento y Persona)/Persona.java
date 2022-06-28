public abstract class Persona {

    //Atributos
    private String id;
    private String nombre;
    private String idioma;
    private String url = "educursos.com";

    //Constructor
    public Persona(String id, String nombre, String idioma){
        this.id = id;
        this.nombre = nombre;
        this.idioma = idioma;
    }

    //GETTER SETTER

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    //Metodos
    public abstract void dirigir();

}
