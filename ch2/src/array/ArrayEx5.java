package array;

import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		int iArr[] = {1,2,3,4,5};
		String strArr[] = {"abc", "cde", "spring"};
		
		System.out.println(iArr);					// 결과 : [I@7d6f77cc
		System.out.println(Arrays.toString(iArr));	// 결과 : [1, 2, 3, 4, 5] => Arrays.toString 암기.
		
		System.out.println(strArr);
		System.out.println(Arrays.toString(strArr));
	}

}
