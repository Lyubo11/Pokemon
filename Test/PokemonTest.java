import Game.Pokemon.FivePokemons.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonTest {
    @Test
    public void attackingWhenHealthThenPikachuHP(){
        Pikachu pikachu = new Pikachu();
        int expected = 60;
        int actualValue = pikachu.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenHealthThenSlowbroHP(){
        Slowbro slowbro = new Slowbro();
        int expected = 95;
        int actualValue = slowbro.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenHealthThenSpectrierHP(){
        Spectrier spectrier = new Spectrier();
        int expected = 100;
        int actualValue = spectrier.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenHealthThenThundurusHP(){
        Thundurus thundurus = new Thundurus();
        int expected = 79;
        int actualValue = thundurus.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void attackingWhenHealthThenVenusaurHP(){
        Venusaur venusaur = new Venusaur();
        int expected = 80;
        int actualValue = venusaur.getHP();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenPikachuLevelUpPokemon(){
        Pikachu pikachu = new Pikachu();
        pikachu.trainPokemon();
        int expected = 56;
        int actualValue = pikachu.getPokemonLevel();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenPikachuGainAttack(){
        Pikachu pikachu = new Pikachu();
        pikachu.trainPokemon();
        int expected = 56;
        int actualValue = pikachu.getAttack();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenPikachuGainDefense(){
        Pikachu pikachu = new Pikachu();
        pikachu.trainPokemon();
        int expected = 42;
        int actualValue = pikachu.getDefense();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenSlowbroLevelUpPokemon(){
        Slowbro slowbro = new Slowbro();
        slowbro.trainPokemon();
        int expected = 41;
        int actualValue = slowbro.getPokemonLevel();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenSlowbroGainAttack(){
        Slowbro slowbro = new Slowbro();
        slowbro.trainPokemon();
        int expected = 76;
        int actualValue = slowbro.getAttack();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenSlowbroGainDefense(){
        Slowbro slowbro = new Slowbro();
        slowbro.trainPokemon();
        int expected = 112;
        int actualValue = slowbro.getDefense();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenSpectrierLevelUpPokemon(){
        Spectrier spectrier = new Spectrier();
        spectrier.trainPokemon();
        int expected = 100;
        int actualValue = spectrier.getPokemonLevel();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenSpectrierGainAttack(){
        Spectrier spectrier = new Spectrier();
        spectrier.trainPokemon();
        int expected = 66;
        int actualValue = spectrier.getAttack();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenSpectrierGainDefense(){
        Spectrier spectrier = new Spectrier();
        spectrier.trainPokemon();
        int expected = 62;
        int actualValue = spectrier.getDefense();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenThundurusLevelUpPokemon(){
        Thundurus thundurus = new Thundurus();
        thundurus.trainPokemon();
        int expected = 82;
        int actualValue = thundurus.getPokemonLevel();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenThundurusGainAttack(){
        Thundurus thundurus = new Thundurus();
        thundurus.trainPokemon();
        int expected = 116;
        int actualValue = thundurus.getAttack();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenThundurusGainDefense(){
        Thundurus thundurus = new Thundurus();
        thundurus.trainPokemon();
        int expected = 72;
        int actualValue = thundurus.getDefense();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenVenusaurLevelUpPokemon(){
        Venusaur venusaur = new Venusaur();
        venusaur.trainPokemon();
        int expected = 76;
        int actualValue = venusaur.getPokemonLevel();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenVenusaurGainAttack(){
        Venusaur venusaur = new Venusaur();
        venusaur.trainPokemon();
        int expected = 83;
        int actualValue = venusaur.getAttack();
        assertEquals("Method failed!", expected, actualValue);
    }

    @Test
    public void trainPokemonWhenTrainingThenVenusaurGainDefense(){
        Venusaur venusaur = new Venusaur();
        venusaur.trainPokemon();
        int expected = 85;
        int actualValue = venusaur.getDefense();
        assertEquals("Method failed!", expected, actualValue);
    }
}
