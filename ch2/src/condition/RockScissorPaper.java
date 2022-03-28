package condition;

import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
		// 가위 : 1, 바위 : 2, 보자기 : 3
		
		// 컴퓨터가 무작위로 1~3까지의 숫자 중에서 하나를 가지고 있도록 한다.
		
		// 사용자의 가위, 바위, 보 정하기
		// 누가 이겼는지 결과 출력
		
		// 컴퓨터가 무작위로 1~3까지의 숫자 중에서 하나를 가지고 있도록 한다.
		int com = (int)(Math.random()*3)+1;
		
		// 3(보자기)
		// 사용자의 가위,바위,보 정하기 => 2(바위)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 : 1, 바위 : 2, 보자기 : 3 번호를 선택하세요.");
		int user = sc.nextInt();
		
		// 누가 이겼는지 결과 출력
		// user 가위(1) - computer(1, 2, 3)
		
		switch (user - com) {
		case -1 : case 2:
			System.out.println("user : "+user+"com : "+com);
			System.out.println("user가 졌음");
			break;
		case 1: case -2:
			System.out.println("user : "+user+"com : "+com);
			System.out.println("user가 이겼음");
			break;
		case 0:
			System.out.println("user : "+user+"com : "+com);
			System.out.println("비겼음");
			break;
		}
		
		
		
//		if(com == 1) {
//			if(user == 1) {
//				System.out.println("비겼습니다.");
//			}
//			else if(user == 2) {
//				System.out.println("user가 이겼습니다.");
//			}
//			else if(user == 3) {
//				System.out.println("com이 이겼습니다.");
//			}
//		}
//		if(com == 2) {
//			if(user == 2) {
//				System.out.println("비겼습니다.");
//			}
//			else if(user == 3) {
//				System.out.println("user가 이겼습니다.");
//			}
//			else if(user == 1) {
//				System.out.println("com이 이겼습니다.");
//			}
//		}
//		if(com == 3) {
//			if(user == 3) {
//				System.out.println("비겼습니다.");
//			}
//			else if(user == 1) {
//				System.out.println("user가 이겼습니다.");
//			}
//			else if(user == 2) {
//				System.out.println("com이 이겼습니다.");
//			}
//		}
	}

}
