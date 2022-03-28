package classtest;

import java.util.Arrays;

public class MethodTestEx {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		// MethodTest1에서의 메소드들 활용하여 사용하기.
		MethodTest1 obj = new MethodTest1();

		System.out.println(obj.sum(5, 6));
		
		char charValue = obj.method1();	// 'c' a(97)
		
		int value = charValue+1;	// 'c' + 1 => 100
		System.out.println(value);
		
		float result1 = obj.divide1(5.0f, 2.0f);	// float형이므로 인자의 숫자끝에 f 넣어주기
		System.out.println(result1);
		
		//array
		int arr[] = {4,5,6,7};
		int arr2[] = obj.array(arr);
		System.out.println(Arrays.toString(arr2));	// Arrays.toString을 안써주면 arr2의 메모리의주소값이 나옴. -> [I@200a570f
		
		
	}

}
