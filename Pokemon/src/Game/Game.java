package Game;

import Game.GameBattle.Battle;
import Game.GamePlayer.Player;
import Game.GamePlayer.Prize;
import Game.Pokemon.Pokemon;

import java.util.List;

public class Game implements Gameable, Winable, Messagable {

    private Battle battle;
    private Player player;
    private Prize prize;
    private List<Pokemon> allPokemons;
    public static final int battlesCount = 5;

    public Game(Battle battle, Player player, Prize prize, List<Pokemon> allPokemons) {
        this.battle = battle;
        this.player = player;
        this.prize = prize;
        this.allPokemons = allPokemons;
    }

    @Override
    public void startGame() {

        for (int i = 1; i <= battlesCount; i++) {

        }
    }

    @Override
    public void winGame() {

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
    public void winGameMessage() {

    }

    @Override
    public void loseMessage() {

    }

    public Battle getBattle() {
        return battle;
    }

    public void setBattle(Battle battle) {
        this.battle = battle;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }

    public List<Pokemon> getAllPokemons() {
        return allPokemons;
    }

    public void setAllPokemons(List<Pokemon> allPokemons) {
        this.allPokemons = allPokemons;
    }
}