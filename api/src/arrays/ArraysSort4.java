package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort4 {

	public static void main(String[] args) {
		String arr1[] = {"대한민국","우리나라","서울","대구","부산","나주"};
		
		Arrays.sort(arr1);	//오름차순
		Arrays.sort(arr1, Comparator.reverseOrder());	//내림차순
		
		System.out.println(Arrays.toString(arr1));
		
		

	}

}
