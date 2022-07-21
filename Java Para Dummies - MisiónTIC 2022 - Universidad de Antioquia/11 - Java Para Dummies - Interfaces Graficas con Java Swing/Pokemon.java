public class Pokemon {

    private int ataque;
    private int vida;

    public Pokemon(int ataque, int vida) {
        this.ataque = ataque;
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Pokemon otroPokemon){
        int danio = otroPokemon.getVida() - getAtaque();
        otroPokemon.setVida(danio);
        if (otroPokemon.getVida() <= 0){
            otroPokemon.setVida(0);
        }
    }
}
