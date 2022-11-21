package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.FivePokemons.*;
import Game.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestGame {

    public static void listOfPokemons(Game game) {
        Pokemon Pikachu = new Pikachu();
        Pokemon Slowbro = new Slowbro();
        Pokemon Spectrier = new Spectrier();
        Pokemon Thundurus = new Thundurus();
        Pokemon Venusaur = new Venusaur();

        game.getAllPokemons().add(Pikachu);
        game.getAllPokemons().add(Slowbro);
        game.getAllPokemons().add(Spectrier);
        game.getAllPokemons().add(Thundurus);
        game.getAllPokemons().add(Venusaur);

        for (int i = 1; i <= game.getAllPokemons().size(); i++) {
            System.out.println(i + ". " + game.getAllPokemons().get(i-1));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("-- WELCOME TO POKEMON --");
        System.out.println("Press 'ENTER' to start the game!");
        Game.userInput.nextLine();
        //my game objects
        Prize prize = new Prize("Destroyer", "Destroyed all his opponent's pokemons.");
        Player player = new Player("pokemontrainer123", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player computer = new Player("bot-pokemontrainer123", 1, 10, player.getPokemons(), new ArrayList<>());
        Battle newBattle = new Battle(new ArrayList<>(Arrays.asList(player,computer)));
        Game newGame = new Game(newBattle, newBattle.getBattlePlayers(), prize, new ArrayList<>());
        listOfPokemons(newGame);
        newGame.startGame();
    }
}
