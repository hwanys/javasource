package classtest;

public class PersonEx {

	public static void main(String[] args) {
		Person person = new Person("001111-1222123", "홍길동");
		
		System.out.println("국적 : "+person.nation);
		System.out.println("주민번호 : "+person.ssn);
		System.out.println("이름 : "+person.name);
		
		person.name = "홍두깨";
		System.out.println("이름 : "+person.name);
		
//		person.ssn = "011212";	//The final field Person.ssn cannot be assigned => final필드는 변경 할 수 없다..
		
	}

}
