package Day06;

import java.util.Scanner;

public class Day06_1 {//c s
	public static void main(String[] args) {//m s
		
		// 0. ȸ������ => ȸ������
					// 1. �ʵ�
						// 1. ���̵� 2.��й�ȣ 3. �̸� 4.��ȭ��ȣ
				// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣ ã�� ]
					// 1. ȸ�����Խ� �Է¹ޱ�
					// 2. �α��ν� ���̵�� ����ϸ� �α��� ó��
					// 3. ���̵�� �̸��� ���̵� �����ϴ�
					// 4. ���� ���̵�� ��ȭ��ȣ�� ���� �ð�
		
		Scanner scanner =new Scanner(System.in);
		Member[] memberlist = new Member[100];
		while(true) {
			System.out.println("------ȸ������(Ŭ����)------");
			System.out.println("1.ȸ������  2.�α���  3.���̵�ã��  4.��й�ȣã��"); int ch=scanner.nextInt();
			if(ch==1) {
				System.out.println("------[ȸ������]------");
				System.out.println("���̵� �Է� : "); String id=scanner.next();
				System.out.println("��й�ȣ �Է� : "); String pw=scanner.next();
				System.out.println("�̸� �Է� : "); String name=scanner.next();
				System.out.println("����ó �Է� : "); String phone=scanner.next();
				System.err.println("�˸�)) ȸ�������� �Ϸ�Ǿ����ϴ�.");
				
				Member member = new Member();
				member.id=id;
				member.pw=pw;
				member.name=name;
				member.phone=phone;
				
				
				
			
				boolean check=(false);
				for(Member temp:memberlist) {
					if(temp !=null && temp.id.equals(id)) {
					System.err.println("�˸�))������� ���̵� �Դϴ�. [ȸ������ ����]");
					check= true;
					break;
					}//if end �ߺ�üũ
				}
				if(check==false) {
					int i=0;
					for(Member temp:memberlist) {
						if(temp==null) {
							memberlist[i]=member;
							System.err.println("�˸�))ȸ������ ����!!");
							break;
						}//if ����
						i++;
					}//for ����
				
				}//for������
			}//if 1. ȸ������
			else if(ch==2) {
				System.out.println("---------�α��� ������---------");
				System.out.println("���̵� : "); String id=scanner.next();
				System.out.println("��й�ȣ : "); String pw=scanner.next();
				boolean check=(false);
				for(member temp : memberlist) {
					if(temp!=null&&temp.name.eqals(id)&&temp.pw.eqals(pw)) {
						System.out.println("�˸�))�α��� ����");
						check=true;
					}//if�� ����
				}//���� ����
				if (check==false) {
					System.err.println("�˸�)) ������ ������ �����ϴ�.");
				}//�α��� ����, if����
			}//2.�α���
			else if(ch==3) {
				System.out.println("-------���̵� ã��-------");
				System.out.println("�̸� : "); String name = scanner.next();
				System.out.println("����ó : "); String phone = scanner.next();
				boolean find=false;
				for(member temp : memberlist) {
					if(temp!=null&&temp.name.eqals(name)&&temp.pw.eqals(phone)) {
					System.out.println("�˸�))���̵� ã�� ����");
					System.out.println("ȸ�� ID : "+temp.id);
					find=true;
					break;
					}//if����				}
				}//for������
				if(find==false) {
					
					System.out.println("�˸�))������ ȸ�� ������ �����ϴ�.[ã�� ����]");
					}
			}//3.���̵�ã��
			else if(ch==4) {
				System.out.println("-------��й�ȣ ã��-------");
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("����ó : "); String phone = scanner.next();
				boolean find=false;
				for(member temp : memberlist) {
					if(temp!=null&&temp.name.eqals(id)&&temp.pw.eqals(phone)) {
					System.out.println("�˸�))��й�ȣ ã�� ����");
					System.out.println("ȸ�� ID : "+temp.pw);
					find=true;
					break;
						}//if����
				}//for������
				if(find==false) {
					System.out.println("�˸�))������ ȸ�� ������ �����ϴ�.[ã�� ����]");
					}
			}//4.��й�ȣ ã��
			else {
				System.out.println("�˸�))�߸� �����̽��ϴ�. ");
				}//����
		}//while�� ����
	}//m e
}//c e
