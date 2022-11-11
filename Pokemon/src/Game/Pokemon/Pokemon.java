package Game.Pokemon;

import java.util.Random;

public class Pokemon {
    private String name;
    private int pokemonLevel;
    private int HP;
    public static int maxHP;
    private double height;
    private double weight;
    private int attack;
    private int defense;

    public Pokemon(String name, int pokemonLevel, int HP, double height, double weight, int attack, int defense) {
        this.name = name;
        this.pokemonLevel = pokemonLevel;
        this.HP = HP;
        this.height = height;
        this.weight = weight;
        this.attack = attack;
        this.defense = defense;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack < 10) {
            System.out.println("Your pokemon must have at least 10 attack damage! \nTry again, buddy!");
        } else if (attack > 190) {
            System.out.println("Your pokemon can not have more than 190 attack damage! \nTry again, buddy!");
        } else {
            System.out.println("Your pokemon has " + attack + " attack damage! \nLet's go, buddy!");
        }
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense < 5) {
            System.out.println("Your pokemon must have at least 5 defense! \nTry again, buddy!");
        } else if (defense > 230) {
            System.out.println("Your pokemon can not have more than 190 defense! \nTry again, buddy!");
        } else {
            System.out.println("Your pokemon has " + defense + " defense! \nLet's go, buddy!");
        }
        this.defense = defense;
    }

    public String attacking() {     //TODO look at the code structure
        Random rand = new Random();
        if (this.pokemonLevel > 0 && this.pokemonLevel <= 20) {
            setHP(getHP() - (rand.nextInt(10) + 10));
        } else if (this.pokemonLevel > 20 && this.pokemonLevel <= 40) {
            setHP(getHP() - (rand.nextInt(20) + 10));
        } else if (this.pokemonLevel > 40 && this.pokemonLevel <= 60) {
            setHP(getHP() - (rand.nextInt(20) + 20));
        } else if (this.pokemonLevel > 60 && this.pokemonLevel <= 80) {
            setHP(getHP() - (rand.nextInt(25) + 20));
        } else if (this.pokemonLevel > 80 && this.pokemonLevel <= 99) {
            setHP(getHP() - (rand.nextInt(30) + 20));
        }else if (this.pokemonLevel == 100) {
            setHP(getHP() - (rand.nextInt(40) + 40));
        } else {
            return "Your pokemon's level must be between level 1 and 100!";
        }
        return "Your HP now is: " + this.HP;
    }

    public void fallingBellow0HP() {
        if (this.HP <= 0) {
            System.out.println("Your pokemon died! :c \n(HP fell bellow 0)");
        }
    }

    @Override
    public String toString() {
        return "Pokemon's info:" +
                "\nName: " + name +
                "\nPokemon's level: " + pokemonLevel +
                "\nHP: " + HP +
                "\nHeight: " + height +
                "\nWeight: " + weight +
                "\nAttacks: " + attack +
                "\nDefense: " + defense;
    }
}
