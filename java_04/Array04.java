package java_04;

public class Array04 {

	public static void main(String[] args) {
		/**
		 * [ Array ] 베열의 예제 - 다차원 배열
		 */

		arrayEx01();
		//		arrayEx02();
	}

	// 이차원 배열 예제 01
	public static void arrayEx01() {
		System.out.println("===== [ 이차원 배열 예제 01 ] =====");

		int[][] arr1 = { {1,2,3}, {4,5,6} };

		// arr[0][0] = 1		arr[1][0] = 4
		// arr[0][1] = 2		arr[1][1] = 5
		// arr[0][2] = 3		arr[1][2] = 6

		// 배열에 담긴 값을 확인하기 위한 출력문 작성


		System.out.println("============================");

		int[][] arr2 = new int[2][3];

		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[0][2] = 30;
		arr2[1][0] = 40;
		arr2[1][1] = 50;
		arr2[1][2] = 60;

		// 배열에 담긴 값을 확인하기 위한 출력문 작성

	}

	// 이차원 배열 예제 02
	// - 3행 3열 짜리 int 2차원 배열에 난수(0~9)를 대입한 후
	// - 각 행의 합과 전체 합을 출력
	public static void arrayEx02() {
		System.out.println("===== [ 이차원 배열 예제 02 ] =====");

		// 3행 3열짜리 int형 배열 생성
		int[][] arr = new int[3][3];

		// 난수(무작위의 수, 랜덤 숫자) 대입 및 출력
		// java 난수 생성 - [ Math.random() * 수의 범위 ]
		for (int row=0; row<arr.length; row++) {
			for (int col=0; col<arr[row].length; col++) {

				// 배열 요소에 난수 대입
				arr[row][col] = (int) (Math.random() * 10); // 0 ~ 9 사이의 난수

				System.out.print(arr[row][col] + "  ");
			}

			System.out.println(); // 개행
		}

		// 합계 계산 및 출력		
		int sum = 0;

		// 배열에 대입한 난수들의 전체 합계 구하기
		
		

		System.out.println("전체 합 : " + sum);
	}

}