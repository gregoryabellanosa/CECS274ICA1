/**
 * DiceGame is a program that constructs two Die objects and then
 * compares the two values rolled in order to determine the winner to
 * be the higher value
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 */
public class DiceGame {

	public static void main(String[] args) {
		//constant that declares the maximum amount of sides the 
        //dice can have
        final int MAX_SIDES = 6;
        
        //constructs 2 new Die objects that only have sides equal 
        //to the MAX_SIDES
        Die dice1 = new Die( MAX_SIDES );
        Die dice2 = new Die( MAX_SIDES );
        
        //Uses the roll method to modify the dieValue of each dice
        int d1 = dice1.roll();
        int d2 = dice2.roll();
        
        //calls the cheat method i order to make player 2 always wins
        cheat(dice2, 6);
        d2 = dice2.getDieValue();
        
        //Prints out the current dice values
        System.out.println("Die1 = " + d1 );
        System.out.println("Die2 = " + d2 );
        
        //compares the two dice values and determines which value is higher
        //before printing a declaration of the winner
        if( dice1.getDieValue() > dice2.getDieValue() )
        {
            System.out.println("Player 1 Wins!!!!!!");
        }
        else if ( dice2.getDieValue() > dice1.getDieValue() )
        {
            System.out.println("Player 2 Wins!!!!!!");
        }
        else //if they are equal
        {
            System.out.println("Tied");
        }

	}
	
	/**
     * method that changes the value of the Die object called within
     * the parameters into the value given in the parameter list 
     * (assuming that the given value is the highest)
     * 
     * @param cheaterDie the Die who's value will be changed
     * @param value what value to change the Die value into
     */
    public static void cheat(Die cheaterDie, int value)
    {
        cheaterDie.setDieValue(value);
    }

}
