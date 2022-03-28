package exception;

public class CheckedException {
	public static void main(String[] args) {
		// CheckedException(코드를 치자마자 빨간줄로 알려주는) -> 예외가 나는 상황을 알려줌.
		try {
			Class.forName(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
