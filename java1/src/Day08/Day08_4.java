package Day08;

import java.util.Scanner;
import Day08.Member;

public class Day08_4 {
	
	//모바일 뱅크 프로그램
		//요구사항
		//회원 주요기능 : 1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기
		//주요기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록 7.로그아웃
				//계좌 6자리 숫자
		//설계 : -통장(이름, 계좌번호, 잔액, 비밀번호)
			//	-대출상품(admin??) 빌려간 날짜, 금액,
			//	-회원(Member)
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] member=new Member[1000];
	static Acc[] acc=new Acc[1000];
	
	public static void main(String[] args) {
		Day08_4 mbank = new Day08_4();
		mbank.menu();
	}
	
		void menu() {
			while(true) {//무한반복
				System.out.println("---------모바일 뱅크 프로그램---------");
				System.out.println(" 1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기\n입력 : ");
				int i=scanner.nextInt();
				Member member = new Member();
				if(i==1) {
					Boolean result=member.회원가입();
					if(result)System.err.println("알림))회원가입 성공");
					else System.err.println("알림))회원가입 실패");
				}//if종료
				else if(i==2) {
					String  result = member.로그인();
					if(result==null) {
						System.out.println("알림))동일한 회원정보가 없습니다.");
					}//로그인 실패
					else if(result.equals("admin")) {//2.관리자 메뉴 메소드 호출
						System.out.println("알림))안녕하세요~"+result+"님");
						;
					}//관리자 메뉴 호출
					else {//1. 일반회원 메뉴 메소드 호출
						System.out.println("알림))안녕하세요~"+result+"님");
					}//일반회원 메뉴 메소드 호출

				}//else 2종료
				else if(i==3) {member.아이디찾기();}//else 3종료
				else if(i==4) {member.비밀번호찾기();}//else 4종료
				else {System.err.println("알림))올바르지 못한 접근입니다.");}//else 기타 종료
			}//while 무한반복 종료
		}//void end
		void membermenu(String loginid) {
			while(true) {
			System.out.println("-----------회원 메뉴-----------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록 7.로그아웃\n선택 : ");
			int ch=scanner.nextInt();
				Acc acc = new Acc();
				if(ch==1) {//
					acc.계좌생성();
				}//if 1end
				else if(ch==2){
					acc.입금();
					
				}//else 2end
				else if(ch==3){
					acc.출금();
				}//else 3end
				else if(ch==4){
					acc.계좌이체();
				}
				else if(ch==5) {
					acc.대출();
				}
				else if(ch==6){
					acc.계좌목록();
				}//else 6end
				else if(ch==7){//로그아웃
					return;//일반회원 메소드 종료[로그아웃]
				}//else 7end
				else {System.err.println("알림))알 수 없는 번호 입니다.");	} 
			}//while
		}//회원void
		
	}//c e