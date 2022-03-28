package api;

public class Reverse {

	public static void main(String[] args) {
		String str = "ABzquartK";
		
		//거꾸로 출력
		for(int i=str.length()-1;i>=0;i--) {	// 방법1. charAt사용 바로 출력
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
		
		char[] chArr = str.toCharArray();		//방법2 . 배열사용 / String -> char형 배열로 한번에 변경
		for(int i=chArr.length-1;i>=0;i--) {
			System.out.print(chArr[i]);
		}
		
		//StringBuilder reverse
		
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());	//바로 reverse시켜서 출력 (+builder에 저장)
		
	}

}





