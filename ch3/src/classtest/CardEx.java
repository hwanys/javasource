package classtest;

public class CardEx {

	public static void main(String[] args) {
		
		System.out.println("width "+Card.width);
		System.out.println("height "+Card.height);
		
		//static - 객체 생성없이 호출 가능
		Card card1 = new Card("heart", 7);
		Card card2 = new Card("spade", 4);
		Card card3 = new Card("heart", 8);
		
		
		System.out.println("card1 kind = "+card1.kind+" , "+
						   "card1 number = "+card1.number+" , "+
						   "card1 width = "+Card.width+" , "+		// static이 붙은거는 Card같은 클래스명. 사용해도 됨!
						   "card1 height = "+Card.height);
		
		System.out.println("card2 kind = "+card2.kind+" , "+
				"card2 number = "+card2.number+" , "+
				"card2 width = "+Card.width+" , "+		// static이 붙은거는 Card같은 클래스명. 사용해도 됨!
				"card2 height = "+Card.height);
		
		Card.width = 50;		//static사용했던 고정된 수 변경 시.
		Card.height = 80;
		
		System.out.println("card3 kind = "+card3.kind+" , "+
				"card3 number = "+card3.number+" , "+
				"card3 width = "+Card.width+" , "+		// 100 -> 50 변경된게 출력.
				"card3 height = "+Card.height);			// 150 -> 80 변경된게 출력.
		
	}
}
