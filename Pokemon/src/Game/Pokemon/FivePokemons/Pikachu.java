package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

public class Pikachu extends Pokemon {

    public Pikachu() {
        super("Pikachu", 55, 60, 0.4, 6, 55, 40, "ELECTRIC", "GROUND");
    }

    @Override
    public String attacking() {
        return super.attacking();
    }

    @Override
    public void reduceDamage(){
        super.reduceDamage();
    }

    @Override
    public void fallingBellow0HP() {
        super.fallingBellow0HP();
    }

    @Override
    public void cryMessage() {
        //TODO
    }

    @Override
    public String toString() {
        return "Pikachu's info:" +
                "\nName: " + name +
                "\nPokemon's level: " + pokemonLevel +
                "\nHP: " + HP +
                "\nHeight: " + height +
                "\nWeight: " + weight +
                "\nAttacks: " + attack +
                "\nDefense: " + defense +
                "\nType: " + type +
                "\nWeakness: " + weakness;
    }
}
