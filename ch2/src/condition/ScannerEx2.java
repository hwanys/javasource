package condition;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력>>");
//		int num1 = sc.nextInt();
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 수 입력>>");
//		int num2 = sc.nextInt();
		
		// Integer.parseInt("35"); // "35" => 35
		int num2 = Integer.parseInt(sc.nextLine());	
		
		System.out.println("사칙연산(+,-,*,/,%) 중 하나 입력 >>");
		String op = sc.nextLine();
		
		// + : 연결(문자열), + : 뎃셈
		
		int result = 0;
		
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;

		default:
			break;
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,result);
		
	}

}
