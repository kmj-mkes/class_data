package java_02;

import java.util.Scanner;

public class Method04 {

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하세요.
		- 연산식 ( + , - , * , / , % )를 각각의 메소드로 선언하세요.
		
		[ 조건추가 ]
		- 0을 포함한 양수만 입력 가능
		--------------------------
		1. 입력 > scanner 생성
		2. 사용할 변수 선언 및 초기화
			: int n1, int n2, String result
		3. 메소드 선언
		4. 매개변수 이용 메소드 작성
		5. 값 반환
		6. 반환값 출력
		 */

		Scanner sc = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		String result = "";

		System.out.print("첫번째 숫자  : ");
		n1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		n2 = sc.nextInt();

		// 각각의 연산식 메소드 호출

		// 1. 메소드 호출
		result = add(n1, n2);
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);
		
		// 2. 조건 추가 - 숫자는 0을 포함한 양수만 허용
		System.out.println("=====================================================");
		System.out.println("조건 추가 - 숫자는 0을 포함한 양수만 허용");

		if (n1 >= 0 && n2 >= 0) {
			result = add(n1, n2);
			System.out.println(result);
			
			result = subtract(n1, n2);
			System.out.println(result);
			
			result = multiply(n1, n2);
			System.out.println(result);
			
			result = divide(n1, n2);
			System.out.println(result);
			
			result = mod(n1, n2);
			System.out.println(result);
		} else {
			System.out.println("[ERR] 0을 포함한 양수만 입력이 가능합니다.");
		}

		sc.close();

	}

	// 더하기 ( + )
	public static String add(int n1, int n2) {

		int result = 0;
		String output = "";

		result = n1 + n2;
		output = n1 + " + " + n2 + " = " + result;

		return output;

	}

	// 빼기 ( - )
	public static String subtract(int n1, int n2) {

		int result = 0;
		String output = "";

		result = n1 - n2;
		output = n1 + " - " + n2 + " = " + result;

		return output;
	}

	// 곱하기 ( * )
	public static String multiply(int n1, int n2) {

		int result = 0;
		String output = "";

		result = n1 * n2;
		output = n1 + " * " + n2 + " = " + result;

		return output;

	}

	// 나누기 몫 ( / )
	public static String divide(int n1, int n2) {

		double result = 0;
		String output = "";

		if (n2 == 0) {
			output = "0으로는 나눌 수 없음 !!";
		} else {
			result = (double) n1 / n2;
			output = n1 + " / " + n2 + " = " + result;
		}

		return output;
	}

	// 나누기 나머지 ( % )
	public static String mod(int n1, int n2) {

		int result = 0;
		String output = "";

		if (n2 == 0) {
			output = "0으로는 나눌 수 없음 !!";
		} else {
			result = n1 % n2;
			output = n1 + " % " + n2 + " = " + result;
		}

		return output;
	}

}