package java_04;

import book.Book;

public class Array02 {

	public static void main(String[] args) {
		/**
		 * [ Array ] 베열의 예제 - 객체 배열 생성
		 */

		arrayEx01();
//		arrayEx02();
	}

	// 객체 배열 생성 예제
	public static void arrayEx01() {
		System.out.println("===== [ Book 클래스 배열 생성 ] =====");

		Book[] library = new Book[5];

		for (int i=0; i<library.length; i++) {
			System.out.println(i + " : " + library[i]);
		}
	}

	// 객체 배열 생성 예제
	public static void arrayEx02() {
		System.out.println("===== [ Book 클래스를 활용하여 여러개의 도서 정보를 배열로 생성 ] =====");

		Book[] library = new Book[5];

		library[0] = new Book("해리포터", "J.K.롤링");
		library[1] = new Book("정의란 무엇인가", "마이클 샌델");
		library[2] = new Book("Do it java 프로그래밍", "박은종");
		library[3] = new Book("어린왕자", "앙투안 드 생텍쥐페리");
		library[4] = new Book("괭이 부리말 아이들", "김중미");

		for (int i=0; i<library.length; i++) {
			System.out.println(i + "] 책 이름 : " + library[i].getTitle());
			System.out.println(i + "] 책 저자 : " + library[i].getAuthor());
		}

	}

}