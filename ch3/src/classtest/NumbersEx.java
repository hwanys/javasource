package classtest;

public class NumbersEx {

	public static void main(String[] args) {
		// Numbers 객체 생성 후 합계, 평균 구하기
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		Numbers cal = new Numbers(arr);
		
		// 위 또는 아래 같은 결과를 내는 코드! => 알아놓기.
		
		Numbers numbers = new Numbers(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		System.out.println("합계 : "+numbers.getTotal());
//		System.out.println("평균 : "+cal.getAverage());
		System.out.printf("평균 : %.2f",numbers.getAverage());	//=> 소수점 아래 제한 하고 싶을때 =>(printf, %.?f 사용하기.)
		
	}

}
