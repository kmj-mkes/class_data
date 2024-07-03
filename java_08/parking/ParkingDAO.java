package parking;

public class ParkingDAO {
	
	static final int ROW = 4;
	static final int COL = 3;
	
	// 데이터 저장소
	String[][] parkingSpace;
	
	public ParkingDAO() {
		parkingSpace = new String[ROW][COL];
	}

}
