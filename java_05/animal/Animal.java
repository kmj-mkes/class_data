package java_05.animal;

public class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
