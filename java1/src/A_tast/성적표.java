package A_tast;

import java.util.Scanner;

public class ����ǥ {
	
	
	
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 �л�[]stu=new �л�[100];
		
			while(true){
				try {
				System.out.println("---------------------------------------------------------------");
				System.out.println("                         ��  ��  ǥ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				int j=0;
				for(�л� temp:stu) {
					if(temp!=null) {
						int ���� = stu[j].����+stu[j].����+stu[j].����;
						double ���=����/3;
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d",stu[j].��ȣ,stu[j].�̸�,stu[j].����,stu[j].����,stu[j].����,����,���,j);
						System.out.println("");
					}j++;
				}
				System.out.println("�޴� : 1.�л����� ��� 2.�л����� ����"); int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println(" ��ȣ : "); int �л���ȣ = scanner.nextInt();
					System.out.println(" �̸� : "); String �̸�2= scanner.next();
					System.out.println(" ���� : "); int ���� = scanner.nextInt();
					System.out.println(" ���� : "); int ���� = scanner.nextInt();
					System.out.println(" ���� : "); int ���� = scanner.nextInt();
					�л� �л�=new �л�(�̸�2, �л���ȣ, ����, ����, ����);
					for( int i=0;i<stu.length;i++) {
						if (stu[i]==null) {
							stu[i]=�л�;break;	
						}i++;
					}
				}//1�� �л���� end
				else if(ch==2) {
					System.out.println("�����Ͻ� �̸��� �Է��ϼ���");
					System.out.println(" �̸� : "); String �̸�2= scanner.next();
					for( int k=0;k<stu.length;k++) {
						if (k!=0&&stu[k].�̸�.equals(�̸�2)) {
							stu[k]=null;break;	
						}k++;
					}
				
					
				}//2������ end
		
				}catch(Exception e){
					System.out.println("�߸��� �Է��Դϴ�.");
					scanner =new Scanner(System.in);}
			}//while end
	
	}//m e
}//c e
