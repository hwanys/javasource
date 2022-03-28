package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product items[] = new Product[10];	// 부모의 배열로 표현을 하면 모든것을 포함.
	// Tv
//	Tv tv[] = new Tv[10];		
//	Computer computer[] = new Computer[10];
	//			...				// 하나하나 계속해서 추가하게 됨...
	
	
	int i=0;
	
	
	void buy(Product p) {								// 하나로 다 처리가능한 부모 매개변수 Product
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건 구매 불가");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;
		System.out.println(p + "을/를 구매하였습니다.");
	}
	
//	void buy(Tv p) {								// 하나씩 매번 만들어야 하는 번거로움.
//		if(money < p.price) {
//			System.out.println("잔액 부족으로 물건 구매 불가");
//			return;
//		}
//		
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		System.out.println(p + "을/를 구매하였습니다.");
//	}
//	void buy(Computer p) {
//		if(money < p.price) {
//			System.out.println("잔액 부족으로 물건 구매 불가");
//			return;
//		}
//		
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		System.out.println(p + "을/를 구매하였습니다.");
//	}
}
