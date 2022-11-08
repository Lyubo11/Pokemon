package Game.Pokemon;

import java.util.List;
import java.util.Random;

public class Pokemon {
    private String name;
    private int pokemonLevel;
    private int HP;
    public static int maxHP;
    private double height;
    private double weight;
    private List<Attack> attacks;

    public Pokemon(String name, int pokemonLevel, int HP, double height, double weight) {     //TODO List<Attack>attacks
        this.name = name;
        this.pokemonLevel = pokemonLevel;
        this.HP = HP;
        this.height = height;
        this.weight = weight;
//      TODO  this.attacks = attacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokemonLevel() {
        return pokemonLevel;
    }

    public void setPokemonLevel(int pokemonLevel) {
        if (pokemonLevel <= 0) {
            System.out.println("Your pokemon must be at least level 1! \nTry again, buddy!");
        } else if (pokemonLevel > 100) {
            System.out.println("Your pokemon can not be higher level than 100! \nTry again, buddy!");
        } else {
            System.out.println("Your pokemon is level " + pokemonLevel + "! \nLet's go, buddy!");
        }
        this.pokemonLevel = pokemonLevel;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        if (HP <= 0) {
            System.out.println("Your pokemon must have at least 1 HP! \nTry again, buddy!");
        } else if (HP > 255) {
            System.out.println("Your pokemon can not have more than 255 HP! \nTry again, buddy!");
        } else {
            System.out.println("Your pokemon has " + HP + " HP! \nLet's go, buddy!");
        }
        this.HP = HP;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Your pokemon must be at least 1 meter tall! \nTry again, buddy!");
        } else if (height == 1) {
            System.out.println("Your pokemon is " + height + " meter tall! \nLet's go, buddy!");
        } else if (height > 20) {
            System.out.println("Your pokemon can not be taller than 20 meters! \nTry again, buddy!");
        } else {
            System.out.println("Your pokemon is " + height + " meters tall! \nLet's go, buddy!");
        }
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0.1) {
            System.out.println("Your pokemon must weight at least 0.1 kg! \nTry again, buddy!");
        } else if (weight > 1590.8) {
            System.out.println("Your pokemon can not be heavier than 1590.8 kg! \nTry again, buddy!");
        } else {
            System.out.println("Your pokemon is " + weight + " kg! \nLet's go, buddy!");
        }
        this.weight = weight;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public int attacking() {
        Random rand = new Random();
        setHP(getHP() - (rand.nextInt(25) + 20));
        return this.HP;
    }

    @Override
    public String toString() {
        return "Pokemon's info:" +
                "\nName: " + name +
                "\nPokemon's level: " + pokemonLevel +
                "\nHP: " + HP +
                "\nHeight: " + height +
                "\nWeight: " + weight +
                "\nAttacks: " + attacks;
    }
}
