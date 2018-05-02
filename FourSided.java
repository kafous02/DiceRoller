package diceRoller;
import java.util.*;

public class FourSided extends die
{
	private int sidesFour = sides-2;
	public int roll()
  {
		Random rand = new Random();
		int randNum = rand.nextInt((sidesFour) + 1);
		return randNum;
	}
}
