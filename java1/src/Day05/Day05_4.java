package Day05;

import java.util.Scanner;

public class Day05_4 { //c s
	public static void main(String[] args) {//m s
		//1.입출력  2.변수/자료형 3.제어/반복 4.제어/반복 5.배열
		
		//도서 대여 프로그램
			//1.배열 변수
				//1. 회원[아이디(중복X),비밀번호]
				//2. 도서[도서명, 도서대여여부(대여가능,대여중), 대여인(ID)]
			//2. 초기메뉴
				//1. 회원가입 2.로그인
					//1.회원가입시 아이디중복체크
			//3. 로그인시메뉴
				//1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
					//1. 도서 검색시 도서명이 일치하면 도서명과 도서대여여부 출력,아니면 없음.
					//2. 도서목록시 모든 도서명  출력
					//3. 도서대여시 도서대여여부가 가능할 때 도서대여처리
					//4. 도서 반납시  본인이  대여 한도서만 반납처리
					//5. 로그아웃
			//4. 로그인시 아이디가 admin이면 관리자메뉴
				//1. 도서등록 2.도서목록 3.도서삭제 4.로그아웃
					//1.도서 등록시 도서명을 입력받아 도서 등록 처리
					//2.도서목록시 모든도서명 출력
					//3.도서삭제시 삭제할 도서명을 입력받아 동일한도서명 삭제[null]
					//4.로그아웃시 초기메뉴로
		
		Scanner scanner = new Scanner(System.in); 
		while(true) {
				
		System.out.println("-------도서대여 관리자 모드--------");
		System.out.println("1. 도서등록 2.도서목록 3.도서삭제 4.로그아웃");
		int 선택 = scanner.nextInt();
	
		String[] booklist=new String[100];
		if (선택==1) {//if 1
			System.out.println("-------도서 등록-------");
			System.out.println("도서명을 입력하시오. : "); String 도서=scanner.next();
			boolean 도서중복=true;
			for(int i=0;i<booklist.length;i++) {
				if(booklist[i][0] !=null&& booklist[i].equals(도서)) {//if 2
					System.err.println("알림))동일한 책이 존재합니다.");
					도서중복=false;
					break;
					}//if2 end
			}//for end
			if(도서중복) {
				for(int i=0;i<booklist.length;i++) {
					if(booklist[i]==null) {
						booklist[i]=도서;
						System.err.println("도서가 등록되었습니다.");
						break;
					}//if end
				
				}//for end
				
			}//if end
		}//if1 end
		else if (선택==2) {
			for(int i=0;i<booklist.length;i++) {
							
				System.out.println("--------도서목록--------");
				System.out.println("번호\t도서목록\t");
				if (booklist[i] !=null) {
				System.out.printf("%d\t%s",i,booklist[i]);
					}//if end
			}//for end
		}//else 2 end
		else if(선택==3) {}
		else if(선택==4) {}
		else {System.err.println("올바르지 못한 방법입니다.");}
		
		
		
	
				
				
		
		
		
		
		
		
		
		}//while end
	}// m e

}//c e