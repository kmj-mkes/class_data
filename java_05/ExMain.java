package java_05;

public class ExMain {

	public static void main(String[] args) {
		// 부모 클래스 생성자
//		Point point = new Point();
		Point point = new Point(1, 2);
		
		System.out.println("point x값 : " + point.getX());
		System.out.println("point y값 : " + point.getY());
		
		point.setX(10);
		point.setY(20);
		
		System.out.println("point x값 : " + point.getX());
		System.out.println("point y값 : " + point.getY());
		
		
		// 자식 클래스 생성자 - Point 클래스를 상속받았음
//		Circle circle = new Circle();
		Circle circle = new Circle(10, 20);
		
		System.out.println("circle x값 : " + circle.getX());
		System.out.println("circle y값 : " + circle.getY());
		
		circle.setX(100);
		circle.setY(200);
		
		System.out.println("circle x값 : " + circle.getX());
		System.out.println("circle y값 : " + circle.getY());

	}

}
