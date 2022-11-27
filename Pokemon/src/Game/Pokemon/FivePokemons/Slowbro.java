package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

import java.util.Timer;
import java.util.TimerTask;

public class Slowbro extends Pokemon{
    public Slowbro() {
        super("Slowbro", 40, 95, 1.6, 78.5, 75, 110, "WATER and PSYCHIC", "GHOST, DARK, GRASS, ELECTRIC and BUG");
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
        System.out.print("Slo");
        timer(2, "o");

        System.out.print("wbro");

        timer(4, "o");
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
