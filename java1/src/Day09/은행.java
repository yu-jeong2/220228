package Day09;

public class 은행 {
	
	//필드
	private String 계좌번호;	//계좌번호[중복x=식별용]
	private String 비밀번호;	//비밀번호
	private String 예금주;	//예금주
	private int 예금액;	//예금액
	
	//생성자
		//1.빈
	public 은행() {
		// TODO Auto-generated constructor stub
	}
		//2.모든
	public 은행(String 계좌번호, String 비밀번호, String 예금주, int 예금액) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.예금주 = 예금주;
		this.예금액 = 예금액;
	}

	//메소드 get, set 메소드[필드가 private 인 경우
	public String get계좌번호() {
		return 계좌번호;
	}
	public void set계좌번호(String 계좌번호) {
		this.계좌번호 = 계좌번호;
	}
	public String get비밀번호() {
		return 비밀번호;
	}
	public void set비밀번호(String 비밀번호) {
		this.비밀번호 = 비밀번호;
	}
	public String get예금주() {
		return 예금주;
	}
	public void set예금주(String 예금주) {
		this.예금주 = 예금주;
	}
	public int get예금액() {
		return 예금액;
	}
	public void set예금액(int 예금액) {
		this.예금액 = 예금액;
	}
	
	
	
}
