package Day02;

import java.util.Scanner;

public class Day02_4 {//c s
	public static void main(String[] args) {//m s
		
	//문제2 : 지폐세기
	//[입력조건]금액
	//[조건] 십만원 부터 백원까지의 개수 새기
	//[출력조건] 예)356700 입력시 십만원 3장, 만원 5장 ... 100원 7개

	Scanner scanner =new Scanner(System.in);
	System.out.println("금액을 입력하시오"); int 금액  = scanner.nextInt();
	System.out.println("십만원 : "+(금액/100000)+"장");
	금액=금액-(금액/100000)*100000;
	System.out.println("만원 : "+(금액/10000)+"장");
	금액-=(금액/10000)*10000;
	System.out.println("천원 : "+(금액/1000)+"장");
	금액-=(금액/1000)*1000;
	System.out.println("백원 : "+(금액/100)+"장");

}//m e
}//c e