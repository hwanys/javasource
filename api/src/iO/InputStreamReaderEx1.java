package iO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStreamReader : 문자 변환 보조 스트림
 * 바이트 스트림 => 문자(char) 기반
 */
public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		
		// InputStream(바이트기반)Reader(문자기반) : 바이트기반으로 읽으면 문자형태로 출력해주겠다.
		try(InputStream in = new FileInputStream("c:\\temp1\\file1.txt");){
			InputStreamReader reader = new InputStreamReader(in,"ms949");	//ms949하면 한글깨지는거 방지해줌.
			
			char cbuf[] = new char[100];
			while(reader.read(cbuf) != -1) {	//in.read()로 부르면 byte형태로 불러오게됨, char형태로 불러오려면 InputStreamReader로 작성
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
