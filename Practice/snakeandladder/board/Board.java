package Practice.snakeandladder.board;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer,Integer> snakes;
    private Map<Integer,Integer> ladders;

    public Board(int size){
        this.size= size;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
    }
    public int getSize() {
        return size;
    }

    public Map<Integer,Integer> getSnakes(){
        return snakes;
    }

    public Map<Integer,Integer> getLadders() {
        return ladders;
    }

    public void addSnake(int start, int end){
        snakes.put(start,end);
    }

    public void addLadder(int start, int end){
        ladders.put(start,end);
    }

    public boolean isSnakePosition(int curPos){
        return snakes.containsKey(curPos);
    }

    public boolean isLadderPosition(int curPos){
        return ladders.containsKey(curPos);
    }

    public int getSnakeTailValue(int curPos){
        return snakes.get(curPos);
    }

    public int getLadderTailValue(int curPos){
        return ladders.get(curPos);
    }

}
