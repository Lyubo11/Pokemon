package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

import java.util.Timer;
import java.util.TimerTask;

public class Venusaur extends Pokemon {

    public Venusaur() {
        super("Venusaur", 75, 80, 2, 100, 82, 83, "GRASS and POISON", "FIRE, PSYCHICS, FLYING and ICE");
    }

    @Override
    public int attacking() {
        return super.attacking();
    }

    @Override
    public void trainPokemon() {
        super.trainPokemon();
    }

    @Override
    public void cryMessage() {
        System.out.print("Venu");
        timer(2, "u");

        System.out.print("sau");

        timer(4, "u");

        System.out.print("r");
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
