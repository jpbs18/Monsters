package academy.mindswap;

public class Game {

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2, int numberOfMonsters){
        this.player1 = new Player(numberOfMonsters);
        this.player2 = new Player(numberOfMonsters);
    }

    public void play(){

        if((int) (Math.random() * 2) == 1){
            game(player1, player2);
            return;
        }
        game(player2, player1);
    }

    private Game game(Player player1, Player player2){

        player1.playerDefend(player2.playerAttack());
        if(gameEnded(player1, player2)){
            return null;
        }

        player2.playerDefend(player1.playerAttack());
        if(gameEnded(player1, player2)){
            return null;
        }

        return game(player1, player2);
    }

    private boolean gameEnded(Player player1, Player player2){

        if(player1.getNumberOfDeadMonsters() == player1.monsters.length){
            System.out.println("Player 2 won with + " +
                    (player2.monsters.length - player2.getNumberOfDeadMonsters()) + " monsters left!");
            return true;
        }
        if(player2.getNumberOfDeadMonsters() == player2.monsters.length){
            System.out.println("Player 1 won with "+
                    (player1.monsters.length - player1.getNumberOfDeadMonsters()) +" monsters left!");
            return true;
        }
        return false;
    }
}
