package diceRoller;

import java.util.Random;

public class EightSided extends die
{
	private int sidesEight = sides + 2;
	public int roll()
  {
		Random rand = new Random();
		int randNum = rand.nextInt((sidesEight) + 1);
		return randNum;
	}
}
