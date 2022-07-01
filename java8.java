package test;

public class java8 {

	public static void main(String[] args) {
		mymath mm = new mymath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multyply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
class mymath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	long substract(long a, long b) {return a - b;}
	long multyply(long a, long b) { return a * b;}
	double divide(double a , double b) {return a / b;}
}