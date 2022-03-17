package A_tast;

import java.util.ArrayList;
import java.util.Scanner;

public class 시험예제 {
	/*
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		Scanner  scanner= new Scanner(System.in);
		static 학생[] 학생배열 = new 학생[100];//배열은 동일한 자료명만 저장 가능....?????????? 
		while(true) {//
		try {
			System.out.println("----------------------------------------");//
			System.out.println("               성    적    표");//
			System.out.println("----------------------------------------");//
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
			
			for(int i = 0; i<학생배열.length; i++ ){
				if( 학생배열 != null ) {
					System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,학생배열[i].이름,학생배열[i].국어,학생배열[i].영어,학생배열[i].수학,학생배열[i].총점,학생배열[i].평균,학생배열[i].순번);
				}i++;break;
			}
			System.out.println("1.학생점수등록 2.학생점수삭제"); int ch=scanner.nextInt();//	
			if(ch==1) {//
				System.out.println("번호 점수 : ");int 번호=scanner.nextInt();
				System.out.println("학생 이름 : ");String 이름=scanner.next();
				System.out.println("국어 점수 : ");int 국어=scanner.nextInt();
				System.out.println("영어 점수 : ");int 영어=scanner.nextInt();
				System.out.println("수학 점수 : ");int 수학=scanner.nextInt();
				학생 학생=new 학생(번호,이름,국어,영어,수학);
				 int 총점=국어+영어+수학;
				 double 평균=총점/3;
				 int j = 0 ;
				for(학생 temp:학생배열) {
					if( 학생배열 != null ) { 
						학생배열[j] = 학생; 
						break;
						}//if end
					j++;
				}//for end
				System.out.println("총점 : "+총점);
				System.out.println("평균 : "+평균);

				
			}//if 1 end
			else if(ch==2) {}//else 2  종료//
			else {System.out.println("알림))알 수 없는 동작입니다.");}//
			}catch(Exception e) {System.out.println("알림))알 수 없는 동작입니다.");}//
			
			
			
		}//while end
	}//m e
}
