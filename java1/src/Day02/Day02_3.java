package Day02;

import java.util.Scanner;

public class Day02_3 { //c s
	public static void main(String[] args) {//m s
		
		//문제1 : 급여계산
			//[입력조건]기본급, 수당
			//[조건]실수령액=기본급+수당-세금[기본급10%]
			//[출력조건]실수령액 출력
		
		
	
		// 1. 입력 객체를 만든다.
		Scanner scanner = new Scanner(System.in);
		// 2. 입력 받을 값을 변수에  저장한다.[입력객체는 입력 받을 때마다 기존 데이터가 사라짐]
		System.out.println("기본급을 입력하시오");
		int 기본급 = scanner.nextInt();//입력객체명.next() : int형 정수빼오기
		System.out.println("수당을 입력하시오");
		int 수당 = scanner.nextInt();
		// 3. 변수를 연산(계산) 한다.
		int 세금 =(int)(기본급*0.1);//int*double 후에 int형으로변환
		int 실수령액 = 기본급 + 수당-세금; //100%:1 10%:0.1
		// 4. 출력한다.
		System.out.println("회원님의 실수령액 : "+ 실수령액);
							//      문자열    + 변수명(변수 내 데이터 호출)
							//  +  : 1.연결연산자 기능 2. 더하기 기능
		
		

	}

	private static void next() {
		// TODO Auto-generated method stub
		
	} //m e
}//c e
