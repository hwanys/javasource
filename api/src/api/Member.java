package api;

public class Member {
	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// id가 같으면 true
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			if(id.equals(member.id)) {	//String의 equals -> 값을 비교하는. (오버라이딩 한 equals와는 다름)
				return true;
			}
		}
		
		
		return false;
	}
	
	@Override
	public String toString() {		
		
		return "id = "+id;		//return은 String 형태로만 해주면 됨.
	}
	
}
