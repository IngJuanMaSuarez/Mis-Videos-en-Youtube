public class Main {

    public static void main(String[] args) {

        int miVariable = 5;
        Pokemon miPokemon = new Pokemon("Pikachu", "Electrico");

        Pokemon pokemonRival = new Pokemon("Charmander", "Fuego");
        Pokemon otroPokemon = new Pokemon(5);

        System.out.println(miPokemon.getNumero());
        miPokemon.setNumero(200);
        System.out.println(miPokemon.getNumero());
        miPokemon.setNumero(142);
        System.out.println(miPokemon.getNumero());

        System.out.println(miPokemon.toString(5));
        System.out.println(otroPokemon.toString("Hola"));
        System.out.println(otroPokemon.toString(10, false));

        System.out.println("******************");
        miPokemon.caminar(7);
        miPokemon.caminar(0);
        miPokemon.caminar(-45);

        System.out.println(miPokemon.caminar(3));
        System.out.println("******************");

        miPokemon.luchar(miPokemon, pokemonRival);
    }
}
