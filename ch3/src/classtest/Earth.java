package classtest;

// static final : 상수
// 상수 : 대문자로 표현
public class Earth {
	static final double EARTH_RADIUS = 6400;	//static - final 순서는 상관은 없음!
	final static double EARTH_SURFACE_AREA;
	
	static {
		//E_SURFACE_AREA final 사용했으니 초기화 필요
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;	 //4*PI*r(반지름)^2
	}
}
