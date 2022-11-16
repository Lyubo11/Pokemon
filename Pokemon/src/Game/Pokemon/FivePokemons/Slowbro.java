package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

public class Slowbro extends Pokemon{
    public Slowbro() {
        super("Slowbro", 40, 95, 1.6, 78.5, 75, 110, "WATER and PSYCHIC", "GHOST, DARK, GRASS, ELECTRIC and BUG");
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
        return "Slowbro's info:" +
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
