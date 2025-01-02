package Practice.snakeandladder.Dice;

import java.util.Random;

public class Dice implements DiceInterface {

    private int diceRange;
    private Random random;

    public Dice(int diceRange){
        this.diceRange = diceRange;
        this.random = new Random();
    }

    @Override
    public int rollDice() {
        return random.nextInt(diceRange)+1;
    }
    
}
