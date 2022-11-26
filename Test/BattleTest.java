import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.Pokemon.FivePokemons.Pikachu;
import Game.Pokemon.FivePokemons.Spectrier;
import Game.Pokemon.Pokemon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BattleTest {
    @Test
    public void testCheckPokemonForDefeatWhenPokemonHealthBelow0ThenTrue() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        pikachu.setHP(-5);
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        testPlayer2.getRoundPokemons().add(spectrier);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        boolean expected = true;
        boolean actual = battle.checkPokemonForDefeat(1, 1);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testCheckPokemonForDefeatWhenPokemonHealthAbove0() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        testPlayer2.getRoundPokemons().add(spectrier);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(1, 1);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testIsPokemonCount0_WhenCount0_ThenTrue() {
        Pokemon pikachu = new Pikachu();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        boolean expected = true;
        boolean actual = battle.isPokemonCount0();
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testIsPokemonCount0_WhenCountMoreThan0_ThenFalse() {
        Pokemon pikachu = new Pikachu();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        testPlayer2.getRoundPokemons().add(pikachu);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        boolean expected = false;
        boolean actual = battle.isPokemonCount0();
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testFightPokemon_WhenPokemonAttackAndOpponentPokemonDie_ThenTrue() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        pikachu.setHP(10);
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        testPlayer2.getRoundPokemons().add(spectrier);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        boolean expected = true;
        boolean actual = battle.fightPokemon(1, 1);

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testFightPokemon_WhenPokemonAttackAndOpponentPokemonNotDead_ThenFalse() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        pikachu.setHP(100);
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        testPlayer2.getRoundPokemons().add(spectrier);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        boolean expected = false;
        boolean actual = battle.fightPokemon(1, 1);

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testRoundMessageAndRemovePokemonAfterDeath_WhenUsed_ThenSizeMinus1() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        testPlayer.getRoundPokemons().add(spectrier);
        testPlayer2.getRoundPokemons().add(spectrier);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        battle.roundWinMessage(1, 0, 1);
        int expected = 1;
        int actual = testPlayer.getRoundPokemons().size();

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testRoundResult_WhenUsed_ThenPlayerPointsPlus1() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        battle.roundResult(1);
        int expected = 1;
        int actual = battle.getPlayerRoundPoints();

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testRoundResult_WhenUsed_ThenComputerPointsPlus1() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        battle.roundResult(0);
        int expected = 1;
        int actual = battle.getComputerRoundPoints();

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testGetFormattedChoice_WhenPlayerAndChoice2_ThenReturnIndex1() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        int expected = 1;
        int actual = battle.getFormattedChoice(testPlayer, 2, 1);

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testGetFormattedChoice_WhenComputerAndChoice3_ThenReturnIndex2() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        int expected = 2;
        int actual = battle.getFormattedChoice(testPlayer2, 1, 3);

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testGetFormattedChoice_WhenPlayerAndChoice500_ThenReturnMinus9999() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        int expected = -9999;
        int actual = battle.getFormattedChoice(testPlayer, 500, 1);

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testGetFormattedChoice_WhenPlayerAndChoice0_ThenReturnMinus9999() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        int expected = -9999;
        int actual = battle.getFormattedChoice(testPlayer, 0, 1);

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testGetFormattedChoice_WhenPlayerAndChoiceMinus123_ThenReturnMinus9999() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        int expected = -9999;
        int actual = battle.getFormattedChoice(testPlayer, -123, 1);

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testWinBattleMessageAndRemoveAllPokemons_WhenBattleEnds_ThenSize0() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.getRoundPokemons().add(pikachu);
        testPlayer.getRoundPokemons().add(spectrier);
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        battle.winBattleMessage();
        int expected = 0;
        int actual = testPlayer.getRoundPokemons().size();

        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void testScoreBattlePoints_WhenPlayerBattlePoints0_Then1() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        Player testPlayer2 = new Player("bot-testPlayer2", 20, 350, new ArrayList<>(), new ArrayList<>());
        Battle battle = new Battle(new ArrayList<>(Arrays.asList(testPlayer, testPlayer2)));
        battle.scoreBattlePoints(testPlayer);
        int expected = 1;
        int actual = battle.getPlayerBattlePoints();

        assertEquals("Method failed!", expected, actual);
    }
}


