package methodOverrinding;

public class Driver {
	public static void main(String[] args) {
		Card c1=new Card();
		Swipe s1=new Swipe();
		s1.swipingMachine(c1);
		Card c2=new CreditCard();
		CreditCard c3=(CreditCard)c2;
		s1.swipingMachine(c3);
		Card c4=new DebitCard();
		DebitCard d5=(DebitCard)c4;
		s1.swipingMachine(d5);
	}
}
