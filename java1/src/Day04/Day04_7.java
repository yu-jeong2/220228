package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_7 {//c s
	public static void main(String[] args) {//m s
		//삼목게임[틱텍토 게임]
			//1.9칸생성
				//1.STRING[]배열=newString[9]
			//2.사용자에게 0~8 인덱스 입력 받기
				//1. 해당 인덱스애 O표시
				//2. 이미 둔 자리는 재 입력
			//3.컴퓨터는 0~8 사이 난수 발생
				//1. 해당 인덱스에 X표시
				//2. 이미 둔 자리는 재 난수 생성
			//4. 승리 판단
				//가로 인덱스 모양이 모두 동일하면  012,345,678
				//세로 인덱스 모양이 모두 동일하면  036,147,258
				//대각선 인덱스 모양이 모두 동일하면 48,246
		Scanner scanner=new Scanner(System.in);//1. 입력객체
		String[]게임판= {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};//String 객체 9개 생성
		String 승리알 = "";//3목이 되었을 때 사용할 변수
		
		//게임실행
		while(true) {//무한루프종료조건 1.9칸모두 알이 있을 경우  2.승리자가 있을 때
			//게임판 출력[배열 내 모든 인덱스  출력]
			//////////////////////////////게임판 출력//////////////////////////////////
			for(int i=0;i<게임판.length;i++) {
				System.out.print(게임판[i]);
				//배수찾기 : 값%수==0
				if( i%3==2)// 인덱스는 0부터 시작. 
					{System.out.println();}
			/////////////////////////////플레이어 위치 인덱스///////////////////////////////////////
		//1. 플레이어 위치 선택(인덱스)
		while (true) {
			System.out.println("위치 선택 : "); int 위치=scanner.nextInt();
			if(게임판[위치].equals("[ ]"))//선택한 위치가 공백이면 알 두기
			{게임판[위치]="[O]";
			break;}//가장 가까운 반복문 탈출;
			else {
			System.err.println("알림))해당 위치에 이미 알이 존재합니다.");}
		}//정상입력 while end
		/////////////////////////////컴퓨터 난수(인덱스) 선택/////////////////////////////
		
		while(true) {
			Random random=new Random();//1.난수 객체 생성
			int 위치=random.nextInt(9);//2. 0~8 사이의 난수 int형으로 가져오기
			if(게임판[위치].equals("[ ]")) {//3. 해당 난수 위치에 공백이면 X 알두기
				게임판[위치]="[X]";break;	}
			
		}//컴퓨터난수while end[난수가 공백 위치를 생성했을 경우 break;]
		/////////////////////////////////////승리판단///////////////////////////////////
		//1.가로로 이기는수 012 345 678
//		if(게임판[0].equals(게임판[1])&&게임판[1].equals(게임판[2])) {}
//		if(게임판[3].equals(게임판[4])&&게임판[4].equals(게임판[5])) {}	
//		if(게임판[6].equals(게임판[7])&&게임판[7].equals(게임판[8])) {}
		
		for(int i=0;i<=6;i+=3) {
			//i는 0부터 3씩증가->0 3 6->3회
			if(게임판[i].equals(게임판[i+1])&&(게임판[i+1]).equals(게임판[i+2])) {
				//0인덱스==1인덱스 이면서 1 3인덱스==2
			
			승리알 = 게임판[i];}//동일한  알을 승리알  변수에 대입
		}
		//2. 세로로 이기는 수 036 147 258
		for(int i=0;i<=2;i++) {//i는 0부터 2까지1씩증가->
			if(게임판[i].equals(게임판[i+3])&&(게임판[i+3]).equals(게임판[i+6])) {
			승리알=게임판[i];}
		}//for  end
		//3. 대각선으로 이기는 수 048 246
		if(게임판[0].equals(게임판[4])&&게임판[4].equals(게임판[8])) 
		{승리알=게임판[0];}//if end
		if(게임판[2].equals(게임판[4])&&게임판[4].equals(게임판[6]))
		{승리알=게임판[2];}//if end
		
		
		
		
		/////////////////////////////게임종료////////////////////////////////
		if(승리알.equals("[X]")) {System.out.println("알림)) 컴퓨터 승리");break;}//게임종료
		
		if(승리알.equals("[O]")) {System.out.println("알림)) 플레이어  승리");break;}//게임종료
		
		}//game while end
		//////////////////////////////게임판 출력//////////////////////////////////	
			for(int i=0;i<게임판.length;i++) {
				System.out.print(게임판[i]);
				//배수찾기 : 값%수==0
				if( i%3==2)// 인덱스는 0부터 시작. 
					{System.out.println();}		
	}//m e
}//c e
