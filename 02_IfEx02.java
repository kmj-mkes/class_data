package java_00;

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


		// 1. if



		// 2. if-else



		// 3. if-else if


	}

}