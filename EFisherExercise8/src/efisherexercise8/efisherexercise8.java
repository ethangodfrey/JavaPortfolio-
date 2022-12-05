package efisherexercise8;

import java.util.ArrayList;
import java.util.Random;

public class efisherexercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<PlayingCards> cardDeck = new ArrayList<PlayingCards>(52); 
		
		char[] suits = {'s','c','h','d'};
		int [] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};	
		
		for(int i=0; i<52; i++)
		{
			char cSuit = suits[i/13];
			int cValue = values[i%13];
			PlayingCards c = new PlayingCards(cSuit,cValue);
			cardDeck.add(c);
		}
		
		Random rand = new Random();
		int upperbound = 52;
		int int_random1 = rand.nextInt(upperbound);
		int int_random2 = rand.nextInt(upperbound);
		
		if(cardDeck.get(int_random1).isMatch(cardDeck.get(int_random2)))
			System.out.println(cardDeck.get(int_random1).toString()+'\t'+cardDeck.get(int_random2)+'\t'+"true");
		else
			System.out.println(cardDeck.get(int_random1).toString()+'\t'+cardDeck.get(int_random2)+'\t'+"false");
	}
	
}
