
/**
 * Write a description of class testclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testclass
{
    public static void main(String[] args){
        //test:
        character[] enermies = new character[2];
        
        for(int i = 0; i<enermies.length; i++){
            enermies[i] = new goblin();
        }
        
        enermies[1].setHealth(0);
        System.out.println(enermies[1].isAlive());
    }
}
