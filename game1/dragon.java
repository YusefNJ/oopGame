
/**
 * Write a description of class dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class dragon extends character
{
    //state:
    private String keyItem;
    
    //constructor:
    public dragon(){
        super("dragon", 200, 3, 100, 0, 0);
        keyItem = "dragon heart"; //dragon speical item is a dragon heart dropped when it dies:
    }
    
    //behaviour
    
    //attack method:
    //we have over ridden this function by allowing the character dragon to randomly use one if its attacks:
    public void attack(String spell, character opponent){
       Random rand = new Random();
       int prob;
       String attack;
       
       prob = rand.nextInt(4);  //we need 4 possible random numbers (between 0-3) so we can randomly select one of our attacks:
       if(prob==0){ //if prob var is 0 than the enermy does this attak.
           attack = "punch";
           opponent.setHealth(opponent.getHealth() - 10);   //change opponents health as doing damage to them.
           System.out.println(getName() + " has landed " + attack);
           System.out.println(opponent.getName() + " health now " + opponent.getHealth()); //display user health after attack
        }
        
        else if(prob==1){
            attack = "kick";
            opponent.setHealth(opponent.getHealth() - 15);
            System.out.println(getName() + " has landed " + attack);
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
       
       else if(prob==2){
           attack = "fire breath";
           opponent.setHealth(opponent.getHealth() - 70); //dragon has fire breath attack which does 70 damage
           System.out.println(getName() + " has landed " + attack);
           System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
       else if(prob==3){
           attack = "slash";
           opponent.setHealth(opponent.getHealth() - 40); //dragon has slash attack which does 40 damage
           System.out.println(getName() + " has landed " + attack);
           System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
    } 
    //display item drop to user:
    public void getDrop(){
        System.out.println("Dragon has dropped a " + getKeyItem());
         
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
