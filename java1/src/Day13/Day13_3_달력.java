package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_�޷� {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("���� : ");  int year=scanner.nextInt();
		System.out.println("�� : "); int month=scanner.nextInt();
		
		�޷�( year , month );
	}	
			//�޷� �޼ҵ� �����
	
			public static void �޷�(int year, int month) {
				while(true) {//�������� : 4��
					//1.Ķ���� Ŭ���� �� ���� ��¥/�ð� ��ü ȣ��
					Calendar calendar=Calendar.getInstance();//2022�� 3�� 22��
					//2. ��, ��, ��
//					int year =calendar.get(Calendar.YEAR);
//					int month =calendar.get(Calendar.MONTH)+1;
//					int day=calendar.get(Calendar.DAY_OF_MONTH);
					//�ش� ���� 1���� ���� ã��
					//����� ���� Ķ���� ����
					calendar.set( year , month-1 , 1 );//��) 2022�� 3�� 1��
					//3�� 1���� ����
					int sweek = calendar.get( Calendar.DAY_OF_WEEK );
					//3�� ������ �� ��
					int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH );
					
					System.out.println("\t     -----"+year+"�� " +month+"�� "+"-----");
					System.out.println("��\t��\tȭ\t��\t��\t��\t��");
					
					//���� �� 1���� ��ġ �տ�  ����ä���
					for(int i=1;i<sweek;i++) {//1�� ����(sweek)������ �迭��ŭ ����ֱ�
							//3�� 1�� = ȭ=3
						System.out.print("\t");
					}
					//1�Ϻ��� ������������ ���
					for( int i = 1 ; i<=eday ; i++ ) {
						 // i = �ϼ� ���
						System.out.print(i+"\t");
						// ����ϸ��� �ٹٲ�ó�� [ �����=7 ] ������ 7�������
						if( sweek % 7 == 0 ) System.out.println();
						 // �Ϸ羿 ���� ���� 
						sweek++;
					}
					//��ư[1.��(������)  2.��(������)  3.�ٽð˻�]
				try {
						System.out.print("\n\n1.��(������)  2.��(������)  3.�ٽð˻�  4.����");
						Scanner scanner= new Scanner(System.in); int ch=scanner.nextInt();
						if (ch==1) {month=month-1;
							if(month==0) {month=12; year-=1;}
							}
						else if (ch==2){
							month+=1;
							//���࿡ 13���̵Ǹ� �������� 1 �����ϰ�, ���� �ٽ� 1�μ���
							if(month==13) {month=1; year+=1;}
						}
						else if (ch==3){
							System.out.println("���� : ");   year=scanner.nextInt();
							System.out.println("�� : ");  month=scanner.nextInt();}
						else if (ch==4) {System.out.println("�޷� ���α׷� ����");break;}
						else {System.out.println("�� �� ���� ��ȣ�Դϴ�.");}
				}catch(Exception e){//���࿡ try { }���� ���ܰ� �߻��ϸ� �ش� �ڵ尡 ����
					System.err.println("�������� �Է��� ���ּ���[�����ڿ��� ����]");}
				}//while
			}//�޷� �޼ҵ� end
}
