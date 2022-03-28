package api;

import static java.lang.Math.*;	// 입력시 Math.round => 그냥 round만 입력해도 된다.

public class MathEx1 {
	//강의 코드 보기

	public static void main(String[] args) {
		double val = 90.7552;
		
		System.out.println("반올림 "+Math.round(val));	// 반올림
		System.out.println("반올림 "+Math.ceil(val));		// 올림
		System.out.println("반올림 "+Math.floor(val));		// 내림
		
		System.out.println(Math.PI);

	}

}
