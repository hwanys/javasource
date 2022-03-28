package shop;

public class User {
	private String name;	//고객명
	private PayType payType;		//결제방법		=>enum을 통해 PayType만들어줘서 지정한것 외에 값 입력안되도록 함.
	public User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}
	public String getName() {
		return name;
	}
	public PayType getPayType() {
		return payType;
	}
	
}
