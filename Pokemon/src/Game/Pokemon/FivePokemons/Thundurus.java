package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

import java.util.Timer;
import java.util.TimerTask;

public class Thundurus extends Pokemon{

    public Thundurus(){
        super("Thundurus", 81, 79, 1.5, 61, 115, 70, "ELECTRIC and FLYING", "ICE and ROCK");
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
        System.out.print("Thu");
        timer(2, "u");

        System.out.print("nduru");

        timer(4, "u");

        System.out.print("s");
    }

    @Override
    public String toString() {
        return "Thundurus's info:" +
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
