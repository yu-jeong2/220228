package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {
	//������ȣ ���� ���α׷�
		//����
			//1. ���� 0000~9999[4�ڸ� ����] ���� 10�� �����ؼ� �迭�� ����
			//2. ��� ���� ��ȣ�� �迭�� ����
			//3. ���ڸ� ��ȣ�� Ȧ/¦ ����
			//4. ���� ���ڸ� ��ȣ�� Ȧ���� ����
			//5. ���� ���ڸ� ��ȣ�� ¦���� ���� ���
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] carlist=new String[10];
		
		while(true) {
			
			System.out.println("**�������***");
			for(String temp : carlist) {
				if(temp!=null)System.out.print(temp+"  ");
			}
			//Ȧ��������ȣ
			System.out.println("\n***Ȧ������***");
			for(String temp : carlist) {
				if(Integer.parseInt(temp)%2==0) {
					System.out.println(temp+"[Ȧ]  ");
				}
			}
			
			//¦��������ȣ
			System.out.println("\n***¦������***");
			for(String temp : carlist) {
				if(Integer.parseInt(temp)%2==1) {
					System.out.println(temp+"[¦]  ");
				}
			}
			
			System.out.println("1. ��������"); int ch=scanner.nextInt();
			Random random =new Random();//������ü
			int intnum=random.nextInt(10000);
			String strnum=String.format("%04d", intnum);
			boolean save=false;
			for(int i=0;i<carlist.length;i++) {
				if(carlist[i]==null) {carlist[i]=strnum;save=true;break;}
			}//���࿡ �� ������ ������ ����
			if(save==false)System.err.println("����[�����Ұ�]");
			
			
			
		}//while
	}//m e 
}//c e
