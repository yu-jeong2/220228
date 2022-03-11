package Day08;

import Day08.Day08_4;
import Day08.Member;

public class Bank {
	//1.필드
		//-통장(이름, 계좌번호, 잔액, 비밀번호)
	private int bnumber;//통장계좌번호
	public String password;
	private int bbalance;//잔액
	//2.생성자
	public Bank() {}

	public Bank(int bnumber, String password, int bbalance) {
		super();
		this.bnumber = bnumber;
		this.password = password;
		this.bbalance = bbalance;
	}

	
	
	
	//3.메소드
	
	boolean 계좌생성(String loginid) { 
		System.out.println("----------- 계좌생성 페이지 -----------");
		System.out.println("계좌번호 : ");	int bnumber = Day08_4.scanner.nextInt();
		
		// * 계좌번호 중복체크
		for(Bank temp : Day08_4.banklist) {
			if(temp != null && temp.bnumber == bnumber) {
				System.err.println("알림)현재 사용중인 계좌번호 입니다.");
				return false;
			} // if e
		} // for e
		
		System.out.println("통장 비밀번호 : ");	String password = Day08_4.scanner.next();
		
		Bank bank = new Bank(bnumber, password, bbalance);
		
		int i = 0;
		for(Bank temp : Day08_4.banklist) {
			if(temp == null) {
				Day08_4.banklist[i]= bank;
				System.out.println("알림)계좌생성 완료");
				return true;
			} // if e
			i++;
		} // for e
		return false;
	} // boolean e
	void 입금() {
		System.out.println("----------- 입금 페이지 -----------");
		System.out.println("비밀번호를 입력하세요 : ");String password = Day08_4.scanner.next();
		int i=0;
		for(Bank temp:Day08_4.banklist) {
			if(temp!=null&&temp.password.equals(password)) {
				System.out.println("입금액 : ");	int 입금 = Day08_4.scanner.nextInt();
				System.out.println("알림)" + 입금 + "원 입금되었습니다.");	
				Day08_4.banklist[i].bbalance +=입금;
				System.out.println("잔액 : "+Day08_4.banklist[i]);
				return;
			}//if종료
			else {
				System.err.println("비밀번호가 일치하지 않습니다.");
				return;
			}
		
		}
	} // void e
	void 출금() {
		System.out.println("----------- 출금 페이지 -----------");
		System.out.println("비밀번호를 입력하세요 : ");String password = Day08_4.scanner.next();
		int i=0;
		for(Bank temp:Day08_4.banklist) {
			if(temp!=null&&temp.password.equals(password)) {
				System.out.println("출금액 : ");	int 출금 = Day08_4.scanner.nextInt();
				System.out.println("알림)" + 출금 + "원 출금되었습니다.");
				Day08_4.banklist[i].bbalance -=출금;
				System.out.println("잔액 : "+Day08_4.banklist[i]);
				return;
			}else {
					System.err.println("비밀번호가 일치하지 않습니다.");
					return;
				}
			}
	}
	void 계좌이체() {
		System.out.println("----------- 계좌이체 페이지 -----------");
		System.out.println("통장 비밀번호 : ");	String password = Day08_4.scanner.next();
		for(Bank temp:Day08_4.banklist) {
			if(temp!=null&&temp.password.equals(password)) {
			System.out.println("보낼 계좌를 입력하세요 : ");
			int 타인계좌 = Day08_4.scanner.nextInt();
			for(Bank temp2 : Day08_4.banklist) {
				if(타인계좌==bnumber) {
					System.out.println("금액을 입력하세요 : ");
					int 타행이체금액 = Day08_4.scanner.nextInt();
					if(타행이체금액<=temp.bbalance) {
						temp.bbalance+=타행이체금액;
						this.bbalance-=타행이체금액;
						return;
					}
				}//if 종
				else {System.err.println("알림))계좌번호를 다시 확인해주세요");
				break;}
			}//for종료
			}
		else {
			System.err.println("비밀번호가 일치하지 않습니다.");
			break;
		}
		}//for
		}//void
			
		
	void 대출() {}
	void 계좌목록(String loginid) {
		for(bank temp:Day08_4.banklist) {
			if(temp!=null&&)
		}
		
	}
}
