package Day08;

import Day08.Day08_4;

public class Member {

	//�ʵ�
	private String id;
	private String pw;
	private String name;
	private String phone;
	private int Acc;
	
	//2.������
			
	public Member() {}//�ʵ�0�� �� ������[�޼ҵ�ȣ��� ��뿹��]



	
	public Member(String id, String pw, String name, String phone, int acc) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		Acc = acc;
	}




	public Member(String id, String pw, String name, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}




	//�ʵ�4�� Ǯ ������[���ȸ������ ȣ��� ��뿹��]
	
	
	boolean ȸ������() {
		System.out.println("---------ȸ������ ������---------");
		System.out.println("���̵� : ");	String id =Day08_4.scanner.next();
		for(Member temp : Day08_4.member){
			if(temp!=null&&temp.id.equals(id)) {
				System.err.println("�˸�))��� ���� ���̵� �Դϴ�.");
				return false;
			}//if�� ����
		}//for������
		System.out.println("��й�ȣ : ");	String pw =Day08_4.scanner.next();
		System.out.println("�̸� : ");	String name=Day08_4.scanner.next();
		System.out.println("����ó : ");	String phone=Day08_4.scanner.next();
		Member member=new Member(id,pw,name,phone);
		int i=0;
		for(Member temp:Day08_4.member) {
			if(temp==null) {
				Day08_4.member[i]=member;
				return true;
			}//if����
			i++;
		}//for����
		return false;
	}//bool end
	String �α���() {
		System.out.println("---------�α��� ������---------");
		System.out.println("���̵� : ");	String id=Day08_4.scanner.next();
		System.out.println("��й�ȣ : ");	String pw=Day08_4.scanner.next();
		for(Member temp:Day08_4.member) {
			if(temp!=null&&temp.id.equals(id)&&
					temp.pw.equals(pw)) {
				return temp.id;
			}//if����
		}//for������
		return null;//���н� null��ȯ
	}		
	void ���̵�ã��() {
		System.out.println("---------���̵� ã�� ������---------");
		System.out.println("�̸� : ");	String name=Day08_4.scanner.next();
		System.out.println("����ó : ");	String phone=Day08_4.scanner.next();
		for(Member temp:Day08_4.member) {
			if(temp!=null&&temp.name.equals(name)&&
					temp.phone.equals(phone)) {
				System.out.println("ȸ������ ���̵� : "+temp.id);
				return;
			}//if����
			System.out.println("�˸�))��ġ�ϴ� ȸ���� �����ϴ�.");
			return;
		}//for������
		
	}
	void ��й�ȣã��() {
		System.out.println("---------��й�ȣ ã�� ������---------");
		System.out.println("���̵� : ");	String id=Day08_4.scanner.next();
		System.out.println("����ó : ");	String phone=Day08_4.scanner.next();
		for(Member temp:Day08_4.member) {
			if(temp!=null&&temp.id.equals(id)&&
					temp.phone.equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ : "+temp.pw);
				return;//������ ���� ã������ �ش� �޼ҵ� ����
			}
			System.out.println("�˸�))��ġ�ϴ� ȸ���� �����ϴ�.");
		}
		
	}
	
				
}//08_4 e
	