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

//    @Override
//    public int reduceDamage(){
//        super.reduceDamage();
//        return 0;
//    }

    @Override
    public void trainPokemon() {
        super.trainPokemon();
    }

    @Override
    public void cryMessage() {
        System.out.print("Venu");
        new Timer().scheduleAtFixedRate(new TimerTask() {
            int times = 0;

            public void run() {
                ++times;
                System.out.print("u");
                if (times == 2) {
                    System.out.println();
                    cancel();
                }
            }
        }, 1000, 1000);

        System.out.print("sau");

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
