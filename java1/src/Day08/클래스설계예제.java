package Day08;

public class 클래스설계예제 {
			//회원클래스
	
	//1. 필드[private 권장]
	private String id;
	private String pw;
	private String name;
	private String point;
	//2.생성자
		//1.필드0개 빈 생성자[메소드호출용 사용예정]
	public 클래스설계예제() {}
		//2.필드3개 생성자[회원가입시 사용예정]
		//3.필드4개 풀 생성자[모든회원정보 호출시 사용예정]
	public String getId() {
		return id;
	}
	public 클래스설계예제(String id, String pw, String name, String point) {
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.point = point;
		}
	//3.메소드
		//private필드 사용시 get or set메소드

	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	

	
	
	
	

}
