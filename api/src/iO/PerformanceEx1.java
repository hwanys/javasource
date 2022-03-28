package iO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PerformanceEx1 {
	public static void main(String[] args) {
		//FileInputStream 만 사용시
		
		try (FileInputStream fis = new FileInputStream("C:\\temp1\\jenny.png")){
			
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			long end  = System.currentTimeMillis();
			
			System.out.println("FileIntputStream 만 사용시 "+(end-start));
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//FileInputStream + BufferedInputStream 사용시 +byte 배열
		try (FileInputStream fis = new FileInputStream("C:\\temp1\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\temp1\\hold.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			byte data[] = new byte[4096];
			
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {
				bos.write(data);
			}
			long end  = System.currentTimeMillis();
			
			System.out.println("FileIntputStream + BufferedInputStream + byte 배열사용시 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try (FileInputStream fis = new FileInputStream("C:\\temp1\\jenny.png");
				BufferedInputStream bis = new BufferedInputStream(fis)){		//버퍼에서 읽어올때 시간
			
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end  = System.currentTimeMillis();
			
			System.out.println("FileIntputStream + BufferedInputStream 사용시 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream 사용시 +byte 배열
		try (FileInputStream fis = new FileInputStream("C:\\temp1\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis)){		//버퍼에서 읽어올때 시간
			
			byte data[] = new byte[4096];
			
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end  = System.currentTimeMillis();
			
			System.out.println("FileIntputStream + BufferedInputStream + byte 사용시 "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try (FileInputStream fis = new FileInputStream("C:\\temp1\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\temp1\\hold_copy2.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			
			int data;
			long start = System.currentTimeMillis();
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
			long end  = System.currentTimeMillis();
			
			System.out.println("FileIntputStream + BufferedOutStream "+(end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}












