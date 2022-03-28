package poly;

public class Tv extends Product {

	public Tv() {
		super(100);		// default형 생성자에 부모클래스의 인자에 100을 넣음.
		}
	
	@Override
	public String toString() {
		return "Tv";
	}
}
