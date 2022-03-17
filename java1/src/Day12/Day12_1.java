package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1 {
	public static void main(String[] args) throws IOException {
		
	
	//p.496
		/*
		  - String 클래스
   			- String문자열 클래스
        	1. java.lang 패키지[import]소속
        	2. 객체인데 자동 리터릴[객체가 자동생성]
        	3. 13개의 생성자[문자열, 바이트열 등]
        	
		 */
		
		//바이트->문자 변환 가능 이유
			//1.바이트 => +-127 표현가능
			//2.아스키코드 → 0 or 1 조합된 7자리 → 2의 7승(7자리)->128문자 표현가능
				//아스키코드 -영어/특수문자 1byte , 한글 2byte
		
		//기계어 0 or 1
		//7자리 기계어 : 아스키코드[1000001 → A]
		
		//여러개 바이트 저장할 수 있는 배열 선언
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		//바이트 배열 -> 문자열로 변환 [new String(배열명)
		String str1=new String(bytes); // String 바이트-> 아스키토드 변환
		//호출
		System.out.println("바이트배열->문자열변환 : "+str1);
		
		//특정 위치부터 변환[new ,배열명, 시작인덱스, 갯수]
		String str2=new String(bytes,6,4);
		
		//System.out : 시스템 클래스 내 출력필드
		byte[] bytes2=new byte[100];
		System.out.println(" 입력 : ");//출력필드 내 print 메소드 호출
		int readByteNo=System.in.read(bytes2);
		//외부통신 : 자바프로그램 외[키보드,파일,네트워크 등] 입출력 일반예외
		//키보드에 입력 -> 스트림[통신:바이트] -> 컴퓨터
		//일반예외 ->던지기 or  try catch
		System.out.println("입력받은 바이트: " +Arrays.toString(bytes2));
		String str=new String(bytes2,0,readByteNo-2);// \r\n (읽은바이트수)두개 빼기
		System.out.println("입력받은 바이트-> 문자 : " +str);
				
		//Scanner [system.in 으로 부터 입력받은 바이트를객체에 저장]
		Scanner scanner = new Scanner(System.in);
		scanner.next(); //바이트->문자열 변환
		scanner.nextInt();//바이트->정수열 변환
		scanner.nextDouble();//바이트->실수로 변환
		
		
		
		
	}//m e 
}
