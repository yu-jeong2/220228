package Day11;

public class Reply {//���
	
		//�ʵ�
	private String content;
	private String password;
	private String whiter;
	private String date;
	
		//������
			//�� ������
	public Reply() {}
			//Ǯ������
	public Reply(String content, String password, String whiter, String date) {
		this.content = content;
		this.password = password;
		this.whiter = whiter;
		this.date = date;
	}
			//��� ��Ͻ�  ���Ǵ� ������
	public Reply(String content, String password, String whiter) {
		super();
		this.content = content;
		this.password = password;
		this.whiter = whiter;
	}

		//�޼ҵ�-���ͼ���
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
