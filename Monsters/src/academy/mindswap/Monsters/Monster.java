package academy.mindswap.Monsters;

public abstract class Monster {

    private  int health = 100;
    private  int damage = 25;
    private  boolean isAlive = true;


    public int attack(){
        if(isAlive){
            return this.damage;
        }
        return 0;
    }

    public void defend(int damage){
        this.health -= damage;
        if(this.health <= 0){
            this.health = 0;
            isAlive = false;
            System.out.println("I am dead.");
        }
    }

    public int getHealth(){
       return this.health;
    }

    public void increaseHealth(int health){
        this.health += health;
    }

    public void decreaseHealth(int health){
        this.health -= health;
    }

    public boolean isAlive(){
        return isAlive;
    }

}
