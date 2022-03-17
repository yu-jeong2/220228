package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {
	//차량번호 구분 프로그램
		//조건
			//1. 난수 0000~9999[4자리 문자] 난수 10개 생성해서 배열에 저장
			//2. 모든 차량 번호를 배열에 저장
			//3. 끝자리 번호로 홀/짝 구분
			//4. 차량 끝자리 번호가 홀수인 차량
			//5. 차량 끝자리 번호가 짝수인 차량 출력
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] carlist=new String[10];
		
		while(true) {
			
			System.out.println("**모든차량***");
			for(String temp : carlist) {
				if(temp!=null)System.out.print(temp+"  ");
			}
			//홀수차량번호
			System.out.println("\n***홀수차량***");
			for(String temp : carlist) {
				if(Integer.parseInt(temp)%2==0) {
					System.out.println(temp+"[홀]  ");
				}
			}
			
			//짝수차량번호
			System.out.println("\n***짝수차량***");
			for(String temp : carlist) {
				if(Integer.parseInt(temp)%2==1) {
					System.out.println(temp+"[짝]  ");
				}
			}
			
			System.out.println("1. 차량입차"); int ch=scanner.nextInt();
			Random random =new Random();//랜덤객체
			int intnum=random.nextInt(10000);
			String strnum=String.format("%04d", intnum);
			boolean save=false;
			for(int i=0;i<carlist.length;i++) {
				if(carlist[i]==null) {carlist[i]=strnum;save=true;break;}
			}//만약에 빈 공간이 없으면 만차
			if(save==false)System.err.println("만차[주차불가]");
			
			
			
		}//while
	}//m e 
}//c e
