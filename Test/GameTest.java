import Game.Game;
import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.FivePokemons.Pikachu;
import Game.Pokemon.FivePokemons.Spectrier;
import Game.Pokemon.Pokemon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void testRandomWinPrize_WhenWinRandomPrize_ThenWinPrizeArrayPlus1() {
        Pokemon pikachu = new Pikachu();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        testPlayer.getRoundPokemons().add(pikachu);

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.randomWinPrize();
        int expected = 1;
        int actual = testPlayer.getWonPrizes().size();
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testRandomWinPrize_WhenPlayerWinBattle_ThenPlayerLevelUp() {
        Pokemon pikachu = new Pikachu();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        testPlayer.getRoundPokemons().add(pikachu);

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.randomWinPrize();
        int expected = 21;
        int actual = testPlayer.getPlayerLevel();
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testDecideWhoWinsGame_WhenPlayerBattlePoints5_ThenWin5Crystals() {
        Pokemon pikachu = new Pikachu();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        battle.setPlayerBattlePoints(5);
        testPlayer.getRoundPokemons().add(pikachu);

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.decideWhoWinGame();
        int expected = 5;
        int actual = testPlayer.getCristals();
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testDecideWhoWinsGame_WhenPlayerBattlePointsMinus10_ThenErrorAnd0() {
        Pokemon pikachu = new Pikachu();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        battle.setPlayerBattlePoints(-10);
        testPlayer.getRoundPokemons().add(pikachu);

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.decideWhoWinGame();
        int expected = 0;
        int actual = testPlayer.getCristals();
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testDecideWhoWinsGame_WhenPlayerBattlePoints0_Then0() {
        Pokemon pikachu = new Pikachu();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        testPlayer.getRoundPokemons().add(pikachu);

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.decideWhoWinGame();
        int expected = 0;
        int actual = testPlayer.getCristals();
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testChoosePokemon_WhenChoice2_ThenTrue() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.getAllPokemons().add(pikachu);
        testGame.getAllPokemons().add(spectrier);
        boolean expected = true;
        boolean actual = testGame.choosePokemon(2);
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testChoosePokemon_WhenChoice500_ThenFalse() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.getAllPokemons().add(pikachu);
        testGame.getAllPokemons().add(spectrier);
        boolean expected = false;
        boolean actual = testGame.choosePokemon(500);
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testChoosePokemon_WhenChoiceMinus30_ThenFalse() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));

        Prize pokeballs = new Prize("Pokeballs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi mattis.");
        Prize money = new Prize("money", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin rhoncus.");
        Prize RP = new Prize("RP", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In eget.");

        Game testGame = new Game(battle, new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)), new ArrayList<>(Arrays.asList(pokeballs, money, RP)), new ArrayList<>());
        testGame.getAllPokemons().add(pikachu);
        testGame.getAllPokemons().add(spectrier);
        boolean expected = false;
        boolean actual = testGame.choosePokemon(-30);
        assertEquals("Method failed", expected, actual);
    }
}
