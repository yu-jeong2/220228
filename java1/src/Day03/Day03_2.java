package Day03;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Day03_2 {//c s
	public static void main(String[] args) {//m s
		
		Scanner scanner=new Scanner(System.in);
		
		
		//����  1 : 2���� ������ �Է¹޾Ƽ� �� ū���� ����Ͻÿ�
		
		System.out.println("����1)���� 1 �Է�: "); int ����1=scanner.nextInt();
		System.out.println("����1)���� 2 �Է�: "); int ����2=scanner.nextInt();
		if (����1>����2) System.out.println("�� ū ������"+����1);
		else if (����2>����1)System.out.println("�� ū ������"+����2);
		else System.out.println("�� ���� ����.");
		
		//����2 : 3���� ������ �Է¹޾Ƽ� ���� ū �� ���
		System.out.println("����2 : ���� 1 �Է�"); int ����3=scanner.nextInt();
		System.out.println("����2 : ���� 2 �Է�"); int ����4=scanner.nextInt();
		System.out.println("����2 : ���� 3 �Է�"); int ����5=scanner.nextInt();
		int max = ����3; // ���� ū ���������ϴ� �ӽ� ����, max�� ���� �ӽ�����
		if(max<����4) {max=����4;}
			//���࿡  max���� ����4�� �� ũ�� ��ü
		if(max<����5) {max=����5;}
		System.out.println("���� ū �� : "+max);	
		
		//����3 : 4���� ������ �Է¹޾Ƽ� ���� ū �� �Է�
		System.out.println("����3 : ���� 1 �Է�"); int ����6=scanner.nextInt();
		System.out.println("����3 : ���� 2 �Է�"); int ����7=scanner.nextInt();
		System.out.println("����3 : ���� 3 �Է�"); int ����8=scanner.nextInt();
		System.out.println("����3 : ���� 4 �Է�"); int ����9=scanner.nextInt();
		int max2=����6;
		if(max2<����7) {max2=����7;}
		if(max2<����8) {max2=����8;}
		if(max2<����9) {max2=����9;}
		System.out.println("���� ū ���� : "+max2);
		
		//����4 : 3���� ������ �Է¹޾Ƽ� ��������(��������,<)
		
		System.out.println("����4 : ���� 1 �Է�"); int ����10=scanner.nextInt();
		System.out.println("����4 : ���� 2 �Է�"); int ����11=scanner.nextInt();
		System.out.println("����4 : ���� 3 �Է�"); int ����12=scanner.nextInt();
		if(����10>����11) {
			//��ü[����=�ΰ��Ǻ����� �� ��ü]
			int temp =����10; //�ӽú��� = ����1;
			����10 = ����11;// ����1=����2;
			����11=temp;//����=�ӽú���;
		}	
		if(����10>����12) {int temp=����10;����10=����12;����12=temp;}
		if(����11>����12) {int temp=����11;����11=����12;����12=temp;}
		System.out.printf("�Է��� �� �������� : %d %d %d", ����10,����11,����12);
		System.out.println("�Է��� �� �������� : "+����10+","+����11+","+����12);
		
		
		//����5 : 4���� ������ �Է¹޾Ƽ� ��������
		
		System.out.println("����5 : ���� 1 �Է�"); int ����13=scanner.nextInt();
		System.out.println("����5 : ���� 2 �Է�"); int ����14=scanner.nextInt();
		System.out.println("����5 : ���� 3 �Է�"); int ����15=scanner.nextInt();
		System.out.println("����5 : ���� 4 �Է�"); int ����16=scanner.nextInt();
		if(����13<����14) {int temp=����13;����13= ����14;����14=temp;}	
		if(����13<����15) {int temp=����13;����13=����15;����15=temp;}
		if(����13<����16) {int temp=����13;����13=����16;����16=temp;}
		if(����14<����15) {int temp=����14;����14=����15;����15=temp;}
		if(����14<����16) {int temp=����14;����14=����16;����16=temp;}
		if(����15<����16) {int temp=����15;����15=����16;����16=temp;}
		System.out.printf("�Է��� �� �������� : %d %d %d %d", ����13,����14,����15,����16);
		
	
		
		
		
		
		
		
		
	}//m e
}// c e
