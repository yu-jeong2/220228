package Day09;

public class Day09_3 {
	public static void main(String[] args) {
		//p294-295
			//super(): �θ� Ŭ���� �� �� ������ ȣ��: ������ �ڵ��߰�
		//super(�μ�1,�μ�2) : �θ�  Ŭ���� �� [2�� �μ�]������ȣ��
		//super(�μ�1,�μ�2,�μ�3) : �θ�  Ŭ���� �� [3�� �μ�]������ȣ��
			
		//����Ŭ������ ��ü ����
		Student student=new Student("ȫ�浿", "123456-1234567", 1);
		//����Ŭ������ ���� ��ü�� ����Ŭ���� �� ��� ����
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);
		
	}
	
	
}
