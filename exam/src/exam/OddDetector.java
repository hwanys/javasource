package exam;

public abstract class OddDetector  {

	int n;
	
	public OddDetector(int n) {
		super();
		this.n = n;
	}

	abstract boolean isOdd();

	public int getN() {
		return n;
	}


}
