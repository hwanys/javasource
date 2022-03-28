package classtest;

public class TVEx2 {

	public static void main(String[] args) {
		//(default 생성자를 이용해서) 객체 생성
//		TV2 tv = new TV2(); //The constructor TV2() is undefined
		//ㄴ=> 이미 인자가 있는 형태(틀)로 만들어져있으므로 default 형태로는 불가능!
		TV2 tv = new TV2("white",false,3);
	}

}
