package java_10.abs01;

public abstract class Computer {
	public abstract void display(); // 추상 메서드
	public abstract void typing();  // 추상 메서드

	public void turnOn() { // 일반 메서드
		System.out.println("전원을 킵니다.");
	}

	public void turnoff() { // 일반 메서드
		System.out.println("전원을 끕니다.");
	}
}

