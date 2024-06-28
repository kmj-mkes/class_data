package java_05.ride;

public class Ride {
	
	private String rideColor;
	
	public Ride() {
		
	}
	
	public void move() {
		System.out.println("이동수단을 타다.");
	}
	
	public void moveRide(Ride ride) {
		ride.move();
	}

	public String getRideColor() {
		return rideColor;
	}

	public void setRideColor(String rideColor) {
		this.rideColor = rideColor;
	}

	
}
