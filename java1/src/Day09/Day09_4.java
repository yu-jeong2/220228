package Day09;

public class Day09_4 {
	public static void main(String[] args) {
		
	
	//p294-295
	
	//@Oberride : ������
	//������ �μ��� �޼ҵ�� �Ұ���
	//���� : �����Ѹ޼ҵ带 ������[����]
	
	int r=10;//����Ŭ�����ΰ�ü����
	Cal cal=new Cal();
	System.out.println("�� ���� : "+cal.areaCircal(r));
	System.out.println();
	
	//����Ŭ������ ��ü ����
	Com com=new Com();
	//����Ŭ������ ���� ��ü�� �޼ҵ�ȣ��
	System.out.println("������ : "+com.areaCircal(r));
	//����Ŭ������ ����Ŭ���� �� �޼ҵ�� �ٸ���
	
	}
}
