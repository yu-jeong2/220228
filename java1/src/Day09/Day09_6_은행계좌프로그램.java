package Day09;

import java.util.Scanner;

public class Day09_6_����������α׷� {//����Ʈ(��)


	//���� ���� ���α׷�[���]
		//����[super]
		//����[sub], ����[sub], �ϳ�[sub]
		//�� ���: 1.���»��� 2.�Ա� 3.��� 4.��ü 5.�� ���¸�� 6.����
	
	
	//���� �ۿ��� �����ϴ� ����--> ��� Ŭ�������� ���� ����ϱ� ���� static�� ����
	public static ����[] ���¸���Ʈ=new ����[100];
	public static void main(String[] args) {//m s
		Scanner scanner =new Scanner(System.in);	
		while(true) {
			System.out.println("-------------���� �ý���-------------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���¸�� 6.����");
			int ����=scanner.nextInt();
			//��Ʈ�ѷ� �޼ҵ�ȣ��� ��ü
			������Ʈ�ѷ� ��Ʈ��=new ������Ʈ�ѷ�();
			if(����==1) {
				System.out.println("+++���»��� ������+++");	
				System.out.println("��й�ȣ : ");			String ��й�ȣ=scanner.next();
				System.out.println("������ : ");			String ������=scanner.next();
				System.out.println("���༱�� : 1.���� 2.���� 3.�ϳ�   > "); int �����ȣ=scanner.nextInt();
				String ���¹�ȣ = ��Ʈ��.���»���(��й�ȣ,������,�����ȣ);//�޼ҵ� ȣ��[�μ�3��]
				//�޼ҵ� ��ȯ ����
				//�޼ҵ���� �� �޼��� ���
				if(���¹�ȣ!=null) {System.err.println("*** ���»������� ***");
				System.out.println("������ ���¹�ȣ : "+���¹�ȣ);}
				else {System.err.println("�˸�))���µ�� ����[�����ڿ��� ����]");}
				
			}
			else if(����==2) {
				System.out.println("+++�����Ա� ������+++");
				System.out.println("���¹�ȣ : "); String ���¹�ȣ = scanner.next();
				System.out.println("�Աݾ� : "); int �Աݾ� = scanner.nextInt();
				boolean result=��Ʈ��.�Ա�(���¹�ȣ,�Աݾ�);
				if(result) {
					System.out.println("*** �Ա� ���� ***");
				}else {
					System.err.println("�˸�))�Ա� ����(������ ���°� �����ϴ�.)");
				}
			}//����2 �Ա�
			else if(����==3) {
				System.out.println("+++������� ������+++");
				System.out.println("���¹�ȣ : "); String ���¹�ȣ = scanner.next();
				System.out.println("��й�ȣ : "); String ��й�ȣ = scanner.next();
				System.out.println("��ݾ� : "); int ��ݾ� = scanner.nextInt();
				int result = ��Ʈ��.���(���¹�ȣ,��й�ȣ,��ݾ�);
				if(result==1) {System.err.println("*** �ܾ׺��� ***");}
				else if(result==2)	{System.out.println("+++ ��� ���� +++");}
				else if(result==3)	{System.err.println("*** �ùٸ� ������ �ƴմϴ�. ***");}
			}//����3 ���
			else if(����==4) {
				System.out.println("+++������ü ������+++");
				System.out.println("���¹�ȣ : "); String ���¹�ȣ = scanner.next();
				System.out.println("��й�ȣ : "); String ��й�ȣ = scanner.next();
				System.out.println("��ü���� : ");String ��ü����=scanner.next();
				System.out.println("��ü�ݾ� : "); int ��ü�ݾ� = scanner.nextInt();
				int result =��Ʈ��.��ü(���¹�ȣ,��й�ȣ,��ü����,��ü�ݾ�);
				if (result==1) {System.err.println("*** �ܾ� ���� ***");}
				else if(result==2) {System.out.println("+++ ��ü ���� +++");}
				else if(result==3) {System.err.println("�˸�))��ġ�ϴ� ������ �����ϴ�.");}
				else if(result==4) {System.err.println("�˸�))������ ���� ������ �����ϴ�.");}
			}//����4 ��ü
			else if(����==5) {
				System.out.println("+++ �� ���¸�� ������ +++");
				System.out.println(" ������ : "); String ������ = scanner.next();
				����[] �����¸�� = ��Ʈ��.���¸��( ������ );
				System.out.println(" *** �˻��� ������ ���� ���¸�� *** ");
				int i = 1;
				for( ���� temp : �����¸�� ) {
					if( temp !=null ) // �������� [ �����̸� ��¿��� �߻� ] 
						System.out.println( i+"�� ���¹�ȣ : "+temp.get���¹�ȣ() );
					i++;
				}	
			}//����5 ���¸��
			else if(����==6) {
				System.out.println("+++���� ������+++");
			}//����6 ����
			else {System.err.println("�˸�)) �� �� ���� ��ȣ�Դϴ�.");}
		}//while ��  end
	}//m e
}//c e
