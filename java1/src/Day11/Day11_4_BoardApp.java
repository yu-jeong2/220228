package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {
	/*
	 * ��ȸ���Խ��� + ��� ���α׷�
	 * 	[m]�Խù� Ŭ����
	 * 		��ȣ=�ε���, ����, �н�����, ����, �ۼ���, �ۼ���, ��ȸ��
	 * 		�� �� �Խù��� ���� ��۸���Ʈ/�迭
	 * 	[m]��� Ŭ����
	 * 		����, �ۼ���, �ۼ���
	 * 	[c]��Ʈ�ѷ� Ŭ����
	 * 		1.��� 2.���� 3.���� 4.���� 5.���� 6.��۾��� 7.�Խù�����  8.�Խù��ҷ����� 9.������� 10.��ۺҷ�����
	 * 	[v]Day11_4_BoardApp Ŭ����
	 * 		�����[�Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ����]
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Controller.load(); // 2. ����[ ��� �Խù�] �ҷ����� 
		while(true) {
			try {//���ܹ߻� : ����ڰ� ���� �Է½� ���ܹ߻�!!! ->catch �̵�
				//��� �Խù� ���
				System.out.printf("%s\t%10s\t%10s\t%10s\t%2s\t \n","��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				int i=0; 
				for(Board board:Controller.boardlist) {
					System.out.printf("%2s\t%10s\t%10s\t%10s\t%2s\t \n", i , board.getTitle() ,
							board.getWriter() , board.getDate() , board.getViewcount() );
				i++;}
				System.out.print("1.���� 2.���� ���� : ");int ch=scanner.nextInt();
				if (ch==1) {
					System.out.println("*** �Խù� ��� ***");
					scanner.nextLine();//�������� �Է°���. ��, nextline �� �Ϲ�next���� �ϳ��� ���
										//�ذ��� : �Ϲ�next�� nextline ���̿� �ǹ̾��� nextline() �߰��ϱ�.
					System.out.println(" ���� : "); String ����=scanner.nextLine();
					System.out.println(" ���� : "); String ����=scanner.nextLine();
					System.out.println(" �ۼ��� : "); String �ۼ���=scanner.next();
					System.out.println(" ��й�ȣ[����/������] : "); String ��й�ȣ=scanner.next();
					Controller.write(����,����,�ۼ���,��й�ȣ);
				}
				else if(ch==2) {
					//�ش� �Խù� ��ȣ[�ε���]�� �Է¹޾� �Խù� ���� ��� ���
					System.out.println("�Խù� ��ȣ �Է� : ");int index=scanner.nextInt();
					Board temp =  Controller.boardlist.get(index);//�ش� �ε����� ��ü�� �ӽ� ��ü[�ڵ� ���̱�]
					System.out.println("*** �Խù� ���� ***");
					System.out.println("���� : "+temp.getTitle());
					System.out.println("�ۼ��� : "+temp.getWriter()+"\t�ۼ��� : "+temp.getDate()+"\t��ȸ�� : "+temp.getViewcount());
					System.out.println("���� : "+temp.getContent());
					System.out.println("");
					System.out.println("1.�ڷΰ��� 2.���� 3.���� 4.��۾���");//�޴�
					int ch2=scanner.nextInt();
					if(ch2==1) {}
					else if(ch2==2) {
						System.out.println("�� �Խù��� ��й�ȣ : "); String password=scanner.next();
						scanner.nextLine();//�Ϲ�next  �������� nextline�� ���� �����߻�.
						System.out.println("���� ���� : "); String title=scanner.nextLine();
						System.out.println("���� ���� : ");String content=scanner.nextLine();
						Boolean result = Controller.update(index,password, title, content);//������ �ε��� ��ȣ, �н�����, ����������, �����ҳ���=>�μ�
						if(result) System.err.println("�˸�)) ���� ����");
						else {System.err.println("�˸�)) ���� ����[�н����尡 �ٸ��ϴ�]");}
						
					}//����
					else if(ch2==3) {
						System.out.println("�� �Խù��� ��й�ȣ : "); String password=scanner.next();
						boolean result = Controller.delete(index,password);
						if(result) System.err.println("�˸�)) ���� ����");
						else {System.err.println("�˸�)) ���� ����[�н����尡 �ٸ��ϴ�]");}
					}//����
					else if(ch2==4) {
						Controller.replywrite();//�ε�����ȣ, ��۳���, ����н�����,����ۼ���=>�μ�
					}//��۾���
					else {}
					
				}
				else {}
			}catch(Exception e) {
				System.err.println("�޼���))����� �� ���� �Է��Դϴ�.");
				scanner =new Scanner(System.in);//�ٽ� �޸� �Ҵ�[�������빰 �����]				
			}//catch end
		}//while end		
	}//m e
}
