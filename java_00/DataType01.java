package java_00; 

public class DataType01 {

	public static void main(String[] args)  {

		/* [기본 자료형 8가지]
		 * 
		 * 정수형
		 * byte(1), short(2), int(4)(기본형), long(8, L/l)
		 * 
		 * 실수형
		 * float(4, F/f), double(8)(기본형)
		 * 
		 * 문자형
		 * char(2)
		 * 
		 * 논리형
		 * boolean(1, true/false)
		 * 
		 * [컴퓨터 값 처리 원칙]
		 * 같은 자료형끼리만 연산 가능, 결과도 같은 자료형
		 * 
		 * [자동 형변환]
		 * 값의 범위가 다른 자료형끼리의 연산 시
		 * 범위가 작은 자료형을 큰 자료형으로 변환
		 * (컴파일러가 자동 진행)
		 * 
		 * [강제 형변환]
		 * 특정한 자료형으로 강제 변환(바꾸고 싶은 자료형을 명시)
		 * 데이터 손실이 발생할 수 있음
		 * 소수 버림 처리 가능 
		 * 
		 * */

		// 정수, -128 ~ 127
		byte byteValue = -128;
		System.out.println("byteValue: " + byteValue);

		// 정수, -32,768 ~ 32,767
		short shortValue = -32768;
		System.out.println("shortValue: " + shortValue);

		// 정수, -2,147,483,648 ~ 2,147,483,647
		int intValue = -2147483648;
		System.out.println("intValue: " + intValue);

		// 정수, -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long longValue = -9223372036854775808L;
		System.out.println("longValue: " + longValue);

		// 실수, (유효 자릿수) 소수 6자리
		float floatValue = -128.12345f;
		System.out.println("floatValue: " + floatValue);
		floatValue = -128.123456f;
		System.out.println("floatValue: " + floatValue);

		// 실수, (유효 자릿수) 소수 15자리
		double doubleValue = -128.1234567890123d;
		System.out.println("doubleValue: " + doubleValue);
		doubleValue = -128.12345678901234d;
		System.out.println("doubleValue: " + doubleValue);

		// 논리, 진실(true) 또는 거짓(false)
		boolean booleanValue = true;
		System.out.println("booleanValue: " + booleanValue);

		// 문자, 0 ~ 65,535
		char charValue = 'P';
		System.out.println("charValue: " + charValue);
		charValue = 80;
		System.out.println("charValue: " + charValue);

	}
}
