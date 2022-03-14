package Day09;

import java.util.Scanner;

public class Day09_6_은행계좌프로그램 {//프론트(뷰)


	//은행 계좌 프로그램[상속]
		//은행[super]
		//국민[sub], 신한[sub], 하나[sub]
		//주 기능: 1.계좌생성 2.입금 3.출금 4.이체 5.내 계좌목록 6.대출
	
	
	//메인 밖에서 선언하는 이유--> 모든 클래스에서 같이 사용하기 위해 static로 선언
	public static 은행[] 계좌리스트=new 은행[100];
	public static void main(String[] args) {//m s
		Scanner scanner =new Scanner(System.in);	
		while(true) {
			System.out.println("-------------계좌 시스템-------------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.계좌목록 6.대출");
			int 선택=scanner.nextInt();
			//컨트롤러 메소드호출용 객체
			은행컨트롤러 컨트롤=new 은행컨트롤러();
			if(선택==1) {
				System.out.println("+++계좌생성 페이지+++");	
				System.out.println("비밀번호 : ");			String 비밀번호=scanner.next();
				System.out.println("예금주 : ");			String 예금주=scanner.next();
				System.out.println("은행선택 : 1.국민 2.신한 3.하나   > "); int 은행번호=scanner.nextInt();
				String 계좌번호 = 컨트롤.계좌생성(비밀번호,예금주,은행번호);//메소드 호출[인수3개]
				//메소드 반환 저장
				//메소드실행 후 메세지 출력
				if(계좌번호!=null) {System.err.println("*** 계좌생성성공 ***");
				System.out.println("고객님의 계좌번호 : "+계좌번호);}
				else {System.err.println("알림))계좌등록 실패[관리자에게 문의]");}
				
			}
			else if(선택==2) {
				System.out.println("+++계좌입금 페이지+++");
				System.out.println("계좌번호 : "); String 계좌번호 = scanner.next();
				System.out.println("입금액 : "); int 입금액 = scanner.nextInt();
				boolean result=컨트롤.입금(계좌번호,입금액);
				if(result) {
					System.out.println("*** 입금 성공 ***");
				}else {
					System.err.println("알림))입금 실패(동일한 계좌가 없습니다.)");
				}
			}//선택2 입금
			else if(선택==3) {
				System.out.println("+++계좌출금 페이지+++");
				System.out.println("계좌번호 : "); String 계좌번호 = scanner.next();
				System.out.println("비밀번호 : "); String 비밀번호 = scanner.next();
				System.out.println("출금액 : "); int 출금액 = scanner.nextInt();
				int result = 컨트롤.출금(계좌번호,비밀번호,출금액);
				if(result==1) {System.err.println("*** 잔액부족 ***");}
				else if(result==2)	{System.out.println("+++ 출금 성공 +++");}
				else if(result==3)	{System.err.println("*** 올바른 정보가 아닙니다. ***");}
			}//선택3 출금
			else if(선택==4) {
				System.out.println("+++계좌이체 페이지+++");
				System.out.println("계좌번호 : "); String 계좌번호 = scanner.next();
				System.out.println("비밀번호 : "); String 비밀번호 = scanner.next();
				System.out.println("이체계좌 : ");String 이체계좌=scanner.next();
				System.out.println("이체금액 : "); int 이체금액 = scanner.nextInt();
				int result =컨트롤.이체(계좌번호,비밀번호,이체계좌,이체금액);
				if (result==1) {System.err.println("*** 잔액 부족 ***");}
				else if(result==2) {System.out.println("+++ 이체 성공 +++");}
				else if(result==3) {System.err.println("알림))일치하는 정보가 없습니다.");}
				else if(result==4) {System.err.println("알림))보내는 계좌 정보가 없습니다.");}
			}//선택4 이체
			else if(선택==5) {
				System.out.println("+++ 내 계좌목록 페이지 +++");
				System.out.println(" 계좌주 : "); String 예금주 = scanner.next();
				은행[] 내계좌목록 = 컨트롤.계좌목록( 예금주 );
				System.out.println(" *** 검색한 예금주 님의 계좌목록 *** ");
				int i = 1;
				for( 은행 temp : 내계좌목록 ) {
					if( temp !=null ) // 공백제외 [ 공백이면 출력오류 발생 ] 
						System.out.println( i+"번 계좌번호 : "+temp.get계좌번호() );
					i++;
				}	
			}//선택5 계좌목록
			else if(선택==6) {
				System.out.println("+++대출 페이지+++");
			}//선택6 대출
			else {System.err.println("알림)) 알 수 없는 번호입니다.");}
		}//while 문  end
	}//m e
}//c e
