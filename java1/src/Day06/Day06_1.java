package Day06;

import java.util.Scanner;

public class Day06_1 {//c s
	public static void main(String[] args) {//m s
		
		// 0. 회원가입 => 회원가입
					// 1. 필드
						// 1. 아이디 2.비밀번호 3. 이름 4.전화번호
				// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호 찾기 ]
					// 1. 회원가입시 입력받기
					// 2. 로그인시 아이디와 등록하면 로그인 처리
					// 3. 아이디는 이름과 아이디가 동일하다
					// 4. 붙은 아이디와 전화번호가 붙은 시간
		
		Scanner scanner =new Scanner(System.in);
		Member[] memberlist = new Member[100];
		while(true) {
			System.out.println("------회원가입(클래스)------");
			System.out.println("1.회원가입  2.로그인  3.아이디찾기  4.비밀번호찾기"); int ch=scanner.nextInt();
			if(ch==1) {
				System.out.println("------[회원가입]------");
				System.out.println("아이디 입력 : "); String id=scanner.next();
				System.out.println("비밀번호 입력 : "); String pw=scanner.next();
				System.out.println("이름 입력 : "); String name=scanner.next();
				System.out.println("연락처 입력 : "); String phone=scanner.next();
				System.err.println("알림)) 회원가입이 완료되었습니다.");
				
				Member member = new Member();
				member.id=id;
				member.pw=pw;
				member.name=name;
				member.phone=phone;
				
				
				
			
				boolean check=(false);
				for(Member temp:memberlist) {
					if(temp !=null && temp.id.equals(id)) {
					System.err.println("알림))사용중인 아이디 입니다. [회원가입 실패]");
					check= true;
					break;
					}//if end 중복체크
				}
				if(check==false) {
					int i=0;
					for(Member temp:memberlist) {
						if(temp==null) {
							memberlist[i]=member;
							System.err.println("알림))회원가입 성공!!");
							break;
						}//if 종료
						i++;
					}//for 종료
				
				}//for문종료
			}//if 1. 회원가입
			else if(ch==2) {
				System.out.println("---------로그인 페이지---------");
				System.out.println("아이디 : "); String id=scanner.next();
				System.out.println("비밀번호 : "); String pw=scanner.next();
				boolean check=(false);
				for(member temp : memberlist) {
					if(temp!=null&&temp.name.eqals(id)&&temp.pw.eqals(pw)) {
						System.out.println("알림))로그인 성공");
						check=true;
					}//if문 종료
				}//포문 종료
				if (check==false) {
					System.err.println("알림)) 동일한 정보가 없습니다.");
				}//로그인 실패, if종료
			}//2.로그인
			else if(ch==3) {
				System.out.println("-------아이디 찾기-------");
				System.out.println("이름 : "); String name = scanner.next();
				System.out.println("연락처 : "); String phone = scanner.next();
				boolean find=false;
				for(member temp : memberlist) {
					if(temp!=null&&temp.name.eqals(name)&&temp.pw.eqals(phone)) {
					System.out.println("알림))아이디 찾기 성공");
					System.out.println("회원 ID : "+temp.id);
					find=true;
					break;
					}//if종료				}
				}//for문종료
				if(find==false) {
					
					System.out.println("알림))동일한 회원 정보가 없습니다.[찾기 실패]");
					}
			}//3.아이디찾기
			else if(ch==4) {
				System.out.println("-------비밀번호 찾기-------");
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("연락처 : "); String phone = scanner.next();
				boolean find=false;
				for(member temp : memberlist) {
					if(temp!=null&&temp.name.eqals(id)&&temp.pw.eqals(phone)) {
					System.out.println("알림))비밀번호 찾기 성공");
					System.out.println("회원 ID : "+temp.pw);
					find=true;
					break;
						}//if종료
				}//for문종료
				if(find==false) {
					System.out.println("알림))동일한 회원 정보가 없습니다.[찾기 실패]");
					}
			}//4.비밀번호 찾기
			else {
				System.out.println("알림))잘못 누르셨습니다. ");
				}//오류
		}//while문 종료
	}//m e
}//c e
