
/**
 * Write a description of class zombie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class zombie extends character
{
   //state:
   private String keyItem; //special instance var 
    
   //constructor:
   public zombie(){
       super("zombie", 100, 2, 50, 0, 0);
       keyItem = "shield"; //shield when used by the user will give them more health.
    }
    //we have over ridden this function by allowing the character zombie to randomly use one if its attacks:
    public void attack(String spell, character opponent){
       Random rand = new Random();
       int prob; //we need a random variable
       String attack;
       
       prob = rand.nextInt(3); //we need the three possible random numbers so that we can choose from our three attacks:
       if(prob==0){
           attack = "punch";
           opponent.setHealth(opponent.getHealth() - 10);
           System.out.println(getName() + " has landed " + attack);
           System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
        else if(prob==1){
            attack = "kick";
            opponent.setHealth(opponent.getHealth() - 15);
            System.out.println(getName() + " has landed " + attack);
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
       
       else if(prob==2){
           attack = "bite";
           opponent.setHealth(opponent.getHealth() - 30); //the zombie has an additonal attack called bite which does 30 damage to the opponent
           System.out.println(getName() + " has landed " + attack);
           System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
       
    }
    //display to the user that the zombie has dropped an item after being killed:
    public void getDrop(){
        System.out.println("zombie has dropped a " + getKeyItem());
         
    }
    
    //getters
    public String getKeyItem(){
        return keyItem;
    }
    
    //setters
    public void setKeyItem(String newKeyItem){
         keyItem = newKeyItem;
    }
}
