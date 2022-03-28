package condition;

public class BreakEx1 {

	public static void main(String[] args) {
		
		// sum이 100을 넘는 순간 i값과 sum을 출력
		int i = 0;
		int sum = 0;
		
		while(true) {
			if(sum > 100) {
				break;	// while 문 종료
			}
			++i;
			sum += i;
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
	}

}
