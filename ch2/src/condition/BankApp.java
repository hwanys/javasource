package condition;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; // 잔고
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.println("선택>");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				// 예금액 입력받은 후 잔고에 추가
				System.out.println("예금할 금액을 입력하세요.");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.println("출금할 금액을 입력하세요");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("현재 잔액은 : "+balance+"원 입니다.");
				// 잔고 출력
				break;
			case 4:
				run = false;
				break;
			default:
				break;
			}
			
		}
	}

}
