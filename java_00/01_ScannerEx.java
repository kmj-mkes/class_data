package java_00;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		// 자바 라이브러리에서 제공하는 콘솔 기본 입력 객체 - Scanner
		// 클래스 import - java.util.Scanner
		// 객체 선언으로 Scanner의 시작을 알림
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력해 주세요. : ");
		
		// nextlt() : 정수 하나를 입력받는 메소드
		int a = sc.nextInt();
		
		System.out.print("이름을 입력해 주세요. : ");
		String b = sc.next();

		System.out.println(a + " :: " + b);

		// close : Scanner 객체를 닫는 메소드 (메모리 해제)
		sc.close();
		
		// Scanner 객체가 닫힌 후에는 Scanner를 통한 입력을 할 수 없다.
		
		
		
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 * int 변수가 아닌 Scanner를 통하여 숫자를 입력 받아 사용
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */


	}

}
