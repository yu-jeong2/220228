package Day08;

import java.util.Scanner;
import Day08.Member;

public class Day08_4 {
	
	//����� ��ũ ���α׷�
		//�䱸����
		//ȸ�� �ֿ��� : 1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��
		//�ֿ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸�� 7.�α׾ƿ�
				//���� 6�ڸ� ����
		//���� : -����(�̸�, ���¹�ȣ, �ܾ�, ��й�ȣ)
			//	-�����ǰ(admin??) ������ ��¥, �ݾ�,
			//	-ȸ��(Member)
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] member=new Member[1000];
	static Acc[] acc=new Acc[1000];
	
	public static void main(String[] args) {
		Day08_4 mbank = new Day08_4();
		mbank.menu();
	}
	
		void menu() {
			while(true) {//���ѹݺ�
				System.out.println("---------����� ��ũ ���α׷�---------");
				System.out.println(" 1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��\n�Է� : ");
				int i=scanner.nextInt();
				Member member = new Member();
				if(i==1) {
					Boolean result=member.ȸ������();
					if(result)System.err.println("�˸�))ȸ������ ����");
					else System.err.println("�˸�))ȸ������ ����");
				}//if����
				else if(i==2) {
					String  result = member.�α���();
					if(result==null) {
						System.out.println("�˸�))������ ȸ�������� �����ϴ�.");
					}//�α��� ����
					else if(result.equals("admin")) {//2.������ �޴� �޼ҵ� ȣ��
						System.out.println("�˸�))�ȳ��ϼ���~"+result+"��");
						;
					}//������ �޴� ȣ��
					else {//1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
						System.out.println("�˸�))�ȳ��ϼ���~"+result+"��");
					}//�Ϲ�ȸ�� �޴� �޼ҵ� ȣ��

				}//else 2����
				else if(i==3) {member.���̵�ã��();}//else 3����
				else if(i==4) {member.��й�ȣã��();}//else 4����
				else {System.err.println("�˸�))�ùٸ��� ���� �����Դϴ�.");}//else ��Ÿ ����
			}//while ���ѹݺ� ����
		}//void end
		void membermenu(String loginid) {
			while(true) {
			System.out.println("-----------ȸ�� �޴�-----------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸�� 7.�α׾ƿ�\n���� : ");
			int ch=scanner.nextInt();
				Acc acc = new Acc();
				if(ch==1) {//
					acc.���»���();
				}//if 1end
				else if(ch==2){
					acc.�Ա�();
					
				}//else 2end
				else if(ch==3){
					acc.���();
				}//else 3end
				else if(ch==4){
					acc.������ü();
				}
				else if(ch==5) {
					acc.����();
				}
				else if(ch==6){
					acc.���¸��();
				}//else 6end
				else if(ch==7){//�α׾ƿ�
					return;//�Ϲ�ȸ�� �޼ҵ� ����[�α׾ƿ�]
				}//else 7end
				else {System.err.println("�˸�))�� �� ���� ��ȣ �Դϴ�.");	} 
			}//while
		}//ȸ��void
		
	}//c e