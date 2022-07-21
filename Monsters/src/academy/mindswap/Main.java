package academy.mindswap;

import academy.mindswap.Monsters.Monster;
import academy.mindswap.Monsters.Mummy;
import academy.mindswap.Monsters.Vampire;
import academy.mindswap.Monsters.Werewolf;


public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(10);
        Player player2 = new Player(10);

        Game game = new Game(player1,player2,10);

        game.play();

    }

/*
    public static void testPlayers(){
        Player player1 = new Player(10);
        Player player2 = new Player(10);

        player1.playerDefend(player2.playerAttack());

    }
*/
 /*
    public static void testMummy(){

        Monster monster = new Werewolf();
        Monster monster2 = new Mummy();

        monster2.defend(monster.attack());
        monster2.defend(monster.attack());
        monster.defend(monster2.attack());
        monster.defend(monster2.attack());
        monster.defend(monster2.attack());

        System.out.println(monster.getHealth());
        System.out.println(monster2.getHealth());
    }
*/

/*
    public static void testVampire(){

        Monster monster = new Werewolf();
        Monster monster2 = new Vampire();

        monster2.defend(monster.attack());
        monster2.defend(monster.attack());
        monster.defend(monster2.attack());
        monster.defend(monster2.attack());
        monster.defend(monster2.attack());

        System.out.println(monster.getHealth());
        System.out.println(monster2.getHealth());
    }
*/

/*
    public static void testWerewolf(){

        Monster monster = new Werewolf();
        Monster monster2 = new Werewolf();

        monster.defend(monster2.attack());
        System.out.println(monster.getHealth());
    }

 */

/*
    public static void testMonsters(){

        Monster monster =  new Monster();
        Monster monster2 = new Monster();

        monster.defend(monster2.attack());
        monster.defend(monster2.attack());
        monster.defend(monster2.attack());
        monster.defend(monster2.attack());

        System.out.println(monster.getHealth()); // 0 health
    }
 */
}
