package Day03;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Day03_2 {//c s
	public static void main(String[] args) {//m s
		
		Scanner scanner=new Scanner(System.in);
		
		
		//문제  1 : 2개의 정수를 입력받아서 더 큰수를 출력하시오
		
		System.out.println("문제1)정수 1 입력: "); int 정수1=scanner.nextInt();
		System.out.println("문제1)정수 2 입력: "); int 정수2=scanner.nextInt();
		if (정수1>정수2) System.out.println("더 큰 정수는"+정수1);
		else if (정수2>정수1)System.out.println("더 큰 정수는"+정수2);
		else System.out.println("두 수는 같다.");
		
		//문제2 : 3개의 정수를 입력받아서 가장 큰 수 출력
		System.out.println("문제2 : 정수 1 입력"); int 정수3=scanner.nextInt();
		System.out.println("문제2 : 정수 2 입력"); int 정수4=scanner.nextInt();
		System.out.println("문제2 : 정수 3 입력"); int 정수5=scanner.nextInt();
		int max = 정수3; // 가장 큰 수를저장하는 임시 저장, max에 값을 임시저장
		if(max<정수4) {max=정수4;}
			//만약에  max보다 정수4가 더 크면 교체
		if(max<정수5) {max=정수5;}
		System.out.println("가장 큰 수 : "+max);	
		
		//문제3 : 4개의 정수를 입력받아서 가장 큰 수 입력
		System.out.println("문제3 : 정수 1 입력"); int 정수6=scanner.nextInt();
		System.out.println("문제3 : 정수 2 입력"); int 정수7=scanner.nextInt();
		System.out.println("문제3 : 정수 3 입력"); int 정수8=scanner.nextInt();
		System.out.println("문제3 : 정수 4 입력"); int 정수9=scanner.nextInt();
		int max2=정수6;
		if(max2<정수7) {max2=정수7;}
		if(max2<정수8) {max2=정수8;}
		if(max2<정수9) {max2=정수9;}
		System.out.println("가장 큰 수는 : "+max2);
		
		//문제4 : 3개의 정수를 입력받아서 오름차순(내림차순,<)
		
		System.out.println("문제4 : 정수 1 입력"); int 정수10=scanner.nextInt();
		System.out.println("문제4 : 정수 2 입력"); int 정수11=scanner.nextInt();
		System.out.println("문제4 : 정수 3 입력"); int 정수12=scanner.nextInt();
		if(정수10>정수11) {
			//교체[스왑=두개의변수에 값 교체]
			int temp =정수10; //임시변수 = 변수1;
			정수10 = 정수11;// 변수1=변수2;
			정수11=temp;//변수=임시변수;
		}	
		if(정수10>정수12) {int temp=정수10;정수10=정수12;정수12=temp;}
		if(정수11>정수12) {int temp=정수11;정수11=정수12;정수12=temp;}
		System.out.printf("입력한 값 오른차순 : %d %d %d", 정수10,정수11,정수12);
		System.out.println("입력한 값 오른차순 : "+정수10+","+정수11+","+정수12);
		
		
		//문제5 : 4개의 정수를 입력받아서 내림차순
		
		System.out.println("문제5 : 정수 1 입력"); int 정수13=scanner.nextInt();
		System.out.println("문제5 : 정수 2 입력"); int 정수14=scanner.nextInt();
		System.out.println("문제5 : 정수 3 입력"); int 정수15=scanner.nextInt();
		System.out.println("문제5 : 정수 4 입력"); int 정수16=scanner.nextInt();
		if(정수13<정수14) {int temp=정수13;정수13= 정수14;정수14=temp;}	
		if(정수13<정수15) {int temp=정수13;정수13=정수15;정수15=temp;}
		if(정수13<정수16) {int temp=정수13;정수13=정수16;정수16=temp;}
		if(정수14<정수15) {int temp=정수14;정수14=정수15;정수15=temp;}
		if(정수14<정수16) {int temp=정수14;정수14=정수16;정수16=temp;}
		if(정수15<정수16) {int temp=정수15;정수15=정수16;정수16=temp;}
		System.out.printf("입력한 값 내림차순 : %d %d %d %d", 정수13,정수14,정수15,정수16);
		
	
		
		
		
		
		
		
		
	}//m e
}// c e
