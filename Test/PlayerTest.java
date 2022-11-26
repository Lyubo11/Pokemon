import Game.GamePlayer.Player;
import Game.Pokemon.FivePokemons.Pikachu;
import Game.Pokemon.FivePokemons.Spectrier;
import Game.Pokemon.Pokemon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void testCloneArrayList_WhenUsed_ThenRoundPokemonsSize2() {
        Pokemon pikachu = new Pikachu();
        Pokemon spectrier = new Spectrier();
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(Arrays.asList(pikachu, spectrier)), new ArrayList<>());
        testPlayer.cloneArrayList();
        int expected = 2;
        int actual = testPlayer.getRoundPokemons().size();
        assertEquals("Method failed", expected, actual);
    }

    @Test
    public void testCloneArrayList_WhenUsedWith0Pokemons_ThenRoundPokemonsSize0() {
        Player testPlayer = new Player("testPlayer", 20, 350, new ArrayList<>(), new ArrayList<>());
        testPlayer.cloneArrayList();
        int expected = 0;
        int actual = testPlayer.getRoundPokemons().size();
        assertEquals("Method failed", expected, actual);
    }
}
