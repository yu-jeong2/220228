package Day08;

public class Day08_1 {//c s
	public static void main(String[] args) {//m s
		
		//p.238 :static
			//��������
			//�������� ������=���α׷�  ���������� ���Ǵ� �޸�[�ʵ�]
		//* Ŭ���� �� �ʵ� �޼ҵ� ���ٹ��
			//(static ����� �ƴ� ��)1.��ü ����->��ü.���
				//��ü�� ���� �� �� new�����ڷ� ��ü �޸� �Ҵ�
		Cal cal=new Cal();
		System.out.println("��ü�� �̿��� ��� ���� : "+cal.pi);
			//static ����� �� : Ŭ������.���
				//Ŭ���� �ε� �ǰ� �޼ҵ� ������  static ������ ����
		System.out.println("��ü���� ��� ���� : "+Cal.pi);
		
		double result1=10*10*Cal.pi;
		int result2=Cal.plus(10,5);
		int result3=Cal.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
	}//m e
}//c e
