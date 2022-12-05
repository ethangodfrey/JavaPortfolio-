package eFisherExercise4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EFisherExercise4 {
		
	
	public static void main(String args[]) throws FileNotFoundException {
		File text = new File("c:/temp/numbers.txt");
		Scanner input = new Scanner(text);
		double total;
		int count = 0;
		double contribution; 
		total = 0;
		while (input.hasNextDouble() && total < 1000000000) {
			contribution = input.nextDouble();
			total = total + contribution;
			count = count + 1;
			input.nextLine();
		}
		total = (int)(total * 100)/100.0;
			System.out.println("We have had "+count+"contributions that add up to $" + total);
		input.close();
	}
}

