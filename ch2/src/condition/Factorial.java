package condition;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 숫자 입력 받은 후 그 숫자의 팩토리얼 구하기
		// ex ) 5 => 5!(5 * 4 * 3 * 2 * 1)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial을 구할 숫자 입력 : ");
		int num = sc.nextInt();
		int fac = 1;
		
		
		for(int i = 1; i<=num; i++) {
			fac *= i;
		}
		System.out.printf("%d! = %d ",num,fac);
	}

}
