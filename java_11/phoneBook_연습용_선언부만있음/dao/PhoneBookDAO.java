package java_11.phoneBook.dao;

import java.util.HashMap;

import java_11.phoneBook.model.Phone;

public class PhoneBookDAO {

	/*
	문제) 이름, 주소, 전화번호를 멤버로 갖는 Phone클래스를 만들고,
		Map을 이용하여 전화번호 정보를 관리하는 프로그램을 작성하시오.

		- 생성자 : 저장소 초기화
		- 등록, 수정, 삭제, 검색, 전체 출력에 대한 상세 로직 구현
		- 전화번호 중복 체크는 예시로 제공
	 */

	// 저장소 HashMap<key, value>
	// 			   <이름, 전화번호 객체>를 사용하는 HashMap 구조로 셋팅
	// 이름이 키값이 되어줌
	HashMap<String, Phone> phoneBookMap;

	// 생성자
	public PhoneBookDAO() {
		phoneBookMap = new HashMap<String, Phone>();
	}

	// 전화번호 등록
	public void insert(String name, String tel, String addr) {
		// HashMap put 활용
		// map.put(key, value);
	}

	// 전화번호 수정
	public void update(String name, String tel, String addr) {
		// HashMap put 활용
		// map.put(key, value);
	}

	// 전화번호 삭제
	public void delete(String name) {
		// HashMap remove 활용
		// map.remove(key);
	}

	// 전화번호 중복 체크
	public boolean dupCheck(String name) {

		// true : 이미 등록 되어 있음
		// false : 등록된 정보 없음
		// Map 객체의 경우, containsKey라는 함수를 활용하여 해당 키에 대한 value(연결 값)를 가지고 올 수 있다.
		if (phoneBookMap.containsKey(name)) {
			return true;
		} else {
			return false;
		}
	}

	// 전화번호 검색
	public void search(String name) {
	}

	// 전화번호 전체 출력
	public void searchAll() {
	}
}