package java_05;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		System.out.println("Point 부모 생성자 호출 - 기본 생성자");
		
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		System.out.println("Point 부모 생성자 호출 - 인자값이 있는 생성자");
		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
