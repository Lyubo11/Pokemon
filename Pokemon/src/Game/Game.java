package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.Pokemon;

import java.util.List;
import java.util.Scanner;

public class Game implements Gameable, Winable, Messagable {

    private Battle battle;
    private List<Player> players;
    private Prize prize;
    private List<Pokemon> allPokemons;
    public static final int battlesCount = 5;
    public static Scanner userInput = new Scanner(System.in).useDelimiter("\\R");

    public Game(Battle battle, List<Player> players, Prize prize, List<Pokemon> allPokemons) {
        this.battle = battle;
        this.players = players;
        this.prize = prize;
        this.allPokemons = allPokemons;
    }

    public void makeThreePokemonChoices() {
        System.out.println("Pick three pokemons.");
        int choice = 0;
        for (int i = 0; i < 3; i++) {
            choice = userInput.nextInt();
            choosePokemon(choice);
            System.out.println();
        }
    }

    @Override
    public void startGame() {
        makeThreePokemonChoices();
        for (int i = 1; i <= battlesCount; i++) {
            getBattle().startBattle();
        }
    }

    @Override
    public void winGame() {

    }

    @Override
    public void winPrize() {

    }

    @Override
    public void winPokemon() {

    }

    @Override
    public void winCristals() {

    }

    @Override
    public void loseGame() {

    }

    @Override
    public void winGameMessage() {

    }

    @Override
    public void loseMessage() {

    }

    public boolean choosePokemon(int choice) {
        if (choice >= 1 && choice <= 5) {
            getPlayers().get(0).getPokemons().add(getAllPokemons().get(choice-1));
            System.out.println("Successfully added pokemon #" + choice + " to your battle pokemons.");
            return true;
        } else {
            System.out.println("There's no such pokemon number.");
            return false;
        }
    }

    public Battle getBattle() {
        return battle;
    }

    public void setBattle(Battle battle) {
        this.battle = battle;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }

    public List<Pokemon> getAllPokemons() {
        return allPokemons;
    }

    public void setAllPokemons(List<Pokemon> allPokemons) {
        this.allPokemons = allPokemons;
    }
}