package java_11.phoneBook.model;

public class Phone {
	private String name;
	private String tel;
	private String addr;

	// 기본 생성자
	public Phone() {

	}

	// 인자값 사용 생성자
	public Phone(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	// 출력용
	@Override
	public String toString() {
		return "Phone [name = " + name + ", tel = " + tel + ", addr = " + addr + "]";
	}

	// getter/setter 필요


}