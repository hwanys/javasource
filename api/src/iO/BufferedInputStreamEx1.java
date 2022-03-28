package iO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {
		
		
		try (//Reader in = new FileReader("c:\\temp1\\file1.txt");		// 입력 스트림(변수 : in)	//메모장과 버전이달라서 한글이 깨질수도있음
			InputStreamReader in = new InputStreamReader(new FileInputStream("c:\\temp1\\file1.txt"), "ms949"); //이렇게 하면 안꺠짐.
			BufferedReader bis = new BufferedReader(in);				// 보조 스트림(in 넣음)
			Writer out = new FileWriter("c:\\temp1\\output2.txt");
			BufferedWriter bos = new BufferedWriter(out);){
			
			String str = null;
			while((str=bis.readLine())!=null) {
				bos.write(str);
				bos.newLine();    //엔터
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

	}

}
