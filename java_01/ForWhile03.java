package java_01;

import java.util.Scanner;

public class ForWhile03 {

	public static void main(String[] args) {

		// 정수를 입력 받아 구구단을 출력해 보세요.
		// 단, 1~9까지만 허용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 단수의 구구단을 출력할까요 : ");
		
		int dan = sc.nextInt();
		
		if (dan >=1 && dan < 10) {
		
			// while 문 활용
			System.out.println("====== [ while문 ] " + dan + " 단 ==========");
			
			int hang = 1;
			
			while (hang <= 9) {
				int result = 0;
				
				result = dan * hang;
				System.out.println(dan + " * " + hang + " = " + result);
				hang++;
			}
			
			
			// for 문 활용
			System.out.println("====== [ for문 ] " + dan + " 단 ==========");
			
			for (int i=1; i<=9; i++) {
				int result = 0;
				
				result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
			}
		} else {		
			System.out.println("1~9단 까지만 출력이 가능합니다.");
		}
		
		sc.close();
		
	}

}