package calc;

import java.util.Scanner;

public class Calc {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하세요.
		- 연산자 ( + , - , * , / )를 각각의 메소드로 선언하세요.
		--------------------------
		1. 입력 > scanner 생성
		2. 사용할 변수 선언 및 초기화
			: int n1, int n2, String result
		3. 메소드 선언
		4. 매개변수 이용 메소드 작성
		5. 값 반환
		6. 반환값 출력
		 */

		int num = 0;
		String oper = "";

		int calcResult = 0;
		String calcOper = "";
		
		boolean flag = true;

		while (flag) {

			num = num();
			calcOper = calcOper + num;
			System.out.print(calcOper);
			
			calcResult = calcOper(calcResult, oper, num);
			System.out.println(" = " + calcResult);
			
			oper = oper();
			calcOper = calcOper + oper;			
			
			if ("=".equals(oper)) {
				System.out.println("[ 계산 결과 ] " + calcResult);
				flag = false;
			} else {
				System.out.println(calcOper);
			}
			
		}
		
	}

	// 숫자 입력 받기
	public static int num() {
		int num = 0;

		System.out.print("숫자를 입력해 주세요  : ");
		num = sc.nextInt();

		return num;
	}

	// 연산자 입력 받기
	public static String oper() {
		String oper = "";

		System.out.print("연산자 ( + , - , * , / )  : ");
		oper = sc.next();
		
//		if (!("+".equals(oper) || "-".equals(oper) || "*".equals(oper) || "/".equals(oper) || "=".equals(oper))) {
//			System.out.println("올바른 연산자를 입력해 주세요.");
//			oper();
//		}

		return oper;
	}

	public static int calcOper(int num1, String oper, int num2) {

		int operResult = 0;

		switch (oper) {
		case "+" :
			operResult = num1 + num2;
			break;
		case "-" :
			operResult = num1 - num2;
			break;
		case "*" :
			operResult = num1 * num2;
			break;
		case "/" :
			if (num2 == 0) {
				System.out.println("0으로는 나누기 못함 !!");
				break;
			}

			operResult = num1 / num2;			
			break;


		default:
			operResult = num2;

		}

		return operResult;
	}

}