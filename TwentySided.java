package diceRoller;

import java.util.Random;

public class TwentySided extends die
{
	private int sidesTwenty = sides + 14;
	public int roll()
  {
		Random rand = new Random();
		int randNum = rand.nextInt((sidesTwenty) + 1);
		return randNum;
	}
}
