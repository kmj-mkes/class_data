package java_01;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {

		// 사용자 나이 입력 - 19세 이상 통과, 60세 미만 거절
		// true(통과), false(거절)
		int age = 10;
		String ageResult = "";

		ageResult = (age >= 19 && age < 60) ? "통과" : "거절";
		System.out.println("회원님의 나이는 " + age + "세이므로, " + ageResult + " 입니다.");
		System.out.println();


		// -----------------------------------------------------
		// (예제) Scanner를 통해 나이를 입력 받아 통과 또는 거절을 결과로 보여주세요.
		// (조건) 사용자 나이 입력 - 19세 이상 통과, 60세 미만 거절
		// -----------------------------------------------------

		Scanner sc = new Scanner(System.in);

		// 1. if
		System.out.println("if 나이 : ");
		int age1 = sc.nextInt();

		if (age1 >= 19 && age1 < 60) {
			System.out.println("통과");
		}
		
		if (!(age1 >= 19 && age1 < 60)) {
			System.out.println("거절");
		}

		// 2. if-else

		System.out.println("if-else 나이 : ");
		int age2 = sc.nextInt();
		
		if (age2 >= 19 && age2 < 60) {
			System.out.println("통과");
		} else {
			System.out.println("거절");
		}


		// 3. if-else if
		
		System.out.println("if-elseif 나이 : ");
		int age3 = sc.nextInt();
		
		if (age3 >= 19 && age3 < 60) {
			System.out.println("통과");
		} else if (age3 < 19) {
			System.out.println("거절");
		} else if (age3 >= 60) {
			System.out.println("거절");
		}
		
		sc.close();

	}

}