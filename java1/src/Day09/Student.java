package Day09;

public class Student extends People{
			//����Ŭ���� extends ����Ŭ����
	//������
	public int studentNo;//�л���ȣ
	
	//�ʵ�
	public Student(String name, String ssn, int studentNo) {
		//�θ�Ŭ���� �� ��� �ʵ��ʱ�ȭ[���ֱ�]
		//1. �ʵ忡����
		//2. �����ڿ� ����
		super(name,ssn);
		this.studentNo=studentNo;
	}
	//�޼ҵ�

}
