package java_00;

import java.util.Scanner;

public class ForWhile02 {

	public static void main(String[] args) {

		// 5개의 정수를 입력받아, 입력받은 수 중 양수(+)만 합계를 구하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;		// 합계
		
		for (int i=0; i<5; i++) {
			System.out.print(i + "] 숫자를 입력해 주세요 : ");
			int n = sc.nextInt();
			
			// 음수일 때만, 합계에 누적하지 않고 넘어가기
			if (n < 0) {
				continue; //남은 실행문을 무시하고, 다음 반복으로
			}
			
			sum += n;
		}
		
		System.out.println("양수의 합 : " + sum);
		
		
		// 무한루프 >> 반드시 종료조건을 추가해주어야 한다.(break)
		while (true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
			// 문자열.equals("비교문자열")
			// : 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
			if ("STOP".equals(str)) {
				break;
			}
			
			System.out.println("입력 문자열 >> " + str);
		}
		
		System.out.println("프로그램을 종료합니다 !!");
		
		sc.close();
		
	}

}