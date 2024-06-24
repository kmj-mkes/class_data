package java_02;

public class Method01 {

	public static void main(String[] args) {

		/*

		[ 요구사항 ]
		- 인삿말을 출력하는 메소드 3개를 선언하세요.

		[ 조건 ]
		- void hello()
		- void introduce()
		- void bye()

		[ 호출 ]
		- hello();
		- introduce();
		- bye();

		[ 출력 ]
		안녕하세요.
		저는 홍길동입니다.
		안녕히가세요.
		-------------------
		1. void 메소드 선언
		2. 각 메소드 안의 인삿말 출력
		3. 메소드 호출

		 */

		// 메소드 호출
		hello();
		introduce();
		bye();
	}

	// 인삿말 출력 메소드 hello
	public static void hello() {
		System.out.println("안녕하세요.");
	}

	// 인삿말 출력 메소드 introduce
	public static void introduce() {
		System.out.println("제 이름은 권민정 입니다.");
	}

	// 인삿말 출력 메소드 bye
	public static void bye() {
		System.out.println("오늘도 수고하셨습니다. 내일 또 봐요 !!");
	}

}
