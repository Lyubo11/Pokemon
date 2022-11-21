package Game.GameBattle;

import Game.Game;
import Game.GamePlayer.Player;
import Game.Pokemon.Pokemon;

import java.util.List;
import java.util.Random;

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
            System.out.println("Round #" + i);
            System.out.println();
            listOfPlayerPokemons();
            int tempComputerPokemonsCount = getBattlePlayers().get(1).getRoundPokemons().size();
            computerChoice = rand.nextInt(tempComputerPokemonsCount) + 1;
            System.out.println("Choose a pokemon for the round: ");
            choice = Game.userInput.nextInt();

            while (true) {
                if (fightPokemon(choice, computerChoice)) break;
            }
            //TODO round win message??
        }
        winBattleMessage();
    }

    public void cloneArraysForBothPlayers() {
        for (Player player:getBattlePlayers()) {
            player.clonePokemonArray();
        }
    }

    public boolean fightPokemon(int choice, int computerChoice) {
        for (Player player:getBattlePlayers()) {
            userAttackMessage(player);
            System.out.println(player.getRoundPokemons().get(getFormattedChoice(player, choice, computerChoice)).getHP());
            System.out.println(player.getRoundPokemons().get(getFormattedChoice(player, choice, computerChoice)).attacking());
            System.out.println(player.getUserName());
            System.out.println(player.getRoundPokemons().get(getFormattedChoice(player, choice, computerChoice)).getHP());
            System.out.println();
            if (checkPokemonForDefeat(choice, computerChoice)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkPokemonForDefeat(int choice, int computerChoice) {
        int playerID = 0;
        int computerID = 1;
        int playerPokemonsHP = getBattlePlayers().get(playerID).getRoundPokemons().get(getFormattedChoice(getBattlePlayers().get(playerID), choice, computerChoice)).getHP();
        int computerPokemonsHP = getBattlePlayers().get(computerID).getRoundPokemons().get(getFormattedChoice(getBattlePlayers().get(computerID), choice, computerChoice)).getHP();

        if (playerPokemonsHP <= 0) {
            getBattlePlayers().get(playerID).getRoundPokemons().remove(choice - 1);
            return true;
        } else if (computerPokemonsHP <= 0) {
            getBattlePlayers().get(computerID).getRoundPokemons().remove(computerChoice - 1);
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
    public void winBattleMessage() {
        for (Player player:getBattlePlayers()) {
            if (!(player.getRoundPokemons().size() == 0)) {
                System.out.println(player.getUserName() + " has won the battle!");
            }
        }

    }
}
