import Game.GameBattle.Battle;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BattleTest {
    @Test
    public void testCheckPokemonForDefeatWhenPokemonHealthBelow0ThenTrue() {
        Battle battle = new Battle(new ArrayList<>());
        boolean expected = true;
        boolean actual = battle.checkPokemonForDefeat(1, 2);
        assertEquals("Method failed!", expected, actual);
    }
}
