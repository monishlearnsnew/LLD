package Practice.snakeandladder.players;

import Practice.snakeandladder.Dice.DiceInterface;

public interface PlayerInterface {
    public int rollDice(DiceInterface dice);
    void notify(String message);
}