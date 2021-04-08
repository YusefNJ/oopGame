
/**
 * Write a description of class goblin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class goblin extends character
{
    //state:
    private String keyItem;
    //constructor:
    public goblin(){
        super("goblin", 50, 1, 25, 0, 0);
        
        keyItem = "heal potion";
    }
    
    
    //behaviour:
    //we have over ridden this function by allowing the character goblin to randomly use one if its attacks:
    public void attack(String spell, character opponent){
       Random rand = new Random();
       int prob;
       String attack;
       
       prob = rand.nextInt(2); //we need two random numbers to allow us to use the two attacks:
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
        
       
    } 
    
    public void getDrop(){
        System.out.println("Goblin has dropped a " + getKeyItem());
         
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


    

