package java_04;

import java.text.DecimalFormat;

public class Array05 {

	public static void main(String[] args) {
		/**
		 * [ Array ] 이차원 배열
		 * 
		 * { A, B, C, D } 학생 배열 생성
		 * { 국어, 영어, 수학 } 으로 이루어진 과목명을 담은 배열 생성
		 * 
		 * 네 명의 학생의 과목별 점수를 int 이차원 배열로 생성
		 * 
		 * 1. stuArray01 method 선언
		 *  - 네명 학생의 점수 총합을 구하시오.
		 *  
		 * 2. stuArray02 method 선언
		 *  - 네명 학생의 점수 평균을 구하시오.
		 *  - 평균 점수는 DecimalFormat을 사용하여 소수점 두자리까지 표기
		 */

		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};

		// 4행 3열의 이차원 배열
		// row : 학생 정보
		// col : 과목명
		int[][] score = {
				{79, 80, 99}, //A학생
				{95, 85, 89}, //B학생
				{90, 65, 56}, //C학생
				{69, 78, 77}  //D학생
				//과목: 3과목
		};


		stuArray01(stuName, subName, score);
//		stuArray02(stuName, subName, score);
//		javaFormat();
	}

	//	 * 1. stuArray01 method 선언
	//	 *  - 네명 학생의 점수 총합을 구하시오.
	public static void stuArray01(String[] stuName, String[] subName, int[][] score) {
		System.out.println("===== [ stuArray01 ] =====");

		for (int row=0; row<stuName.length; row++) {
			int total = 0;

			for (int col=0; col<subName.length; col++) {
				total += score[row][col];
			}

			System.out.println(stuName[row] + "의 점수 총합 : " + total + " 점");
		}
	}

	//	 * 2. stuArray02 method 선언
	//	 *  - 네명 학생의 점수 평균을 구하시오.
	public static void stuArray02(String[] stuName, String[] subName, int[][] score) {
		System.out.println("===== [ stuArray02 ] =====");

	}

	// JAVA Format 사용하기
	public static void javaFormat() {

		// 돈 표시 (세자리 수당 ,를 표시)
		DecimalFormat formatter = new DecimalFormat("#,##0");
		int data = 1000000000;
		String ret = formatter.format(data);
		System.out.print("#,##0 - ");
		// 1,000,000,000
		System.out.println(ret);

		// 소수점 이하 2번째자리까지 표시 (소수점 이하가 없을 경우 0.00으로 표시한다.)
		DecimalFormat formatter2 = new DecimalFormat("#,##0.00");
		double data2 = 10000000d;
		ret = formatter2.format(data2);
		//10,000,000.00
		System.out.print("#,##0.00 - ");
		System.out.println(ret);

		// 소수점 이하 2번째자리까지 표시 (소수점 이하가 없을 경우 표시하지 않는다.)
		DecimalFormat formatter3 = new DecimalFormat("#,##0.##");
		ret = formatter3.format(data2);
		System.out.print("#,##0.## - ");
		// 1,000,000,000
		System.out.println(ret);

		// 자릿수 이하는 반올림 처리
		double data3 = 1000.178d;
		System.out.print("#,##0.00 - ");
		ret = formatter2.format(data3);
		// 1,000.12
		System.out.println(ret);

		System.out.print("#,##0.## - ");
		ret = formatter3.format(data3);
		// 1,000.12
		System.out.println(ret);

		double data4 = 1000.1d;
		System.out.print("#,##0.00 - ");
		ret = formatter2.format(data4);
		// 1,000.10
		System.out.println(ret);

		System.out.print("#,##0.## - ");
		ret = formatter3.format(data4);
		// 1,000.1
		System.out.println(ret);
	}

}