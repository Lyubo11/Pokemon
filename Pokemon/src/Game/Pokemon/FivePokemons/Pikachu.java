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
        new Timer().scheduleAtFixedRate(new TimerTask() {
            int times = 0;

            public void run() {
                ++times;
                System.out.print("a");
                if (times == 2) {
                    System.out.println();
                    cancel();
                }
            }
        }, 1000, 1000);

        System.out.print(" chu");

        new Timer().scheduleAtFixedRate(new TimerTask() {
            int times = 0;

            public void run() {
                ++times;
                System.out.print("u");
                if (times == 4) {
                    System.out.println();
                    cancel();
                }
            }
        }, 1000, 1000);
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
