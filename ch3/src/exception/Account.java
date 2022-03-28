package exception;

/* 접근 제한자
 * - 객체 생성을 막아야 하는 경우
 * - 특정 메소드 호출 못하도록 하는 경우
 * - 객체의 속성을 외부에서 함부로 변경하지 못하도록 하는 경우
 * - 종류 : private < default(package) < protected < public	(가장 넓은 범위)
 * 		 : default : 접근제한자를 안 붙이면 됨.			
 * - 클래스의 접근 제한
 * ㄴ public(같은 패키지, 다른 패키지), default(같은 패키지)		=> (~만 허용)
 * 
 * - 멤버변수의 접근 제한(접근제한자 모두 사용가능)
 * - private : 같은 패키지건 다른 패키지건 상관없이 멤버변수 사용불가
 * 			 : 속성의 값 변경을 위해서는 메소드를 통해서만 제공하고
 * 			   직접적으로 변경하는 것은 허용하지 않기 위해서 사용
 * 
 */

public class Account {
	// 속성 : 계좌번호(111-11-1234), 소유자("홍길동"), 잔액(정수)
	private String accountNo; 
	private String owner;
	private int balance;
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}

	// 기능 : 입금한다, 출금한다.
	// 입금한다(deposit) : 입금액을 입력받아 현재 잔액에 추가/ 리턴값으로 현재 잔액
	int deposit(int amount) {
		balance += amount;
		return balance;	
	
	}
	// 출금한다(withdraw) : 출금액을 입력받아 현재 잔액에서 감소/ 현재 잔액
	int withdraw(int amount) throws Exception{
		if(balance < amount) {
			//예외 강제 발생
//			throw new BalanceInsufficientException("잔고부족 : "+(amount-balance)+"부족");	// 방법1
			throw new Exception("잔고부족 : "+(amount-balance)+"부족");						// 방법2
		}
		balance -= amount;
		return balance;
	}
	
	
}






