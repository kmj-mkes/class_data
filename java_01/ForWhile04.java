package java_01;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		
		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
		
		int dan = 1;
		
		while (dan <= 9) {
			
			System.out.println("[while] " + dan + " 단");
			
			int hang = 1;
			
			while (hang <= 9) {
				int result = 0;
				
				result = dan * hang;
				System.out.println(dan + " * " + hang + " = " + result);
				hang++;
			}
			
			dan++;
		}
		
		System.out.println();
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");
		
		for (int i=1; i<=9; i++) {
			
			System.out.println("[for] " + i + " 단");
			
			for (int j=1; j<=9; j++) {
				int result = 0;				
				result = i * j;
				
				System.out.println(i + " * " + j + " = " + result);
			}
		}
		
	}

}