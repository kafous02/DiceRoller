package diceRoller;

import java.util.Random;

public class TenSided extends die
{
	private int sidesTen = sides + 4;
	public int roll()
  {
		Random rand = new Random();
		int randNum = rand.nextInt((sidesTen) + 1);
		return randNum;
	}
}
