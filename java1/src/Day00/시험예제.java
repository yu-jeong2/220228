package Day00;

import java.util.ArrayList;
import java.util.Scanner;

public class ���迹�� {
	/*
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		Scanner  scanner= new Scanner(System.in);
		�л�[] �л�list = new �л�[100];
		while(true) {//
		try {
			System.out.println("----------------------------------------");//
			System.out.println("               ��    ��    ǥ");//
			System.out.println("----------------------------------------");//
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
			
			int i = 0;
			for( �л� �л�  : �л�list ) {
				if( �л� != null ) {
					System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,�л�.get����(),�л�.get����(),�л�.get����(),�л�.get����(),�л�.get���(),�л�.get����());
				}i++;
			}
			System.out.println("1.�л�������� 2.�л���������"); int ch=scanner.nextInt();//	
			if(ch==1) {//
				System.out.println("�л� �̸� : ");String �̸�=scanner.next();
				System.out.println("���� ���� : ");int ����=scanner.nextInt();
				System.out.println("���� ���� : ");int ����=scanner.nextInt();
				System.out.println("���� ���� : ");int ����=scanner.nextInt();
				 int ����=����+����+����;
				 double ���=����/3;
				�л� member = new �л�();
				member.�̸�=�̸�;
				member.����=����;
				member.����=����;
				member.����=����;

				int j = 0;
				for( �л� temp  : �л�list ) { 
					if( temp != null ) { 
						�л�list[j] = member; 
						break;
						}//if end
					j++;
				}//for end
				System.out.println("���� : "+����);
				System.out.println("��� : "+���);

				
			}//if 1 end
			else if(ch==2) {}//else 2  ����//
			else {System.out.println("�˸�))�� �� ���� �����Դϴ�.");}//
			}catch(Exception e) {System.out.println("�˸�))�� �� ���� �����Դϴ�.");}//
			
			
			
		}//while end
	}//m e
}
