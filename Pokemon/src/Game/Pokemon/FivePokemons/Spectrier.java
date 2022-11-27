package Game.Pokemon.FivePokemons;

import Game.Pokemon.Ability;
import Game.Pokemon.Pokemon;

import java.util.Timer;
import java.util.TimerTask;

public class Spectrier extends Pokemon{

    public Spectrier(){
        super("Spectrier", 100, 100, 2, 44.5, 65, new Ability(), 60, "GHOST", "GHOST and DARK");
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
        new Timer().scheduleAtFixedRate(new TimerTask() {
            int times = 0;

            public void run() {
                ++times;
                System.out.print("r");
                if (times == 5) {
                    System.out.println();
                    cancel();
                }
            }
        }, 1000, 1000);
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
