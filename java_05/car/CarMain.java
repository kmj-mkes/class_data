package java_05.car;

public class CarMain {

	public static void main(String[] args) {
		// carEx1() method 선언
		// 기본 Car, 화물차 Truck, 경차 LightCar 객체 생성 및 내용 확인

//		carEx1();
		carEx2();
	}
	
	public static void carEx1() {
		// 기본 Car
		Car c1 = new Car();
		c1.setModel("제네시스");
		c1.setWheel(4);
		c1.setSeat(4);
		c1.setFuel("휘발유");
		System.out.println(c1.carInfo());
		
		// 화물차 Truck
		Truck c2 = new Truck();
		c2.setModel("화물차");
		c2.setWheel(10);
		c2.setSeat(3);
		c2.setFuel("경유");
		c2.setWeight(1.0);
		System.out.println(c2.carInfo());
		
		// 경차 LightCar
		LightCar c3 = new LightCar();
		c3.setModel("경차");
		c3.setWheel(4);
		c3.setSeat(4);
		c3.setFuel("전기");
		c3.setDiscountOffer(0.3);
		System.out.println(c3.carInfo());
	}

	public static void carEx2() {
		Car[] carList = new Car[3];
		
		carList[0] = new Truck("", 12, 3, "경유", 5.5);
		carList[1] = new LightCar("", 4, 4, "휘발유", 0.7);
		carList[2] = new Car("", 4, 2, "전기");
		
		for (Car c : carList) {
			
			String carModel = "";
			
			if (c instanceof Truck) {
				carModel = "10톤 트럭";
			} else if (c instanceof LightCar) {
				carModel = "레이";
			} else {
				carModel = "제네시스";
			}
			
			c.setModel(carModel);
			System.out.println(c.carInfo());
		}
		

		
	}
}
