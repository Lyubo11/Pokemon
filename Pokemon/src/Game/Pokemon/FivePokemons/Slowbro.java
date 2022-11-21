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
    public int reduceDamage(){
        super.reduceDamage();
        return 0;
    }

    @Override
    public void fallingBellow0HP() {
        super.fallingBellow0HP();
    }

    @Override
    public void cryMessage() {
        System.out.print("Slo");
        new Timer().scheduleAtFixedRate(new TimerTask() {
            int times = 0;

            public void run() {
                ++times;
                System.out.print("o");
                if (times == 2) {
                    System.out.println();
                    cancel();
                }
            }
        }, 1000, 1000);

        System.out.print("wbro");

        new Timer().scheduleAtFixedRate(new TimerTask() {
            int times = 0;

            public void run() {
                ++times;
                System.out.print("o");
                if (times == 4) {
                    System.out.println();
                    cancel();
                }
            }
        }, 1000, 1000);
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
