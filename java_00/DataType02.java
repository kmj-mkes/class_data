package java_00; 

public class DataType02 {

	public static void main(String[] args)  {

		/*
			[ 자동형변환 ]
			 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
			 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해 줌.
			 (promotion, UpCasting)
		 */

		// byte -> int 자동형변환
		byte b = 10; 
		int i = b;  
		System.out.println(i);

		// char -> int 자동형변환 
		char c = '가';
		int j = c;		
		System.out.println("가의 문자 번호:" + j);

		// int -> double 자동형변환
		int k = 500;
		double d = k;
		System.out.println(d);

	}
}
