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
                try {
                    if (fightPokemon(choice, computerChoice)) break;
                } catch (Exception e) {
                    System.out.println("That pokemon is no longer pickable.");
                    System.out.println("Choose a pokemon for the round: ");
                    choice = Game.userInput.nextInt();
                }
            }
        }
        winBattleMessage();
    }

    public void cloneArraysForBothPlayers() {
        for (Player player:getBattlePlayers()) {
            player.clonePokemonArray();
        }
    }

    public boolean fightPokemon(int choice, int computerChoice) {
        Pokemon pokemon;
        int pokemonHealthBefore = 0;
        int pokemonHealthAfter = 0;
        for (Player player:getBattlePlayers()) {
            pokemon = player.getRoundPokemons().get(getFormattedChoice(player, choice, computerChoice));
            userAttackMessage(player);

            pokemonHealthBefore = pokemon.getHP();
            System.out.println(pokemon.getName() + " health before attack: " + pokemonHealthBefore);
            pokemon.attacking();
            pokemonHealthAfter = pokemon.getHP();
            System.out.println(pokemon.getName() + " health after attack: " + pokemonHealthAfter);
            System.out.println(player.getUserName() + "'s pokemon has lost " + (pokemonHealthBefore - pokemonHealthAfter) + "HP.");
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
            roundWinMessage(choice, playerID, computerID);
            return true;
        } else if (computerPokemonsHP <= 0) {
            roundWinMessage(computerChoice, computerID, playerID);
            return true;
        }
        return false;
    }

    public void roundWinMessage(int choice, int ID1, int ID2) {
        getBattlePlayers().get(ID1).getRoundPokemons().remove(choice - 1);
        System.out.println(getBattlePlayers().get(ID2).getUserName() + " has won the round.");
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
            System.out.println(player.getUserName() + "'s pokemons.");
            System.out.println();
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
