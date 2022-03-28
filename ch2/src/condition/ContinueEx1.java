package condition;

// continue; 반복문과 함께 사용
// 			 continue 문 이후의 문장 수행하지 않음

public class ContinueEx1 {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i % 3 == 0) {
				continue;				// i 가 3의 배수 일때
			}
			System.out.println(i);		// continue -> 시행 x
		}
	}

}
