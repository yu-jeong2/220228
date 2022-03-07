package Day05;

import java.util.Scanner;

public class Day05_2 { //c s
	public static void main(String[] args) {//m s
		
		//회원제 방문록 프로그램
			//1. 초기메뉴[1. 회원가입. 2.로그인]
				//1. 회원가입 [아이디,비밀번호,이름]
				//2.로그인[아이디, 비밀번호 동일하면 로그인처리]
			//2. 로그인시 메뉴[1. 방문록쓰기 2.로그아웃]
				//1. 방문록 쓰기[제목, 내용, 작성자(로그인된아이디)
				//2. 로그아웃[초기메뉴 돌아가기]
			//회원 100명[id pw nace] 저장하는 배열
		Scanner scanner=new Scanner(System.in);// 입력객체
		String[][] memberlist=new String[100][3];//100행 3열=>[1열=id][2열=pw][3열=이름]
		//방문록 100개[tilte,contents,writer]저장하는 배열
		String[][] boardlist=new String[100][3];
		
		while(true) {//무한루프[종료조건: X]
			System.out.println("----------------------------");
			System.out.println("---------회원제 방문록---------");
			System.out.println("----------------------------");
			System.out.print("1.회원가입        2. 로그인 선택 : "); int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("-----회원가입  페이지-------");
				System.out.println("Member ID : ");		 String id=scanner.next();
				System.out.println("Member Password : ");String pw = scanner.next();
				System.out.println("Member Name : ");	 String name = scanner.next();
				//string 3개변수를 입력받아 memberlist 2차원 배열에저장
					//1. 빈 공간[정수=0,객체(문자열)=null]을 찾아서 저장[빈  공간이  없으면 회원 100명  초과]
				
				//id 중복체크[찾기] 기존회원 id와 동일하면회가입불가
				boolean idcheck=true;
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist[i][0] !=null&& memberlist[i][0].equals(id)) {
						// ==null : 회원X, !=null = 회원O
						System.err.println("알림))동일한 아이디가 존재합니다.");
						idcheck=false;//.회원가입 불가능하게 idchecke변수를 false 변경
						break;
						}//if end
					}//for end
				
				if( idcheck ) {
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist[i][0]==null) {//i번째 행에  id가  없으면 저장=빈  공간
					memberlist[0][0]=id; memberlist[0][1]=pw; memberlist[0][2]=name;
					System.err.println("알림)) 회원가입이 완료 되었습니다.");
					break;//저장 했으면 끝
						}//if end
					}//for end
				}
			}//if end
			else if(ch==2) {
				System.out.println("-----로그인  페이지-------");
				System.out.println("Member ID : ");		 String id=scanner.next();
				System.out.println("Member Password : ");String pw = scanner.next();
				
				boolean loginchecked=false;//로그인  설정 초기값
				//배열 내 데이터가  입력받은 id와 pw가  동일하면  로그인 처리
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist [i][0] !=null&&
							memberlist[i][0].equals(id)&&memberlist[i][1].equals(pw)) {
						//1번째 행에  id와 pass가 입력받은 값과  equals 같으면
							//null은 객체가아니기 때문에 equals가 불가능=> ==
						System.out.println("알림)) 로그인  성공");
						
						loginchecked=true;//로그인 성공 값  저장
				////////////////////////////////////////////////////////////////////////////
						while(true) {//로그인시 메뉴 무한루프[종료 : 로그아웃]
							System.out.println("---------------------");
							System.out.println("--------방문록--------");
							System.out.println("번호\t작성자\t제목\t내용");
								//모든 방문록 출력
							for(int j=0;j<boardlist.length;j++) {
								if (boardlist[j][0] !=null) {//게시물이 없는 인덱스는 제외
								System.out.printf("%d\t%s\t%s\t%s \n",
										j,
										boardlist[j][2],
										boardlist[j][0],
										boardlist[j][1]);
								}
							}//for end
							
							System.out.println("1.방문록남기기   2. 로그아웃 선택 : "); int ch2=scanner.nextInt();
							if(ch2==1) {
								System.out.println("---------글쓰기---------");
								System.out.println("title : "); String title = scanner.next();
								System.out.println("content : ");String content = scanner.next();
								//배열 내 공백 찾아서 저장
								for(int j=0;j<boardlist.length;j++) {
									if (boardlist[j][0]==null) {
										boardlist[j][0]=title;
										boardlist[j][1]=content;
										boardlist[j][2]=id;//로그인시 사용된 id를 대입
										System.err.println("알림))방문록이 작성되었습니다.");
										break;
									}//if end
								}//for end
								
							}//if end
							else if(ch2==2){
								System.err.println("알림))로그아웃");
								break;// 가장 가까운 반복문 탈출
							}
							else {System.err.print("알림))알 수 없는 번호입니다.");}
						}//회원메뉴 while 종료
					//////////////////////////////////////////////////////////////////////////	
						
						
					}//if end= login end
				}//for end
				//로그인 실패시
				if (loginchecked==false)System.err.println("알림))회원정보가 없거나 다릅니다.");
				
			}//ch==2 if end
			else {System.err.println("알림)) 알 수 없는 번호입니다.");}
	
		
		
		}//while 1 end = 초기메뉴end
	}// m e

}//c e