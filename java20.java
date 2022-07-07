package test;
import java.util.*;
class student{
	int money;
	String name;
	student(String name, int money){
		this.money = money;
		this.name = name;
	}
	public void takebus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takesubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void taketaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	void showinfo() {
		System.out.println(name + "님의 남은 돈은" + money + "입니다.");
	}
}
class Bus{
	int busnumber;
	int passenger;
	int money;
	Bus(int busnumber){
		this.busnumber = busnumber;
	}
	void take(int money) {
		this.money += money;
		passenger++;
	}
	void showinfo() {
		System.out.println(busnumber + " " + passenger + " " + money);
	}
}
class Subway{
	String linenumber;
	int passenger;
	int money;
	Subway(String linenumber){
		this.linenumber = linenumber;
	}
	void take(int money) {
		this.money += money;
		passenger++;
	}
	void showinfo() {
		System.out.println(linenumber + " " + passenger + " " + money);
	}
}
class Taxi{
	int taxinumber;
	int passenger;
	int money;
	Taxi(int taxinumber){
		this.taxinumber = taxinumber;
	}
	void take(int money) {
		this.money += money;
		passenger++;
	}
	void showinfo() {
		System.out.println(taxinumber + " " + passenger + " " + money);
	}
}
public class java20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		int money1 = sc.nextInt();
		String name2 = sc.next();
		int money2 = sc.nextInt();
		String name3 = sc.next();
		int money3 = sc.nextInt();
		student studentjames = new student(name1, money1);
		student studenttomas = new student(name2, money2);
		student studentedward = new student(name3, money3);
		
	Bus bus100 = new Bus(100);
	studentjames.takebus(bus100);
	studentjames.showinfo();
	bus100.showinfo();
	
	Subway subwaygreen = new Subway("2호선");
	studenttomas.takesubway(subwaygreen);
	studenttomas.showinfo();
	subwaygreen.showinfo();
	
	Taxi taxi4534 = new Taxi(4534);
	studentedward.taketaxi(taxi4534);
	studentedward.showinfo();
	taxi4534.showinfo();
}
}