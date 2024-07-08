package java_11.phoneBook.service;

public interface PhoneBookService {
	
	/*
	문제) 이름, 주소, 전화번호를 멤버로 갖는 Phone클래스를 만들고,
		Map을 이용하여 전화번호 정보를 관리하는 프로그램을 작성하시오.

		- 공통적으로 구현해야 할 메소드를 설계하여 interface로 제공
		- implements 하는 클래스에서 상세 비지니스 로직 구현
		- 모든 메소드를 구현하여야 정상 작동 함
	 */

	// 시작 메서드
	public void phoneBookStart();

	// 메뉴를 출력하고 작업 번호를 입력 받아 반환하는 메서드
	public int displayMenu();
	
	// 새로운 전화번호 정보를 등록하는 메서드 
	// 이미 등록된 사람은 등록되지 않음 (동명이인 없음)
	public void insert();
	
	// 전화번호 정보를 수정하는 메서드
	public void update();
	
	// 전화번호 정보를 삭제하는 메서드
	public void delete();

	// 전화번호 정보를 검색하는 메서드
	public void search();
	
	// 전체 자료를 출력하는 메서드
	public void searchAll();
	
}