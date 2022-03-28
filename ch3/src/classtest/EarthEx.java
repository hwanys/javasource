package classtest;

// import : 다른 패키지에 있는 클래스를 사용할 때 필요
//		  : 자바에서 제공하는 패키지 중 java.lang 패키지는 import 구문 없이 사용 가능

// java.util : 패키지명

import java.util.Scanner;

public class EarthEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("반지름 "+Earth.EARTH_RADIUS+" km");
		System.out.println("지구의 표면적 "+Earth.EARTH_SURFACE_AREA+" km^2");
		
	}
}
