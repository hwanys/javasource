package condition;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		// q가 입력되기 전까지 문자를 입력받기
		
		System.out.println("메세지를 입력해 주세요");
		System.out.println("종료를 원하면 q 입력해 주세요");
		
		String msg = " ";		// do-while문 내에 선언하면 while부분에서 msg를 선언 할수 x (영역 밖이라)
		
		do {
			
			Scanner sc = new Scanner(System.in);
			msg = sc.nextLine();
			
		}while(!msg.equals("q"));
	}

}
