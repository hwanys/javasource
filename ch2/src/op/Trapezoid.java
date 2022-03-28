package op;

public class Trapezoid {

	public static void main(String[] args) {
		// 사다리꼴 넓이 구하기
		// 윗변 = 5, 아랫변 = 10, 높이 = 7 로 변수 선언하기
		
		// 넓이 구하기
		
		int u_l = 5;
		int d_l = 10;
		int h = 7;
		
//		double area = (double)((u_l+d_l)*h/2);
//		System.out.println("넓이 : "+area);
		System.out.println("사다리꼴 넓이 : "+(double)(u_l+d_l)*h/2);
	}

}
