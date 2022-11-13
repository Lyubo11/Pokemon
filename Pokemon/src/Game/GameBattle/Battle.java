package Game.GameBattle;

import Game.GamePlayer.Player;
import Game.Pokemon.Pokemon;

import java.util.List;

public class Battle implements Battleable{

    private List<Player> battlePlayers;
    public static final int roundsCount = 5;

    public Battle(List<Player> battlePlayers) {
        this.battlePlayers = battlePlayers;
    }

    public List<Player> getBattlePlayers() {
        return battlePlayers;
    }

    public void setBattlePlayers(List<Player> battlePlayers) {
        this.battlePlayers = battlePlayers;
    }

    @Override
    public void startBattle(int choice) {
        for (int i = 1; i <= roundsCount; i++) {
            choosePokemonForRound(choice); //TODO not done
            for (Player player:getBattlePlayers()) {

            }
        }
    }

    public int choosePokemonForRound(int choice) {
        if (choice >= 1 && choice <= 3) {
            return choice - 1;
        } else {
            return -1;
        }

    }

    public void listOfPlayerPokemons() {
        Player player = getBattlePlayers().get(0);
        int pokemonNum = 1;
        for (Pokemon pokemon:player.getPokemons()) {
            System.out.println("#" + pokemonNum + pokemon);
            System.out.println();
            pokemonNum++;
        }
    }

    @Override
    public void endBattle() {

    }
}
