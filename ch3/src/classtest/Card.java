package classtest;

public class Card {
	//멤버변수(인스턴스 변수)
	String kind;
	int number;
	
	//클래스 변수
	static int width = 100;		// width, height는 크기가 동일하여 고정된 수! => static 사용
	static int height = 150;
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
}
