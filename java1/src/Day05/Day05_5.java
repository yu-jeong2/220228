package Day05;

import java.util.Scanner;

public class Day05_5 { // cs
	
	public static void main(String[] args) { // ce
		
		String[][] memberlist = new String[100][2];	// 100�����
		String[][] booklist = new String[100][3];	// 100������
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------- ���� �뿩 ���α׷� -------");
			System.out.println("1. ȸ������ 2. �α���");
			System.out.println("-----------------------------");
			System.out.println("���� : ");	int ���� = scanner.nextInt();
			
			if(����==1) {
				System.out.println("--------- ȸ������ ---------");
				System.out.println("ID : ");		String id = scanner.next();
				System.out.println("Password : ");	String pw = scanner.next();
				
				boolean idcheck = true;
				for(int i =0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.err.println("�˸�)������ ���̵� �����մϴ�.");
						idcheck = false;
						break;
					} // if e
				} // for e
				if(idcheck) {
					for(int i = 0; i<memberlist.length; i++) {
						if(memberlist[i][0]==null) {
							memberlist[0][0]=id; memberlist [0][1] = pw;
						} // if e
						System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						break;
					} // for e
				} // if e
			}
			else if(����==2) {
				System.out.println("------- �α��� ������ -------");
				System.out.println("ID : ");		String id = scanner.next();
				System.out.println("Password : ");	String pw = scanner.next();
				
			
				
				for(int i = 0; i<memberlist.length; i++) {
					if(memberlist[i][0].equals("admin")) {
						System.out.println("---------- ������ �޴� ----------");
						System.out.println("1. ������� 2. ������� 3. �α׾ƿ�");	int ����3 = scanner.nextInt();
						if(����3==1) {
							System.out.println("������ : ");	String ����=scanner.next();
							
							boolean bookcheck = true;
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(����)) {
									System.err.println("�˸�)������ å�� �����մϴ�.");
									bookcheck = false;
									break;
									
								} // if e
							} // for e
							if(bookcheck) {
								for(int k=0;k<booklist.length;k++) {
									if(booklist[k][0]==null) {
										booklist[k][0]=����;
										System.err.println("������ ��ϵǾ����ϴ�.");
										break;
									}	
								}	
							}	
						} // if e
						else if(����3==2) {}
						else if(����3==3) {}
						else System.err.println("�˸�)�� �� ���� ��ȣ�Դϴ�.");
					} // if e
				} // for e
		
				
				
				boolean logincheck = false;
				for(int i = 0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)){
						System.out.println("�α��� ����");
						logincheck = true;
						
						while(true) {
							System.out.println("---------------- �������α׷� �޴� ----------------");
							System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
							System.out.println("----------------------------------------------");
							System.out.println("���� : ");	int ����2 = scanner.nextInt();
							
							if(����2==1) {
								System.out.println("������ �˻� : "); String ������ = scanner.next();
								
								boolean bookcheck = false;
								for(int j = 0; j<booklist.length; j++) {
									if(booklist[j][0] != null && booklist[j][0].equals(������)) {
										System.out.println("������ : " + ������ );
										bookcheck = true;
									} // if e
									if(bookcheck==false)	System.err.println("�˸�)�ش� ���� ã�� �� �����ϴ�.");
								} // for e
							}
							else if(����==2) {}
							else if(����==3) {}
							else if(����==4) {}
							else if(����==5) {}
							else {
								System.err.println("�˸�)�� �� ���� ��ȣ�Դϴ�.");
							} // else e
						} // while e
					} // if e
					
				} // for e
				
				if(logincheck == false) System.err.println("�˸�)ȸ�������� ���ų� �ٸ��ϴ�.");
				
			} // else if e
			else {
				System.err.println("�˸�)�˼����� ��ȣ�Դϴ�.");
			} // else e
			
		} // while e
		
		
	} // me
	
} // ce