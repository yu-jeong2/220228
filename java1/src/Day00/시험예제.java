package Day00;

import java.util.ArrayList;
import java.util.Scanner;

public class 시험예제 {
	/*
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		Scanner  scanner= new Scanner(System.in);
		학생[] 학생list = new 학생[100];
		while(true) {//
		try {
			System.out.println("----------------------------------------");//
			System.out.println("               성    적    표");//
			System.out.println("----------------------------------------");//
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
			
			int i = 0;
			for( 학생 학생  : 학생list ) {
				if( 학생 != null ) {
					System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,학생.get국어(),학생.get수학(),학생.get영어(),학생.get총점(),학생.get평균(),학생.get순번());
				}i++;
			}
			System.out.println("1.학생점수등록 2.학생점수삭제"); int ch=scanner.nextInt();//	
			if(ch==1) {//
				System.out.println("학생 이름 : ");String 이름=scanner.next();
				System.out.println("국어 점수 : ");int 국어=scanner.nextInt();
				System.out.println("영어 점수 : ");int 영어=scanner.nextInt();
				System.out.println("수학 점수 : ");int 수학=scanner.nextInt();
				 int 총점=국어+영어+수학;
				 double 평균=총점/3;
				학생 member = new 학생();
				member.이름=이름;
				member.국어=국어;
				member.영어=영어;
				member.수학=수학;

				int j = 0;
				for( 학생 temp  : 학생list ) { 
					if( temp != null ) { 
						학생list[j] = member; 
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
