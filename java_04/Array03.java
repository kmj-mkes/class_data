package java_04;

import book.Book;

public class Array03 {

	public static void main(String[] args) {
		/**
		 * [ Array ] 베열의 예제 - 배열 복사
		 * 
		 * System.arraycopy(src, srcPos, dest, destPos, length);
		 * 
		 * src		: 복사할 배열 이름
		 * scrPos	: 복사할 배열의 첫 번째 위치
		 * dest		: 복사해서 붙여 넣을 대상 배열 이름
		 * destPos	: 복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치
		 * length	: src에서 dest로 자료를 복사할 요소 개수
		 */

        arrayEx01();
//        arrayEx02();
//        arrayEx03();
	}

	// 배열 복사 예제
	public static void arrayEx01() {
		System.out.println("===== [ 배열 복사하기 ] =====");
		
        int[] array1 = { 10, 20, 30, 40, 50 };
        int[] array2 = { 1, 2, 3, 4, 5 };

        // (복사할 배열 이름, 복사할 배열의 첫번째 위치, 대상 배열 이름, 대상 배열 붙여넣기 시작 위치, 복사할 요소 개수)
        System.arraycopy(array1, 0, array2, 1, 4);
        
        for (int i=0; i<array2.length; i++) {
            System.out.println(array2[i]);
        }
	}

	// 객체 배열 복사 예제 - 시스템 명령어인 arraycopy 활용
	public static void arrayEx02() {
		System.out.println("===== [ 객체 배열 복사 예제 - 시스템 명령어인 arraycopy 활용 ] =====");
		
	    Book[] bookArray1 = new Book[3];
	    Book[] bookArray2 = new Book[3];

	    bookArray1[0] = new Book("태백산맥", "조정래");
	    bookArray1[1] = new Book("데미안", "헤르만 헤세");
	    bookArray1[2] = new Book("홍당무", "쥘 르나르");

	    System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

	    for (int i=0; i<bookArray2.length; i++) {
	        System.out.println("책 이름 : " + bookArray2[i].getTitle());
	        System.out.println("책 저자 : " + bookArray2[i].getAuthor());
	    }
	}

	// 객체 배열 복사 예제 - for문을 활용한 전체 복사
	public static void arrayEx03() {
		System.out.println("===== [ 객체 배열 복사 예제 - for문을 활용한 전체 복사 ] =====");
		
	    Book[] bookArray1 = new Book[3];
	    Book[] bookArray2 = new Book[3];

	    bookArray1[0] = new Book("태백산맥", "조정래");
	    bookArray1[1] = new Book("데미안", "헤르만 헤세");
	    bookArray1[2] = new Book("홍당무", "쥘 르나르");


	}

}
