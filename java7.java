package test;

public class java7 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + card.width);
		System.out.println("Card.height = " + card.height);
		
		card c1 = new card();
		c1.kind = "spade";
		c1.number = 7;
		
		card c2 =new card();
		c2.kind = "heart";
		c2.number = 4;
		
		System.out.println(c1.kind + " " + c1.number + " "  + c1.width + " " + c1.height);
		
		c1.width = 80;
		c1.height = 100;
		System.out.println(c1.kind + c1.number + c1.width + c1.height);
	}
}

class card
{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}