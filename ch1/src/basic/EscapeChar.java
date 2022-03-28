package basic;

public class EscapeChar {

	public static void main(String[] args) {
		// \로 시작하는 문자는 약속된 규칙이 있음
		// \n(엔터), \t(탭), \"(쌍따옴표 화면 출력)
		// print에 ln이 붙으면 띄어쓰기포함
		System.out.println("\n안녕하세요");
		System.out.println("안녕하세요\t반갑습니다");
		System.out.println("'Hello'");
		System.out.println(" \"Hello\" ");
		// print -> 띄어쓰기 포함 안함.
		System.out.print("Hello\n");
		System.out.print("wor\nld");
		
		
		// \하나를 표현하려면 => \\
		System.out.println("c:\\");		// "\" 하려면 \\로 표기하기.
	}

}
