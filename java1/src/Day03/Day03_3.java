package Day03;

import java.util.Scanner;

public class Day03_3 {// c s
	public static void main(String[] args) {//m s
		Scanner scanner = new Scanner(System.in);
		
		//����6
		//������ �Է¹޾�  ������ 90�� �̻��̸�  �հ�, �ƴϸ� ���հ� ���
		
		System.out.println("������ �Է��ϼ���."); int ����=scanner.nextInt();
		if (����>=90)System.out.println("�հ�");
		else System.out.println("���հ�");
		
		//����7 ������ �Է¹޾� ������ 90�� �̻��̸� A���
		//				������ 80�� �̻��̸� B���
		//				������ 70�� �̻��̸� C���
		//				�׿� �����
		
		System.out.println("������ �Է��ϼ���."); int ����2=scanner.nextInt();
		if(����2<=90)System.out.println("A���");
		else if (����2<=80) System.out.println("B���");
		else if (����2<=70)System.out.println("C���");
		else System.out.println("�����");
		
		
		//����8 �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
		// [ ���� ] : ȸ�����̵� admin �̰� 
		//           ��й�ȣ�� 1234 �� ��쿡�� 
		//          �α��� ���� �ƴϸ� �α��� ���� ���
		
		System.out.println("���̵� �Է��ϼ���"); String ���̵�=scanner.next();
		System.out.println("��й�ȣ �Է��ϼ���"); int ��й�ȣ=scanner.nextInt();
		boolean �α��μ���=false;
			//boolean  1��Ʈ true Ȥ�� false ����
		if (���̵�.equals("admin"))
			if (��й�ȣ==1234) {System.out.println("�α��� ����");
			�α��μ���=true;}
			else //�Է��� ��й�ȣ�� Ʋ������{
				{System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}else { //�Է��� ���̵� Ʋ������{
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
				}if (�α��μ���==false) System.out.println("�α��� ����");
			//�ڷ��� ����ϴ� ������ �����ڻ�� ����.
			//Ŭ���� ����ϴ� ��ü�� �����ڻ�� �Ұ�-> �޼ҵ�
				//���ڿ� �񱳽�  .equals
				//���ڿ�1.equals("���ڿ�2")
		
//		* ����9
//		[ �Է� ] : ����,����,���� �Է¹ޱ�
//		[ ���� ]
//			����� 90�� �̻��̸鼭 
//				�������� 100�� �̸� '������' ���
//				�������� 100�� �̸� '������' ���
//				�������� 100�� �̸� '���п��' ���
//			����� 80�� �̻��̸鼭 
//				�������� 90�� �̸� '�������' ���
//				�������� 90�� �̸� '��������' ���
//				�������� 90�� �̸� '�������' ���
//			�׿� ����� 
		
		System.out.println("���� ���� �Է�"); int ����=scanner.nextInt();
		System.out.println("���� ���� �Է�"); int ����=scanner.nextInt();
		System.out.println("���� ���� �Է�"); int ����=scanner.nextInt();
		int ���=(����+����+����)/3;
		
		if(���>=90) {
			if(����==100)System.out.println("������");
			if(����==100)System.out.println("���п��");
			if(����==100)System.out.println("������");
		}else if(���>=80) {
			if(����>=90)System.out.println("�������");
			if(����>=90)System.out.println("�������");
			if(����>=90)System.out.println("�������");
		}else System.out.println("�����");
			
		
	}//m e
}//c e
