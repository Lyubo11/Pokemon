import Game.Pokemon.Pokemon;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PokemonTest {
    @Test
    public void attackingWhenProductThenTakenDamage() {
        Pokemon pokemon = new Pokemon("Snorlax", 25, 1300, 244, 120);
        int expected = 1000;
        int actualValue = pokemon.attacking();
        assertEquals("Method failed!", expected, actualValue);
    }

}
