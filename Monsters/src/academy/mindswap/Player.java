package academy.mindswap;

import academy.mindswap.Monsters.Monster;
import academy.mindswap.Monsters.Mummy;
import academy.mindswap.Monsters.Vampire;
import academy.mindswap.Monsters.Werewolf;

public class Player {
    public Monster[] monsters;
    private int numberOfDeadMonsters;

    public Player(int numberOfMonstersSelected){
        monsters = new Monster[numberOfMonstersSelected];
        createMonsters();
    }


    private void createMonsters(){

        for(int i = 0; i < monsters.length; i++){
            if(i % 5 == 0){
                monsters[i] = new Vampire();
            }
            else if(i % 2 == 0){
                monsters[i] = new Werewolf();
            }
            else{
                monsters[i] = new Mummy();
            }
        }
    }

    private Monster pickMonster(){

        int index = (int) (Math.random() * monsters.length);

        if(monsters[index].isAlive()){
            return monsters[index];
        }
        return pickMonster();
    }

    public int playerAttack(){

        Monster monster = pickMonster();
        String kindOfMonster = monster.getClass().getSimpleName();
        System.out.printf("The %s just attacked!%n", kindOfMonster);
        return monster.attack();
    }

    public void playerDefend(int damage){

        Monster monster = pickMonster();
        String kindOfMonster = monster.getClass().getSimpleName();
        System.out.printf("The %s just took a hit.%n", kindOfMonster);
        monster.defend(damage);

        if(!monster.isAlive()){
            numberOfDeadMonsters++;
        }
    }

    public int getNumberOfDeadMonsters(){
        return numberOfDeadMonsters;
    }

}
