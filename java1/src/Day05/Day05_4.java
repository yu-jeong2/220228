package Day05;

import java.util.Scanner;

public class Day05_4 { //c s
	public static void main(String[] args) {//m s
		//1.�����  2.����/�ڷ��� 3.����/�ݺ� 4.����/�ݺ� 5.�迭
		
		//���� �뿩 ���α׷�
			//1.�迭 ����
				//1. ȸ��[���̵�(�ߺ�X),��й�ȣ]
				//2. ����[������, �����뿩����(�뿩����,�뿩��), �뿩��(ID)]
			//2. �ʱ�޴�
				//1. ȸ������ 2.�α���
					//1.ȸ�����Խ� ���̵��ߺ�üũ
			//3. �α��νø޴�
				//1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
					//1. ���� �˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���,�ƴϸ� ����.
					//2. ������Ͻ� ��� ������  ���
					//3. �����뿩�� �����뿩���ΰ� ������ �� �����뿩ó��
					//4. ���� �ݳ���  ������  �뿩 �ѵ����� �ݳ�ó��
					//5. �α׾ƿ�
			//4. �α��ν� ���̵� admin�̸� �����ڸ޴�
				//1. ������� 2.������� 3.�������� 4.�α׾ƿ�
					//1.���� ��Ͻ� �������� �Է¹޾� ���� ��� ó��
					//2.������Ͻ� ��絵���� ���
					//3.���������� ������ �������� �Է¹޾� �����ѵ����� ����[null]
					//4.�α׾ƿ��� �ʱ�޴���
		
		Scanner scanner = new Scanner(System.in); 
		while(true) {
				
		System.out.println("-------�����뿩 ������ ���--------");
		System.out.println("1. ������� 2.������� 3.�������� 4.�α׾ƿ�");
		int ���� = scanner.nextInt();
	
		String[] booklist=new String[100];
		if (����==1) {//if 1
			System.out.println("-------���� ���-------");
			System.out.println("�������� �Է��Ͻÿ�. : "); String ����=scanner.next();
			boolean �����ߺ�=true;
			for(int i=0;i<booklist.length;i++) {
				if(booklist[i][0] !=null&& booklist[i].equals(����)) {//if 2
					System.err.println("�˸�))������ å�� �����մϴ�.");
					�����ߺ�=false;
					break;
					}//if2 end
			}//for end
			if(�����ߺ�) {
				for(int i=0;i<booklist.length;i++) {
					if(booklist[i]==null) {
						booklist[i]=����;
						System.err.println("������ ��ϵǾ����ϴ�.");
						break;
					}//if end
				
				}//for end
				
			}//if end
		}//if1 end
		else if (����==2) {
			for(int i=0;i<booklist.length;i++) {
							
				System.out.println("--------�������--------");
				System.out.println("��ȣ\t�������\t");
				if (booklist[i] !=null) {
				System.out.printf("%d\t%s",i,booklist[i]);
					}//if end
			}//for end
		}//else 2 end
		else if(����==3) {}
		else if(����==4) {}
		else {System.err.println("�ùٸ��� ���� ����Դϴ�.");}
		
		
		
	
				
				
		
		
		
		
		
		
		
		}//while end
	}// m e

}//c e