package Game.Pokemon;

import Game.Game;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Pokemon implements Pokemonable, Cloneable {
    protected String name;
    protected int pokemonLevel;
    protected int HP;
    public static int maxHP;
    protected double height;
    protected double weight;
    protected int attack;
    protected int firstNormalAbility;
    protected int secondNormalAbility;
    protected int hiddenAbility;
    protected int defense;
    protected String type;
    protected String weakness;

    public Pokemon(String name, int pokemonLevel, int HP, double height, double weight, int attack, int defense, String type, String weakness) {
        this.name = name;
        this.pokemonLevel = pokemonLevel;
        this.HP = HP;
        this.height = height;
        this.weight = weight;
        this.attack = attack;
        this.firstNormalAbility = 2;
        this.secondNormalAbility = 3;
        this.hiddenAbility = 5;
        this.defense = defense;
        this.type = type;
        this.weakness = weakness;
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
        if (HP > 255) {
            System.out.println("Your pokemon can not have more than 255 HP! \nTry again, buddy!");
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

    public int getFirstNormalAbility() {
        return firstNormalAbility;
    }

    public void setFirstNormalAbility(int firstNormalAbility) {
        this.firstNormalAbility = firstNormalAbility;
    }

    public int getSecondNormalAbility() {
        return secondNormalAbility;
    }

    public void setSecondNormalAbility(int secondNormalAbility) {
        this.secondNormalAbility = secondNormalAbility;
    }

    public int getHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(int hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense < 5) {
            System.out.println("Your pokemon must have at least 5 defense! \nTry again, buddy!");
        } else if (defense > 230) {
            System.out.println("Your pokemon can not have more than 230 defense! \nTry again, buddy!");
        } else {
            System.out.println("Your pokemon has " + defense + " defense! \nLet's go, buddy!");
        }
        this.defense = defense;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int attacking() {
        Random rand = new Random();
        if (this.pokemonLevel > 0 && this.pokemonLevel <= 20) {
            return (getHP() - (rand.nextInt(10) + 10));
        } else if (this.pokemonLevel > 20 && this.pokemonLevel <= 40) {
            return (getHP() - (rand.nextInt(20) + 10));
        } else if (this.pokemonLevel > 40 && this.pokemonLevel <= 60) {
            return (getHP() - (rand.nextInt(20) + 20));
        } else if (this.pokemonLevel > 60 && this.pokemonLevel <= 80) {
            return (getHP() - (rand.nextInt(25) + 20));
        } else if (this.pokemonLevel > 80 && this.pokemonLevel <= 99) {
            return (getHP() - (rand.nextInt(30) + 20));
        } else if (this.pokemonLevel == 100) {
            return (getHP() - (rand.nextInt(40) + 40));
        } else {
            return 0;
        }
    }

    public void chooseAbility() {
        System.out.println("Choose ability to fight with: ");
        System.out.println("1. First Normal Ability");
        System.out.println("2. Second Normal Ability");
        System.out.println("3. Hidden Normal Ability");

        int choice = 0;
        while (true) {
            choice = Game.userInput.nextInt();
            if (choice == 1) {
                setHP(attacking() + getFirstNormalAbility());
                break;
            } else if (choice == 2) {
                setHP(attacking() + getSecondNormalAbility());
                break;
            } else if (choice == 3) {
                setHP(attacking() + getHiddenAbility());
                break;
            } else {
                System.out.println("Invalid Input! \nThere is no such choice!");
            }
        }
    }

    @Override
    public void trainPokemon() {
        if ((getPokemonLevel() > 0) && (getPokemonLevel() < 100)) {
            setPokemonLevel(getPokemonLevel() + 1);
        }
        if ((getAttack() > 10) && (getAttack() < 190)) {
            setAttack(getAttack() + 1);
        }
        if ((getDefense() > 5) && (getDefense() < 229)) {
            setDefense(getDefense() + 2);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void cryMessage();

    public void timer(int timesCount, String cryLetter) {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            int times = 0;

            public void run() {
                ++times;
                System.out.print(cryLetter);
                if (times == timesCount) {
                    System.out.println();
                    cancel();
                }
            }
        }, 1000, 1000);
    };

    @Override
    public String toString() {
        return "Pokemon's info:" +
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
