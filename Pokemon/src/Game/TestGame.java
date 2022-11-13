package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestGame {

    public static void listOfPokemons(Game game) {
        Pokemon Pikachu = new Pokemon("Pikachu", 25, 150, 40, 6, 20, 30);
        Pokemon Eevee = new Pokemon("Eevee", 15, 100, 30, 6.5, 30, 40);
        Pokemon Charizard = new Pokemon("Charizard", 20, 150, 170, 90.5, 50, 55);
        Pokemon Snorlax = new Pokemon("Snorlax", 35, 200, 210, 460, 50, 30);
        Pokemon Garchomp = new Pokemon("Garchomp", 50, 200, 190, 95, 80, 60);

        game.getAllPokemons().add(Pikachu);
        game.getAllPokemons().add(Eevee);
        game.getAllPokemons().add(Charizard);
        game.getAllPokemons().add(Snorlax);
        game.getAllPokemons().add(Garchomp);

        for (int i = 1; i <= game.getAllPokemons().size(); i++) {
            System.out.println(i + ". " + game.getAllPokemons().get(i-1));
            System.out.println();
        }
    }

    public static void makeThreePokemonChoices(int choice, Game newGame, Scanner sc) {
        System.out.println("Pick three pokemons.");
        for (int i = 0; i < 3; i++) {
            choice = sc.nextInt();
            newGame.choosePokemon(choice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("-- WELCOME TO POKEMON --");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 'ENTER' to start the game!");
        sc.nextLine();
        //my game objects
        Prize prize = new Prize("Destroyer", "Destroyed all his opponent's pokemons.");
        Player player = new Player("pokemontrainer123", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player computer = new Player("bot-pokemontrainer123", 1, 10, player.getPokemons(), new ArrayList<>());
        Battle newBattle = new Battle(new ArrayList<>(Arrays.asList(player,computer)));
        Game newGame = new Game(newBattle, newBattle.getBattlePlayers(), prize, new ArrayList<>());
        listOfPokemons(newGame);
        int choice = 0;
        makeThreePokemonChoices(choice, newGame, sc);
        newBattle.listOfPlayerPokemons();
        System.out.println("Choose a pokemon for the round.");
        choice = sc.nextInt();
        System.out.println(newBattle.choosePokemonForRound(choice)); //тест
        newGame.startGame(choice); //TODO..... not done
    }
}
