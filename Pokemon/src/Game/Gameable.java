package Game;

public interface Gameable {
    void makeThreePokemonChoices();
    void startGame();
    void decideWhoWinGame();
    void winGameMessage(int playerID);
    boolean choosePokemon(int choice);

}
