package access;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();	//static 가지고 오는 거
		Singleton obj2 = Singleton.getInstance();	
		
		System.out.println(obj1 == obj2);		//(=obj1,obj2의 주소가 같은가?)
		
		Account account1 = new Account("111-22", "홍길동", 10000);	//(new 사용할때마다 각각 heap에 저장) 
		Account account2 = new Account("111-23", "김길동", 10000);
		System.out.println(account1 == account2);

	}

}
