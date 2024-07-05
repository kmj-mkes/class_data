package java_10.abs02;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 직접 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크로 정지합니다.");
    }
}
