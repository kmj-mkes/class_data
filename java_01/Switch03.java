package java_01;

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
				System.out.println("0으로는 나눌 수 없음 !!");
				break;
			}
			
			operResult = num1 / num2;
			break;
			
		default :
			System.out.println("연산 기호를 정확하게 입력해 주세요.");
			
		}
		
		System.out.println(operResult);
		
		

		sc.close();

	}

}