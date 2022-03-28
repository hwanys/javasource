package iO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileReaderEx2 {

	public static void main(String[] args) {
		//입력 : 파일, 출력 : 화면
		// == InputStream
		// Charset.forName("ms949")를 통해 한글깨지는거 막아줌.
		 try (Reader reader= new FileReader("c:\\temp1\\file1.txt",Charset.forName("ms949")); ){
			 int ch;
			 while((ch=reader.read()) != -1) {
				 System.out.println((char)ch);
			 }
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
