package Day02;

import java.util.Scanner;

public class Day02_6 {//c s
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
		System.out.println("7�� ������� Ȯ�� ���� ���ڸ� �Է��Ͻÿ�"); int ����  = scanner.nextInt();
		System.out.println("�Է��� ������ 7�� ��� �Ǵ� : "+(����%7==0));
		
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
		System.out.println("Ȧ, ¦�� ���� ���ڸ� �Է��ϼ���"); int Ȧ¦  = scanner.nextInt();
		System.out.println("����� �Է��� ���ڴ� : "+(Ȧ¦%2>=1));
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		System.out.println("���ڸ� �Է��ϼ���"); int ����4  = scanner.nextInt();
		System.out.println("����� �Է��� ���ڴ� : "+(����4%7/2==0)); //����4/7==0 && ����4/2==0
		
		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
		System.out.println("����6.����1�� �Է��ϼ���"); int ����1 = scanner.nextInt();
		System.out.println("����6.����2�� �Է��ϼ���"); int ����2 = scanner.nextInt();
		int ū��=����1>����2?����1:����2;
		System.out.println("�� ���� ū ����"+ū��);
		

		
		//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
		System.out.println("�������� �Է��Ͻÿ�"); int ������ = scanner.nextInt();
		System.out.println("���� ���̴� : "+������*������*3.14+"�Դϴ�");
												   
										   
		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
		// ��) 54.5   84.3 �̸�    64.285714%
//		System.out.println("����8.���� �ϳ� �Է��ϼ���"); double ����1 = scanner.nextDouble();
//		System.out.println("����8.���� �ϳ� �� �Է��ϼ���"); double ����2 = scanner.nextDouble();
		System.out.println("�� : "+����1/����2*100+"%�Դϴ�");
		double ����=����1/����2*100;
		
		System.out.printf("�Ǽ�1�ǽǼ�2 ����� : %.2f%%",����);
				
		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
		//��ٸ��� ���� = > (���� * �غ�) * ���� / 2		
		System.out.println("����8.�غ��� ���̸� �Է��Ͻÿ�"); int �غ� = scanner.nextInt();
		System.out.println("����8.������ ���̸� �Է��Ͻÿ�"); int ���� = scanner.nextInt();
		System.out.println("����8.������ ���̸� �Է��Ͻÿ�"); int ���� = scanner.nextInt();
		System.out.println("��ٸ����� ���̴�"+�غ�*����*����/2+"�Դϴ�");
		
		
		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
		//ǥ��ü�� ���� = > (Ű - 100) * 0.9
		System.out.println("Ű�� �Է��ϼ���."); float Ű=scanner.nextFloat();
		System.out.println("ǥ��ü���� "+(Ű-100/0.9f)+"�Դϴ�");
	
		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
		//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		
		System.out.println("Ű : ");int Ű2 =scanner.nextInt();
		System.out.println("������ : ");int ������=scanner.nextInt();
		System.out.printf("BMI : %.2f\n"+������/((Ű2/100.0)*(Ű2/100.0)));
	
		
		
		
		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
		System.out.println("/n��ġ�� �Է��ϼ���"); float ��ġ=scanner.nextFloat();
		System.out.println("�Է��Ͻ� ��ġ��"+��ġ*2.54+"cm�Դϴ�.");
		
		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
		//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
		//�߰���� �ݿ����� => 30 %
		//�⸻��� �ݿ����� => 30 %
		//������ �ݿ����� => 40 %
		System.out.println("�߰���� ������ �Է��ϼ���"); double �߰����=scanner.nextDouble();
		System.out.println("�⸻��� ������ �Է��ϼ���"); double �⸻���=scanner.nextDouble();
		System.out.println("������ ������ �Է��ϼ���"); double ������=scanner.nextDouble();
		double ������=(�߰����*30/100)+(�⸻���*30/100)+(������*40/100);
		System.out.printf("�� ������ %.2f\n",������);
				
//		����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
//	 	int x = 10; // (10)
//		int y = x-- + 5 + --x; //(23)x-- +5+ --x;
//		printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
//			1. x-- +5 -> ����  ���� + =>10+5
//			2. x-- -> x�� ����[x=9]
//			3. 15+ --x -> ���� ���� [x=8]
//			4. 15+8 =>y=23
			
		
		//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
		System.out.println("���̸� �Է��ϼ���"); int ����=scanner.nextInt();
		String ���ɴ� = ���� >= 40?"�߳�":����<=20?"�л�":"����";
  		System.out.println("���ɴ�� "+���ɴ�+"�Դϴ�.");
		

		//����16 : 3���� ������ �Է¹޾� ������������ ���� 
		System.out.println("����1�� �Է��ϼ���"); int ����1 = scanner.nextInt();
		System.out.println("����2�� �Է��ϼ���"); int ����2 = scanner.nextInt();
		System.out.println("����3�� �Է��ϼ���"); int ����3 = scanner.nextInt();
	
		if(����1>����2) {int temp =����1;����1 = ����2;	����2=temp;	}	
		if(����1>����3) {int temp=����1;����1=����3;����3=temp;}
		if(����2>����3) {int temp=����2;����2=����3;����3=temp;}
		System.out.printf("�Է��� �� �������� : %d %d %d", ����1,����2,����3);
		

		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
		
		System.out.println("����17) ���� 1 �Է� : "); int ����4=scanner.nextInt();
		System.out.println("����17) ���� 2 �Է� : "); int ����5=scanner.nextInt();
		System.out.println("����17) ���� 3 �Է� : "); int ����6=scanner.nextInt();
		System.out.println("����17) ���� 4 �Է� : "); int ����7=scanner.nextInt();
		if (����4<����5) {int temp=����4;����4=����5;����5=temp;}
		if (����4<����6) {int temp=����4;����4=����6;����6=temp;}
		if (����4<����7) {int temp=����4;����4=����7;����7=temp;}
		if (����5<����6) {int temp=����5;����5=����6;����6=temp;}
		if (����5<����7) {int temp=����5;����5=����7;����7=temp;}
		if (����6<����7) {int temp=����6;����6=����7;����7=temp;}
		System.out.printf("�Է��� �� �������� : %d %d %d %d", ����4,����5,����6,����7);
		
		
		
		
		
	}//m e
}//c e
