package extend;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		// BonusPointAccount 객체 생성
		BonusPointAccount account1 = new BonusPointAccount("111-11","일순이",100000,0);
		// 예금
		account1.deposit(20000);
		// 보너스 포인트 출력
		System.out.println("현재 보너스 포인트는 : "+account1.getBonusPoint());
		System.out.println("현재 잔액 : "+account1.getBalance());
		
	}

}
