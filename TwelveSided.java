package diceRoller;

import java.util.Random;

public class TwelveSided extends die
{
	private int sidesTwelve = sides + 6;
	public int roll()
  {
		Random rand = new Random();
		int randNum = rand.nextInt((sidesTwelve) + 1);
		return randNum;
	}
}
