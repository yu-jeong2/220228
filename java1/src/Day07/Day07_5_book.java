package Day07;

import java.util.Scanner;

public class Day07_5_book {//����Ʈ, �����
	//05_book Ŭ���� : ����� ���� �ڵ�
	//book Ŭ���� : ���� �����ڵ�
	//Member : ȸ�� ���� �ڵ�
	
	//���� �뿩 console ���α׷�[Ŭ��������]
	//1. Ŭ���� ����(��ص�)
		//1.book
			//�ʵ� : ISBN(������ȣ), ������, �۰�, �����뿩����, �뿩��
			//�޼ҵ� :1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� / 1.������� 2.��������
		//2.Member
			//�ʵ� : ��ȣ, ���̵�, ��й�ȣ,�̸�,����ó
			//�޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��
			//�����ڸ޼ҵ� : 1.������� 2.��������
	//2. ȭ�� ����(����Ʈ)
		//1.�ʱ� �޴�[1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��]
		//2.�Ϲ�ȸ���޴�[1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�]
		//3.�����ڸ޴� [1.������� 2.������� 3.�������� 4.����(����Ʈ����) 5.�α׾ƿ�]
	
	//0.�ڵ带 �о��ִ½��� �޼ҵ�[������]
	
	//main�ۿ������� �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ���ؼ�
		//��������( {��������} : ��ȣ ������ ����� ������ { }������ ������.
			//���� �ٸ� { } ��ȣ ������ ���� ->��������
		//static : ���α׷� ���۽� �޸� �Ҵ� / ���α׷� ����ÿ� �޸� ����
			//���α׷� ���������� ��� ���� ���Ǵ� �޸�[����]
	static Scanner scanner = new Scanner(System.in);//static : ��� ������ ��ü ���� ���(ȣ��) ����
	static Member_2[] member=new Member_2[1000];//��� ���Ͽ��� ����ϴ� ȸ�� ��� �迭
	static Book[] books = new Book[1000];
	public static void main(String[] args) {//m s
		//�޼ҵ�ȣ��
			//1.����ȣ�� �Ұ���
				//menu();
				//static : �޸𸮰� �켱�Ҵ� �̱� ������ static �� �޼ҵ�,�ʵ� ������
				//main �޼ҵ� static �޼ҵ� �̱⶧���� static �޼ҵ常 ����ȣ�� ����
			//2.�ܺ�ȣ��
				//1.��ü����->�޼ҵ� ȣ��
		
	}//m e
	//1. �ʱ�޴� �޼ҵ�
	
	void menu() {
		while(true) {
			System.out.println("-----------------���� �뿩 ���α׷�-----------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��  �Է� : ");
			int ch=scanner.nextInt();
			Member_2 member = new Member_2(); // 1~4 {}��ȣ���� ��� ����
			if(ch==1) {//ȸ������ �޼ҵ�  ȣ��
				Boolean result=member.ȸ������();
				if(result)System.err.println("�˸�))ȸ������ ����");
				else System.err.println("�˸�))ȸ������ ����");
			}//if����
			else if(ch==2) {//�α��� �޼ҵ� ȣ��
				String  result = member.�α���();
				if(result==null) {
					System.out.println("�˸�))������ ȸ�������� �����ϴ�.");
				}//�α��� ����
				else if(result.equals("admin")) {//2.������ �޴� �޼ҵ� ȣ��
					System.out.println("�˸�))�ȳ��ϼ���~"+result+"��");
					adminmenu();
				}//������ �޴� ȣ��
				else {//1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println("�˸�))�ȳ��ϼ���~"+result+"��");
					membermenu(result);
				}//�Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
				
			
			
				
			}//else if 2  ����
			else if(ch==3) {//���̵�ã�� �޼ҵ�ȣ��
				member.���̵�ã��();
			}//else if 3  ����
			else if(ch==4) {//��й�ȣã�� �޼ҵ�ȣ��
				member.��й�ȣã��();
			}//else if 4  ����
			else {
				System.err.println("�˸�))�� �� ���� ��ȣ�Դϴ�.");
			}//else ����
		}//while����
	}//menu void end
		//2. �Ϲ�ȸ�� �޴� �޼ҵ�
		void membermenu(String loginid) {//�μ��� ���� �޶� ������, �ڷ����� �����ؾ� ��.
			while(true) {
			System.out.println("-----------ȸ�� �޴�-----------");
			System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�\n���� : ");
			int ch=scanner.nextInt();
				Book book = new Book();
				if(ch==1) {//�����˻�
					book.�����˻�();
					
				}//if 1end
				else if(ch==2){//�������
					book.�������();
					
				}//else 4end
				else if(ch==3){//�����뿩
					book.�����뿩(loginid);
				}//else 3end
				else if(ch==4){//�����ݳ�
					book.�����ݳ�(loginid);
				}//else 4end
				else if(ch==5){//�α׾ƿ�
					return;//�Ϲ�ȸ�� �޼ҵ� ����[�α׾ƿ�]
				}//else 5end
				else {System.err.println("�˸�))�� �� ���� ��ȣ �Դϴ�.");
				}//else end
			}//while end
		}//membermenu void end
		//3. ������ �޴� �޼ҵ�
		void adminmenu() {
			System.out.println("-----------������ �޴�-----------");
			System.out.println("1.������� 2.������� 3.�������� 4.�α׾ƿ�\n���� : ");
			int ch=scanner.nextInt();
			Book book = new Book();
			if(ch==1) {//�������
				book.�������();
			}//if 1end
			else if(ch==2){//�������
				book.�������();
			}//else 4end
			else if(ch==3){//��������
				book.��������();
			}//else 3end
			else if(ch==4){//�α׾ƿ�
				return;//�Ϲ�ȸ�� �޼ҵ� ����[�α׾ƿ�]
			}//else 4end
			else {System.err.println("�˸�))�� �� ���� ��ȣ �Դϴ�.");
				
			}//else end
			
		}//adminmenu void end

}//c e
