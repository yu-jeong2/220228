package Day00;

public class �л� {
	
	//�ʵ�
	
	String �̸�;
	int ����;
	int ����;
	int ����;
	�л�[] �л�list = new �л�[100];
	 int ����=����+����+����;
	 double ���=����/3;
	 int ����;
	
	
	//������
	public �л�() {}
	
	public �л�(String name, int ����, int ����, int ����) {
		super();
		this.�̸� = name;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
	}

	

	public �л�(String �̸�, int ����, int ����, int ����, �л�[] �л�list, int ����, double ���, int ����) {
		super();
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.�л�list = �л�list;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
	}

	//�޼ҵ�
	public String get�̸�() {
		return �̸�;
	}
	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}

	public �л�[] get�л�list() {
		return �л�list;
	}

	public void set�л�list(�л�[] �л�list) {
		this.�л�list = �л�list;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public double get���() {
		return ���;
	}

	public void set���(double ���) {
		this.��� = ���;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}


	
	

}
