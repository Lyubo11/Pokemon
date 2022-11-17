package Game.GameBattle;

import Game.Game;
import Game.GamePlayer.Player;
import Game.Pokemon.Pokemon;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battle implements Battleable{

    private List<Player> battlePlayers;
    public static final int roundsCount = 5;

    public Battle(List<Player> battlePlayers) {
        this.battlePlayers = battlePlayers;
    }

    public List<Player> getBattlePlayers() {
        return battlePlayers;
    }

    public void setBattlePlayers(List<Player> battlePlayers) {
        this.battlePlayers = battlePlayers;
    }

    @Override
    public void startBattle() {
        int choice = 0;
        Random rand = new Random();
        int computerChoice = 0;
        for (int i = 1; i <= roundsCount; i++) {
            listOfPlayerPokemons();
            computerChoice = rand.nextInt(3) + 1;
            System.out.println("Choose a pokemon for the round: ");
            choice = Game.userInput.nextInt();
            System.out.println(choosePokemonForRound(choice));
            System.out.println(choosePokemonForRound(computerChoice));

            for (Player player:getBattlePlayers()) {
                System.out.println(player.getPokemons().get(getFormattedChoice(player, choice, computerChoice)).getName());
            }
        }
    }

    public int getFormattedChoice(Player player, int choice, int computerChoice) {
        int formattedChoice = 0;
        if (player.getUserName().startsWith("bot-")) {
            formattedChoice = choosePokemonForRound(computerChoice);
        } else {
            formattedChoice = choosePokemonForRound(choice);
        }

        return formattedChoice;
    }

    public int choosePokemonForRound(int choice) {
        if (choice >= 1 && choice <= 3) {
            return choice - 1;
        } else {
            return -1;
        }

    }

    public void listOfPlayerPokemons() {
        Player player = getBattlePlayers().get(0);
        int pokemonNum = 1;
        for (Pokemon pokemon:player.getPokemons()) {
            System.out.println("#" + pokemonNum + " " + pokemon);
            System.out.println();
            pokemonNum++;
        }
    }

    @Override
    public void endBattle() {

    }
}
