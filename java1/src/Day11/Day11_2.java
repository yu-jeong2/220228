package Day11;

public class Day11_2 {
	
	//P.422
		//��ǻ�� �ϵ���� ������ ����[���� �Ұ���]
		//������� �߸��� ���� Ȥ��, ��������  �߸��� �ڵ��� �����濹��
		//���� 1.�Ϲݿ��� 2.���࿹��
			//�Ϲݿ��� : ������[����]���� ���ܰ˻� -�����ڿ��� ���� ����ó��(�ܺ����)
			//���࿹�� : ������[����]�Ŀ� ���ܰ˻� -������ �������� �Ǵ��ؼ� ����ó��
		//����ó��
			//���� : �������߻��ϸ� ���α׷��� ����ȴ�.[�������� ���� ����]
			//���࿡ ������ �߻��ϸ� ��ü�ڵ尡 ����[���α׷� ������� �ʰ�]
	
	public static void main(String[] args) {
		try {
			String date=null;
			System.out.println(date.toString());//���� ������ ���� ����.
			//toString() : object Ŭ���� �޼ҵ� ->��ü�������
			//������ �߻��ϴ� ���� : null�� �޸𸮰� ���� ������[NullPointerException]
			
		}//try end
		catch(NullPointerException ��ü��) {
			System.out.println("���� �߻� : "+��ü��);
		}
		try {//���� ���ܰ� �߻��� �� ���� �ڵ�
		String[] �迭=new String[2]; //String 2���� ������ �� �ִ� �迭 
		�迭[0]="a";�迭[1]="b";�迭[2]="c";//ArrayIndexOutOfBoundsException
		}catch(Exception e) {//���࿡ ���ܰ� �߻��ϸ� ����Ǵ��ڵ�
			System.out.println("���ܹ߻� : "+e);//���ܰ� �߻��ϸ� ������ �ڵ�
		}
		try {
		String date1="100";
		String date2="a100";
		int value1=Integer.parseInt(date1);
		int value2=Integer.parseInt(date2);//NumberFormatException
		//���� �߻� ���� : ���ڿ� �� ���������� ��ȯ�� ���������� ���ڿ� �� �������� ��ȯ�� �Ұ���
		//�������߻��ϸ� catch�̵�[���� �߻� ���� �ڵ����X]
		int result=value1+value2;
		System.out.println(date1+"+"+date2+"="+result);
		}catch(NumberFormatException e) {System.out.println("�����߻� : "+e);}

		String ���ڿ�="���缮";//�ڹ� Ŭ���� �� �ϳ�
		Object ���۰�ü; //�ڹ� Ŭ���� �� �ֻ��� Ŭ����
		���۰�ü=���ڿ�;  //�ڽ�->�θ� [����]
		���ڿ�=(String)���۰�ü;}//�θ�->�ڽ�[�Ұ���]
			//��������ȯ, �����߿� ����ȯ
		//����ó�� �Ǵ�
		//����� ���� �ڵ�[������ ����ó��]
	
	
	
		
		
	}//m e
}//c e
