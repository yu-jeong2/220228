package Day03;

import java.util.Scanner;

public class Day03_6 {//c s
	public static void main(String[] args) {//m s
		Scanner scanner =new  Scanner(System.in);
		
		//별문제1 : 입력받은 수 만큼 * 출력
			System.out.println("문제 1)별 갯수 : "); int s1=scanner.nextInt();
			for(int i=1; i<=s1;i++) {
				//i는 1부터 입력받은수 까지 i는 1씩증가
				System.out.print("*");
			}
	System.out.println("\n---------------------------\n");	
		//별문제2 : 입력받은 수 만큼 *출력[단 5개마다 줄바꿈처리]
			System.out.println("문제 2)별 갯수 : "); int s2=scanner.nextInt();
			for(int i=1; i<=s2;i++) {
				System.out.print("*");
			
			if(i%5 ==0)System.out.println();//줄바꿈처리
			}
	System.out.println("\n---------------------------\n");
		//별문제3 : 입력받은 줄 만큼 출력
			System.out.println("문제3 )줄 수 : "); int s3=scanner.nextInt();
			for(int i=1;i<=s3;i++) {
				//i는 1부터  입력받은 줄 수 까지 1씩증가
				
				//1. 별찍기
				for(int s=1;s<=i;s++) {
					System.out.print("*");
				}
				//2. 줄바꿈처리
				System.out.println();
			}
				//순서도
					//사용자가 3을 입력했을 때
					//i=1 i<=3 [true]
						//s=1부터 1<=1 [true]-> * -> s++
						//s=2일때 2<=1 [false]->반복문 종료
					//줄바꿈
					//i=2 i<3 [true]
						//s=1  s<=1 [true] -> *-> s++
						//s=2  s<=2 [true] -> *-> s++
						//s=3  s<=3 [false] -> 반복문 종료
					//줄바꿈
					//i=3 i<=3 [true]
						//s=1 s<=3 [true]-> * -> s++
						//s=2 s<=3 [true]-> * -> s++
						//s=3 s<=3 [true]-> * -> s++
						//s=4 s<=3 [false]-> 반복문 종료
					//줄바꿈
					//i=4 i<=3[false] -> 반복문 종료
	System.out.println("\n---------------------------\n");
	
			//별문제 4 : 입력받은 줄 만큼 출력
			System.out.println("문제4 )줄 수 : "); int s4=scanner.nextInt();
			for(int i=1;i<=s4;i++) {
				for(int s=1;s<=s4-i+1;s++) {
					System.out.print("*");
				}
				System.out.println();
				}
	
	System.out.println("\n---------------------------\n");				
			
			//별문제 5 :입력받은  줄 만큼 출력
			System.out.println("문제5)줄 수 : "); int s5=scanner.nextInt();
			for(int i=1;i<=s5;i++) {
				//1.공백찍기
				for(int b=1;b<=s5-i;b++) {System.out.print(" ");//공백 입력받은 수-현재줄수 까지 1씩증가
				}//2. 별찍기
					for(int s=1;s<=i;s++) {System.out.print("*");//입력받은수까지 1씩증가
					
				}//줄바꿈
				System.out.println("");
			}
			
			//별문제6 : 입력받은 줄 만큼출력
			System.out.println("문제6) 줄 수 : "); int s6=scanner.nextInt();
			for(int i=1;i<=s6;i++) {//줄
				for(int b=1;b<i;b++) {System.out.print(" ");//공백 : 줄수-1
				}for(int s=1;s<=s6-i+1;s++) {System.out.print("*");//별 : 입력받은 수-현재 줄수까지
				}
				System.out.println("");
			}
		
			//별문제7
			System.out.println("문제7) 줄 수 : "); int s7=scanner.nextInt();
			for( int i = 1 ; i<=s7 ; i++ ) {
				for( int b= 1 ; b<=s7-i ; b++)  {System.out.print(" ");//공백
				}for( int s= 1; s<=i*2-1; s++ )  {System.out.print("*");//별 [를 i 찍으면 숫자로 출력됨]
				}
				System.out.println("");//줄바꿈
			}
			
			//별문제8 : 입력받은 줄만큼 출력 
			System.out.println("문제8) 줄 수 : "); int s8=scanner.nextInt();
			for(int i=1;i<=s8;i++) {
				for(int b=1;b<=s8-i;b++) {System.out.print(" ");
				}for(int s=1;s<=i*2-1;s++) {System.out.print(i);
				}
			System.out.println("");
			}
				
			//별문제9 : 입력받은 줄만큼 출력
			
			System.out.println("문제9) 줄 수 : "); int s9=scanner.nextInt();
			for(int i=1;i<=S9;i++) {
				for(int b=1;b=i*2-1;b++) {System.out.print(" ");
				}for(int s=1;s<=i;s++) {System.out.print("*");
				}
			System.out.println(" ");
			}
				
			
			
}//m e

}//c e
