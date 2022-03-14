package Day06;

import java.util.Scanner;

public class Day06_1 {
	public static void main(String[] args) {
		
		// 회원제 프로그램 [ 클래스 버전 ] 
		
			// 0. 회원 설계 => 회원 클래스 만들기 
				// 1. 필드 
					// 1. 아이디 2.비밀번호 3.이름 4.전화번호
			// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 , 4.비밀번호찾기 ]
				// 1. 회원가입시 입력받아 저장 
				// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리 
				// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력 
				// 4. 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력
		
		Scanner scanner =new Scanner(System.in);
		Member[] memberlist = new Member[100];
		
		while(true) {
			System.out.println("----------회원제[클래스]----------");
			System.out.println("1.회원가입\n2.로그인\n3.아이디찾기\n4.비밀번호찾기\n선택 : ");
			int ch=scanner.nextInt();
			///////////아이디 입력 받기	
			if(ch==1) {
				System.out.println("----------회원가입 페이지----------");
				System.out.println("아이디 : "); String id=scanner.next();
				System.out.println("비밀번호 : "); String pw= scanner.next();
				System.out.println("이름 : ");String name=scanner.next();
				System.out.println("연락처 : ");String phone =scanner.next();
				////////////아이디 Member에 저장하기
				Member member=new Member();
				member.id=id;
				member.pw=pw;
				member.name=name;
				member.phone=phone;
		
				////////////////중복체크	
				boolean idcheck=false;
				for(Member temp:memberlist) {
					if(temp!=null&&temp.id.equals(id)) {
						System.err.println("알림))사용중인 아이디 입니다.[회원가입 실패]");
						idcheck=true;
						break;
					}
				}
		//////memberlist 에 저장하기
				if(idcheck==false) {
					int i =0;
					for(Member temp:memberlist) {
						if(temp==null) {
							memberlist[i]=member;
							System.out.println("알림))회원가입 성공");
							break;
						}
					}i++;
					
				}		
			}
		/////////////2번 로그인	
			else if(ch==2) {
				
				System.out.println("----------로그인 페이지----------");
				System.out.println("아이디 : "); String lid=scanner.next();
				System.out.println("비밀번호 : "); String lpw=scanner.next();
				
		//////////입력받은 값과 기존Member와 비교하기
				 boolean check =false;
				 for(Member temp:memberlist) {
					 if(temp!=null&&temp.id.equals(lid)&&temp.pw.equals(lpw)) {
						 System.err.println("알림))로그인 성공");
						 check=true;
					 }
				 }
				if(check==false) {System.err.println("알림))동일한 회원정보가 없습니다.");}
			}//else 2 로그인 end
			else if(ch==3) {
				System.out.println("----------아이디 찾기----------");
				System.out.println("이름 : "); String name=scanner.next();
				System.out.println("연락처 : "); String phone=scanner.next();
				
				boolean find =false;
				for(Member temp:memberlist) {
					if(temp!=null&&temp.name.equals(name)&&temp.phone.equals(phone)) {
						System.out.println("알림))아이디 찾기 성공!!");
						System.out.println("회원 ID : "+temp.id);
						find=true;
						break;
					}
					if(find==false) {System.err.println("알림))동일한 회원정보가 없습니다.[찾기실패]");}
				}	
			}//else 3 아이디 찾기 end
			else if(ch==4) {
				System.out.println("----------비밀번호 찾기----------");
				System.out.println("아이디 : "); String id=scanner.next();
				System.out.println("연락처 : "); String phone=scanner.next();
				
				boolean find =false;
				for(Member temp:memberlist) {
					if(temp!=null&&temp.id.equals(id)&&temp.phone.equals(phone)) {
						System.out.println("알림))아이디 찾기 성공!!");
						System.out.println("회원 비밀번호 : "+temp.pw);
						find=true;
						break;
					}
					if(find==false) {System.err.println("알림))동일한 회원정보가 없습니다.[찾기실패]");}
				}
			}//else 4 비밀번호 찾기 end
			else {System.err.println(" 알림)) 알수없는 번호입니다.");}//else end
			
		}//while end
	}//m e
}//c e
