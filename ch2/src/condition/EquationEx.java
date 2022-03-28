package condition;

public class EquationEx {

	public static void main(String[] args) {
		// 4x + 5y = 60
		// x,y 는 10 이하의 자연수
		
		
		for(int i=1;i<=10;i++) {				// 수업 코드 -> i를 x로, j를 y로 쓰셨음 -> 가독성 좋아보임.
			for(int j=1;j<=10;j++) {
				int add = 4*i + 5*j;
				
				if(add == 60) {					// 굳이 변수 add 사용 안하고 바로 4x + 5y로 하셨음.

//					System.out.printf("4*%d + 5*%d = 60",i,j);		// 내방식
					System.out.printf("(%d, %d)\n",i,j);			// 수업 코드
				}
			}
		}
	}

}
