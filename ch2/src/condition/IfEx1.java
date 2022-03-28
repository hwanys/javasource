package condition;

/* 조건문
 * 
 * 
 * 
 */
public class IfEx1 {

	public static void main(String[] args) {
		int num = 10;
		
		// num == 0 => 숫자는 0 입니다.
		// num != 0 => 숫자는 0이 아닙니다.
		if(num == 0) {
			System.out.println("숫자는 0 입니다.");
		}
		
//		if(num != 0) {
//			System.out.println("숫자는 0 이 아닙니다.");
//		}
		
		if(num >= 0) {
			System.out.println("숫자는 0 이 아닙니다.");
			System.out.println("등급은 A");
		}
	}

}
