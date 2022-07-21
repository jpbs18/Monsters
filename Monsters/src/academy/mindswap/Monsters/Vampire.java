package academy.mindswap.Monsters;

public class Vampire extends Monster{

    @Override
    public int attack(){
        if(isAlive()){
            if((int) (Math.random() * 10) < 4 && getHealth() <= 90){
                bite();
            }
           return super.attack();
        }
        return 0;
    }

    public void bite(){
            System.out.println("I just sucked life out of you!");
            increaseHealth(10);
    }
}
