package condition;

import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택해 주세요(종료:0)");
			
			menu = sc.nextInt();
			
			if(menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}else if( !( 1<= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택했습니다.(종료는 0)");
				continue;
			}
			System.out.printf("선택하신 메뉴는 %d입니다.\n",menu);
		}
	}

}
