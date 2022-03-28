package iO;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx1 {

	public static void main(String[] args) {
		try (Writer writer = new FileWriter("c:\\\\temp1\\\\file3.txt",true)){
			//위에서 FileWriter("경로",true) 경로뒤에 true 입력시 기존에 작성한거 남겨두고 추가 입력.
			// 엔터 : 타자기 => 한줄 올리고, 커서를 맨 앞으로 이동 ("\r\n"으로 해야 엔터가능)
			writer.write("FileWriter는 한글로 된\r\n");
			writer.write("문자열을 출력할 수 있다.\r\n");
			writer.write("Writer 클래스는 문자 단위의\r\n");
			writer.write("출력만 가능합니다.\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
