package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.FivePokemons.*;
import Game.Pokemon.Pokemon;

import java.util.*;

public class TestGame {

    public static void listOfPokemons(Game game) {
        Pokemon pikachu = new Pikachu();
        Pokemon slowbro = new Slowbro();
        Pokemon spectier = new Spectrier();
        Pokemon thundurus = new Thundurus();
        Pokemon venusaur = new Venusaur();

        game.getAllPokemons().add(pikachu);
        game.getAllPokemons().add(slowbro);
        game.getAllPokemons().add(spectier);
        game.getAllPokemons().add(thundurus);
        game.getAllPokemons().add(venusaur);

        for (int i = 1; i <= game.getAllPokemons().size(); i++) {
            System.out.println(i + ". " + game.getAllPokemons().get(i-1));
            System.out.println();
        }
    }

    public static void generateComputerPokemons(Player computer, Game game) {
        Random rand = new Random();
        List<Integer> randomIndexes = new ArrayList<>();
        while (computer.getPokemons().size() != 3) {
            int randomIndex = rand.nextInt(5);

            if (!randomIndexes.contains(randomIndex)) {
                computer.getPokemons().add(game.getAllPokemons().get(randomIndex));
            }
            randomIndexes.add(randomIndex);
        }
    }

    public static void main(String[] args) {
        System.out.println("-- WELCOME TO POKEMON --");
        System.out.println("Press 'ENTER' to start the game!");
        Game.userInput.nextLine();
        //my game objects
        Prize prize = new Prize("Destroyer", "Destroyed all his opponent's pokemons.");
        Player player = new Player("pokemontrainer123", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player computer = new Player("bot-pokemontrainer123", 1, 10, new ArrayList<>(), new ArrayList<>());
        Battle newBattle = new Battle(new ArrayList<>(Arrays.asList(player,computer)));
        Game newGame = new Game(newBattle, newBattle.getBattlePlayers(), prize, new ArrayList<>());
        listOfPokemons(newGame);
        generateComputerPokemons(computer, newGame);
        newGame.startGame();
    }
}
