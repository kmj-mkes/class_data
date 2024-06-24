package java_02;

import java_02.Method01;

public class Method02 {

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- return값이 있는 메소드 연습
		- 이름을 인자값으로 호출하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하세요.
		
		[ 조건 ]
		- String getName(String name)
			- name : 이름
			- return: 이름 님

		[ 호출 ]
		result = getName("백종원");
		System.out.println("고객명 : " + result);

		[ 출력 ]
		고객명 : 권민정 님

		-----------------------------------
		1. 메소드 선언 > String getName(String name)
		2. main method에서 사용할 변수 선언 > String result
		3. 매개변수값 가공 > name + " 님"
		4. 가공된 값 반환
		5. 선언한 메소드 호출 > getName("백종원")
		6. 반환값 출력 > System.out.println("고객명 : " + result)

		 */

		// 사용할 변수 선언 및 초기화
		String result = "";

		result = getName("백종원"); //반환된 return값이 main result의 값으로 치환
		System.out.println("고객명 : " + result);

	}

	
	// String 형태의 name을 매개변수로 가지는 getName 메소드 선언
	// String 형태의 result값을 호출한 곳으로 반환한다.
	public static String getName(String name) {

		String result = name + " 님";
		
		return result;
	}

}
