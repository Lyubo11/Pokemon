package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.Pokemon;

import java.util.ArrayList;
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

        //TODO още няколко обекта от покемонм след което да ги принтна в main и с цифрички да се избира кой покемон всеки от играчите иска за битката му
        //като се избере цифра да се добавя в battlePokemons list-a
        //TODO да направим различни видове покемони(класове) които да наследяват Pokemon класа за да имаме пример за наследяване в проекта
        //както и да е абстрактен Pokemon за да имаме абстракция.
    }

    public static void choosePokemon(Game game, int choice) {
        game.getBattle().getBattlePokemons().add(game.getAllPokemons().get(choice-1));  //TODO да ги преместя в game класа
    }

    public static void main(String[] args) {
        System.out.println("-- WELCOME TO POKEMON --");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 'ENTER' to start the game!");
        sc.nextLine();
        Battle newBattle = new Battle(new ArrayList<>(), new ArrayList<>());
        Player player = new Player("pokemontrainer123", 20, 350, new ArrayList<>(), new ArrayList<>());
        Prize prize = new Prize("Destroyer", "Destroyed all his opponent's pokemons.");
        Game newGame = new Game(newBattle, player, prize, new ArrayList<>());
        System.out.println("Pick three pokemons.");
        listOfPokemons(newGame);
        int choice = sc.nextInt();

        choosePokemon(newGame, choice);
    }
}
