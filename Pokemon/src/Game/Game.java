package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.Pokemon;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game implements Gameable, Winable, Messagable {

    private Battle battle;
    private List<Player> players;
    private List<Prize> prizes;
    private List<Pokemon> allPokemons;
    public static final int battlesCount = 5;
    public static Scanner userInput = new Scanner(System.in).useDelimiter("\\R");

    public Game(Battle battle, List<Player> players, List<Prize> prizes, List<Pokemon> allPokemons) {
        this.battle = battle;
        this.players = players;
        this.prizes = prizes;
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
    public void randomWinPrize() {
        Random rand = new Random();
        int randomNum = rand.nextInt(getPrizes().size());
        Prize randomPrizeWin = getPrizes().get(randomNum);
        int previousPlayerLevel = 0;
        for (Player player:players) {

            if (!(player.getRoundPokemons().size() == 0)) {
                player.getWonPrizes().add(randomPrizeWin);
                System.out.println(player.getUserName() + " has just won a prize: " + randomPrizeWin);
                System.out.println();
                previousPlayerLevel = player.getPlayerLevel();
                player.setPlayerLevel(player.getPlayerLevel() + 1);
                System.out.println(player.getUserName() + " got higher level: " + previousPlayerLevel + " --> " + player.getPlayerLevel());
            }
        }
    }

    @Override
    public void startGame() {
        makeThreePokemonChoices();
        for (int i = 1; i <= battlesCount; i++) {
            System.out.println("Battle #" + i);
            getBattle().startBattle();
            randomWinPrize();
            System.out.println();
            getBattle().winBattleMessage();
        }
        decideWhoWinGame();
    }

    @Override
    public void decideWhoWinGame() {
        int playerID = 0;
        int computerID = 1;

        if (getBattle().getComputerBattlePoints() < getBattle().getPlayerBattlePoints()) {
            winGameMessage(playerID);
            winCristals(playerID, getBattle().getPlayerBattlePoints());
        } else {
            winGameMessage(computerID);
            winCristals(computerID, getBattle().getComputerBattlePoints());
        }
    }

    @Override
    public void winCristals(int playerID, int battlePoints) {
        int getCristals = players.get(playerID).getCristals();
        players.get(playerID).setCristals(getCristals + battlePoints);
    }

    @Override
    public void winGameMessage(int playerID) {
        String playerUsername = players.get(playerID).getUserName();
        System.out.println(playerUsername + " has won the game!");
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

    public List<Prize> getPrizes() {
        return prizes;
    }

    public List<Pokemon> getAllPokemons() {
        return allPokemons;
    }

    public void setAllPokemons(List<Pokemon> allPokemons) {
        this.allPokemons = allPokemons;
    }
}