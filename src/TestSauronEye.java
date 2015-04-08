// Tyler Herrin
// Observer Design Pattern

public class TestSauronEye 
{
    public static void main(String[] args) 
    {
        EyeOfSauron eye = new EyeOfSauron();
        BadGuy saruman = new BadGuy(eye, "Saruman");
        BadGuy witchKing= new BadGuy(eye, "Witch King");
        
        eye.setEnemies(1, 1, 2, 0); //hobbits, elves, dwarves, men -- BTW, this is HORRIBLE coding style
        //message should be displayed from Saruman and Angmar that they know about 1 hobbit, 1 elf, 2 dwarves
        
        saruman.report();
        witchKing.report();
        
        saruman.defeated(); //Saruman is no longer registered with the Eye
        System.out.println("\nSARUMAN HAS BEEN DEFEATED IN BATTLE\n");
        
        eye.setEnemies(4, 2, 2, 100);
        
        //only the Witch King reports on the enemies
        System.out.print("Witch King still updates: ");
        witchKing.report();
        System.out.print("Saruman no longer updates: ");
        saruman.report();

    }//end main
}//end class