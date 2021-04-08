
/**
 * Write a description of class character here.
 *
 * @author Yusef Naqvi-Jukes
 * @version 0.0.1
 */
import java.util.Random;
import java.util.Arrays;
public class character
{
    //state:
    private String name;
    private int health;
    private int level;
    private int exp;
    private int x; //x co-ordinate
    private int y; //y co-ordinate
    private String[] spells = new String[4]; //spells are just the attacks the user will be able to perform
    private String[] inventory = new String[10]; //inventory is where our items go
    private boolean alive; 
    
    
    //constructor:
    
    public character(){
        name = "";
    }
    public character(String name, int health, int level, int exp, int x, int y){
        this.name = name;
        this.health = health;
        this.level = level;
        this.exp = exp;
        this.x = x;
        this.y = y;
        
        spells = new String[]{"punch", "kick", "stab", "slash"}; //set these instance varibles to this by default
        inventory = new String[]{"null", "null", "null", "null","null", "null", "null", "null", "null", "null"};
        alive = true;
    }
    
    //behaviour:
    //main attack function: we override this method in the subclasses (zombie, dragon, goblin, assassin, knight) so we can have dynamic attacks:
    public void attack(String spell, character opponent){
        if(spell.equals("punch")){
            opponent.setHealth(opponent.getHealth() - 10); //a punch decreases health by this amount:
            System.out.println(opponent.getName() + " health now " + opponent.getHealth()); //display new health to user
        }
        
        else if(spell.equals("kick")){
            opponent.setHealth(opponent.getHealth() - 15); //a kick decreases health by this amount
            System.out.println(opponent.getName() + " health now " + opponent.getHealth()); //display new health to user
        }
       
    }
    //this function will heal the user: it is overwritted in the subclasses medic and magical healer:
    public void healUser(character user){
        //no heal to do from this class:
        user.setHealth(user.getHealth());
    }
    
    
    public void dropItem(){
        
        System.out.println("item null");
    }
    
    //move by 20m
    public void move(){
        x += 20;
    }
    //display the spells to the user:
    public void displaySpells(){
        System.out.println(Arrays.toString(spells));
    }
    //display the inventory to the user:
    public void displayInventory(){
        System.out.println(Arrays.toString(inventory));
    }
    //method returns true if the character is alive and false if the character is dead
    public boolean isAlive(){
        if(getHealth()<=0){
            setAlive(false);
            return getAlive();
        }
        else{
            return getAlive();
        }
    }
    //this method is overridden in the classes goblin, zombie, dragon - its purpose is to display the keyItem var that these classes hold:
    public String getKeyItem(){
        return "";
    }
    
    public void getDrop(){
        System.out.println("nothing to drop");
    }
    
    //this method allows the user to use an item in their inventory:
    public void useItem(String item){
        if(item.equals("heal potion")){
            setHealth(getHealth() + 20);
        }
        else if(item.equals("shield")){
            setHealth(getHealth() + 50);
        }
        else if(item.equals("dragon heart")){
            setHealth(getHealth() + 100);
        }
    }
    

    //getters:
    public String getName(){
        return name;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getLevel(){
        return level;
    }
    
    public int getExp(){
        return exp;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public String[] getSpells(){ //get all spells
        return spells;
    }
    
    public String getSpell(int pos){ //get one spell
        return spells[pos];
    }
    
    public String[] getInventory(){ //get complete inventory
        return inventory;
    }
    
    public String getItem(int pos){ //get one item from inventory
        return inventory[pos];
    }
    
    public boolean getAlive(){
        return alive;
    }
    
    //setters:
    public void setName(String newName){
        name = newName;
    }
    
    public void setHealth(int newHealth){
        health = newHealth;
    }
    
    public void setLevel(int newLevel){
        level = newLevel;
    }
    
    public void setName(int newExp){
        exp = newExp;
    }
    
    public void setSpell(String newSpell, int pos){
        spells[pos] = newSpell;
    }
    
    public void setInventory(String item, int pos){
        inventory[pos] = item;
    }
    
    //if the opponent is dead we need to change their life status to dead(alive= false);
    public void setAlive(boolean value){
        if(value==true){
            alive = true; //the opponent is alive
        }
        else {
            alive = false; //the opponent is dead
        }
    }
    
   
}
