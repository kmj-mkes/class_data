package book;

public class Book {
	
	// 도서명
	// 가격
	// 글쓴이
	// 출판사
	// 발행년도
	// ISBN
	// 총 페이지

	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear;
	private String isbn;
	private int page;
	
	public String bookInfo() {
		String result = "";
		
		result = "=== [ 도서정보 ] ===" + "\n";
		result += "도서명 : " + this.title + "\n";
		result += "가격 : " + this.price + "\n";
		result += "글쓴이 : " + this.author + "\n";
		result += "출판사 : " + this.publisher + "\n";
		result += "발행년도 : " + this.pubYear + "\n";
		result += "ISBN : " + this.isbn + "\n";
		result += "총 페이지 : " + this.page;
		
		
		return result;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubYear() {
		return pubYear;
	}
	public void setPubYear(String pubYear) {
		this.pubYear = pubYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	

}