
/**
 * Write a description of class magicalHealer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class magicalHealer extends character
{
    // instance variables 
    private int heal; //heal variable

    /**
     * Constructor for objects of class magicalHealer
     */
    public magicalHealer()
    {
        // initialise instance variables
        super("Magical Healer", 100, 2, 50, 0 , 0);
        heal = 80; //set heal amount to 80 for magicalHealer.
    }

    //behaviour:
    //This method healUser() allows the character to heal the user
    public void healUser(character user){ 
        user.setHealth(user.getHealth() + heal); //increase the health of the character by heal amount.
    }
    
    //getters:
    public int getHeal(){
        return heal;
    }
    
    //setters:
    public void setHeal(int newHeal){
        heal = newHeal;
    }

}
