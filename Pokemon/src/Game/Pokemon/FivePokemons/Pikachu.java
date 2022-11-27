package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

import java.util.Timer;
import java.util.TimerTask;

public class Pikachu extends Pokemon {

    public Pikachu() {
        super("Pikachu", 55, 60, 0.4, 6, 55, 40, "ELECTRIC", "GROUND");
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
        System.out.print("Pika");
        timer(2, "a");

        System.out.print(" chu");

        timer(4, "u");
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
