
/**
 * Write a description of class healer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class medic extends character
{
    // instance variables - 
    private int heal; //heal variable
    
    public medic(){
        super("Medic", 100, 1, 50, 0, 0);
        heal = 30;  //set heal amout to 30hp
    }
    
    //behaviour:
    //this method allows this character to heal the user:
    public void healUser(character user){
        user.setHealth(user.getHealth() + heal); //increase users health by the amount of the heal variable;
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
