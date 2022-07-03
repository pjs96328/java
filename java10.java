package test;

class car {
	String color;
	String gear;
	int door;
		
	car() {
		this("white", "auto", 4);
	}
	
	car(String color) {
		this(color, "auto", 4);
	}
	
	car(String color, String gear, int door){
		this.color = color;
		this.gear = gear;
		this.door = door;
	}

	}
public class java10 {

	public static void main(String[] args) {
		car c1 = new car();
		car c2 = new car("blue");
		System.out.println(c1.color + c1.gear + c1.door);
		System.out.println(c2.color + c2.gear + c2.door);
	}
}
