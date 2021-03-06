package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 순차적으로 추가,삭제하는 경우는 ArrayList가 LinkedList 보다 빠름
 * 중간에 데이터를 추가,삭제하는 경우는 LinkedList가 ArrayList 보다 빠름
 * 
 */

public class ArrayListLinkedListEx {

	public static void main(String[] args) {
		
		//많은 데이터를 다룰때 공간을 얼마나 열어놓냐에 따라 효율도 달라질 수 있다.
		ArrayList<String> al = new ArrayList<String>(2000000);	
		LinkedList<String> ll = new LinkedList<String>();
		
		System.out.println("--- 순차적 추가 ---");
		System.out.println("ArrayList : "+add1(al));
		System.out.println("LinkedList : "+add1(ll));
		
		System.out.println("--- 중간에 추가 ---");
		System.out.println("ArrayList : "+add2(al));
		System.out.println("LinkedList : "+add2(ll));
		
		System.out.println("--- 중간에서 삭제 ---");
		System.out.println("ArrayList : "+remove2(al));
		System.out.println("LinkedList : "+remove2(ll));
		
		System.out.println("--- 순차적으로 삭제 ---");
		System.out.println("ArrayList : "+remove1(al));
		System.out.println("LinkedList : "+remove1(ll));

	}
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add(i+"");	//순차적 추가
		}
		long end = System.currentTimeMillis();
		return end-start;
		}
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);	//중간에 추가
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}
