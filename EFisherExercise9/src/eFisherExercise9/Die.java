package eFisherExercise9;

import java.util.Random;

public class Die {
	int sides = 6;
	int value = 0;
	
	public Die() {
		// TODO Auto-generated constructor stub
	}
	
	public Die (int s)
	{
		sides = s;
	}
	
	public void rollDie()
	{
		Random R = new Random();
		value = R.nextInt(sides) + 1;
	}
}
