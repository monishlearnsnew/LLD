package Practice.snakeandladder;

import Practice.snakeandladder.Dice.Dice;
import Practice.snakeandladder.Game.Game;
import Practice.snakeandladder.board.Board;
import Practice.snakeandladder.players.Player;

public class Main {
    public static void main(String[] args){
        // create players
        Player player1= new Player("monish");
        Player player2 = new Player("varun");
        int size=10;
        Board board = new Board(size);

        Dice dice = new Dice(6);

        // create snakes and ladders
        board.addSnake(90,1 );
        board.addSnake(25, 10);

        board.addLadder(11, 99);
        board.addLadder(5, 60);

        Game game = new Game(board,dice);
        game.addPlayer(player1);
        game.addPlayer(player2);
        while(true){
            Player player = game.getPlayerWithTurn();
            int number = player.rollDice(dice);
            int playerPosition = player.getPosition() + number;
            System.out.println(playerPosition);
            game.setCurrentPlayerPosition(player, playerPosition);
            playerPosition = game.getCurrentPlayerLocation(player);
            if(playerPosition == game.getBoardSize()){
                System.out.println(player.getName()+" is the winner");
                System.out.println(player.getName() + " rolled the dice and got "+ number + " and currentPosition:"+ game.getCurrentPlayerLocation(player));
                // game.notifyPlayers(player.getName()+ " is the winner");
                break;
            }
            game.nextTurn();
        }
    }
}
