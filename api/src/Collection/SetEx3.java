package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		//객체(Member)부분에서 오버라딩 해줘야함.->강의 다시보기 22.03.16 13시
		
		set.add(new Member("hong", "홍길동", "hong123"));
		set.add(new Member("kang", "강길동", "kang123"));
		set.add(new Member("park", "박길동", "park123"));
		set.add(new Member("kim", "김길동", "kim123"));
		set.add(new Member("kim", "김길동", "kim123"));	//중복값 입력
		
		System.out.println(set);
	}

}
