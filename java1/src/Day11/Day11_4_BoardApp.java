package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {
	/*
	 * 비회원게시판 + 댓글 프로그램
	 * 	[m]게시물 클래스
	 * 		번호=인덱스, 제목, 패스워드, 내용, 작성자, 작성일, 조회수
	 * 		각 각 게시물에 대한 댓글리스트/배열
	 * 	[m]댓글 클래스
	 * 		내용, 작성자, 작성일
	 * 	[c]컨트롤러 클래스
	 * 		1.목록 2.쓰기 3.보기 4.수정 5.삭제 6.댓글쓰기 7.게시물저장  8.게시물불러오기 9.댓글저장 10.댓글불러오기
	 * 	[v]Day11_4_BoardApp 클래스
	 * 		입출력[입력받아 컨트롤러에게 입력받은 값 전달]
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Controller.load(); // 2. 파일[ 모든 게시물] 불러오기 
		while(true) {
			try {//예외발생 : 사용자가 문자 입력시 예외발생!!! ->catch 이동
				//모든 게시물 출력
				System.out.printf("%s\t%10s\t%10s\t%10s\t%2s\t \n","번호","제목","작성자","작성일","조회수");
				int i=0; 
				for(Board board:Controller.boardlist) {
					System.out.printf("%2s\t%10s\t%10s\t%10s\t%2s\t \n", i , board.getTitle() ,
							board.getWriter() , board.getDate() , board.getViewcount() );
				i++;}
				System.out.print("1.쓰기 2.보기 선택 : ");int ch=scanner.nextInt();
				if (ch==1) {
					System.out.println("*** 게시물 등록 ***");
					scanner.nextLine();//공백포함 입력가능. 단, nextline 앞 일반next까지 하나로 취급
										//해결방안 : 일반next와 nextline 사이에 의미없는 nextline() 추가하기.
					System.out.println(" 제목 : "); String 제목=scanner.nextLine();
					System.out.println(" 내용 : "); String 내용=scanner.nextLine();
					System.out.println(" 작성자 : "); String 작성자=scanner.next();
					System.out.println(" 비밀번호[수정/삭제시] : "); String 비밀번호=scanner.next();
					Controller.write(제목,내용,작성자,비밀번호);
				}
				else if(ch==2) {
					//해당 게시물 번호[인덱스]를 입력받아 게시물 정보 모두 출력
					System.out.println("게시물 번호 입력 : ");int index=scanner.nextInt();
					Board temp =  Controller.boardlist.get(index);//해당 인덱스의 객체를 임시 객체[코드 줄이기]
					System.out.println("*** 게시물 보기 ***");
					System.out.println("제목 : "+temp.getTitle());
					System.out.println("작성자 : "+temp.getWriter()+"\t작성일 : "+temp.getDate()+"\t조회수 : "+temp.getViewcount());
					System.out.println("내용 : "+temp.getContent());
					System.out.println("");
					System.out.println("1.뒤로가기 2.수정 3.삭제 4.댓글쓰기");//메뉴
					int ch2=scanner.nextInt();
					if(ch2==1) {}
					else if(ch2==2) {
						System.out.println("현 게시물의 비밀번호 : "); String password=scanner.next();
						scanner.nextLine();//일반next  다음으로 nextline가 오면 오류발생.
						System.out.println("변경 제목 : "); String title=scanner.nextLine();
						System.out.println("변경 내용 : ");String content=scanner.nextLine();
						Boolean result = Controller.update(index,password, title, content);//수정할 인덱스 번호, 패스워드, 수정할제목, 수정할내용=>인수
						if(result) System.err.println("알림)) 수정 성공");
						else {System.err.println("알림)) 수정 실패[패스워드가 다릅니다]");}
						
					}//수정
					else if(ch2==3) {
						System.out.println("현 게시물의 비밀번호 : "); String password=scanner.next();
						boolean result = Controller.delete(index,password);
						if(result) System.err.println("알림)) 삭제 성공");
						else {System.err.println("알림)) 삭제 실패[패스워드가 다릅니다]");}
					}//삭제
					else if(ch2==4) {
						Controller.replywrite();//인덱스번호, 댓글내용, 댓글패스워드,댓글작성자=>인수
					}//댓글쓰기
					else {}
					
				}
				else {}
			}catch(Exception e) {
				System.err.println("메세지))사용할 수 없는 입력입니다.");
				scanner =new Scanner(System.in);//다시 메모리 할당[기존내용물 지우기]				
			}//catch end
		}//while end		
	}//m e
}
