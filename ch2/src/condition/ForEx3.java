package condition;

public class ForEx3 {

	public static void main(String[] args) {
		// 1~10 까지 합
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;	// sum = sum + i
		}
		System.out.println("1~10 까지 합 : "+sum);
		
		// 1~100까지의 합
		sum = 0;
		for(int j=1;j<101;j++) {
			sum += j;
		}
		System.out.println("1~100까지의 합 : "+sum);
	}

}
