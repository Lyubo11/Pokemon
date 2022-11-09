package Game.GamePlayer;

import java.util.List;

public class Player {
    private String userName;
    private int playerLevel;
    private double experience;
    private List<Pokemon> pokemons;
    private List<Medal> wonMedals;

    public Player(String userName, int playerLevel, double experience, List<Pokemon> pokemons, List<Medal> wonMedals) {
        this.userName = userName;
        this.playerLevel = playerLevel;
        this.experience = experience;
        this.pokemons = pokemons;
        this.wonMedals = wonMedals;
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
            System.out.println("Invalid level input.");
        }

    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience >= 0.0) {
            this.experience = experience;
        } else {
            System.out.println("Invalid experience input.");
        }

    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Medal> getWonMedals() {
        return wonMedals;
    }

    public void setWonMedals(List<Medal> wonMedals) {
        this.wonMedals = wonMedals;
    }

    @Override
    public String toString() {
        return "Player{" +
                "userName='" + userName + '\'' +
                ", level=" + playerLevel +
                ", experience=" + experience +
                '}';
    }
}
