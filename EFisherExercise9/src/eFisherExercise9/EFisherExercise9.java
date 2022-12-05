package eFisherExercise9;
import java.util.*;
import java.util.Random; 


public class EFisherExercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  Random r = new Random();
		      Scanner input = new Scanner(System.in);
		      int numberOfRolls = input.nextInt();
		      System.out.print("How many times do you want to roll the die?: ");
			
			for(int i=0; i<numberOfRolls; i++)
			{
				int die1 = r.nextInt(6)+1;
				int die2 = r.nextInt(6)+1;
				int die3 = r.nextInt(6)+1;
				int die4 = r.nextInt(6)+1;
				int die5 = r.nextInt(6)+1;
				System.out.println("roll "+(i+1)+" = "+die1+" and "+die2+" and "+die3+" and "+die4+" and "+die5+"");
		}
		input.close(); 
		}
				
			
		
	}


