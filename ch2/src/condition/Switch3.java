package condition;

public class Switch3 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A': case 'a':					// 대문자, 소문자 혹시모를 상황 지정해주기!
			System.out.println("우수회원");
			break;
		case 'B': case 'b':
			System.out.println("일반회원");
		default:
			System.out.println("손님");
			break;
		}
	}

}
