package Day08;

import Day08.Day08_4;
import Day08.Member;

public class Bank {
	//1.�ʵ�
		//-����(�̸�, ���¹�ȣ, �ܾ�, ��й�ȣ)
	private int bnumber;//������¹�ȣ
	public String password;
	private int bbalance;//�ܾ�
	//2.������
	public Bank() {}

	public Bank(int bnumber, String password, int bbalance) {
		super();
		this.bnumber = bnumber;
		this.password = password;
		this.bbalance = bbalance;
	}

	
	
	
	//3.�޼ҵ�
	
	boolean ���»���(String loginid) { 
		System.out.println("----------- ���»��� ������ -----------");
		System.out.println("���¹�ȣ : ");	int bnumber = Day08_4.scanner.nextInt();
		
		// * ���¹�ȣ �ߺ�üũ
		for(Bank temp : Day08_4.banklist) {
			if(temp != null && temp.bnumber == bnumber) {
				System.err.println("�˸�)���� ������� ���¹�ȣ �Դϴ�.");
				return false;
			} // if e
		} // for e
		
		System.out.println("���� ��й�ȣ : ");	String password = Day08_4.scanner.next();
		
		Bank bank = new Bank(bnumber, password, bbalance);
		
		int i = 0;
		for(Bank temp : Day08_4.banklist) {
			if(temp == null) {
				Day08_4.banklist[i]= bank;
				System.out.println("�˸�)���»��� �Ϸ�");
				return true;
			} // if e
			i++;
		} // for e
		return false;
	} // boolean e
	void �Ա�() {
		System.out.println("----------- �Ա� ������ -----------");
		System.out.println("��й�ȣ�� �Է��ϼ��� : ");String password = Day08_4.scanner.next();
		int i=0;
		for(Bank temp:Day08_4.banklist) {
			if(temp!=null&&temp.password.equals(password)) {
				System.out.println("�Աݾ� : ");	int �Ա� = Day08_4.scanner.nextInt();
				System.out.println("�˸�)" + �Ա� + "�� �ԱݵǾ����ϴ�.");	
				Day08_4.banklist[i].bbalance +=�Ա�;
				System.out.println("�ܾ� : "+Day08_4.banklist[i]);
				return;
			}//if����
			else {
				System.err.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				return;
			}
		
		}
	} // void e
	void ���() {
		System.out.println("----------- ��� ������ -----------");
		System.out.println("��й�ȣ�� �Է��ϼ��� : ");String password = Day08_4.scanner.next();
		int i=0;
		for(Bank temp:Day08_4.banklist) {
			if(temp!=null&&temp.password.equals(password)) {
				System.out.println("��ݾ� : ");	int ��� = Day08_4.scanner.nextInt();
				System.out.println("�˸�)" + ��� + "�� ��ݵǾ����ϴ�.");
				Day08_4.banklist[i].bbalance -=���;
				System.out.println("�ܾ� : "+Day08_4.banklist[i]);
				return;
			}else {
					System.err.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					return;
				}
			}
	}
	void ������ü() {
		System.out.println("----------- ������ü ������ -----------");
		System.out.println("���� ��й�ȣ : ");	String password = Day08_4.scanner.next();
		for(Bank temp:Day08_4.banklist) {
			if(temp!=null&&temp.password.equals(password)) {
			System.out.println("���� ���¸� �Է��ϼ��� : ");
			int Ÿ�ΰ��� = Day08_4.scanner.nextInt();
			for(Bank temp2 : Day08_4.banklist) {
				if(Ÿ�ΰ���==bnumber) {
					System.out.println("�ݾ��� �Է��ϼ��� : ");
					int Ÿ����ü�ݾ� = Day08_4.scanner.nextInt();
					if(Ÿ����ü�ݾ�<=temp.bbalance) {
						temp.bbalance+=Ÿ����ü�ݾ�;
						this.bbalance-=Ÿ����ü�ݾ�;
						return;
					}
				}//if ��
				else {System.err.println("�˸�))���¹�ȣ�� �ٽ� Ȯ�����ּ���");
				break;}
			}//for����
			}
		else {
			System.err.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			break;
		}
		}//for
		}//void
			
		
	void ����() {}
	void ���¸��(String loginid) {
		for(bank temp:Day08_4.banklist) {
			if(temp!=null&&)
		}
		
	}
}
