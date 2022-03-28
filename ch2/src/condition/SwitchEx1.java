package condition;

public class SwitchEx1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch (num) {
		case 1:
			System.out.println("1번");
			break;						// switch는 { } 사용 하지 않으므로 break로 멈추기
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			break;
		}
	}
}
