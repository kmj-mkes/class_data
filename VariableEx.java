package java_00;

public class VariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int varNum = 5;
		//String varString = "5";
		
		int varNumber;
		varNumber = 100;
		
		int varNumResult;
		
		varNumResult = varNum + varNumber;
		
		System.out.println("숫자 변수 1 [ " + varNum + " ] 입니다.");
		System.out.println("숫자 변수 2 [ " + varNumber + " ] 입니다.");
		System.out.println(varNumResult);
		
		System.out.println("숫자 1과 숫자2를 더하면 ? [ " + varNum + varNumber + " ] ");
		System.out.println("숫자 1과 숫자2를 더하면 ? [ " + (varNum + varNumber) + " ] ");
		*/
		
		/*
		// 변수 값 바꾸기
		int num1 = 10;
		int num2 = 20;
		
		int numResult;
		
		System.out.println(" === 숫자 바꾸기 전 === ");
		System.out.println("숫자 1 [ " + num1 + " ] ");
		System.out.println("숫자 2 [ " + num2 + " ] ");
		// System.out.println(" 더한 값 [ " + numResult + " ]");
		
		numResult = num1;
		num1 = num2;
		num2 = numResult;
		
		System.out.println(" === 숫자 바꾸기 후 === ");
		System.out.println("숫자 1 [ " + num1 + " ] ");
		System.out.println("숫자 2 [ " + num2 + " ] ");
		
		
		// 변수 값 바꾸기 3개
		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		
		int varTemp;
		
		System.out.println(" === 숫자 바꾸기 전 === ");
		System.out.println("숫자 1 [ " + var1 + " ] ");
		System.out.println("숫자 2 [ " + var2 + " ] ");
		System.out.println("숫자 2 [ " + var3 + " ] ");
		
		varTemp = var1;
		var1 = var2;
		var2 = var3;
		var3 = varTemp;
			
		System.out.println(" === 숫자 바꾸기 후 === ");
		System.out.println("숫자 1 [ " + var1 + " ] ");
		System.out.println("숫자 2 [ " + var2 + " ] ");
		System.out.println("숫자 2 [ " + var3 + " ] ");
		*/
		
		// 년도와 나이 계산
		int curYear = 2024;
		int varNum = 1;
		
		int yearResult;
		
		int curAge = 45;
		
		int ageResult;		
		
		yearResult = curYear + varNum; //2025
		ageResult = curAge + varNum;
		
		System.out.println(" 올해는 [ " + curYear + " ] 년도 입니다.");
		System.out.println(" 올해 내 나이는 [ " + curAge + " ] 세 입니다.");
		
		System.out.println(" 다음해는 [ " + yearResult + " ] 년도 입니다.");
		System.out.println(" 다음해 내 나이는 [ " + ageResult + " ] 세 입니다.");
		
		yearResult = yearResult + varNum; // 2026
		ageResult = ageResult + varNum; // 46
		
		System.out.println(" 다다음해는 [ " + yearResult + " ] 년도 입니다.");
		System.out.println(" 다다음해는 내 나이는 [ " + ageResult + " ] 세 입니다.");
		
		yearResult = yearResult + varNum; // 2027
		ageResult = ageResult + varNum; // 47
		
		int ageResult2 = ageResult;
		
		System.out.println(" 다다다음해는 [ " + yearResult + " ] 년도 입니다.");
		System.out.println(" 다다다음해는 내 나이는 [ " + ageResult2 + " ] 세 입니다.");
		
		
		
		
		
	}

}
