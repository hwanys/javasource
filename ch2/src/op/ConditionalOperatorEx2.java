package op;

import java.util.Scanner;

public class ConditionalOperatorEx2 {

	public static void main(String[] args) {
		//숫자를 입력받고 그 숫자가 양수, 음수인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수" : "음수");
		
		sc.close();
	}

}
