package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try{} : 단독 사용 불가
 * 
 * try 사용가능 3가지.
 * try{}catch(){}
 * try{}finally{}
 * try{}catch(){}finally{}
 */
public class FileInputEx {

	public static void main(String[] args) {
//		FileInputStream fis = null;						//방법1
//		try {
//			fis = new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {	//자원해제
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
		
		
		//자동 리소스 닫기
		try(FileInputStream fis = new FileInputStream("file.txt")) {	//방법2
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
