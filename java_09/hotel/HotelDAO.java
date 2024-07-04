package hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {
	
	final int RoomCnt = 10;

	List<Room> roomList;
	
	public HotelDAO() {
		roomList = new ArrayList<Room>(RoomCnt);
		
		for (int i=0; i<RoomCnt; i++) {
			roomList.add(new Room(false));
		}
	}
	
	public void checkIn(int roomNum) {
		// 객실 체크인 - List에 속해 있는 Room 객체의 사용여부를 '사용중'으로 변경
		roomList.set(roomNum-1, new Room(true));
	}
	
	public void checkOut(int roomNum) {
		roomList.set(roomNum-1, new Room(false));
	}
	
	public boolean selectRoomChk(int roomNum) {
		boolean isFlag = false;
		
		isFlag = roomList.get(roomNum-1).isUsing();
		
		return isFlag;
	}
	
	public List<Room> selectRoomList() {
		return roomList;
	}
}
