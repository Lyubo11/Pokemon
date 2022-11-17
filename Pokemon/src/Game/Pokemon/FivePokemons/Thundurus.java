package Game.Pokemon.FivePokemons;

import Game.Pokemon.Pokemon;

import java.util.Timer;
import java.util.TimerTask;

public class Thundurus extends Pokemon{

    public Thundurus(){
        super("Thundurus", 81, 79, 1.5, 61, 115, 70, "ELECTRIC and FLYING", "ICE and ROCK");
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
        System.out.print("Thu");
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

        System.out.print("nduru");

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
