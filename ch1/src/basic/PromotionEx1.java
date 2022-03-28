package basic;

//크기
//byte(1) < short(2) < int(4) < long(8) < double(8)

// 형(타입)변환
// 1. 자동형변환(Promotion) : 개발자가 신경쓰지 않아도 됨
//			큰 크기 타입 = 작은 크기 타입

// 2. 강제형변환(Casting) : 컴파일 오류와 관련있기 때문에 신경을 써야 함

public class PromotionEx1 {

	public static void main(String[] args) {
		
		byte byteValue = 10;
			// 자동형변환 (byte->int)
		int intValue = byteValue;
		System.out.println(intValue);
		
		
		char charValue = 'A';
		//자동형변환(char -> int)
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 500;
		//자동형변환(int -> long)
		long longValue = intValue;
		System.out.println(longValue);
		
		float floatValue = intValue;
		//자동형변환(int -> float)
		System.out.println(floatValue);
		
		floatValue = 35.2f;
		//자동형변환(float -> double)
		double doubleValue = floatValue;
		
		System.out.println(doubleValue);
		
		
		int v1 = 10;
		double d1 = 5.5;
		
		//두개의 타입이 서로 다를 때 산술연산을 하느 경우 큰 타입을 따라감
		double d2 = v1 + d1;
		
//		int d3 = v1 + d1; -> 변수형 선언 주의. d1이 double형 이므로.
		System.out.println("d2 ="+d2);
	}

}
