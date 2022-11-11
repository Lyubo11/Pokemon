package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.Pokemon.Pokemon;

public class Game implements Gameable, Winable, Losable{

    private Battle battle;
    private Player player;
    private Pokemon pokemon;

    public static final int battlesCount = 5;

    public Game(Battle battle, Player player, Pokemon pokemon) {
        this.battle = battle;
        this.player = player;
        this.pokemon = pokemon;
    }

    @Override
    public void startGame() {
        for (int i = 1; i <= battlesCount; i++) {

        }
    }

    @Override
    public void choosePokemon() {

    }

    @Override
    public void winPrize() {

    }

    @Override
    public void winPokemon() {

    }

    @Override
    public void winCristals() {

    }

    @Override
    public void loseGame() {

    }

    @Override
    public void loseMessage() {

    }
}