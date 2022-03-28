package api;

public class StringCount {

	public static void main(String[] args) {
		String str1 = "aabbccAABBCCaa";
		
		char[] arr1 = new char[str1.length()];
		for(int i=0;i<str1.length();i++) {
			arr1[i] = str1.charAt(i);
		}
		
		int cnt = count(str1, "aa", 0);
		System.out.println("원본 문자열에 aa 패턴이 "+cnt+" 개 나왔습니다.");
	}
	public static int count(String src,String key,int pos) {
		//key에 해당하는 패턴이 몇번 나왔는가?
		int count = 0;
		int index = 0;
		
		if(key == null || key.length() == 0) {
			return -1;
		}
		
		//아이디어 미리 보기.
//		// src = "aabbccAABBCCaa"
//		src.indexOf(key,0) => 0	//인덱스 0 찾음 => count++
//		src.indexOf(key,2) => 0	//첫번째 "aa" 다음의 인덱스(2)부터 찾기
//		src.indexOf(key,4) => 0	
//		src.indexOf(key,6) => 0	 //이런식으로 쭉~~ 반복
		
		// 실행순서
		// 1. src.indexOf(key, pos)
		// 2. index에 넣기
		// 3. index값이 -1이 아니라면.
		while((index = src.indexOf(key, pos))!=-1) {
			count++;
			pos = index+key.length();
		}
		return count;
		
	}
}
