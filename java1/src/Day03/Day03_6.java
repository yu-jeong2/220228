package Day03;

import java.util.Scanner;

public class Day03_6 {//c s
	public static void main(String[] args) {//m s
		Scanner scanner =new  Scanner(System.in);
		
		//������1 : �Է¹��� �� ��ŭ * ���
			System.out.println("���� 1)�� ���� : "); int s1=scanner.nextInt();
			for(int i=1; i<=s1;i++) {
				//i�� 1���� �Է¹����� ���� i�� 1������
				System.out.print("*");
			}
	System.out.println("\n---------------------------\n");	
		//������2 : �Է¹��� �� ��ŭ *���[�� 5������ �ٹٲ�ó��]
			System.out.println("���� 2)�� ���� : "); int s2=scanner.nextInt();
			for(int i=1; i<=s2;i++) {
				System.out.print("*");
			
			if(i%5 ==0)System.out.println();//�ٹٲ�ó��
			}
	System.out.println("\n---------------------------\n");
		//������3 : �Է¹��� �� ��ŭ ���
			System.out.println("����3 )�� �� : "); int s3=scanner.nextInt();
			for(int i=1;i<=s3;i++) {
				//i�� 1����  �Է¹��� �� �� ���� 1������
				
				//1. �����
				for(int s=1;s<=i;s++) {
					System.out.print("*");
				}
				//2. �ٹٲ�ó��
				System.out.println();
			}
				//������
					//����ڰ� 3�� �Է����� ��
					//i=1 i<=3 [true]
						//s=1���� 1<=1 [true]-> * -> s++
						//s=2�϶� 2<=1 [false]->�ݺ��� ����
					//�ٹٲ�
					//i=2 i<3 [true]
						//s=1  s<=1 [true] -> *-> s++
						//s=2  s<=2 [true] -> *-> s++
						//s=3  s<=3 [false] -> �ݺ��� ����
					//�ٹٲ�
					//i=3 i<=3 [true]
						//s=1 s<=3 [true]-> * -> s++
						//s=2 s<=3 [true]-> * -> s++
						//s=3 s<=3 [true]-> * -> s++
						//s=4 s<=3 [false]-> �ݺ��� ����
					//�ٹٲ�
					//i=4 i<=3[false] -> �ݺ��� ����
	System.out.println("\n---------------------------\n");
	
			//������ 4 : �Է¹��� �� ��ŭ ���
			System.out.println("����4 )�� �� : "); int s4=scanner.nextInt();
			for(int i=1;i<=s4;i++) {
				for(int s=1;s<=s4-i+1;s++) {
					System.out.print("*");
				}
				System.out.println();
				}
	
	System.out.println("\n---------------------------\n");				
			
			//������ 5 :�Է¹���  �� ��ŭ ���
			System.out.println("����5)�� �� : "); int s5=scanner.nextInt();
			for(int i=1;i<=s5;i++) {
				//1.�������
				for(int b=1;b<=s5-i;b++) {System.out.print(" ");//���� �Է¹��� ��-�����ټ� ���� 1������
				}//2. �����
					for(int s=1;s<=i;s++) {System.out.print("*");//�Է¹��������� 1������
					
				}//�ٹٲ�
				System.out.println("");
			}
			
			//������6 : �Է¹��� �� ��ŭ���
			System.out.println("����6) �� �� : "); int s6=scanner.nextInt();
			for(int i=1;i<=s6;i++) {//��
				for(int b=1;b<i;b++) {System.out.print(" ");//���� : �ټ�-1
				}for(int s=1;s<=s6-i+1;s++) {System.out.print("*");//�� : �Է¹��� ��-���� �ټ�����
				}
				System.out.println("");
			}
		
			//������7
			System.out.println("����7) �� �� : "); int s7=scanner.nextInt();
			for( int i = 1 ; i<=s7 ; i++ ) {
				for( int b= 1 ; b<=s7-i ; b++)  {System.out.print(" ");//����
				}for( int s= 1; s<=i*2-1; s++ )  {System.out.print("*");//�� [�� i ������ ���ڷ� ��µ�]
				}
				System.out.println("");//�ٹٲ�
			}
			
			//������8 : �Է¹��� �ٸ�ŭ ��� 
			System.out.println("����8) �� �� : "); int s8=scanner.nextInt();
			for(int i=1;i<=s8;i++) {
				for(int b=1;b<=s8-i;b++) {System.out.print(" ");
				}for(int s=1;s<=i*2-1;s++) {System.out.print(i);
				}
			System.out.println("");
			}
				
			//������9 : �Է¹��� �ٸ�ŭ ���
			
			System.out.println("����9) �� �� : "); int s9=scanner.nextInt();
			for(int i=1;i<=S9;i++) {
				for(int b=1;b=i*2-1;b++) {System.out.print(" ");
				}for(int s=1;s<=i;s++) {System.out.print("*");
				}
			System.out.println(" ");
			}
				
			
			
}//m e

}//c e
