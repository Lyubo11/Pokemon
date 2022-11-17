package Game.GameBattle;

import Game.Game;
import Game.GamePlayer.Player;
import Game.Pokemon.Pokemon;

import java.util.ArrayList;
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
        cloneArraysForBothPlayers();

        for (int i = 1; i <= roundsCount; i++) {
            listOfPlayerPokemons();
            computerChoice = rand.nextInt(3) + 1;
            System.out.println("Choose a pokemon for the round: ");
            choice = Game.userInput.nextInt();

            while (true) {
                fightPokemon(choice, computerChoice);
                if (checkPokemonDefeat(choice, computerChoice)) break;
            }
        }
    }

    public void cloneArraysForBothPlayers() {
        for (Player player:getBattlePlayers()) {
            player.clonePokemonArray();
        }
    }

    public void fightPokemon(int choice, int computerChoice) {
        for (Player player:getBattlePlayers()) {
            userAttackMessage(player);
            System.out.println(player.getRoundPokemons().get(getFormattedChoice(player, choice, computerChoice)).getHP());
            System.out.println(player.getRoundPokemons().get(getFormattedChoice(player, choice, computerChoice)).attacking());
            System.out.println(player.getUserName());
            System.out.println(player.getRoundPokemons().get(getFormattedChoice(player, choice, computerChoice)).getHP());
            System.out.println();
            if (checkPokemonDefeat(choice, computerChoice)) break;
        }
    }

    private boolean checkPokemonDefeat(int choice, int computerChoice) {
        int playerPokemonsHP = getBattlePlayers().get(0).getRoundPokemons().get(getFormattedChoice(getBattlePlayers().get(0), choice, computerChoice)).getHP();
        int computerPokemonsHP = getBattlePlayers().get(1).getRoundPokemons().get(getFormattedChoice(getBattlePlayers().get(1), choice, computerChoice)).getHP();
        if (playerPokemonsHP <= 0) {        //TODO || computer , и да оправя проблема с -стойност
            getBattlePlayers().get(0).getRoundPokemons().remove(choice - 1);
            return true;
        } else if (computerPokemonsHP <= 0) {
            getBattlePlayers().get(1).getRoundPokemons().remove(computerChoice - 1);
            return true;
        }
        return false;
    }

    public void userAttackMessage(Player player) {
        int playerID = 0;
        if (!player.getUserName().startsWith("bot-")) {
            playerID = 1;
        }
        System.out.println(getBattlePlayers().get(playerID).getUserName() + " attacks " + player.getUserName());
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
        for (Player player:getBattlePlayers()) {
            int pokemonNum = 1;
            for (Pokemon pokemon:player.getRoundPokemons()) {
                System.out.println("#" + pokemonNum + " " + pokemon);
                System.out.println();
                pokemonNum++;
            }
            System.out.println();
        }
    }

    @Override
    public void endBattle() {

    }
}
