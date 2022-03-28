package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("키위");
		list.add("포드");
		
		//list => 배열
		Object[] fruits= list.toArray();
		for(Object obj:fruits) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		//배열 => List
		String f[] = {"사과","포도","멜론","수박","참외","자두","바나나"};
		List<String> list1 = Arrays.asList(f);
		System.out.println(list1);
		
		//배열의 개념을 끌고와서 list로 변경한 것이기 떄문에 크기 늘어나면 에러발생.
//		list1.add("딸기");	//UnsupportedOperationException
		
		// 배열로부터 생성한 리스트의 변화가 필요할 때
		List<String> list2=new ArrayList<String>(Arrays.asList(f));
		list2.add("딸기");
		System.out.println(list2);
		
	}

}
