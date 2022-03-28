package exam;

public class IPTV extends ColorTV {
	String ip;

	public IPTV(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}
	void printProperty() {
		System.out.println("나의 IPTV는 "+getIp()+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}

	public String getIp() {
		return ip;
	}
	
	

}
