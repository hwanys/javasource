package extend;

public class CreditLineAccount extends Account {
	
	//마이너스 한도 : creditLine
	private int creditLine;
	
	public CreditLineAccount(String accountNo, String owner, int balance) {
		super(accountNo, owner, balance);
		this.creditLine = creditLine;
	}
	
	@Override
	int withdraw(int amount) {
		// 잔액 = 잔액 + 마이너스 한도
		// 사용액 amount 보다 잔액이 작은지 확인
		if(getBalance()+creditLine < amount) {
			System.out.println("잔액 부족");
			return -1;
		}
		// 차감이 가능하다면 잔액 - 사용액
		setBalance(getBalance()-amount);
		// 리턴 값 잔액
//		return getBalance();		//이 코드에서는 오버라이딩으로 가려진게 없으므로 사용 가능
		return super.getBalance();	//오버라이딩 사용으로 인해 가려질수 있는데 이때 super 사용으로 부모꺼인걸 알 수 있다.
	}
	
}
