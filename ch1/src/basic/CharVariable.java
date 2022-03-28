package basic;

// 컴퓨터 : 0,1
// 		: A => ?, 가 => ?
// 컴퓨터 내부에서 문자를 표현하기 위한 문자 코드 set : 문자 인코딩
// A=> 비트로 변환
// 문자 디코딩 : 비트 => 문자
// ASCII(기본 문자 인코딩 방식) -> A(65), a(97) 십진수로 변경했을때 숫자 기억하기!
// 유니코드 : 각 나라의 표준 인코딩
//		  : 1byte 는 아스키 코드값과 호환


// 문자형 : 1. char : 홑따옴표 안에 표현(문자는 하나만 가능)
// 		  2. String : 쌈따옴표 : ""
public class CharVariable {

	public static void main(String[] args) {
		char ch1 = 'A';
//		char ch2 = "Abcded";	//Invalid character constant
		System.out.println("ch1 = "+ch1);
		
		char ch2 = 65;
		System.out.println("ch2 = "+ch2);
		
//		String str1 = "A";
//		String str2 = "Abcded";
		
	}

}
