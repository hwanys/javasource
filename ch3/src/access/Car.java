package access;

public class Car {
	private int speed;
	private boolean stop;
	private Car(int speed, boolean stop) {
		super();
		this.speed = speed;
		this.stop = stop;
	}
	public int getSpeed() {				//getter, setter 생성
		return speed;					// 마우스 오른쪽 -> source -> Generate getters and setters 클릭.
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {	// boolean 타입의 변수는 getter가 만들어질때 is...로 바뀌어 만들어진다.
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}
