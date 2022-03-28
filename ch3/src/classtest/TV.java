package classtest;

//클래스 : 객체의 속성과 기능을 코드로 구현

public class TV {
	//속성 : 색상(black), 전원상태(on/off), 채널......
	String color;
	boolean power;
	int channel;
	
	//기능 : 전원 on/off, 채널 변경
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
