import Game.Pokemon.FivePokemons.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
public class PokemonTest {
//    @Test
//    public void attackingWhenProductThenTakenLevelMinus5() {
//        Pokemon pokemon = new Pokemon("Snorlax", -5, 200, 4, 120, 10, 10);
//        String expected = "Your pokemon's level must be between level 1 and 100!";
//        String actualValue = pokemon.attacking();
//        assertEquals("Method failed!", expected, actualValue);
//    }
//
//    @Test
//    public void attackingWhenProductThenLevel100() {
//        Pokemon pokemon = new Pokemon("Bulbasaur", 100, 220, 244, 120, 5, 10);
//        String expected = "Your HP now is: " + 160;
//        String actualValue = pokemon.attacking();
//        assertEquals("Method failed!", expected, actualValue);
//    }
//
//    @Test
//    public void attackingWhenProductThenLevel101() {
//        Pokemon pokemon = new Pokemon("Charmander", 101, 220, 244, 120, 5, 10);
//        String expected = "Your HP now is: " + 160;
//        String actualValue = pokemon.attacking();
//        assertEquals("Method failed!", expected, actualValue);
//    }
//
    @Test
    public void attackingWhenProductThenPikachuHP(){
        Pikachu pikachu = new Pikachu();
        int expected = 60;
        int actualValue = pikachu.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenProductThenSlowbroHP(){
        Slowbro slowbro = new Slowbro();
        int expected = 95;
        int actualValue = slowbro.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenProductThenSpectrierHP(){
        Spectrier spectrier = new Spectrier();
        int expected = 100;
        int actualValue = spectrier.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenProductThenThundurusHP(){
        Thundurus thundurus = new Thundurus();
        int expected = 79;
        int actualValue = thundurus.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenProductThenVenusaurHP(){
        Venusaur venusaur = new Venusaur();
        int expected = 80;
        int actualValue = venusaur.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }
}
