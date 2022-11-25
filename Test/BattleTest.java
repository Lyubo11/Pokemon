import Game.GameBattle.Battle;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class BattleTest {
    @Test
    public void choosePokemonWhenOneOne() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(1, 1);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenOneTwo() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(1, 2);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenOneThree() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(1, 3);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenOneFour() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(1, 4);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenOneFive() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(1, 5);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenTwoOne() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(2, 1);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenTwoTwo() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(2, 2);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenTwoThree() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(2, 3);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenTwoFour() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(2, 4);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenTwoFive() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(2, 5);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenThreeOne() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(3, 1);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenThreeTwo() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(3, 2);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenThreeThree() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(3, 3);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenThreeFour() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(3, 4);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenThreeFive() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(3, 5);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFourOne() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(4, 1);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFourTwo() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(4, 2);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFourThree() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(4, 3);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFourFour() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(4, 4);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFourFive() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(4, 5);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFiveOne() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(5, 1);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFiveTwo() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(5, 2);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFiveThree() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(5, 3);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFiveFour() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(5, 4);
        assertEquals("Method failed!", expected, actual);
    }

    @Test
    public void choosePokemonWhenFiveFive() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = false;
        boolean actual = battle.checkPokemonForDefeat(5, 5);
        assertEquals("Method failed!", expected, actual);
    }
}
