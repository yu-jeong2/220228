package Day11;

import java.awt.Taskbar.State;

public class Day11_3 {
	
	//p.422 ���� ������
		//���� : ��� �޼ҵ忡�� try{ } catch{ } ���� �ڵ� �����ԡ��Ѱ����� ���� �̵�
	public static void main(String[] args) {
		try {
			findClass();
		}catch(Exception e) { }
		
		try {
			wtithdrar(30000);
		}catch(Exception e){System.out.println(e);}
		
	}//m e
		public static void findClass()throws Exception {
			
//		1.���ܴ�����[�޼ҵ��() throws���� Ŭ������]
//			try {//���ܰ� �߻��� �� ���� �ڵ�(���࿹��) Ȥ�� �Ϲݿ���[������]
			Class clazz=Class.forName("java.lang.String2");//Ŭ���� ã�� �޼ҵ�
//			}catch(Exception e) {//���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
//				//Exception : ����Ŭ���� �� ����Ŭ���� �̹Ƿ� ��� ���ܸ� ���� ����
//				System.out.println(e);
//			}
		}
		
		
		//p.444~445
		public static void wtithdrar(int money) throws Exception{
			if(20000<money) {  
				throw new Exception("�ܰ����");
			}
		}
	
}//c e
