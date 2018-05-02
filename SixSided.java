package diceRoller;

import java.util.Random;

public class SixSided extends die
{
	private int sidesSix = sides;
	public int roll()
   {
		Random rand = new Random();
		int randNum = rand.nextInt((sidesSix) + 1);
		return randNum;
	}
}
