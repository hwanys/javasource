package iO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceEx2 {
	public static void main(String[] args) {
		//FileInputStream 만 사용시
		
		try (FileInputStream fis = new FileInputStream("C:\\temp1\\pawel.jpg")){
			
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			long end  = System.currentTimeMillis();
			
			System.out.println("FileIntputStream 만 사용시 "+(end-start));
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("C:\\temp1\\pawel.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)){		//버퍼에서 읽어올때 시간
			
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end  = System.currentTimeMillis();
			
			System.out.println("FileIntputStream + BufferedInputStream 사용시 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
