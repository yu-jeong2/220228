package Day00;

import java.util.Scanner;

public class ���迹�� {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
		
		String[] �̸� = new String[100];
		int[][] ���� = new int[100][4];//[?][0] : ��ȣ/[?][1] : ����/[?][2] : ����/[?][3] : ����
		
		
		while(true) {
			try {
				
				System.out.println("----------------------------------------");
				System.out.println("               ��    ��    ǥ");//
				System.out.println("----------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				for (int i=0;i<�̸�.length;i++) {
					if (�̸�[i]!=null) {
						System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,�̸�[i],����[i][1],����[i][2],����[i][3],(����[i][1]+����[i][2]+����[i][3]),(����[i][1]+����[i][2]+����[i][3]/3));
						System.out.println("");
					}//if end
					i++;
				}//for end
				System.out.println("1. �л��������   2.�л���������  ���� : "); int ch=scanner.nextInt();
				if(ch==1) {
					System.out.println("��ȣ ���� : ");int ��ȣ=scanner.nextInt();
					System.out.println("�л� �̸� : ");String �л��̸�=scanner.next();
					System.out.println("���� ���� : ");int ����=scanner.nextInt();
					System.out.println("���� ���� : ");int ����=scanner.nextInt();
					System.out.println("���� ���� : ");int ����=scanner.nextInt();
					for(int i=0;i<�̸�.length;i++) {
						if (�̸�[i]!=null) {
							����[i][0] = ��ȣ;
							����[i][1] = ����;
							����[i][2] = ����;
							����[i][3] = ����;
							�̸�[i] = �л��̸�;
							System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,�̸�[i],����[i][1],����[i][2],����[i][3],(����[i][1]+����[i][2]+����[i][3]),(����[i][1]+����[i][2]+����[i][3]/3));
							System.out.println("");
							break;
						}i++;
					}//for end
				}//if end
				else if (ch==2){}
				else {
					System.err.println("�� �� ���� �����Դϴ�. �ٽ� �Է����ּ���");
				}
			}catch(Exception e){
				System.err.println("�� �� ���� �����Դϴ�. �ٽ� �Է����ּ���");
			}			
		}//while end
	}//m e 
}// c e
