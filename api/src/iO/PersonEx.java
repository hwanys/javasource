package iO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* 객체 전송
 * 직렬화(Serializable)
 * 
 */
// java.io.NotSerializableException

public class PersonEx {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		try (FileOutputStream fos = new FileOutputStream("c:\\temp1\\serial.dat");
			 ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//역직렬화
		try (FileInputStream fis = new FileInputStream("c:\\temp1\\serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			for(int i=0;i<2;i++) {
				Person p = (Person)ois.readObject();
				System.out.println(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
