package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

public class Spectrier extends Pokemon{

    public Spectrier(){
        super("Spectrier", 100, 100, 2, 44.5, 65, 60, "GHOST", "GHOST and DARK");
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
        return "Spectrier's info:" +
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
