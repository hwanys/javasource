package array;

// 향상된 for : 배열, 리스트 사용
// for(타입 변수명 : 배열명(리스트명)){
//	수행문;
//}


public class ArrayEx4 {

	public static void main(String[] args) {
		char chArr[] = {'a','b','c','d','e'};		// char형 '?' => 홑따옴표
		
		for(int i=0; i<chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		
		for(char ch : chArr) {			// 향상된 for문. => chArr 배열에서 차례로 하나씩 가져와서 ch라는 변수에 담아라	
			System.out.print(ch+" ");
		}
		System.out.println();
		
		
		
		System.out.println(chArr);					// 결과 : abcde 
													// 예외 => char배열만 예외로 오버라이딩 되어 주소가 나오지않고 문자자체 출력됨
		
		String str[] = {"a","b","c","d","e"};		// String형 "?" => 쌍따옴표
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		for(String s : str) {				// 향상된 for문 => 단순 형태를 출력할때는..! 편리.
			System.out.println(s);
		}
		
		System.out.println(str);					// 결과 : [Ljava.lang.String;@7d6f77cc (주소형식)
	}
}






