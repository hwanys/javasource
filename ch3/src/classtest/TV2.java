package classtest;

//클래스 : 객체의 속성과 기능을 코드로 구현

public class TV2 {
	//속성 : 색상(black), 전원상태(on/off), 채널......
	String color;
	boolean power;
	int channel;
	
	
	
	//생성자를 명시하지 않으면
	//컴파일러가 자동으로 default 생성자를
	//만들어줌
	
	// 생성자
	public TV2(String color) {
		this.color = color;
	}
	public TV2(String color,boolean power) {
		this.color = color;
		this.power = power;
	}
	public TV2(String color,boolean power,int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	
	
	
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
