package calc;

import java.util.Scanner;

public class CalcSum {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 연속으로 입력받아 합계를 구하세요.
		- 숫자 0 을 입력 받으면 반복을 멈추고 최종 결과를 보여주세요.
		--------------------------

		 */

		int num = 0;

		int calcResult = 0;
		String calcStr = "";
		
		boolean flag = true;

		while (flag) {

			num = num();
			calcResult = calcResult + num;
			
			if (num == 0) {
				flag = false;
				continue;
			}
			
			if ("".equals(calcStr)) {
				calcStr = "" + num;
			} else {
				calcStr = calcStr + " + " + num;
			}
			
			System.out.println(calcStr);
		}
		
		System.out.println(calcStr + " = " + calcResult);
		
	}

	// 숫자 입력 받기
	public static int num() {
		int num = 0;

		System.out.print("숫자를 입력해 주세요  : ");
		num = sc.nextInt();
		
		return num;
	}

}