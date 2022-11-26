package Game.Pokemon;

public class Ability implements Abilityable {

    private int firstNormalAbility;
    private int secondNormalAbility;
    private int hiddenAbility;

    public Ability() {
        this.firstNormalAbility = 2;
        this.secondNormalAbility = 3;
        this.hiddenAbility = 5;
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

    public void attackCombinedWithFirstAbility(Pokemon pokemon) {
        int finalDamage = pokemon.attacking() + getFirstNormalAbility();
        System.out.println(pokemon.name + " has attacked with his first normal ability!");
        System.out.println("You have dealt " + finalDamage + " damage with your first ability!");
    }

    public void attackCombinedWithSecondAbility(Pokemon pokemon) {
        int finalDamage = pokemon.attacking() + getSecondNormalAbility();
        System.out.println(pokemon.name + " has attacked with his second normal ability!");
        System.out.println("You have dealt " + finalDamage + " damage with your second ability!");
    }

    public void attackCombinedWithHiddenAbility(Pokemon pokemon) {
        int finalDamage = pokemon.attacking() + getHiddenAbility();
        System.out.println(pokemon.name + " has attacked with his hidden ability!");
        System.out.println("You have dealt " + finalDamage + " damage with your hidden ability!");
    }

    @Override
    public String toString() {
        return "Ability's info:" +
                "\nFirst normal ability: " + firstNormalAbility +
                "\nSecond normal ability: " + secondNormalAbility +
                "\nHidden ability: " + hiddenAbility;
    }
}
