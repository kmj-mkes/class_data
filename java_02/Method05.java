package java_02;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 구하시오.
		- Scanner를 통해 숫자 입력 받기
		- 숫자의 합을 구하는 구문은 메소드로 작성하기
		--------------------------
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력해 주세요 : ");
		num = sc.nextInt();

		if (num >= 1) {
			sum = sum(num);
			System.out.println("1부터 " + num + "까지의 합은 " + sum + " 입니다.");
		} else {
			System.out.println("1보다 작은 숫자는 계산할 수 없어요.");
		}
	}
	
	// 계산식 method
	public static int sum(int num) {
		int result = 0;
		
		for (int i=1; i<=num; i++) {
			result = result + i;
			//result += i;
		}
		
		return result;
	}

}