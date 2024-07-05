package java_10.abs02;

public class ExMain {
	
    public static void main(String[] args) {
        Car myCar = new ManualCar();
        myCar.run();
        
        System.out.println("-------------------------------------");

        Car newCar = new AICar();
        newCar.run();
    }


}
