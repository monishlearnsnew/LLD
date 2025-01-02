package Practice.snakeandladder.Game;

import java.util.ArrayList;
import java.util.List;

import Practice.snakeandladder.Dice.Dice;
import Practice.snakeandladder.Dice.DiceInterface;
import Practice.snakeandladder.board.Board;
import Practice.snakeandladder.players.Player;

public class Game {
    private Board board;
    private DiceInterface dice;
    private List<Player> players;
    private int currentPlayerIndex;

    public Game(Board board, DiceInterface dice){
        this.board = board;
        this.dice = dice;
        this.players = new ArrayList<>();
        this.currentPlayerIndex =0;
    }

    public List<Player> getPlayers(){
        return players;
    }
    
    public void addPlayer(Player player){
        players.add(player);
        // notifyPlayers(player.getName() + " is added to the game");
    }

    public void notifyPlayers(String message){
        for(Player player1 : players){
            player1.notify(message);
        }
    }

    public void nextTurn(){
        int size = players.size();
        int nexIndex = currentPlayerIndex+1;
        currentPlayerIndex = nexIndex % size;
    }

    public Player getPlayerWithTurn(){
        return players.get(currentPlayerIndex);
    }

    public int getCurrentPlayerLocation(Player player){
        return player.getPosition();
    }

    public void setCurrentPlayerPosition(Player player,int curPos){
        if(board.isSnakePosition(curPos)){
            player.setPosition(board.getSnakeTailValue(curPos));
        }
        else if(board.isLadderPosition(curPos)){
            player.setPosition(board.getLadderTailValue(curPos));
        }
        else{
            int size = board.getSize();
            int range = size*size;
            if(curPos <= range){
                player.setPosition(curPos);
            }
        }
    }

    public int getBoardSize(){
        return board.getSize()* board.getSize();
    }

}
