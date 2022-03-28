package Collection;

import java.util.ArrayList;
import java.util.List;

/* List 인터페이스
 * - 순서가 있음
 * - 데이터가 중복 허용됨
 * - 구변 클래스 : ArrayList, Vector, LinkedList, Stack ...
 * - 배열과 동일(향상된 버전임)
 */

public class ListEx1 {
	public static void main(String[] args) {
		
		//정수 : int => Integer
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		
		System.out.println(list);
		
		list.add(3, 11);	//add(index, 삽입할 숫자) -> 해당 위치에 삽입후 나머지는 뒤로밀린다.
		
		System.out.println(list);
		
		System.out.println();
		
		for(Integer i:list) {
			System.out.println(i);
		}

	}

}
