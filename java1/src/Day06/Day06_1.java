package Day06;

import java.util.Scanner;

public class Day06_1 {
	public static void main(String[] args) {
		
		// ȸ���� ���α׷� [ Ŭ���� ���� ] 
		
			// 0. ȸ�� ���� => ȸ�� Ŭ���� ����� 
				// 1. �ʵ� 
					// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
			// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
				// 1. ȸ�����Խ� �Է¹޾� ���� 
				// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó�� 
				// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ��� 
				// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ���
		
		Scanner scanner =new Scanner(System.in);
		Member[] memberlist = new Member[100];
		
		while(true) {
			System.out.println("----------ȸ����[Ŭ����]----------");
			System.out.println("1.ȸ������\n2.�α���\n3.���̵�ã��\n4.��й�ȣã��\n���� : ");
			int ch=scanner.nextInt();
			///////////���̵� �Է� �ޱ�	
			if(ch==1) {
				System.out.println("----------ȸ������ ������----------");
				System.out.println("���̵� : "); String id=scanner.next();
				System.out.println("��й�ȣ : "); String pw= scanner.next();
				System.out.println("�̸� : ");String name=scanner.next();
				System.out.println("����ó : ");String phone =scanner.next();
				////////////���̵� Member�� �����ϱ�
				Member member=new Member();
				member.id=id;
				member.pw=pw;
				member.name=name;
				member.phone=phone;
		
				////////////////�ߺ�üũ	
				boolean idcheck=false;
				for(Member temp:memberlist) {
					if(temp!=null&&temp.id.equals(id)) {
						System.err.println("�˸�))������� ���̵� �Դϴ�.[ȸ������ ����]");
						idcheck=true;
						break;
					}
				}
		//////memberlist �� �����ϱ�
				if(idcheck==false) {
					int i =0;
					for(Member temp:memberlist) {
						if(temp==null) {
							memberlist[i]=member;
							System.out.println("�˸�))ȸ������ ����");
							break;
						}
					}i++;
					
				}		
			}
		/////////////2�� �α���	
			else if(ch==2) {
				
				System.out.println("----------�α��� ������----------");
				System.out.println("���̵� : "); String lid=scanner.next();
				System.out.println("��й�ȣ : "); String lpw=scanner.next();
				
		//////////�Է¹��� ���� ����Member�� ���ϱ�
				 boolean check =false;
				 for(Member temp:memberlist) {
					 if(temp!=null&&temp.id.equals(lid)&&temp.pw.equals(lpw)) {
						 System.err.println("�˸�))�α��� ����");
						 check=true;
					 }
				 }
				if(check==false) {System.err.println("�˸�))������ ȸ�������� �����ϴ�.");}
			}//else 2 �α��� end
			else if(ch==3) {
				System.out.println("----------���̵� ã��----------");
				System.out.println("�̸� : "); String name=scanner.next();
				System.out.println("����ó : "); String phone=scanner.next();
				
				boolean find =false;
				for(Member temp:memberlist) {
					if(temp!=null&&temp.name.equals(name)&&temp.phone.equals(phone)) {
						System.out.println("�˸�))���̵� ã�� ����!!");
						System.out.println("ȸ�� ID : "+temp.id);
						find=true;
						break;
					}
					if(find==false) {System.err.println("�˸�))������ ȸ�������� �����ϴ�.[ã�����]");}
				}	
			}//else 3 ���̵� ã�� end
			else if(ch==4) {
				System.out.println("----------��й�ȣ ã��----------");
				System.out.println("���̵� : "); String id=scanner.next();
				System.out.println("����ó : "); String phone=scanner.next();
				
				boolean find =false;
				for(Member temp:memberlist) {
					if(temp!=null&&temp.id.equals(id)&&temp.phone.equals(phone)) {
						System.out.println("�˸�))���̵� ã�� ����!!");
						System.out.println("ȸ�� ��й�ȣ : "+temp.pw);
						find=true;
						break;
					}
					if(find==false) {System.err.println("�˸�))������ ȸ�������� �����ϴ�.[ã�����]");}
				}
			}//else 4 ��й�ȣ ã�� end
			else {System.err.println(" �˸�)) �˼����� ��ȣ�Դϴ�.");}//else end
			
		}//while end
	}//m e
}//c e
