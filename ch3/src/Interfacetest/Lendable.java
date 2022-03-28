package Interfacetest;

public interface Lendable {
	void checkOut(String borrower,String date);	//빌려갈때
	void checkIn();	// 반납할때 초기화용
}
