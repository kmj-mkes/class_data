package java_10.inter01;

public class ExMain {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;

		Calc calc = new CompleteCalc();

		System.out.println(calc.add(num1, num2));
	}
}
