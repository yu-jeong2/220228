package Day02;

import java.util.Scanner;

public class Day02_3 { //c s
	public static void main(String[] args) {//m s
		
		//����1 : �޿����
			//[�Է�����]�⺻��, ����
			//[����]�Ǽ��ɾ�=�⺻��+����-����[�⺻��10%]
			//[�������]�Ǽ��ɾ� ���
		
		
	
		// 1. �Է� ��ü�� �����.
		Scanner scanner = new Scanner(System.in);
		// 2. �Է� ���� ���� ������  �����Ѵ�.[�Է°�ü�� �Է� ���� ������ ���� �����Ͱ� �����]
		System.out.println("�⺻���� �Է��Ͻÿ�");
		int �⺻�� = scanner.nextInt();//�Է°�ü��.next() : int�� ����������
		System.out.println("������ �Է��Ͻÿ�");
		int ���� = scanner.nextInt();
		// 3. ������ ����(���) �Ѵ�.
		int ���� =(int)(�⺻��*0.1);//int*double �Ŀ� int�����κ�ȯ
		int �Ǽ��ɾ� = �⺻�� + ����-����; //100%:1 10%:0.1
		// 4. ����Ѵ�.
		System.out.println("ȸ������ �Ǽ��ɾ� : "+ �Ǽ��ɾ�);
							//      ���ڿ�    + ������(���� �� ������ ȣ��)
							//  +  : 1.���Ῥ���� ��� 2. ���ϱ� ���
		
		

	}

	private static void next() {
		// TODO Auto-generated method stub
		
	} //m e
}//c e
