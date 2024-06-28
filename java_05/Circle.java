package java_05;

public class Circle extends Point {
	
	public Circle() {
		System.out.println("Circle 자식 생성자 호출 - 기본 생성자");
	}
	
	public Circle(int x, int y) {
		super(x, y);
		System.out.println("Circle 자식 생성자 호출 - 인자값이 있는 생성자");
	}

}
