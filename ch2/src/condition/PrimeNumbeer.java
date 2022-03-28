package condition;

public class PrimeNumbeer {

	public static void main(String[] args) {
		// 1 ~ 100 숫자 중에서 소수 구하기
		// 1과 자기자신으로만 나누어지는 수
		
		
		for(int i=2; i<=100; i++) {
			int s = 0;
//			int count = 0;						// 변수 count로 사용 하는 수업코드
			for(int j=2; j<=i-1; j++) {
//			for(int j=1; j<=i; j++) {			// 1 ~ i까지 전부 나누어서 반복 (쉅.코)
				if(i % j == 0) {
					s = 1;
//					count++;					// 나누어 떨어지면 count++해줌 (쉅.코)
				}
			}
//			if(count == 2){						// count == 2 (1,자기자신으로만 나누어지는!) (쉅.코)
//				System.out.printf("%d는 소수입니다.\n",i);
//			}
			if(s == 0) {
				System.out.printf("%d는 소수입니다.\n",i);
			}
		}
		
		
	}

}
