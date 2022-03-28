package classtest;

public class SubscriberInfoEx2 {

	public static void main(String[] args) {
		
		//기본타입(byte, short, char, boolean...)의 초기화는 null 줄 수 없음.
//		int a = null;
//		String str = null;	//null : 값을 할당하지 않았음
//		TV tv = null;
		
		
		
		
		// SubscriberInfo 객체를 담을 배열 생성
		SubscriberInfo info[] = new SubscriberInfo[3];
		//생성된 배열에 SubscriberInfo 객체 생성 후 담기
		info[0] = new SubscriberInfo("홈길동", "hong1234", "hong1234*");
		info[1] = new SubscriberInfo("성춘향", "sung1234", "sung1234*", "010-1234-1234", "경기도 남양주시");
		info[2] = new SubscriberInfo("곽승환", "ksh7353", "ksh1234*", "010-6343-4321", null);
		
		//생성된 정보 확인
		print(info);
	}
	
	static void print(SubscriberInfo info[]) {	// SubscriberInfo : 참조 매개변수 , info[] : 주소를 가르키고있음.
		//for(타입 변수명:배열명) => 향상된 for문.
		for(SubscriberInfo s: info) {
			System.out.println("성명 : "+s.name);
			System.out.println("아이디 : "+s.id);
			System.out.println("비밀번호 : "+s.password);
			System.out.println("전화번호 : "+s.phone);
			System.out.println("주소 : "+s.address);
			System.out.println();
		}
		
		for(int i=0;i<info.length;i++) {
			System.out.println("성명 : "+info[i].name);
			System.out.println("아이디 : "+info[i].id);
			System.out.println("비밀번호 : "+info[i].password);
			System.out.println("전화번호 : "+info[i].phone);
			System.out.println("주소 : "+info[i].address);
			System.out.println();
		}
			
	}
}
