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
        Pokemon spectrier = new Spectrier();
        Pokemon thundurus = new Thundurus();
        Pokemon venusaur = new Venusaur();

        game.getAllPokemons().add(pikachu);
        game.getAllPokemons().add(slowbro);
        game.getAllPokemons().add(spectrier);
        game.getAllPokemons().add(thundurus);
        game.getAllPokemons().add(venusaur);

        for (int i = 1; i <= game.getAllPokemons().size(); i++) {
            System.out.println(i + ". " + game.getAllPokemons().get(i-1));
            System.out.println();
        }
    }

    public static void generateComputerPokemons(Player computer) {
        Random rand = new Random();
        Pokemon pikachuComp = new Pikachu();
        Pokemon slowbroComp = new Slowbro();
        Pokemon spectierComp = new Spectrier();
        Pokemon thundurusComp = new Thundurus();
        Pokemon venusaurComp = new Venusaur();

        List<Pokemon> computerPokemons = new ArrayList<>(Arrays.asList(slowbroComp, pikachuComp, spectierComp, venusaurComp, thundurusComp));
        List<Integer> randomIndexes = new ArrayList<>();
        while (computer.getPokemons().size() != 3) {
            int randomIndex = rand.nextInt(5);

            if (!randomIndexes.contains(randomIndex)) {
                computer.getPokemons().add(computerPokemons.get(randomIndex));
            }
            randomIndexes.add(randomIndex);
        }
    }

    public static void generateGamePrizes(Game game) {
        Prize pokeballs = new Prize("Pokeballs", "Your reward for winning in this tournament is: Pokeballs");
        Prize money = new Prize("money", "Your reward for winning in this tournament is: money ($)");
        Prize RP = new Prize("RP", "Your reward for winning in this tournament is: RP");
        Prize tournamentCup = new Prize("Tournament cup", "Your reward for winning in this tournament is: Tournament cup");
        Prize stars = new Prize("Stars", "Your reward for winning in this tournament is: Stars");
        Prize goldenSkunk = new Prize("Golden skunk", "Your reward for winning in this tournament is: Golden skunk");
        Prize honeyHeart = new Prize("Honey heart", "Your reward for winning in this tournament is: Honey heart");

        game.getPrizes().add(pokeballs);
        game.getPrizes().add(money);
        game.getPrizes().add(RP);
        game.getPrizes().add(tournamentCup);
        game.getPrizes().add(stars);
        game.getPrizes().add(goldenSkunk);
        game.getPrizes().add(honeyHeart);
    }

    public static void main(String[] args) {
        System.out.println("-- WELCOME TO POKEMON --");
        System.out.println("Press 'ENTER' to start the game!");
        Game.userInput.nextLine();
        //my game objects
        Player player = new Player("pokemontrainer123", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player computer = new Player("bot-pokemontrainer123", 1, 10, new ArrayList<>(), new ArrayList<>());
        Battle newBattle = new Battle(new ArrayList<>(Arrays.asList(player,computer)));
        Game newGame = new Game(newBattle, newBattle.getBattlePlayers(), new ArrayList<>(), new ArrayList<>());
        listOfPokemons(newGame);
        generateComputerPokemons(computer);
        generateGamePrizes(newGame);
        newGame.startGame();
    }
}
