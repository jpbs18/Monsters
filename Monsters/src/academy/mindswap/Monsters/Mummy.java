package academy.mindswap.Monsters;

public class Mummy extends Monster{

    private final int MAX_OF_CONSECUTIVE_ATTACKS = 2;
    private int numberOfAttacks = 0;

    @Override
    public int attack(){
        if(numberOfAttacks == MAX_OF_CONSECUTIVE_ATTACKS){
            decreaseHealth(10);
            System.out.println("I attacked to many times in a row...arrghhh");
            return 0;
        }
        numberOfAttacks++;
        return super.attack();
    }

    public void defend(int damage){
        super.defend(damage);
        numberOfAttacks = 0;
    }


}
