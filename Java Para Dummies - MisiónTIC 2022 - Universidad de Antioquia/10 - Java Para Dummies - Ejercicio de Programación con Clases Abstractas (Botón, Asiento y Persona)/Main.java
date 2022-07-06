public class Main{
    public static void main(String[] args) {

        BotonPrueba miBoton = new BotonPrueba(5, 3, "Rojo", "Hola a Todos");
        System.out.println(miBoton.getTexto());
        miBoton.hacerClick();
        System.out.println(miBoton.getTexto());

        Estudiante miEstudiante = new Estudiante("123456", "JuanMa", "ingles");
        System.out.println(miEstudiante.getUrl());
        miEstudiante.dirigir();
        System.out.println(miEstudiante.getUrl());

        Bronce miSilla = new Bronce('b', "123456");
        System.out.println(miSilla.getInclinacionSilla());
        miSilla.disminuirInclinacion(85);
        System.out.println(miSilla.getInclinacionSilla());
        miSilla.disminuirInclinacion(15);
        System.out.println(miSilla.getInclinacionSilla());
        miSilla.aumentarInclinacion(85);
        System.out.println(miSilla.getInclinacionSilla());
        miSilla.aumentarInclinacion(15);
        System.out.println(miSilla.getInclinacionSilla());
        miSilla.aumentarInclinacion(100);
        System.out.println(miSilla.getInclinacionSilla());

    }
}
