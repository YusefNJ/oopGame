import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{

    public static void main(String[] args){
        program(); //program runs here:
    }
    
    public static void program(){
        //spawn hero
        int response; //each response is used to allow the user to input some informaton (like deciding to move or which attack to use)
        character user = new character(); //make object user
        character[] enermies = new character[6]; //make array of character objects of type character for the enermies
        character[] team = new character[2]; //make array of character objectrs of type character for the team mates
        boolean enspotted = false; //stands for if an enermy has been spotted
        Random rand = new Random(); //random var
        int chance; //both chance and chance 2 are used for with the rand variable 
        int chance2;
        character opponent; //particular opponent object
        character teamMate; //particular team mate object
        String[] attacks;
        String response2;
        String response3;
        int response4;
        int response5;
        String response6;
        String item; //particular item
       
        
        //generate enermies randomly:
        for(int i = 0; i<enermies.length; i++){ //loop through our enermies array
            chance = rand.nextInt(3); //randomly generate integer between 0-2
            if(chance==0){
                enermies[i] = new goblin(); //substitution princple to make object goblin of type character
            }
            else if(chance==1){
                enermies[i] = new zombie(); //substitution princple to make object zombie of type character
            }
            else if(chance==2){
                enermies[i] = new dragon(); //substitution princple to make object dragon of type character
            }
            
        }
        
        //generate medic or magical healer randomly:
        for(int  i = 0; i<team.length; i++){
            chance = rand.nextInt(3); //randomly generate integer between 0-2
            if(chance==0){
                team[i] = new medic(); //substitution princple to make object medic of type character
            }
            else if(chance==1){
                team[i] = new medic(); //substitution princple to make object medic of type character
            }
            else if(chance==2){
                team[i] = new magicalHealer(); //substitution princple to make object magicalHealer of type character
            }
        }
        
        System.out.println("Welcome to this game, Please select a character");
        System.out.println("1. knight");
        System.out.println("2. assassin(this option is having unforseen buggs so dont pick)");
        response = inputInt("please select either 1 or 2"); //we want the user to select thier chosen character(knight or assassin)
        if(response==1){
            user = new knight(); //substitution princple to make object knight of type character
            System.out.println("Knight selected");
        }
        else if(response==2){
            user = new assassin(); //substitution princple to make object assassin of type character
            System.out.println("assassin selected");
        }
  
        //intro story:
        System.out.println("");
        System.out.println("you must fight to the death!");
        System.out.println("Goodluck!");
        
        //game loop runs if the user is Alive i.e. has more than 0 health:
        while(user.getHealth()!=0){
            //print menu:
            if(enspotted == false){
                System.out.println("");
                System.out.println("health " + user.getHealth()); //display health to user
                System.out.println("you have various options");
                System.out.println("1. check inventory");
                System.out.println("2. check spells/attacks");
                System.out.println("3. move forward");
                System.out.println("4. to exit game");                            
            }
            response = inputInt("Please select either [1, 2, 3, 4]:"); //allow user to select which option in menu to use
            System.out.println("");
            if(response==1){
                user.displayInventory(); //display inventory to user if they select 1
                response5 = inputInt("if you want to use an item enter the positoin of the item!"); //allow user to use an item
                response5 = response5 - 1; //minus one to get the index
                
                //get item in that pos and run method use item;
                item  = user.getItem(response5); //get item and assign to variable item
                user.useItem(item); //use this item
                //remove item after useage:
                user.setInventory("null", response5); //removes item
                System.out.println("Your health is now " + user.getHealth()); //displayes new health to user
                
            }
            else if(response==2){
                user.displaySpells(); //display spells to user if they select 2
            }
            else if(response==3){
                user.move(); //allows the user to move if they select 3
                chance = rand.nextInt(4); //generate a random nuber between 0-4
                if(chance==0){
                    opponent = enermies[0]; //this long nested if statement is very long way of checking the enermies array to only bump into enermies that are alive
                    //i tried this with a for loop but it wasnt working so i gave up on it and went the long way lol
                    //essentially it checks if the opponent which has assigned to it a specific enermy from enermies is alive. if not than we go to the next index 
                    if(opponent.isAlive()==true){
                        opponent = enermies[0];
                           
                    }
                    else{
                        opponent = enermies[1];
                        if(opponent.isAlive()==true){
                            opponent = enermies[1];
                           
                        } 
                        else{
                            opponent = enermies[2];
                            if(opponent.isAlive()==true){
                                opponent = enermies[2];
                           
                            }
                            else{
                                opponent = enermies[3];
                                if(opponent.isAlive()==true){
                                    opponent = enermies[3];
                           
                                }
                                else{
                                    opponent = enermies[4];
                                    if(opponent.isAlive()==true){
                                        opponent = enermies[4];
                                    }
                                    else{
                                        opponent = enermies[5];
                                        if(opponent.isAlive()==true){
                                            opponent = enermies[5];
                                        }
                                        else{

                                            if(opponent.isAlive()==true){
                                                opponent = enermies[6];
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    attacks = user.getSpells(); //dispay spells to user
                    System.out.println("you have encountered a " + opponent.getName()); //show the user which opponent they have encountered
                    //fight loop: loops if the opponent/enemy is alive
                    while(opponent.isAlive()==true){ //execute the fight loop if opponent is alive
                        System.out.println("your attacks are: ");
                        user.displaySpells(); //display spells to user
                        response2 = inputString("Please select an attack?(type it )"); //allow user to select an attack to use(by typing it)
                        user.attack(response2, opponent); //user does this attack on enemy 
                        if(opponent.getHealth()<=0){ //if the enemy is dead than break from the fight loop
                            break;
                        }
                        opponent.attack("null", user); //allow enemy to attack user
                        if(user.getHealth()<=0){ //if the user is killed(dead) than end game with game over message printed 
                            System.out.println("game over ");
                            return;
                        }
                    }
                    System.out.println("enermy is dead"); //exit loop if enemy is dead to print so display to the user that the enermy is dead
                    opponent.getDrop(); //opponent will drop an item when killed, we want to display this item
                    user.displayInventory(); //display the users inventory
                    response3 = inputString("do you want this item? y/n"); //allow the user to input if they want the item
                    if(response3.equals("y")){ //if they want the item add this to their inventory
                        response4 = inputInt("which position do you want it in?"); //allow user to select which position to put the item in thier inventory
                        response4 = response4 - 1; //minus one from user input to get the index
                        user.setInventory(opponent.getKeyItem(), response4); //put the item into the inventory ( getKeyItem() gets the item from opponent)
                    }
                }
                else if(chance==1){ //if chance is 1 than we want to bumb into a team member not an opponent
                    chance2 = rand.nextInt(2); //the team member we want is random so we need another random number between 0-2
                    teamMate = team[chance2]; //teamMate will be the specifc team member we have bumped into
                    System.out.println("you have bumbed into a " + teamMate.getName()); //display name of team mate bumped into
                    System.out.println(teamMate.getName() + " says: Hello my friend, what a great surprise to see you"); //dialog
                    response6 = inputString(teamMate.getName() + " says: you look injured?? do you want some healing?(y/n)"); //allow user to respond to question
                    if(response6.equals("y")){ // if the user agrees than heal the user
                        //heal user:
                        teamMate.healUser(user); // teamMate uses healUser() method to increase the user's health.
                    }
                }

            }
            
            else if(response==4){ //if user enters 4 than end game by killing the user(setting health to 0)
                user.setHealth(0);
            }
        }
        
        
  
        
        
       
        
    }
    
  
    
    
    //input string method
    public static String inputString(String message){
        String response = "";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(message);
        response = scanner.nextLine(); //input user response
        
        return response; //return user response
    }
    //input int method
   public static int inputInt(String message){
        String response = "";
        int resp;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(message);
        response = scanner.nextLine(); //input user response
        resp = Integer.parseInt(response); //change user response to a int value
        return resp; //return response
    }
    
    
}
