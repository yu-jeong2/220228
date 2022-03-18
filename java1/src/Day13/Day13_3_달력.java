package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_달력 {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("연도 : ");  int year=scanner.nextInt();
		System.out.println("월 : "); int month=scanner.nextInt();
		
		달력( year , month );
	}	
			//달력 메소드 만들기
	
			public static void 달력(int year, int month) {
				while(true) {//종료조건 : 4번
					//1.캘린더 클래스 내 현재 날짜/시간 객체 호출
					Calendar calendar=Calendar.getInstance();//2022년 3월 22일
					//2. 연, 월, 일
//					int year =calendar.get(Calendar.YEAR);
//					int month =calendar.get(Calendar.MONTH)+1;
//					int day=calendar.get(Calendar.DAY_OF_MONTH);
					//해당 월의 1일의 요일 찾기
					//사용자 정의 캘린더 설정
					calendar.set( year , month-1 , 1 );//예) 2022년 3월 1일
					//3월 1일의 요일
					int sweek = calendar.get( Calendar.DAY_OF_WEEK );
					//3월 마지막 날 일
					int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH );
					
					System.out.println("\t     -----"+year+"년 " +month+"월 "+"-----");
					System.out.println("일\t월\t화\t수\t목\t금\t토");
					
					//현재 월 1일의 위치 앞에  공백채우기
					for(int i=1;i<sweek;i++) {//1일 요일(sweek)길이의 배열만큼 공백넣기
							//3월 1일 = 화=3
						System.out.print("\t");
					}
					//1일부터 마지막날까지 출력
					for( int i = 1 ; i<=eday ; i++ ) {
						 // i = 일수 출력
						System.out.print(i+"\t");
						// 토요일마다 줄바꿈처리 [ 토요일=7 ] 요일이 7배수마다
						if( sweek % 7 == 0 ) System.out.println();
						 // 하루씩 요일 증가 
						sweek++;
					}
					//버튼[1.◀(이전달)  2.▶(다음달)  3.다시검색]
				try {
						System.out.print("\n\n1.◀(이전달)  2.▶(다음달)  3.다시검색  4.종료");
						Scanner scanner= new Scanner(System.in); int ch=scanner.nextInt();
						if (ch==1) {month=month-1;
							if(month==0) {month=12; year-=1;}
							}
						else if (ch==2){
							month+=1;
							//만약에 13월이되면 연ㄷ도를 1 증가하고, 월은 다시 1로설정
							if(month==13) {month=1; year+=1;}
						}
						else if (ch==3){
							System.out.println("연도 : ");   year=scanner.nextInt();
							System.out.println("월 : ");  month=scanner.nextInt();}
						else if (ch==4) {System.out.println("달력 프로그램 종료");break;}
						else {System.out.println("알 수 없는 번호입니다.");}
				}catch(Exception e){//만약에 try { }에서 예외가 발생하면 해당 코드가 실행
					System.err.println("정상적인 입력을 해주세요[관리자에게 문의]");}
				}//while
			}//달력 메소드 end
}
