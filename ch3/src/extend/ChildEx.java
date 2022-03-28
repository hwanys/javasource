package extend;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();	//오버라이딩 되어 부모꺼로 보이지 않고 child-method2로 출력.
		child.method3();
		

	}

}
