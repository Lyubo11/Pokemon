package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

public class Venusaur extends Pokemon {

    public Venusaur() {
        super("Venusaur", 75, 80, 2, 100, 82, 83, "GRASS and POISON", "FIRE, PSYCHICS, FLYING and ICE");
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
        return "Venusaur's info:" +
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
