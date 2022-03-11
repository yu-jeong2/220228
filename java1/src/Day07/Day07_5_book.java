package Day07;

import java.util.Scanner;

public class Day07_5_book {//프론트, 입출력
	//05_book 클래스 : 입출력 관련 코드
	//book 클래스 : 도서 관련코드
	//Member : 회원 관련 코드
	
	//도서 대여 console 프로그램[클래스버전]
	//1. 클래스 설계(백앤드)
		//1.book
			//필드 : ISBN(도서번호), 도서명, 작가, 도서대여여부, 대여인
			//메소드 :1.도서검색 2.도서목록 3.도서대여 4.도서반납 / 1.도서등록 2.도서삭제
		//2.Member
			//필드 : 번호, 아이디, 비밀번호,이름,연락처
			//메소드 : 1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기
			//관리자메소드 : 1.도서등록 2.도서삭제
	//2. 화면 설계(프론트)
		//1.초기 메뉴[1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기]
		//2.일반회원메뉴[1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃]
		//3.관리자메뉴 [1.도서등록 2.도서목록 3.도서삭제 4.순위(베스트셀러) 5.로그아웃]
	
	//0.코드를 읽어주는시작 메소드[스레드]
	
	//main밖에변수를 선언하는 이유 : 모든 메소드에서 사용하기 위해서
		//지역변수( {변수선언} : 괄호 내에서 선언된 변수는 { }밖으로 못나감.
			//서로 다른 { } 괄호 내에서 사용시 ->전역변수
		//static : 프로그램 시작시 메모리 할당 / 프로그램 종료시에 메모리 삭제
			//프로그램 전반적으로 모든 곳에 사용되는 메모리[변수]
	static Scanner scanner = new Scanner(System.in);//static : 모든 곳에서 객체 없이 사용(호출) 가능
	static Member_2[] member=new Member_2[1000];//모든 파일에서 사용하는 회원 목록 배열
	static Book[] books = new Book[1000];
	public static void main(String[] args) {//m s
		//메소드호출
			//1.내부호출 불가능
				//menu();
				//static : 메모리가 우선할당 이기 때문에 static 외 메소드,필드 못읽음
				//main 메소드 static 메소드 이기때문에 static 메소드만 내부호출 가능
			//2.외부호출
				//1.객체생성->메소드 호출
		
	}//m e
	//1. 초기메뉴 메소드
	
	void menu() {
		while(true) {
			System.out.println("-----------------도서 대여 프로그램-----------------");
			System.out.println("1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기  입력 : ");
			int ch=scanner.nextInt();
			Member_2 member = new Member_2(); // 1~4 {}괄호에서 사용 가능
			if(ch==1) {//회원가입 메소드  호출
				Boolean result=member.회원가입();
				if(result)System.err.println("알림))회원가입 성공");
				else System.err.println("알림))회원가입 실패");
			}//if종료
			else if(ch==2) {//로그인 메소드 호출
				String  result = member.로그인();
				if(result==null) {
					System.out.println("알림))동일한 회원정보가 없습니다.");
				}//로그인 실패
				else if(result.equals("admin")) {//2.관리자 메뉴 메소드 호출
					System.out.println("알림))안녕하세요~"+result+"님");
					adminmenu();
				}//관리자 메뉴 호출
				else {//1. 일반회원 메뉴 메소드 호출
					System.out.println("알림))안녕하세요~"+result+"님");
					membermenu(result);
				}//일반회원 메뉴 메소드 호출
				
			
			
				
			}//else if 2  종료
			else if(ch==3) {//아이디찾기 메소드호출
				member.아이디찾기();
			}//else if 3  종료
			else if(ch==4) {//비밀번호찾기 메소드호출
				member.비밀번호찾기();
			}//else if 4  종료
			else {
				System.err.println("알림))알 수 없는 번호입니다.");
			}//else 종료
		}//while종료
	}//menu void end
		//2. 일반회원 메뉴 메소드
		void membermenu(String loginid) {//인수의 변수 달라도 되지만, 자료형은 동일해야 함.
			while(true) {
			System.out.println("-----------회원 메뉴-----------");
			System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃\n선택 : ");
			int ch=scanner.nextInt();
				Book book = new Book();
				if(ch==1) {//도서검색
					book.도서검색();
					
				}//if 1end
				else if(ch==2){//도서목록
					book.도서목록();
					
				}//else 4end
				else if(ch==3){//도서대여
					book.도서대여(loginid);
				}//else 3end
				else if(ch==4){//도서반납
					book.도서반납(loginid);
				}//else 4end
				else if(ch==5){//로그아웃
					return;//일반회원 메소드 종료[로그아웃]
				}//else 5end
				else {System.err.println("알림))알 수 없는 번호 입니다.");
				}//else end
			}//while end
		}//membermenu void end
		//3. 관리자 메뉴 메소드
		void adminmenu() {
			System.out.println("-----------관리자 메뉴-----------");
			System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃\n선택 : ");
			int ch=scanner.nextInt();
			Book book = new Book();
			if(ch==1) {//도서등록
				book.도서등록();
			}//if 1end
			else if(ch==2){//도서목록
				book.도서목록();
			}//else 4end
			else if(ch==3){//도서삭제
				book.도서삭제();
			}//else 3end
			else if(ch==4){//로그아웃
				return;//일반회원 메소드 종료[로그아웃]
			}//else 4end
			else {System.err.println("알림))알 수 없는 번호 입니다.");
				
			}//else end
			
		}//adminmenu void end

}//c e
