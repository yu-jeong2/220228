package Day04;

import java.util.Scanner;

public class Day04_2 {//c s
	public static void main(String[] args) {//m s
		
		//Day01: �����
		//Day02: ����[����]  ����[���]
		//Day03: if[���] for[�ݺ���]
		
		//���Ǳ� ���α׷�
			//1. �޴���[1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
			//		1.�޴��ǿ��� ��ǰ����->��ٱ��Ͽ� �ֱ�
			//		2.����������ϸ� �˸�(�������)
			//2. �ʱ� ���[��ǰ��10����]
			//3. ������ �ݾ� �Է¹޾� ������ ��ŭ ���� �� �ܵ� ���
			//		1. ������ �ݾ�>������. ������ [�ݾ׺���]
		
		//���뺯��[��� ��ȣ ������ ����ϴ� ������]
		Scanner scanner=new Scanner(System.in);//1.�Է°�ü
		
		int �ݶ�=10; int ȯŸ=10;	int ���̴�=10;// 2.�������
		int �ݶ󱸸ż�=0; int ȯŸ���ż�=0; int ���̴ٱ��ż�=0; //3. ��ٱ���
		
		//���α׷��� ����[���ѷ���]
		while(true){
		System.out.println("�޴��� �����ÿ�.");
		System.out.println("1. �ݶ�(300)");
		System.out.println("2. ȯŸ(200)");
		System.out.println("3. ���̴�(100)");
		System.out.println("4. ����");
		System.out.println("-----����-----");
		int ����=scanner.nextInt();
		if (����==1) {
			if(�ݶ�==0) {//�ݶ� �����0�̸� ���� �Ұ�
				System.err.println("�˸�) ����� �����ϴ�.-��� �غ��� ");
				System.out.println("--------------");}
				
			else {//�ݶ� ���Ű� ������
				System.out.println("[[�ݶ� ��ҽ��ϴ�]]");
				System.out.println("--------------");
				�ݶ󱸸ż�++; //��ٱ��Ͽ��ݶ� ���
				�ݶ�--;//�ݶ���� ����
			}	
		}//�ݶ󱸸�end
		
		else if(����==2) {
			if(ȯŸ==0) {
				System.err.println("�˸�) �����  �����ϴ�.-��� �غ��� ");
				System.out.println("--------------");}
			else {System.out.println("[[ȯŸ ��ҽ��ϴ�]]");
				System.out.println("--------------");
			ȯŸ���ż�++;ȯŸ--;
			}
		}//ȯŸ����end
		else if(����==3) {
		if(���̴�==0) {
			System.err.println("�˸�) �����  �����ϴ�.-��� �غ��� ");
			System.out.println("--------------");}
		else {System.out.println("[[���̴� ��ҽ��ϴ�]]");
			System.out.println("--------------");
		���̴ٱ��ż�++;���̴�--;
			}
						}//���̴ٱ���end
		else if(����==4) {System.out.println("----���� ��ǰ���----");
		System.out.println("��ǰ��\t����\t�ݾ�");
		if(�ݶ󱸸ż� !=0)System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+(�ݶ󱸸ż�*300));
		if(ȯŸ���ż�!=0) System.out.println("ȯŸ\t"+ȯŸ���ż�+"\t"+(ȯŸ���ż�*200));
		if(���̴ٱ��ż�!=0) System.out.println("���̴�\t"+���̴ٱ��ż�+"\t"+(���̴ٱ��ż�*100));
		int �Ѱ�����=(�ݶ󱸸ż�*300)+(���̴ٱ��ż�*100)+(ȯŸ���ż�*200);
		System.out.println("��ǰ�� ������ : "+�Ѱ�����+"�Դϴ�.");
		System.out.println("--------------");
		System.out.println("1.���� 2.���"); int ����2=scanner.nextInt();
		
		if(����2==1) {//����
			//1. �ݾ��� �Է¹޴´�.
			//2. �ݾ��� �����׺��� ������ ���� �Ұ�->�ݾ� ���Է�
			//�ݾ��� ������ ����  ������ ���� ���� -> ��ٱ����ʱ�ȭ
			while(true) {//���ѷ���[�������� : �����׺��� �ݾ���  ũ��]
			System.out.println("�ݾ��� �����Ͻÿ�.");int ������=scanner.nextInt();//������
			if (������<�Ѱ�����) {//�����Ұ�->���Է�
				System.err.println("�ݾ��� �����մϴ�. �ٽ� �ݾ� ���� ���ּ���");
			}
			else {//�ݾ���  �� ũ��
				System.err.println("�˸�)) ���� �Ϸ�. �ֹ���ȣ : 0000��");
				ȯŸ���ż�=0;���̴ٱ��ż�=0;�ݶ󱸸ż�=0;
				System.err.println("�˸�)) �ܵ� ��� : "+(������-�Ѱ�����)+"�� �Դϴ�.");
				break;//while Ż��
			}
			}
		}
		else if(����2==2) {//���
			System.out.println("�˸� : ����  ��� ��� �����");
			for(int i=1;i<=�ݶ󱸸ż�;i++) {//���ż��� ����� �ű��
				�ݶ�++;�ݶ󱸸ż�=0;
				���̴�=+���̴ٱ��ż�;���̴ٱ��ż�=0;//���ż��ʱ�ȭ
				ȯŸ+=ȯŸ���ż�;ȯŸ���ż�=0;
			}
		}//���
			
		else {System.err.println("�˸�)�� �� ���� �ൿ�Դϴ�.");}//�׿�
		
		}//���� end
		
		else {System.err.println("�˸�)�� �� ���� �ൿ�Դϴ�.");//sys.err(�����۾������)
		
		
		}
		}//while Ż��2
			
		
		
		
		
		
		
		
		
		
		
	}//m e

}//c e