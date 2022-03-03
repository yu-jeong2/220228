package Day03;

import java.util.Scanner;

public class Day03_7 {//c s
	public static void main(String[] args) {//m s
		
		//p136.문제
		
		boolean run =true;//실행 여부 변수/true=실행false=종료
		int balance=0;//예금액[통장 안에 있는 금액]변수
		Scanner scanner = new Scanner(System.in);//입력객체
		
		while(run) {//while(조건식)  {  }: 무한루프
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료.");
			System.out.println("------------------------------");
			System.out.print("선택>  ");  int 선택=scanner.nextInt();
			if(선택==1) {//만약에 입력 값이 1이면 실행
				System.out.println("예금액 : "); int 예금액=scanner.nextInt();
				//입력 받은 예금액을 통장에넣기
				balance += 예금액;
			}
			else if(선택==2) {//만약에 입력 값이 2이면 실행
				System.out.println("출금액 : "); int 출금액=scanner.nextInt();
				//입력 받은 출금액을 통장에빼기
				//만약에 출금액이 예금액보다  더 크면 잔액부족, 아니면 출금실행
				if(출금액>balance) {System.out.println("알림)잔액이 부족합니다.");
				//아니면 출금실행
				}
				else{balance-=출금액;}
			}
			else if(선택==3) {//만약에 입력 값이 3이면 실행
				System.out.println("잔고는 : "+balance);
			}
			else if(선택==4) {//만약에 입력 값이 4이면 실행
				
			}else {//그 외
				System.out.println("알림)알 수 없는 번호 입니다");
				
			}
		}// w e
		
		System.out.println("프로그램 종료");		
		
		
	}//m e
}//c e
