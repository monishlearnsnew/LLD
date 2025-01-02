package Practice.snakeandladder.players;

import Practice.snakeandladder.Dice.Dice;
import Practice.snakeandladder.Dice.DiceInterface;

public class Player implements PlayerInterface {

    private int position;
    private String name;

    public Player(String name){
        this.position = 0;
        this.name = name;
    }


    @Override
    public int rollDice(DiceInterface dice) {
        return dice.rollDice();
    }

    public int getPosition(){
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int pos){
        this.position = pos;
    }

    @Override
    public void notify(String message){
        System.out.println(message);
    }
    
}
