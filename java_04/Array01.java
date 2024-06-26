package java_04;

public class Array01 {

	public static void main(String[] args) {

		/**
		 * [ Array ] 베열의 예제
		 */

		arrayEx01();
//		arrayEx02();
//		arrayEx03();
//		arrayEx04();
//		arrayEx05();
//		arrayEx06();
	}

	// 기본 배열 생성 예제
	public static void arrayEx01() {
		// 배열의 개수 생략
		int[] studentIDs_01 = new int[] { 101, 102, 103 };

		// 오류 발생 (배열 선언 시, 초기화 값을 넣어주려면 숫자를 생략해야 함
		//int[] studentIDs_02 = new int[3] { 101, 102, 103 };

		// 배열 3개가 생성되고 초기값 0이 들어있다.
		int[] studentIDs_03 = new int[3];
	}

	// 기본 배열 생성 예제 - 배열에 값 넣어보기
	public static void arrayEx02() {
		System.out.println("===== 기본 배열 생성 예제02 (값 넣어보기) =====");

		// 값이 0으로 초기화 된 int형 배열 3개 생성
		// 배열의 갯수만 정의하여 선언할 시에 int형 배열은 각각의 배열값이 0으로 초기화 되어 생성
		// int형 데이터 타입의 기본 초기값이 0이기 떄문
		int[] numbers1 = new int[3]; 

		numbers1[0] = 1; // 첫 번째 배열에 1 대입
		numbers1[1] = 2; // 두 번째 배열에 1 대입
		numbers1[2] = 3; // 세 번째 배열에 1 대입

		System.out.println("numbers1 배열의 첫번째 값 : " + numbers1[0]);
		System.out.println("numbers1 배열의 두번째 값 : " + numbers1[1]);
		System.out.println("numbers1 배열의 세번째 값 : " + numbers1[2]);

		System.out.println();

		// int형 배열 3개 생성
		// 첫 번째 배열에 10 대입
		// 두 번째 배열에 20 대입
		// 세 번째 배열에 30 대입
		int[] numbers2 = new int[] {10, 20, 30};

		System.out.println("numbers2 배열의 첫번째 값 : " + numbers2[0]);
		System.out.println("numbers2 배열의 두번째 값 : " + numbers2[1]);
		System.out.println("numbers2 배열의 세번째 값 : " + numbers2[2]);

		System.out.println();

		// 초기값을 지정하여 생성할 시에는 생성자 부분 생략 가능
		int[] numbers3 = {100, 200, 300};
		System.out.println("numbers3 배열의 첫번째 값 : " + numbers3[0]);
		System.out.println("numbers3 배열의 두번째 값 : " + numbers3[1]);
		System.out.println("numbers3 배열의 세번째 값 : " + numbers3[2]);
	}

	// 배열 생성 예제
	public static void arrayEx03() {
		System.out.println("===== [ 배열 생성 예제 03 ] =====");

		int[] nArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 초기화시 값 입력

		for (int i=0; i<nArr.length; i++) {
			System.out.println(nArr[i]);
		}
	}

	// 배열 생성 및 활용 예제
	public static void arrayEx04() {
		System.out.println("===== [ 배열 생성 예제 04 ] =====");

		int[] nArr = new int[10]; // 배열 생성

		// 생성된 배열에 값 할당
		for (int i=0; i<nArr.length; i++) {
			nArr[i] = i+1; 
		}

		// 배열에 할당된 값 확인
		for (int i=0; i<nArr.length; i++) {
			System.out.println(nArr[i]);
		}
	}

	// 배열 생성 및 활용 예제
	public static void arrayEx05() {
		System.out.println("===== [ 배열 생성 예제 05 ] =====");

		double[] data = new double[5];

		data[0] = 10.0; // 첫 번째 요소에 10.0 대입
		data[1] = 20.0; // 두 번째 요소에 20.0 대입
		data[2] = 30.0; // 세 번째 요소에 30.0 대입

		// data[3], data[4]에는 아직 값을 지정하지 않은 상태
		// double형 배열이므로, 값이 지정되지 않은 배열값은 0.0이 대입되어 있음
		for (int i=0; i<data.length; i++) {
			System.out.println(data[i]); // 배열의 전체 요소를 출력
		}
	}
	
	// 배열 생성 및 활용 예제
	public static void arrayEx06() {
		System.out.println("===== [ 배열 생성 예제 06 ] =====");

		String[] data = new String[5];

		data[0] = "오늘도";
		data[1] = "즐겁고";
		data[2] = "행복한";
		data[3] = "하루";
		data[4] = "보내세요!!";
		
		// 배열안의 값 출력하기
		for (int i=0; i<data.length; i++) {
			System.out.println(data[i]); // 배열의 전체 요소를 출력
		}
	}

}