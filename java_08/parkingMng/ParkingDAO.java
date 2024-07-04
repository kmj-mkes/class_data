package parkingMng;

public class ParkingDAO {

	static final int ROW = 4;
	static final int COL = 5;

	// 데이터 저장소
	String[][] parkingSpace;
	String[][] parkingNum;

	public ParkingDAO() {
		parkingSpace = new String[ROW][COL];
		parkingNum = new String[ROW][COL];

		int parkingCnt = 0;

		for (int i=0; i<parkingNum.length; i++) {
			for (int j=0; j<parkingNum[i].length; j++) {
				parkingCnt++;
				parkingNum[i][j] = parkingCnt + "";
			}
		}
	}

	public void insertParking(String location, String carNum) {
		
		for (int i=0; i<parkingNum.length; i++) {
			for (int j=0; j<parkingNum[i].length; j++) {
				if (location.equals(parkingNum[i][j])) {
					parkingSpace[i][j] = carNum;
				}
			}
		}
	}

	public boolean deleteParking(String location) {
		
		boolean flag = true;
		
		for (int i=0; i<parkingNum.length; i++) {
			for (int j=0; j<parkingNum[i].length; j++) {
				if (location.equals(parkingNum[i][j]) && parkingSpace[i][j] != null) {
					parkingSpace[i][j] = null;
					return true;
				} else {
					flag = false;
				}
			}
		}
		
		return flag;
	}

	public String[][] selectParking() {
		return parkingSpace;
	}
	
	public String selectParkingSpace(String location) {
		
		String result = "";
		
		for (int i=0; i<parkingNum.length; i++) {
			for (int j=0; j<parkingNum[i].length; j++) {
				if (location.equals(parkingNum[i][j])) {
					result = parkingSpace[i][j];
				}
			}
		}
		
		return result;
	}

}
