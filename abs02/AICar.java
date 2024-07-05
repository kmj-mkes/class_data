package java_10.abs02;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율 주행을 시작합니다.");
        System.out.println("자동차가 스스로 방향을 전환합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로 멈춥니다.");
    }
}
