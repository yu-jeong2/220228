package A_tast;

import java.util.ArrayList;
import java.util.Scanner;

public class ���迹�� {
	/*
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		Scanner  scanner= new Scanner(System.in);
		static �л�[] �л��迭 = new �л�[100];//�迭�� ������ �ڷ�� ���� ����....?????????? 
		while(true) {//
		try {
			System.out.println("----------------------------------------");//
			System.out.println("               ��    ��    ǥ");//
			System.out.println("----------------------------------------");//
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
			
			for(int i = 0; i<�л��迭.length; i++ ){
				if( �л��迭 != null ) {
					System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,�л��迭[i].�̸�,�л��迭[i].����,�л��迭[i].����,�л��迭[i].����,�л��迭[i].����,�л��迭[i].���,�л��迭[i].����);
				}i++;break;
			}
			System.out.println("1.�л�������� 2.�л���������"); int ch=scanner.nextInt();//	
			if(ch==1) {//
				System.out.println("��ȣ ���� : ");int ��ȣ=scanner.nextInt();
				System.out.println("�л� �̸� : ");String �̸�=scanner.next();
				System.out.println("���� ���� : ");int ����=scanner.nextInt();
				System.out.println("���� ���� : ");int ����=scanner.nextInt();
				System.out.println("���� ���� : ");int ����=scanner.nextInt();
				�л� �л�=new �л�(��ȣ,�̸�,����,����,����);
				 int ����=����+����+����;
				 double ���=����/3;
				 int j = 0 ;
				for(�л� temp:�л��迭) {
					if( �л��迭 != null ) { 
						�л��迭[j] = �л�; 
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
