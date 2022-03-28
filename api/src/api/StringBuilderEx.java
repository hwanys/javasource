package api;

public class StringBuilderEx {

	public static void main(String[] args) {
		// String 클래스와 다른점은 mutable(변경가능) : append, insert, delete
		// StringBuilder : 문자열 클래스, 싱글 스레드
		// StringBuffer : 문자열 클래스, 멀티 스레드
		
		
		
		//builder = "ttt";(X)
		StringBuilder builder = new StringBuilder("Hello Java");
		builder.append("안녕하세요");		// 다시 넣을 필요없이 바로 넣어짐.
		System.out.println(builder);
		
		System.out.println(builder.delete(0, 2));	//0,1번 잘라짐.->"llo Java안녕하세요"
		System.out.println(builder);  //delete로 인해 원본이 바꼈음.->"llo Java안녕하세요"
		
		builder.insert(2, "T");
		System.out.println(builder);
		
		StringBuilder builder1 = new StringBuilder("Hello");
		StringBuilder builder2 = new StringBuilder("Hello");
		
		//equals() 오버라이딩 안되어 있음 (그냥 주소비교로 가는거)
		System.out.println(builder1.equals(builder2)); // false
		
		String str1 = new String(builder1);
		String str2 = new String(builder2);
		System.out.println(str1.equals(str2));	//true
		
		
	}

}
