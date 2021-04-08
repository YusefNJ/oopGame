
/**
 * Write a description of class knight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class knight extends character
{
    private int longsword; //knight has a longsword 
    //constructor:
    public knight(){
        super("Edward", 100, 1, 0, 0, 0);
        
        longsword = 5; //longsword does 5 extra damage
    }
    
    //behaviour:
    //we have overridden this function to allow knight to have more attacks stab and slash that do 50 and 25 damage respecively:
    public void attack(String spell, character opponent){
        if(spell.equals("punch")){
            opponent.setHealth(opponent.getHealth() - (10 + longsword)); //with longsword the damage for punch is increased by 5
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
        else if(spell.equals("kick")){
            opponent.setHealth(opponent.getHealth() - 15); //with longsword the damage for kick is increased by 5
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
        else if(spell.equals("stab")){
            opponent.setHealth(opponent.getHealth() - 50); 
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
        else if(spell.equals("slash")){
            opponent.setHealth(opponent.getHealth() - 25); 
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
    } 
    //this function allows us to use our items displayed in our inventory: 
    public void useItem(String item){
        if(item.equals("heal potion")){
            setHealth(getHealth() + 20); //using heal potion will increase your health by 20
        }
        else if(item.equals("shield")){
            setHealth(getHealth() + 50); //using shield will increase your health by 50
        }
        else if(item.equals("dragon heart")){
            setHealth(getHealth() + 100); //using dragon heart will increase your health by 100
        }
    }
}
