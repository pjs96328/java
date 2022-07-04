package test;
class rec{
	int x;
	int y;
	int height;
	int width;
	rec(int x, int y, int height, int width){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	public int square() {
		return width*height;
	}
	boolean contains(rec r) {
		if(x < r.x && y < r.y)
			if((width+x) > (r.x+r.width)&&(height+y>r.y+r.height))
				return true;
		return false;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가" + square() + "인 사각형");
	}
}
public class java16 {

	public static void main(String[] args) {
		rec r = new rec(2,2,8,7);
		rec s = new rec(5,5,6,6);
		rec t = new rec(1,1,10,10);
		r.show();
		System.out.println("s의 면적은" + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포합합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포합합니다.");
	}

}
