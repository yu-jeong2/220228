package Day03;

import java.util.Scanner;

public class Day03_7 {//c s
	public static void main(String[] args) {//m s
		
		//p136.����
		
		boolean run =true;//���� ���� ����/true=����false=����
		int balance=0;//���ݾ�[���� �ȿ� �ִ� �ݾ�]����
		Scanner scanner = new Scanner(System.in);//�Է°�ü
		
		while(run) {//while(���ǽ�)  {  }: ���ѷ���
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����.");
			System.out.println("------------------------------");
			System.out.print("����>  ");  int ����=scanner.nextInt();
			if(����==1) {//���࿡ �Է� ���� 1�̸� ����
				System.out.println("���ݾ� : "); int ���ݾ�=scanner.nextInt();
				//�Է� ���� ���ݾ��� ���忡�ֱ�
				balance += ���ݾ�;
			}
			else if(����==2) {//���࿡ �Է� ���� 2�̸� ����
				System.out.println("��ݾ� : "); int ��ݾ�=scanner.nextInt();
				//�Է� ���� ��ݾ��� ���忡����
				//���࿡ ��ݾ��� ���ݾ׺���  �� ũ�� �ܾ׺���, �ƴϸ� ��ݽ���
				if(��ݾ�>balance) {System.out.println("�˸�)�ܾ��� �����մϴ�.");
				//�ƴϸ� ��ݽ���
				}
				else{balance-=��ݾ�;}
			}
			else if(����==3) {//���࿡ �Է� ���� 3�̸� ����
				System.out.println("�ܰ�� : "+balance);
			}
			else if(����==4) {//���࿡ �Է� ���� 4�̸� ����
				
			}else {//�� ��
				System.out.println("�˸�)�� �� ���� ��ȣ �Դϴ�");
				
			}
		}// w e
		
		System.out.println("���α׷� ����");		
		
		
	}//m e
}//c e
