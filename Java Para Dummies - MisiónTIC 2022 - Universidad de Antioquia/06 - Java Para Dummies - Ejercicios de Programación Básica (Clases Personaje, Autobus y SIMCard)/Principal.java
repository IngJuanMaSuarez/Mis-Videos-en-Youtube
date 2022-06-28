public class Principal {

    public static void main(String[] args) {

        Personaje miPersonaje = new Personaje("JuanMa", 'M');
        System.out.println(miPersonaje.getNombre());
        System.out.println(miPersonaje.getSexo());
        System.out.println(miPersonaje.getPosicionX());
        System.out.println(miPersonaje.getPosicionY());

        System.out.println(miPersonaje.getVida());
        miPersonaje.usarBotiquin();
        System.out.println(miPersonaje.getVida());

        System.out.println("***********************");
        SIMCard miSIM = new SIMCard("123456789");
        System.out.println(miSIM.getNumeroTelefono());
        System.out.println(miSIM.getSaldo());
        System.out.println(miSIM.getEmpresaTelefonia());

        System.out.println("***********************");
        Autobus miBus = new Autobus("Manuel");
        System.out.println(miBus.getCantidadDinero());
        System.out.println(miBus.getNombreConductor());
        System.out.println(miBus.getnPasajeros());

        miSIM.setSaldo(50000);
        System.out.println(miSIM.getSaldo());
    }
}
