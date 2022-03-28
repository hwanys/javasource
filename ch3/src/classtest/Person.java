package classtest;

// final : 최종적인
//		 : 무조건 초기화 필요(수정 불가)
//		 : 변수, 클래스, 메소드(오버라이딩금지)

public class Person {
	final String nation = "Korea";
	final String ssn;					// final 사용 => ssn 초기화 필요(14줄 코드로 초기화)
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;				// ssn는 이 코드로 초기화 시킴.
		this.name = name;
	}
	
	
}
