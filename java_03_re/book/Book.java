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
		
		result = "[ 도서정보 ]" + "\n";
		result += "도서명 : " + this.title + "\n";
		result += "가격 : " + this.price + " 원" + "\n";
		result += "글쓴이 : " + this.author + "\n";
		result += "출판사 : " + this.publisher + "\n";
		result += "발행년도 : " + this.pubYear + " 년" + "\n";
		result += "ISBN : " + this.isbn + "\n";
		result += "총 페이지 : " + this.page + " 장" + "\n";

		return result;
	}
	
	public String bookInfo(Book book) {
		
		String result = "";
		
		result = "[ 도서정보 ]" + "\n";
		result += "도서명 : " + this.title + "\n";
		result += "가격 : " + this.price + " 원" + "\n";
		result += "글쓴이 : " + this.author + "\n";
		result += "출판사 : " + this.publisher + "\n";
		result += "발행년도 : " + this.pubYear + " 년" + "\n";
		result += "ISBN : " + this.isbn + "\n";
		result += "총 페이지 : " + this.page + " 장" + "\n";

		return result;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		//제목 set 유효성 검사 > 최대 50자 이내
		if (title.length() > 0 && title.length() <=50) {
			this.title = title;
		} else {
			System.out.println("올바른 제목을 입력하세요.");
		}
		//TODO 한글, 영어, 숫자, 공백만 입력 가능하도록 유효성 검사 조건 걸어야 함!!

	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		//가격 set 유효성 검사.
		if (price > 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("올바른 가격을 입력하세요.");
		}

	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}


	//페이지수 읽기
	public int getPage() {
		return page;
	}


	//페이지수 쓰기
	public void setPage(int page) {
		//페이지 set 유효성 검사 > 1~무제한
		if (page > 0) {
			this.page = page;
		} else {
			System.out.println("올바른 페이지수를 입력하세요.");
		}
	}


	//출판사 > 쓰기 전용
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	//발행년도 > 읽기 전용 > 2019년
	public String getPubYear() {

		//			Calendar c = Calendar.getInstance();
		//			c.set(Calendar.YEAR, 2019);
		//TODO 멀라 이거 일단 보류
		return pubYear;
	}

	//ISBN 읽기
	public String getIsbn() {

		return isbn;
	}

	//ISBN 쓰기
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}


	/**
	 * @param pubYear the pubYear to set
	 */
	public void setPubYear(String pubYear) {
		this.pubYear = pubYear;
	}
	
}