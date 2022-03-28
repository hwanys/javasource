package iO;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		// 입력 : 키보드
		InputStream in = System.in;	// Scanner sc = new Scanner(System.in);
		int input = 0;
		try {
			while((input=in.read()) != -1) {	// read() : 한 바이트만 읽어옴
				System.out.println((char)input);	// while로 한단어씩 불러옴.
			}
			System.out.println((char)input);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	// 오류가 나던 안나던 무조건 실행.
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
