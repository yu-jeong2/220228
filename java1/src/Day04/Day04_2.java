package Day04;

import java.util.Scanner;

public class Day04_2 {//c s
	public static void main(String[] args) {//m s
		
		//Day01: 입출력
		//Day02: 변수[저장]  연산[계산]
		//Day03: if[제어문] for[반복문]
		
		//자판기 프로그램
			//1. 메뉴판[1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
			//		1.메뉴판에서 제품선택->장바구니에 넣기
			//		2.재고가부족하면 알림(재고부족)
			//2. 초기 재고[제품당10개씩]
			//3. 결제시 금액 입력받아 결제액 만큼 차감 후 잔돈 출력
			//		1. 투입한 금액>결제액. 적으면 [금액부족]
		
		//공통변수[모든 괄호 내에서 사용하는 변수들]
		Scanner scanner=new Scanner(System.in);//1.입력객체
		
		int 콜라=10; int 환타=10;	int 사이다=10;// 2.재고변수
		int 콜라구매수=0; int 환타구매수=0; int 사이다구매수=0; //3. 장바구니
		
		//프로그램의 시작[무한루프]
		while(true){
		System.out.println("메뉴를 고르시오.");
		System.out.println("1. 콜라(300)");
		System.out.println("2. 환타(200)");
		System.out.println("3. 사이다(100)");
		System.out.println("4. 결제");
		System.out.println("-----선택-----");
		int 선택=scanner.nextInt();
		if (선택==1) {
			if(콜라==0) {//콜라 재고가0이면 구매 불가
				System.err.println("알림) 재고가 없습니다.-재고 준비중 ");
				System.out.println("--------------");}
				
			else {//콜라 구매가 있으면
				System.out.println("[[콜라 담았습니다]]");
				System.out.println("--------------");
				콜라구매수++; //장바구니에콜라 담기
				콜라--;//콜라재고 차감
			}	
		}//콜라구매end
		
		else if(선택==2) {
			if(환타==0) {
				System.err.println("알림) 재고가  없습니다.-재고 준비중 ");
				System.out.println("--------------");}
			else {System.out.println("[[환타 담았습니다]]");
				System.out.println("--------------");
			환타구매수++;환타--;
			}
		}//환타구매end
		else if(선택==3) {
		if(사이다==0) {
			System.err.println("알림) 재고가  없습니다.-재고 준비중 ");
			System.out.println("--------------");}
		else {System.out.println("[[사이다 담았습니다]]");
			System.out.println("--------------");
		사이다구매수++;사이다--;
			}
						}//사이다구매end
		else if(선택==4) {System.out.println("----결제 제품목록----");
		System.out.println("제품명\t수량\t금액");
		if(콜라구매수 !=0)System.out.println("콜라\t"+콜라구매수+"\t"+(콜라구매수*300));
		if(환타구매수!=0) System.out.println("환타\t"+환타구매수+"\t"+(환타구매수*200));
		if(사이다구매수!=0) System.out.println("사이다\t"+사이다구매수+"\t"+(사이다구매수*100));
		int 총결제액=(콜라구매수*300)+(사이다구매수*100)+(환타구매수*200);
		System.out.println("제품총 결제액 : "+총결제액+"입니다.");
		System.out.println("--------------");
		System.out.println("1.결제 2.취소"); int 선택2=scanner.nextInt();
		
		if(선택2==1) {//결제
			//1. 금액을 입력받는다.
			//2. 금액이 결제액보다 적으면 결제 불가->금액 재입력
			//금액이 결제액 보다  많으면 결제 성공 -> 장바구니초기화
			while(true) {//무한루프[종료조건 : 결제액보다 금액이  크면]
			System.out.println("금액을 투입하시오.");int 받은돈=scanner.nextInt();//받은돈
			if (받은돈<총결제액) {//결제불가->재입력
				System.err.println("금액이 부족합니다. 다시 금액 투여 해주세요");
			}
			else {//금액이  더 크면
				System.err.println("알림)) 구매 완료. 주문번호 : 0000번");
				환타구매수=0;사이다구매수=0;콜라구매수=0;
				System.err.println("알림)) 잔돈 출력 : "+(받은돈-총결제액)+"원 입니다.");
				break;//while 탈출
			}
			}
		}
		else if(선택2==2) {//취소
			System.out.println("알림 : 구매  목록 모두 지우기");
			for(int i=1;i<=콜라구매수;i++) {//구매수를 재고로 옮기기
				콜라++;콜라구매수=0;
				사이다=+사이다구매수;사이다구매수=0;//구매수초기화
				환타+=환타구매수;환타구매수=0;
			}
		}//취소
			
		else {System.err.println("알림)알 수 없는 행동입니다.");}//그외
		
		}//결제 end
		
		else {System.err.println("알림)알 수 없는 행동입니다.");//sys.err(빨간글씨로출력)
		
		
		}
		}//while 탈출2
			
		
		
		
		
		
		
		
		
		
		
	}//m e

}//c e
