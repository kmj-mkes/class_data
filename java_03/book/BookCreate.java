package book;

import java.util.Scanner;

import myUtil.MyUtil;

public class BookCreate {
	
	private static Scanner sc = new Scanner(System.in);

	public static void bookInfoInsert() {
		
		// 도서 정보를 입력 받아 Book1을 만들어 주세요.
		
		System.out.print("도서명을 입력해 주세요 : ");
		String bookTitle = sc.next();
		
		System.out.print("도서가격을 입력해 주세요 : ");
		int bookPrice = sc.nextInt();
		
		System.out.print("도서의 저자는 누구인가요? : ");
		String bookAuth = sc.next();
		
		System.out.print("출판사는 어디인가요? : ");
		String bookPub = sc.next();
		
		System.out.print("발행년도는? : ");
		String bookPubYear = sc.next();
		
		System.out.print("도서 ISBN 코드를 입력해 주세요 : ");
		String bookIsbn = sc.next(); 
		
		System.out.print("총 페이지수는 몇 장인가요? : ");
		int bookPage = sc.nextInt();
		
		Book b1 = new Book();

		b1.setTitle(bookTitle);
		b1.setPrice(bookPrice);
		b1.setAuthor(bookAuth);
		b1.setPublisher(bookPub);
		b1.setPubYear(bookPubYear);
		b1.setIsbn(bookIsbn);
		b1.setPage(bookPage);
		
		bookInfoSelect(b1);
	}
	
	public static Book bookInfoSelect(Book book) {
		
		System.out.println(book.bookInfo());
		
		return book;
	}
	


}