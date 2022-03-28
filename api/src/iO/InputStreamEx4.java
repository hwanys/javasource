package iO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// byte배열 사용으로 한번에 출력 가능.
// 한꺼번에 담아서 읽어오기때문에 한글도 출력가능.

public class InputStreamEx4 {

	public static void main(String[] args) {
		// 입력 : 키보드, 출력 : 화면
//		InputStream in = System.in;
//		OutputStream out = System.out;
//		
//		byte arr[]=new byte[100];			//byte형 arr배열
//		try {
//			 while(in.read(arr)!=-1) { 		//추가
//			out.write(arr);
//			 }
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		//-----------------------------------------------
		//위의 finally 사용 하는거에 비해 간편하게 작성 가능.	=> 22.03.17 11:49 강의 riview하기.
		
		try(InputStream in = System.in;
			OutputStream out = System.out) {
			int input = in.read();
			out.write(input);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
