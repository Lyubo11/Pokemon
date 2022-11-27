package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

import java.util.Timer;
import java.util.TimerTask;

public class Spectrier extends Pokemon{

    public Spectrier(){
        super("Spectrier", 100, 100, 2, 44.5, 65, 60, "GHOST", "GHOST and DARK");
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
        System.out.print("Spectrie");
        timer(5, "r");
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
