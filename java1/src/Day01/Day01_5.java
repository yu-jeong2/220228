package Day01;

import java.util.Scanner;

public class Day01_5 { // c s
		public static void main(String[] args) { //m s
		
			// 입력 -> 저장 -> 출력
			// 1. 입력객체 선언
			Scanner scanner = new Scanner(System.in);
			// 2. 입력할 대상 안내
			// 입력 받은 데이터를 다른곳에 저장 [왜??? 사라짐]
				System.out.print("아이디 : ");     String id = scanner.next();
				System.out.print("비밀번호 : ");    String pw = scanner.next();
				System.out.print("성명 : ");      String name = scanner.next();				
				System.out.print("이메일 : ");     String email = scanner.next();
			// 3. 출력
				System.out.println(">>>>회원가입 완료 아래 정보를 확인해주세요<<<<<");
				System.out.println("아이디\t비밀번호\t성명\t이메일");
				System.out.println(id + "\t" + pw + "\t" + name + "\t" + email);
				
				
				
			} // m e
		} // c e
