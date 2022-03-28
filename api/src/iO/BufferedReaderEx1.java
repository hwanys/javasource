package iO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		
		
		try (InputStream in = new FileInputStream("c:\\temp1\\file1.txt");		// 입력 스트림(변수 : in)
			BufferedInputStream bis = new BufferedInputStream(in);				// 보조 스트림(in 넣음)
			OutputStream out = new FileOutputStream("c:\\temp1\\output2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(out);){

			//파일 읽기 => 파일 쓰기
			byte b[] = new byte[1024];
			while(bis.read(b)!=-1) {	// 버퍼에서 읽고(입력 스트림 다음 보조스트림에서)
				bos.write(b);			// 버퍼에서 쓴다(출력 스트림 전 보조스트림에서)
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

	}

}
