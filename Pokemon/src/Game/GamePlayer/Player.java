package Game.GamePlayer;

import Game.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player{
    private String userName;
    private int playerLevel;
    private double experience;
    private List<Pokemon> pokemons;
    private List<Prize> wonPrizes;
    private List<Pokemon> roundPokemons;

    public Player(String userName, int playerLevel, double experience, List<Pokemon> pokemons, List<Prize> wonPrizes) {
        this.userName = userName;
        this.playerLevel = playerLevel;
        this.experience = experience;
        this.pokemons = pokemons;
        this.wonPrizes = wonPrizes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        if (playerLevel >= 0) {
            this.playerLevel = playerLevel;
        } else {
            System.out.println("Invalid level input!");
        }
    }

    public void clonePokemonArray() {
        this.roundPokemons = new ArrayList<>(getPokemons());
    }

    public List<Prize> getWonPrizes() {
        return wonPrizes;
    }

    public void setWonPrizes(List<Prize> wonPrizes) {
        this.wonPrizes = wonPrizes;
    }

    public List<Pokemon> getRoundPokemons() {
        return roundPokemons;
    }

    public void setRoundPokemons(List<Pokemon> roundPokemons) {
        this.roundPokemons = roundPokemons;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience >= 0.0) {
            this.experience = experience;
        } else {
            System.out.println("Invalid experience input!");
        }

    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Prize> getWonMedals() {
        return wonPrizes;
    }

    public void setWonMedals(List<Prize> wonPrizes) {
        this.wonPrizes = wonPrizes;
    }

    @Override
    public String toString() {
        return "Trainer's info" +
                "\nUser's Name: " + userName +
                "\nLevel: " + playerLevel +
                "\nExperience: " + experience;
    }
}
