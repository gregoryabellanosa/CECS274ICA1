/**
 * Die is a class that creates a die object that allows you to roll  the dice
 * and access the number rolled by the die object
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 */
public class Die {
	/** Used to keep track of the number of sides possible on the dice */
	private int sides;

	/** Used to keep track of the number rolled by the die object */
	private int dieValue;

	/** 
	 * Creates the die object using the provided parameter 
	 * 
	 * @param s number determines how many sides the dice will have
	 */
	public Die ( int s )
	{
		sides = s;
		roll();
	}

	/**
	 * When a die object calls this method, a new random value will be
	 * assigned to that object
	 * 
	 * @return the new number that was rolled
	 */
	public int roll ()
	{
		dieValue = (int) (Math.random() * sides) + 1;
		return dieValue;
	}

	/**
	 * Accesses the die object to return the current value of the dice
	 * 
	 * @return the current value of the dice
	 */
	public int getDieValue()
	{
		return dieValue;
	}

	/**
	 * Method to set the the die value to that in the parameter as long as
	 * the given value is within the appropriate range
	 * 
	 * @param value value set dice to
	 * @return boolean tests if the value is within bounds
	 */
	public Boolean setDieValue( int value )
	{
		if ( value > 0 && value <= sides )
		{
			dieValue = value;
			return true;
		}
		else 
		{
			return false;
		}
	}

}

