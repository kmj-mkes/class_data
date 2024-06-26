package book;

import java.util.Scanner;

import myUtil.MyUtil;

public class BookCreate2 {

	private static MyUtil ut = new MyUtil();
	private static Scanner sc = new Scanner(System.in);

	public static void bookInfoInsert() {

		System.out.print("도서명을 입력해 주세요 : ");
		String bookTitle = sc.next();

		System.out.print("도서가격을 입력해 주세요 : ");
		int bookPrice = sc.nextInt();

		System.out.print("저자명을 입력해 주세요 : ");
		String bookAuth = sc.next();

		System.out.print("출판사를 입력해 주세요 : ");
		String bookPub = sc.next();

		System.out.print("발행년도를 입력해 주세요 : ");
		String bookPubYear = sc.next();

		System.out.print("ISBN 코드를 입력해 주세요 : ");
		String bookIsbn = sc.next();

		System.out.print("총 페이지수를 입력해 주세요 : ");
		int bookPage = sc.nextInt();
		
		ut.enter();
		
		/*
		 *	[ 유효성 체크 추가 ]
		 *	1. 도서명은 빈값(null)일 수 없다.
		 *	2. 도서가격은 0원 이상 ~ 100,000원 이하여야 한다.
		 *	3. 총 페이지수는 0이상이어야 한다.
		 */

		Book book = new Book();

		book.setTitle(bookTitle);
		book.setPrice(bookPrice);
		book.setAuthor(bookAuth);
		book.setPublisher(bookPub);
		book.setPubYear(bookPubYear);
		book.setIsbn(bookIsbn);
		book.setPage(bookPage);

		bookInfoSelect(book);
	}
	
	public static Book bookInfoSelect(Book book) {
		
		System.out.println(book.bookInfo());

		return book;
	}

}