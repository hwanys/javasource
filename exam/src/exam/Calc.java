package exam;

public abstract class Calc {
	int a;
	int b;
	
	public abstract void Add();
	public abstract void Sub();
	public abstract void Mul();
	public abstract void Div();
	
	public Calc(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
}
