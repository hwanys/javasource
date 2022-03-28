package extend;

public final class Car {	// 
	
	private String name;
	final String color="white";	// final -> 변경금지 (color = 무조건 white!)
	
	public Car(String name) {
		super();
		this.name = name;
	}
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
