package condition;

public class ContinueEx2 {

	public static void main(String[] args) {
		// 0~10까지의 숫자 중에서 짝수만 출력(continue 사용)
		System.out.println("1~10 사이의 짝수");
		for(int i=0; i<=10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		// 1~100 숫자 중에서 홀수의 합만 구해서 출력
		int sum = 0;
		for(int j=0; j<=100; j++) {
			if(j % 2 == 0) {
				continue;
			}
			sum += j;
		}
		System.out.print("1~100 사이의 홀수의 합"+sum);
	}

}
