package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_��������_����Ʈ���� {
	
	public static void main(String[] args) {
		//����Ʈ[��ü]����
		ArrayList<Book>booklist=new ArrayList<>();
		//����Ʈ Ŭ����<����Ʈ �ȿ� ������ Ŭ����>
		//<Ŭ����> : �ش�  Ŭ�����ǿ��� ��ü�� ����Ʈ�� ����
		//���̴� ����[�⺻ : 10]
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("1.��� 2.��� 3.���� 4.����");
			int ch=scanner.nextInt();
			if (ch==1) {
				//�Է¹ޱ�
				System.out.println("������ : "); String ������=scanner.next();
				System.out.println("���� : "); String ����=scanner.next();
				//��üȭ[������������--> 1���� ��ü]
				Book book = new Book(������,����);				
				//�迭����
				booklist.add(book);
				// .add(��ü��) : ������  �ε����� �ڵ������� ��ü�� �߰�
			}
			else if (ch==2){
				//�迭 :��������
				System.out.println("������\t����");
				for(Book book :booklist) {
					System.out.println(book.get������()+"\t"+book.get����());
					
				}
			}
			else if (ch==3){
				System.out.println("������ ������ : "); String ������=scanner.next();
			for(Book book:booklist) {
				if (book.get������().equals(������))
					booklist.remove(book);break;
				}
			}
			else if (ch==4){
				System.out.println("������ ������ : ");	String ������=scanner.next();
				for(Book book:booklist) {
					if(book.get������().equals(������)) {
						System.out.println("������ ���ڸ� : "); String ����=scanner.next();
						book.set����(����); break;
					}
				}
			}
		}//while
	}//m e 
}
