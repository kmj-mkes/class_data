package java_04;

import java.util.ArrayList;

import book.Book;

public class ArrayList01 {

	public static void main(String[] args) {
		/**
		 * [ ArrayList ] - 객체 배열
		 */

		arrayListEx01();
//		arrayListEx02();
	}

	// arrayList 객체 배열 예제 01
	public static void arrayListEx01() {
		System.out.println("===== [ arrayList 객체 배열 예제 01 ] =====");

	    ArrayList<String> strList = new ArrayList<String>();
	    strList.clear(); // 배열의 값 비워주기
	    
	    strList.add("aaaaa");
	    strList.add("bbbbb");
	    strList.add("ccccc");
	    strList.add("ddddd");
//	    strList.add(12345); // error, String 으로 선언했기 때문에 자료형을 맞춰 주어야 한다.

	    for (int i=0; i<strList.size(); i++) {  // arrayList의 크기만큼 순회한다.
	        System.out.println(strList.get(i)); // arrayList의 i번째 원소를 가져와서 출력한다.
	    }
	}

	// arrayList 객체 배열 예제 01
	public static void arrayListEx02() {
		System.out.println("===== [ arrayList 객체 배열 예제 02 ] =====");

	    // arrayList 선언
	    ArrayList<Book> library = new ArrayList<Book>();

	    // add() 메서드로 Book instance 생성하여 추가
	    library.add(new Book("태백산맥", "조정래"));
	    library.add(new Book("데미안", "헤르만 헤세"));
	    library.add(new Book("해리포터", "조앤 K 롤링"));
	    library.add(new Book("토지", "박경리"));
	    library.add(new Book("어린왕자", "생텍쥐페리"));

	    // arrayList의 사이즈만큼 순회하여 book을 반환받아 해당 정보 출력


	}
	
}