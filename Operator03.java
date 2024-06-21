package java_00; 

public class Operator03 {
	public static void main(String[] args) {

		/*
		 	논리 연산자
		 	- &&(and), ||(or), !(not), ^(xor)
		 	- 2항 연산자(&&, ||, ^)
		 	- 1항 연산자(!)
		 	- 피연산자를 대상으로 정해진 규칙에 따라 연산 결과를 반환
		 	- 피연산자의 자료형이 boolean이다
		 	- 연산의 결과가 boolean이다	 
		 */

		System.out.println(true && true); // 단독으로 쓰이는 경우는 거의 없음

		// 19 보다 크고(초과), 60 보다 작은(미만)
		int var = 45;
		System.out.println((var > 19) && (var < 60)); // 비교연산자와 같이 쓰이는 경우가 많음
		System.out.println();


		/*
			대입 연산자
			- =
			- +=, -=, *=, /=, %= : 복합 대입 연산자
			- 대입 연산자는 모든 연산자들 중 우선 순위가 가장 낮다.

			-----------------------------------------------

			연산자 연산 방향
			- 대입, 증감 : 오른쪽 > 왼쪽
			- 나머지 : 왼쪽 > 오른쪽

		 */

		int sum = 10 + 20 * 3;
		System.out.println(" 10 + 20 * 3 = " + sum);
		System.out.println();
		
		// 덧셈 먼저
		sum = (10 + 20) * 3;
		System.out.println(" 10 + 20 * 3 = " + sum);
		System.out.println();

		
		// 대입연산자이므로 실행방향은 우측에서 좌측 ( 좌측 <----- 우측 )
		int a1 = 10;
		int a2;
		int a3 = 20;

		a1 = a2 = a3; // 에러
		//a3 = a2 = a1;
		
		System.out.println("a1 = " + a1 + " : a2 = " + a2 + " : a3 = " + a3);
		System.out.println();


		// 복합 대입 연산자
		int n = 10;
		int n2 = 10;

		// 기존 n에 1을 추가하기
		n = n + 1;
		System.out.println("n = n + 1 >>> " + n);
		System.out.println();

		// 복합 대입 연산 활용
		n2 += 1; // n2 = n2 + 1
		System.out.println("n2 += 1 >>> " + n2);
		System.out.println();

		// 기존 n에서 2를 빼기
		n = n - 2;
		System.out.println("n = n - 2 >>> " + n);
		System.out.println();

		// 복합 대입 연산 활용
		n2 -= 2 ;		
		System.out.println("n2 = n2 - 2 >>> " + n2);
		System.out.println();

		// 기존 n에서 2를 곱하기
		n = n * 2;
		System.out.println("n = n * 2 >>> " + n);
		System.out.println();
		
		// 복합 대입 연산 활용	
		n2 *= 2;
		System.out.println("n2 = n2 * 2 >>> " + n2);
		System.out.println();

		// 기존 n을 5로 나누기
		n = n / 5;
		System.out.println("n = n / 5 >>> " + n);
		System.out.println();

		// 복합 대입 연산 활용
		n2 /= 5;		
		System.out.println("n2 = n2 / 5 >>> " + n2);
		System.out.println();

		// 기존 n을 10으로 초기화, 3으로 나눈 나머지 값
		n = 10;
		n = n % 3;
		System.out.println("n = n % 3 >>> " + n);
		System.out.println();

		// 복합 대입 연산 활용
		n2 = 10;
		n2 %= 3;
		System.out.println("n2 = n2 % 3 >>> " + n2);
		System.out.println();


		/*

			증감 연산자
			- ++(증가), --(감소)
			- 1항 연산자
			- 피연산자는 숫자형을 가진다.
			- 누적 연산을 한다.
			- 기존 값에 1을 더하거나, 1을 뺀다.

		 *** 연산자의 위치에 따라 우선 순위가 달라진다.
			1. ++n : 전위 배치(전치) > 연산자 우선 순위가 가장 높음 (소괄호는 제외, 소괄호는 영순위 처리)
			2. n++ : 후위 배치(후치) > 연산자 우선 순위가 가장 낮음 (대입연산자보다 하위, 가장 늦게 실행)

		 *** 증감연산자는 일항 연산자이기 때문에 다른 연산자와 한문장에서 사용 불가

		 */

		int num = 10;

		// 동일한 연산을 각기 다른 방법으로 처리 (더하기)
		System.out.println("num = num + 1 >> " + (num = num + 1));
		// num = 10;
		System.out.println("num += 1 >> " + (num += 1));
		// num = 10;
		System.out.println("++num >> " + (++num));
		System.out.println();

		// 동일한 연산을 각기 다른 방법으로 처리 (빼기도 해보기)
		num = 10;
		System.out.println(num = num - 1);
		num = 10;
		System.out.println(num -= 1);
		num = 10;
		System.out.println(--num);
		System.out.println();


		//--------------------------------------
		
		num = 10;
		int result = 0;

		result = 10 + ++num; // 10 + ( 10 + 1 ) = 10 + 11 = 21
		System.out.println("10 + ++num = " + result);

		//--------------------------------------
		
		num = 10;
		
		++num;
		result = 10 + num;
		System.out.println("10 + ++num = " + result);

		//-----------------------------------------
		
		num = 10;
		
		result = 10 + num;
		++num; // num = num + 1
		
		// result = ++result;

		System.out.println("10 + ++num = " + result);
		System.out.println();
		
		//-----------------------------------------


		/*
			조건 연산자
			- ? 와 : 으로 이루어짐
			- A ? B : C 
			- A ? B (true 일 때 반환 값) : C (false 일 때 반환 값)
			- 3항 연산자
			- A: boolean
			- B, C: 상수, 변수 > 데이터(문장이 오는 경우도 있으나, 보통 데이터가 옴)
			- A 조건이 참이면 B를 반환, 거짓이면 C를 반환

		 */

		boolean flag = true;
		String m1 = "참";
		String m2 = "거짓";
		
		// flag ? m1 : m2; // 반환값과 동일한 변수에 넣어줘야 함
		String result2 = flag ? m1 : m2;
		System.out.println("true에 대한 조건식 반환 값 = " + result2);
		System.out.println();

		//---------------------------------
		
		// 사용자 나이 입력 - 19세 이상 통과, 60세 미만 거절
		// true(통과), false(거절)
		// Operator02에서는 true / false의 값만 확인하였으나, 조건 연산자를 통해 비교된 값을 원하는 형태의 결과로 보여줄 수 있다.

		int age = 30;
		String ageResult = "";
		
		ageResult = (age >= 19 && age < 60) ? "통과" : "거절";
		
		System.out.println("회원님의 나이는 " + age + "세이므로, " + ageResult + " 입니다.");

	}
}
