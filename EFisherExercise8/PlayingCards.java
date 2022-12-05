package efisherexercise8;

public class PlayingCards {
	char suit;
	int value;
	public PlayingCards() {
		
	}	
	public PlayingCards(char suit, int value) {
	super();
	this.suit = suit;
	this.value = value;
	
}
	public char getSuit() {
		return suit;
	}
	public void setSuit(char suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isMatch(PlayingCards c)
	{
		if(this.suit == c.getSuit())
			return true;
		if(this.value == c.getValue())
			return true;
		return false; 
	}
	@Override
	public String toString() {
		String rValue = "";
		if(value < 11)
			rValue = String.valueOf(value);
		else if(value == 11)
			rValue = "J";
		else if(value == 12)
			rValue = "Q";
		else if(value == 13)
			rValue = "K";
		else
			rValue = "A";
		
		return "("+rValue+","+suit+")";
	}
}

