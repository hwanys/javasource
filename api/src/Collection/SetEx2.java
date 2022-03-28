package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		//로또 번호
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;set.size() < 6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);				//로또 번호가 중복되면 안되므로 set으로 사용하면 알맞음.
		}
		
		System.out.println(set);
		
		//정렬 한 후 출력
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
