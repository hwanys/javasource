package api;

public class Trim {

	public static void main(String[] args) {
		String s = "    Hello World    ";
		String s1 = "Hello World";
		
		System.out.println(s.equals(s1));	//공백 때문에 false 출력
		System.out.println(s.trim().equals(s1));	//공백 미리제거한 후 비교하기
		System.out.println(s);
		System.out.println(s.trim());	//공백제거

	}
}
