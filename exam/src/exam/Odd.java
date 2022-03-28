package exam;

public class Odd extends OddDetector {
	
	public Odd(int n) {
		super(n);
	}
	
	public boolean isOdd() {
		return n%2 == 1;
	}

}
