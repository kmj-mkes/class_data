package java_00;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 정수1 / 연산자 / 정수2 를 입력 받아 연산식을 구현하여 결과를 출력해 주세요.
		//
		// 입력 값은 총 세개
		// 
		// 정수 1 연산자 정수2 로 계산 및 결과 출력
		// -----------------------------------------------------

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("연산자를 선택하세요. [ +, -, *, / ] : ");
		String oper = sc.next();

		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();



		sc.close();

	}

}