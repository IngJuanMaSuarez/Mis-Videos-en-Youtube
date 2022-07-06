public class Main {
    public static void main(String[] args) {

        Jugador j = new Jugador("Explorador", 'm', 3, 3, 100);
        Enemigo e = new Enemigo("Virico", 'f', 1, 1, 120);

        System.out.println(j);
    }
}