package java_00; 

public class Operator01 {
	public static void main(String[] args) {
		
		/*

    			[ 연산자, Operator ]
    			- 피연산자를 대상으로 미리 정해진 행동(연산)을 한 후에 행동(연산)의 결과를 반환하는 요소

    			1. 문장, Statement
    			- 1개 이상의 표현식이 모여서 문장을 만든다.
    			- int sum = 10 + 20;
    			
    			2. 표현식, Expression
    			- 문장을 구성하는 최소 단위 - 하나의 완성된 문장을 만들 수 있는 최소 표현
    			- int sum; -> 변수 선언 -> 하나의 표현식
    			- 10 + 20 -> 하나의 표현식
    			- sum = 30 -> 하나의 표현식
    			
    			3. 연산자, Operator
    			- 연산에 사용되는 표시나 기호
    			
    			4. 피연산자, Operand
    			- 연산자와 함께 연산되는 데이터
    			    			
    			5. 연산자 우선 순위
    			- 하나의 문장에 속해있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙
    			- 1 + 2 * 3 (산술 연산의 규칙은 수학 공식과 동일)
    			
    			6. 연산자 연산 방향
    			- 하나의 문장에 속해있는 연산자들 중 우선 순위 동일하면 누가 먼저 실행하는지에 대한 규칙
    			- 대부분: 왼쪽 > 오른쪽 실행 (반대 방향인 경우가 몇가지 없기 때문에 반대 방향만 기억하면 됨)


    			[ 연산자 종류 ]
    			1. 행동(목적)
    				a. 산술 연산자
    				b. 비교 연산자
    				c. 논리 연산자
    				d. 대입 연산자
    				e. 증감 연산자
    				f. 조건 연산자
    				g. 비트 연산자

    			2. 용법(피연산자 개수)
    				a. 1항 연산자
    				b. 2항 연산자
    				c. 3항 연산자

		 */

		
		int a = 10;
		int b = 3;
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		System.out.println();
		
		double c = 10;
		double d = 3;
		
		// 동일한 연산자라고하더라도 피연산자의 자료형에 따라 결과가 다름. 몫이 소수점까지 나옴.
		System.out.println("double " + c + " / double " + d + " = " + (c / d)); 
		System.out.println();

		// 모든 산술 연산자의 결과 자료형은 두 피연산자의 자료형 중 더 크기가 큰 자료형으로 반환된다.
		System.out.println(10 / 3);     // 정수/정수 = 정수 3 >> int / int = int
		System.out.println(10.0 / 3.0); // 실수/실수 = 실수 3.333333333333333 >> double / int = double (둘 중에 double이 더 커서 double 반환)
		System.out.println(10.0 / 3);   // 실수/정수 = 실수 3.333333333333333 >> int / double = double (둘 중에 double이 더 커서 double 반환)
		System.out.println(10 / 3.0);   // 정수/실수 = 실수 3.333333333333333 >> double / double = double
		System.out.println();

		// System.out.println(100 / 0); //ArithmeticException: // by zero
		System.out.println(100.0 / 0); // 피제수나 제수 둘중의 하나가 실수가 되면 가능.
		System.out.println(100 / 0.0);
		System.out.println(-100 / 0.0);
		System.out.println();

		// 산술 연산자 중, 나머지 연산자의 사용률이 꽤 많음
		// 특정 텀을 두고 반복되는 프로그램을 만들 때 - 예) 홀짝수 구분, 달력 등..
		System.out.println(10 % 3);
		System.out.println(10 % 4);
		System.out.println(10 % 5);
		System.out.println(10 % 10);
		System.out.println(10 % 11); // 몫이 없기 때문에 나머지가 10
		System.out.println();
		
		// 홀짝 구분
		// 나머지가 0 이면 짝수, 나머지가 1 이면 홀수
		int num1 = 101;
		int numResult;
		
		numResult = num1 % 2;
		
		System.out.println(numResult);
		
	}
}
