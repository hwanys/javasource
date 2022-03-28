package condition;

import java.util.Scanner;

public class PayOfHours {

	public static void main(String[] args) {
		// 사용자로부터 근무시간을 입력받기
		// 근무시간 중 8시간 까지는 시간당 9800원 지금
		// 8시간을 초과하는 근무시간은 시간당 급여의 1.5배를 추가지급하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간 입력 : ");
		int hour = sc.nextInt();
		
		int pay = 0, rate = 9800;
		
		if(hour > 8) {
			pay = (int)((hour-8)*1.5*rate) + 8 * rate;
		}else {
			pay = rate * hour;
		}
		System.out.println("하루 임금은 "+pay);
	}

}
