package Interfacetest;

public class AppInfoEx {

	public static void main(String[] args) {
//		SeparateVolume obj1 = new SeparateVolume("863r774","개미","베르나르");
		Lendable obj1 = new SeparateVolume("863r774","개미","베르나르");	//상속의 개념 있을때 양쪽다르게 사용가능, 인터페이스도 다형성 관련 사용 가능.
		obj1.checkOut("홍길동","2022-02-28");
		
		AppCD obj2 = new AppCD("2022-01","Oracle");
		obj2.checkOut("성춘향", "2022-03-01");
		
	}

}
