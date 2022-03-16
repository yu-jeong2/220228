package Day11;

public class Reply {//댓글
	
		//필드
	private String content;
	private String password;
	private String whiter;
	private String date;
	
		//생성자
			//빈 생성자
	public Reply() {}
			//풀생성자
	public Reply(String content, String password, String whiter, String date) {
		this.content = content;
		this.password = password;
		this.whiter = whiter;
		this.date = date;
	}
			//댓글 등록시  사용되는 생성자
	public Reply(String content, String password, String whiter) {
		super();
		this.content = content;
		this.password = password;
		this.whiter = whiter;
	}

		//메소드-백터섹터
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWhiter() {
		return whiter;
	}

	public void setWhiter(String whiter) {
		this.whiter = whiter;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
		

}
