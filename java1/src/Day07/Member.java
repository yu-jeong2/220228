package Day07;

import java.util.Scanner;

public class Member {//���Ŭ����
	//1.�ʵ�
	int mno;		//ȸ����ȣ[�ڵ���ȣ,�ߺ�X]
	String id;		//���̵�[�ߺ�X]
	String pw;		//��й�ȣ
	String name; 	//�̸�
	String Phone;	//����ó
	//2.������[�����ڸ�==Ŭ������]
		//1.�� ������[�⺻������] : �޼ҵ�ȣ��� ��ü ������
	public Member() {}
		//2.��� �ʵ带 �޴� ������ : ȸ�����Կ� ��ü ������
	public Member(int mno, String id, String pw, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		Phone = phone;
	}
	//3.�޼ҵ�
		//1.ȸ������ �޼ҵ�[�μ�X��ȯO] : ���Լ���True/���Խ���false
	boolean ȸ������() {
		System.out.println("-----------------ȸ������ ������-----------------");
		//1. �Է¹޴´�[id,pw,name,phone]
		System.out.println("���̵� : ");	String id = Day07_5_book.scanner.next();
		//���̵��ߺ�üũ
		for(Member temp : Day07_5_book.member) {//���̵��ߺ�üũ
			if(temp!=null&&temp.id.equals(id)) {
				System.err.println("�˸�))��� ���� ���̵� �Դϴ�.");
				return false;//���̵� �ߺ��Ǿ��� ������ ���Խ���
			}//if�� ����
		}//for������
		System.out.println("��й�ȣ : ");	String pw = Day07_5_book.scanner.next();
		System.out.println("�̸� : ");	String name=Day07_5_book.scanner.next();
		System.out.println("����ó : ");	String phone=Day07_5_book.scanner.next();
			//scanner ��ü�� �ٸ� Ŭ���� �� static ����Ǿ�����.// Ŭ������.�ʵ��.�Լ���();
			//static �ʵ�,�޼ҵ��  ��ü���� ȣ�� ����[Ŭ������.�ʵ��/�޼ҵ��]
		
			
			//ȸ����ȣ �ڵ� ����[������ ȸ��(���� �ֱٿ� ������ȸ���� ��ȣ)�� ȸ����ȣ+1]
			int bno=0;//ȸ����ȣ  �����ϴ� ����
			int j=0;//�ε���
			for(Member temp:Day07_5_book.member) {
				if(temp==null) {//nullã��[nullã���� �� null-1=������ȸ��]
					if(j==0) {
						bno=1;//ù��° �ε����� null=>ùȸ��=>1���� ����
						break;//������
					}else {bno=Day07_5_book.member[j-1].mno+1;//if����2
										//null ��[������ȸ��]��ȣ�� +1
						break;
					}
				}//if ����
				j++;
			}//for������
		
		
		//2. 4������->��üȭ->1���� ����
		Member member=new Member(0,id,pw,name,phone);//��� �ʵ带 �޴� �����ڷ� ��ü����
		int i=0;
		//3. �迭 �� �� ������ ã�Ƽ� ���ο� ȸ��[��ü]�ֱ�
		for(Member temp:Day07_5_book.member) {
			if(temp==null) {
				Day07_5_book.member[i]=member;
				System.out.println(" �˸�)) ȸ������ ȸ����ȣ : " + bno);
				return true;//�� �ε����� ���ο� ȸ�� ����
			}//if����
			i++;
		}//for����
		return false;
		//4. ���� ������ true, ��ȯ ���н�false ��ȯ
		
	}//boolean ����
			
		//2.�α��� �޼ҵ�[�μ�X��ȯO] �α��μ����� ���̵��ȯ, ���н� null��ȯ
	String �α���() {
		System.out.println("-----------------�α��� ������-----------------");
		//1. �Է¹ޱ�
		System.out.println("���̵� : ");	String id=Day07_5_book.scanner.next();
		System.out.println("��й�ȣ : ");	String pw=Day07_5_book.scanner.next();
		//2.�迭 �� ��ü id�� pw�� �Է��� ���� �����ϸ�
		for(Member temp:Day07_5_book.member) {
			if(temp!=null&&temp.id.equals(id)&&
					temp.pw.equals(pw)) {
				return temp.id;
			}//if����
		}//for������
		return null;//���н� null��ȯ
	}//�α��� ����
		//3.���̵� ã�� �޼ҵ�[�μ�X��ȯX]
	void ���̵�ã��() {
		System.out.println("-----------------���̵� ã�� ������-----------------");
		//1. �Է¹ޱ�
		System.out.println("�̸� : ");	String name=Day07_5_book.scanner.next();
		System.out.println("����ó : ");	String phone=Day07_5_book.scanner.next();
		//2.�Է¹��� ���� �迭�� ã��
		for(Member temp:Day07_5_book.member) {
			if(temp!=null&&temp.name.equals(name)&&
					temp.Phone.equals(phone)) {
				//������ �ƴϸ鼭 �ش� ��ü �� name,phone �� �Է¹��� ���� �����ϸ�
				System.out.println("ȸ������ ���̵� : "+temp.id);//ã�� id �ȳ�
				return;//������ ���� ã������ �ش� �޼ҵ� ����
			}//if����
			//3.ã������ ã�� ���̵� ����ϰ� ��ã������ ���� ���
			System.out.println("�˸�))��ġ�ϴ� ȸ���� �����ϴ�.");
		}//for������
		return;//���н� null��ȯ
	}//���̵�ã��
		//4.��й�ȣ ã�� �޼ҵ�[�μ�X��ȯX]
	void ��й�ȣã��() {
		System.out.println("-----------------��й�ȣ ã�� ������-----------------");
		System.out.println("���̵� : ");	String id=Day07_5_book.scanner.next();
		System.out.println("����ó : ");	String phone=Day07_5_book.scanner.next();
		for(Member temp:Day07_5_book.member) {
			if(temp!=null&&temp.id.equals(id)&&
					temp.Phone.equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ : "+temp.pw);
				return;//������ ���� ã������ �ش� �޼ҵ� ����
			}
			System.out.println("�˸�))��ġ�ϴ� ȸ���� �����ϴ�.");
			return;
		}
		
	}//��й�ȣã��
		//5.ȸ��Ż�� �޼ҵ�
		//6.ȸ������ �޼ҵ�
	
	
}
