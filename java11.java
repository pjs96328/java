package test;
class test6{
	String a;
	String b;
	int c;

	test6(String a){
		this(a, "x", 3);
	}
	test6(){
		this("q", "w", 1);
	}
	test6(String a, String b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
}
}
public class java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6 zxc = new test6();
		test6 vbn = new test6("bcx");
		System.out.println(zxc.a + zxc.b + zxc.c);
		System.out.print(vbn.a + vbn.b + vbn.c);
	}

}
