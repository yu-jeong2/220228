package Day07;



public class Book {//����Ŭ����
	
	//1.book
	//�ʵ� : ISBN(������ȣ), ������, �۰�, �����뿩����, �뿩��
	//�޼ҵ� :1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� / 1.������� 2.��������
	
	//1.�ʵ�
	String ISBN;	//ISBN[������ȣ=�ĺ���]
	String bname;	//������
	String bwriter;	//�۰�
	Boolean brental;//�����뿩����
	String mid;		//�뿩��id
	
	//2.������
		//1.�� ������: �޼ҵ�ȣ��� (ctrl+�����̽���)
	public Book() {}//�⺻ ������
		//2.Ǯ������[����ʵ带 �޴� ������]:�������
	
	public Book(String iSBN, String bname, String bwriter, Boolean brental, String mid) {
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	//3.�޼ҵ�
	
		//1.�����˻�
	void �����˻�() {
		System.out.println("------------�����˻� ������------------");
	}//�����˻� ����
		//2.�������
	void �������() {
		System.out.println("------------������� ������------------");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book temp:Day07_5_book.books) {
			if(temp!=null) {
				if(temp.brental)
					System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩����");
				else
					System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩��");
			}
		}//for�� ����
	}//������� ����
		//3.�����뿩
	void �����뿩(String loginid) {
		System.out.println("------------�����뿩 ������------------");
		System.out.println("ISBN : "); String isbn=Day07_5_book.scanner.next();
		int i=0;
		for(Book temp:Day07_5_book.books) {
			//�ӽð�ü(�迭�̸� : �迭 �� 0�� �������ε��� �ϳ��� �ӽ� ��ü ����
			if(temp!=null&&temp.ISBN.equals(isbn)&&temp.brental) {
				if(temp.brental) {
					System.out.println("�˸�))�ش� ������ �뿩�մϴ�.");
					Day07_5_book.books[i].brental=false;
					Day07_5_book.books[i].mid=loginid;
					return;
				}else {
					System.out.println("�˸�)) �ش絵���� �뿩���Դϴ�.");
					return;
				}	
			}
		}System.out.println("�˸�))������ �뿩 ISBN�� �����ϴ�.");
	}//�����뿩 ����
	
		//4.�����ݳ�
	void �����ݳ�(String loginid) {
		System.out.println("------------�����ݳ� ������------------");
		�����뿩���(loginid);
		System.out.println("���� ISBN : ");ISBN=Day07_5_book.scanner.next();
		for(Book temp : Day07_5_book.books) {
			if(temp!=null&&temp.ISBN.equals(ISBN)) {//�Է���isbn�� ������
				if(temp.mid.equals(loginid)) {//�뿩��.id������α���id �����ϸ�
					if(temp.brental) {//�뿩���� �ƴϸ�
						System.out.println("�˸�))���� ������ �뿩���� �ƴմϴ�.");	
					}else {//�뿩���̸�
						System.out.println("�˸�))�ݳ��� �Ϸ��Ͽ����ϴ�.");
						temp.brental=true;//�뿩��->�뿩����
						temp.mid=null;
						return;
					}
				}else {
					System.out.println("�˸�))ȸ������ �뿩�� ������ �ƴմϴ�.");
				}
			}
		}System.err.println("�˸�))������ ���� ISBN�� �����ϴ�.");
	}//�����ݳ� ����
	
		//���� �α��� �� ȸ���� �뿩���� ���� ���[�� �������]
	void �����뿩���(String loginid) {
	System.out.println("------------������� ������------------");
	System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
	for(Book temp:Day07_5_book.books) {
		if(temp!=null&&temp.mid.equals(loginid)) {
			if(temp.brental)
				//������ �����ϸ鼭 �뿩�� id ���� �α��� id�� ������
				System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩��");
		}
	}//for�� ����
}
	
		//5.�������
	void �������() {
		System.out.println("------------������� ������------------");
		//1.�Է¹޾�
		System.out.println("ISBN : "); String ISBN=Day07_5_book.scanner.next();
		System.out.println("������ : ");	String bwriter=Day07_5_book.scanner.next();
		System.out.println("�۰� : ");	String bname=Day07_5_book.scanner.next();
			//�ߺ�üũ
			for(Book temp:Day07_5_book.books) {
				if(temp!=null&&temp.ISBN.equals(ISBN)) {
					System.err.println("�˸�))���� ������� ���� �Դϴ�[��Ͻ���]");
					return;
				}
			}
		Book book=new Book(ISBN, bname,bwriter,true , null);
		//2.��üȸ�� ����
		int i=0;
		for(Book temp:Day07_5_book.books) {
			if(temp==null) {
				Day07_5_book.books[i]=book;
				System.out.println("�˸�))��������� �Ǿ����ϴ�.");
				return;
			}//if����
			i++; // �ε�������
		}//for�� ����
		//3.�迭�� ����[�ֱ�]
		
	}//������� ����
		//6.��������
	void ��������() {
		System.out.println("------------�������� ������------------");
	}//�������� ����
	
	
	
	
}
