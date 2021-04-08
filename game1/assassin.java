public class assassin extends character {
    //state:
    private int poison; //assassins have poision
    //constructor:
    public assassin(){
    super("assassin", 75, 1, 0, 0, 0);
    
    poison = 10; //posion does 10 extra damage:
    }
    //behaviour:
    
    //this method is overridden by allows the assassin to use two extra attacks the poison dart and the slash:
     public void attack(String spell, character opponent){
        if(spell.equals("punch combo")){
            opponent.setHealth(opponent.getHealth() - 35);
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
        else if(spell.equals("head kick")){
            opponent.setHealth(opponent.getHealth() - 40);
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
        else if(spell.equals("poisen dart")){ //assassin can use additonal poison heart
            opponent.setHealth(opponent.getHealth() - (65 + poison)); //poison adds 10 extra damage to a "poison dart"
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
        
        else if(spell.equals("slash")){ //assassin can use slash attack
            opponent.setHealth(opponent.getHealth() - 25);
            System.out.println(opponent.getName() + " health now " + opponent.getHealth());
        }
    } 
}
