package java_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCollection {
	public static void main(String[] args) {
//		Collection은 저장소 역할, 데이터를 다루는 방법에 따라
//		List, Set, Map을 선택해서 사용함
//		ex) 맛집 대기자 리스트는 List
//			순서 상관 없이 중복을 제거하는 경우 Set
//			지역번호 - > Key와 Value를 이용한 Map  (02 : 서울, 031 : 경기 등)
		Scanner sc = new Scanner(System.in);
		Map<String, String> regionNum = new HashMap<String, String>();

		regionNum.put("02", "서울");
		regionNum.put("031", "경기");
		regionNum.put("033", "강원");
		regionNum.put("042", "대전");
		regionNum.put("051", "부산");
		regionNum.put("052", "울산");
		regionNum.put("061", "전남");
		regionNum.put("064", "제주");

//		System.out.println("02를 누르면 서울이 나옵니다 : " + regionNum.get(02));
//		System.out.println("031을 누르면 경기도가 나옵니다 : " + regionNum.get(031));

		// 지역번호 입력 : 031
		// 입력하신 지역번호에 대한 지역은 : 경기도
		while (true) {
			System.out.print("지역번호 입력 : ");
			String num = sc.next();
			if (num.equals("exit"))
				break;
			if (regionNum.get(num) == null) {
				System.out.println("존재하지 않는 지역입니다.");
				continue;
			}
			System.out.println("입력하신 지역번호에 대한 지역은 : " + regionNum.get(num));
		}
	}
}