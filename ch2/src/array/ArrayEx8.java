package array;

import java.util.Arrays;

public class ArrayEx8 {

	public static void main(String[] args) {
		int oldArray[] = {10,20,30};
		int newArray[] = new int[4];
		
		//oldArray 값을 newArray 값으로 복사
		for(int i=0;i<oldArray.length;i++) {			// i<oldArray 사용하도록 하기! -> 또 i<3...
			newArray[i] = oldArray[i];
		}
		System.out.println(Arrays.toString(newArray));
	}

}
