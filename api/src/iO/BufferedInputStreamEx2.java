package iO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:\\temp1\\hold.mp4");	// ()로 하면 따로 입력 안받아도 됨.
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\temp1\\hold_copy.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data;
			while((data=bis.read())!= -1) {
				bos.write(data);
			}
			
		} catch (Exception e) {	
			e.printStackTrace();	//exception 이 나면 추적해서 찍는거 (오류나면 보기용)
		}

	}

}
