package java_05.car;

public class Car {

	// 매개변수 ( 필드 )
	protected String model;	// 차종
	protected int wheel;		// 바퀴 수
	protected int seat;		// 좌석 수
	protected String fuel;	// 연료

	public Car() {

	}		

	public Car(String model, int wheel, int seat, String fuel) {
		this.model = model;
		this.wheel = wheel;
		this.seat = seat;
		this.fuel = fuel;
	}

	public String carInfo() {
		String result = "";

		result += "[ 차종 ] : " + model + "\n";
		result += "[ 바퀴 수 ] : " + wheel + "\n";
		result += "[ 좌석 수 ] : " + seat + "\n";
		result += "[ 연료 ] : " + fuel + "\n";

		return result;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
