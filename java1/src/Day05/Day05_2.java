package Day05;

import java.util.Scanner;

public class Day05_2 { //c s
	public static void main(String[] args) {//m s
		
		//ȸ���� �湮�� ���α׷�
			//1. �ʱ�޴�[1. ȸ������. 2.�α���]
				//1. ȸ������ [���̵�,��й�ȣ,�̸�]
				//2.�α���[���̵�, ��й�ȣ �����ϸ� �α���ó��]
			//2. �α��ν� �޴�[1. �湮�Ͼ��� 2.�α׾ƿ�]
				//1. �湮�� ����[����, ����, �ۼ���(�α��εȾ��̵�)
				//2. �α׾ƿ�[�ʱ�޴� ���ư���]
			//ȸ�� 100��[id pw nace] �����ϴ� �迭
		Scanner scanner=new Scanner(System.in);// �Է°�ü
		String[][] memberlist=new String[100][3];//100�� 3��=>[1��=id][2��=pw][3��=�̸�]
		//�湮�� 100��[tilte,contents,writer]�����ϴ� �迭
		String[][] boardlist=new String[100][3];
		
		while(true) {//���ѷ���[��������: X]
			System.out.println("----------------------------");
			System.out.println("---------ȸ���� �湮��---------");
			System.out.println("----------------------------");
			System.out.print("1.ȸ������        2. �α��� ���� : "); int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("-----ȸ������  ������-------");
				System.out.println("Member ID : ");		 String id=scanner.next();
				System.out.println("Member Password : ");String pw = scanner.next();
				System.out.println("Member Name : ");	 String name = scanner.next();
				//string 3�������� �Է¹޾� memberlist 2���� �迭������
					//1. �� ����[����=0,��ü(���ڿ�)=null]�� ã�Ƽ� ����[��  ������  ������ ȸ�� 100��  �ʰ�]
				
				//id �ߺ�üũ[ã��] ����ȸ�� id�� �����ϸ�ȸ���ԺҰ�
				boolean idcheck=true;
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist[i][0] !=null&& memberlist[i][0].equals(id)) {
						// ==null : ȸ��X, !=null = ȸ��O
						System.err.println("�˸�))������ ���̵� �����մϴ�.");
						idcheck=false;//.ȸ������ �Ұ����ϰ� idchecke������ false ����
						break;
						}//if end
					}//for end
				
				if( idcheck ) {
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist[i][0]==null) {//i��° �࿡  id��  ������ ����=��  ����
					memberlist[0][0]=id; memberlist[0][1]=pw; memberlist[0][2]=name;
					System.err.println("�˸�)) ȸ�������� �Ϸ� �Ǿ����ϴ�.");
					break;//���� ������ ��
						}//if end
					}//for end
				}
			}//if end
			else if(ch==2) {
				System.out.println("-----�α���  ������-------");
				System.out.println("Member ID : ");		 String id=scanner.next();
				System.out.println("Member Password : ");String pw = scanner.next();
				
				boolean loginchecked=false;//�α���  ���� �ʱⰪ
				//�迭 �� �����Ͱ�  �Է¹��� id�� pw��  �����ϸ�  �α��� ó��
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist [i][0] !=null&&
							memberlist[i][0].equals(id)&&memberlist[i][1].equals(pw)) {
						//1��° �࿡  id�� pass�� �Է¹��� ����  equals ������
							//null�� ��ü���ƴϱ� ������ equals�� �Ұ���=> ==
						System.out.println("�˸�)) �α���  ����");
						
						loginchecked=true;//�α��� ���� ��  ����
				////////////////////////////////////////////////////////////////////////////
						while(true) {//�α��ν� �޴� ���ѷ���[���� : �α׾ƿ�]
							System.out.println("---------------------");
							System.out.println("--------�湮��--------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
								//��� �湮�� ���
							for(int j=0;j<boardlist.length;j++) {
								if (boardlist[j][0] !=null) {//�Խù��� ���� �ε����� ����
								System.out.printf("%d\t%s\t%s\t%s \n",
										j,
										boardlist[j][2],
										boardlist[j][0],
										boardlist[j][1]);
								}
							}//for end
							
							System.out.println("1.�湮�ϳ����   2. �α׾ƿ� ���� : "); int ch2=scanner.nextInt();
							if(ch2==1) {
								System.out.println("---------�۾���---------");
								System.out.println("title : "); String title = scanner.next();
								System.out.println("content : ");String content = scanner.next();
								//�迭 �� ���� ã�Ƽ� ����
								for(int j=0;j<boardlist.length;j++) {
									if (boardlist[j][0]==null) {
										boardlist[j][0]=title;
										boardlist[j][1]=content;
										boardlist[j][2]=id;//�α��ν� ���� id�� ����
										System.err.println("�˸�))�湮���� �ۼ��Ǿ����ϴ�.");
										break;
									}//if end
								}//for end
								
							}//if end
							else if(ch2==2){
								System.err.println("�˸�))�α׾ƿ�");
								break;// ���� ����� �ݺ��� Ż��
							}
							else {System.err.print("�˸�))�� �� ���� ��ȣ�Դϴ�.");}
						}//ȸ���޴� while ����
					//////////////////////////////////////////////////////////////////////////	
						
						
					}//if end= login end
				}//for end
				//�α��� ���н�
				if (loginchecked==false)System.err.println("�˸�))ȸ�������� ���ų� �ٸ��ϴ�.");
				
			}//ch==2 if end
			else {System.err.println("�˸�)) �� �� ���� ��ȣ�Դϴ�.");}
	
		
		
		}//while 1 end = �ʱ�޴�end
	}// m e

}//c e