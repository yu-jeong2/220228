package Day08;

public class Ŭ�������迹�� {
			//ȸ��Ŭ����
	
	//1. �ʵ�[private ����]
	private String id;
	private String pw;
	private String name;
	private String point;
	//2.������
		//1.�ʵ�0�� �� ������[�޼ҵ�ȣ��� ��뿹��]
	public Ŭ�������迹��() {}
		//2.�ʵ�3�� ������[ȸ�����Խ� ��뿹��]
		//3.�ʵ�4�� Ǯ ������[���ȸ������ ȣ��� ��뿹��]
	public String getId() {
		return id;
	}
	public Ŭ�������迹��(String id, String pw, String name, String point) {
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.point = point;
		}
	//3.�޼ҵ�
		//private�ʵ� ���� get or set�޼ҵ�

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
