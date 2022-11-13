package Game.Pokemon;

public class Ability implements Abilityable {

    private int firstNormalAbility;
    private int secondNormalAbility;
    private int hiddenAbility;

    public Ability() {
        this.firstNormalAbility = 8;
        this.secondNormalAbility = 10;
        this.hiddenAbility = 15;
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
        System.out.println("You have dealt " + (pokemon.getAttack() + getFirstNormalAbility()) + " damage with your first ability!");
    }

    public void attackCombinedWithSecondAbility(Pokemon pokemon) {
        System.out.println("You have dealt " + (pokemon.getAttack() + getSecondNormalAbility()) + " damage with your second ability!");
    }

    public void attackCombinedWithHiddenAbility(Pokemon pokemon) {
        System.out.println("You have dealt " + (pokemon.getAttack() + getHiddenAbility()) + " damage with your hidden ability!");
    }

    @Override
    public String toString() {
        return "Ability's info:" +
                "\nFirst normal ability: " + firstNormalAbility +
                "\nSecond normal ability: " + secondNormalAbility +
                "\nHidden ability: " + hiddenAbility;
    }
}
