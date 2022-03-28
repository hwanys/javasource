package condition;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//안녕하세요 10번 출력하기
//		System.out.println("안녕하세요"); <- 10번 반복하기에는 너무 효율성 안좋음.
		
		//반복문 사용시
		for(int i=0; i < 10; i++) {
			//1. int i=0;
			//2. i<10; true 가 결과적으로 나오는 경우만 for 실행
			//3. for 블럭 안으로 진입 => {} 안 구문 실행
			//4. i++(i=i+1) i = 1
			//5. i<10; (1 < 10)
			//6. for 블럭 안으로 진입 => 안 구문 실행
			//7. i++(i=i+1) i = 2
			//8. i<10; ( 2 < 10)
			//9. for 블럭 안으로 진입 => 안 구문 실행
//			...
			
			System.out.println("안녕하세요");
		}
	}

}
