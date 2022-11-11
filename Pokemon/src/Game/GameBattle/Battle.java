package Game.GameBattle;

import Game.GamePlayer.Player;
import Game.Pokemon.Pokemon;

import java.util.List;

public class Battle implements Battleable{
    private List<Pokemon> battlePokemons;
    public static final int roundsCount = 5;
    private List<Player> battlePlayers;

    public Battle(List<Pokemon> battlePokemons, List<Player> battlePlayers) {
        this.battlePokemons = battlePokemons;
        this.battlePlayers = battlePlayers;
    }

    public List<Pokemon> getBattlePokemons() {
        return battlePokemons;
    }

    public void setBattlePokemons(List<Pokemon> battlePokemons) {
        this.battlePokemons = battlePokemons;
    }

    public List<Player> getBattlePlayers() {
        return battlePlayers;
    }

    public void setBattlePlayers(List<Player> battlePlayers) {
        this.battlePlayers = battlePlayers;
    }

    @Override
    public String toString() {
        return "Battle's info:'" +
                "\nBattle pokemons: " + battlePokemons +
                "\nBattle players: " + battlePlayers;
    }

    @Override
    public void startBattle() {

    }

    @Override
    public void endBattle() {

    }
}
