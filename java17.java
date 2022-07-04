package test;
import java.util.*;
class circle{
	double x,y;
	int radius;
	circle(double x, double y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		
	}
}
public class java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		circle c[] = new circle[2];
		for (int i=0; i<c.length;i++) {
			System.out.println("x,y,radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new circle(x,y,radius);
		}
		for(int i=0;i<c.length; i++)
			System.out.println(c[i]);
		sc.close();
	}

}
