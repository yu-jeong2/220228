package Day00;

import java.util.Scanner;

public class 시험예문 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
		
		String[] 이름 = new String[100];
		int[][] 점수 = new int[100][4];//[?][0] : 번호/[?][1] : 국어/[?][2] : 영어/[?][3] : 수학
		
		
		while(true) {
			try {
				
				System.out.println("----------------------------------------");
				System.out.println("               성    적    표");//
				System.out.println("----------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				for (int i=0;i<이름.length;i++) {
					if (이름[i]!=null) {
						System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,이름[i],점수[i][1],점수[i][2],점수[i][3],(점수[i][1]+점수[i][2]+점수[i][3]),(점수[i][1]+점수[i][2]+점수[i][3]/3));
						System.out.println("");
					}//if end
					i++;
				}//for end
				System.out.println("1. 학생점수등록   2.학생점수삭제  선택 : "); int ch=scanner.nextInt();
				if(ch==1) {
					System.out.println("번호 점수 : ");int 번호=scanner.nextInt();
					System.out.println("학생 이름 : ");String 학생이름=scanner.next();
					System.out.println("국어 점수 : ");int 국어=scanner.nextInt();
					System.out.println("영어 점수 : ");int 영어=scanner.nextInt();
					System.out.println("수학 점수 : ");int 수학=scanner.nextInt();
					for(int i=0;i<이름.length;i++) {
						if (이름[i]!=null) {
							점수[i][0] = 번호;
							점수[i][1] = 국어;
							점수[i][2] = 영어;
							점수[i][3] = 수학;
							이름[i] = 학생이름;
							System.out.printf("%d\t,%s\t,%d\t,%d\t,%d\t,%d\t,%2f\t,%d\t",i,이름[i],점수[i][1],점수[i][2],점수[i][3],(점수[i][1]+점수[i][2]+점수[i][3]),(점수[i][1]+점수[i][2]+점수[i][3]/3));
							System.out.println("");
							break;
						}i++;
					}//for end
				}//if end
				else if (ch==2){}
				else {
					System.err.println("알 수 없는 동작입니다. 다시 입력해주세요");
				}
			}catch(Exception e){
				System.err.println("알 수 없는 동작입니다. 다시 입력해주세요");
			}			
		}//while end
	}//m e 
}// c e
