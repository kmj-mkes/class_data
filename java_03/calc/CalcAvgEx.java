package calc;

import java.util.Scanner;

public class CalcAvgEx {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 연속으로 입력받아 평균값을 구하세요.
		- 숫자 0 을 입력 받으면 반복을 멈추고 최종 결과를 보여주세요.
		--------------------------

		 */
		
		// 숫자를 입력 받을 변수 초기화 선언
		int num = 0;
		
		// 계산(입력받은 숫자들의 합계)한 값을 저장할 변수 초기화 선언
		int result = 0;
		
		// 계산 결과를 보여줄 문자열 변수 초기화 선언
		String calcStr = "";
		
		boolean flag = true;
		
		int numCnt = 0;
		
		
		// 반복해서 숫자 입력을 받을 수 있도록 반복문 작성
		// 숫자 0을 입력 받았을 때 반복문을 멈추고 결과를 출력할 수 있어야 함
		while (flag) {
			num = getNum();
			result = result + num;
			
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
			
			numCnt++;
		}		
		
		result = result / numCnt;
		
		// 입력 받은 숫자들의 합을 보여줄 수 있는 출력문 작성
		System.out.println(" ( " + calcStr + " ) " + " / " + numCnt + " = " + result);
	}
	
	// 숫자 입력 받는 메소드
	public static int getNum() {
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		return num;
	}
}