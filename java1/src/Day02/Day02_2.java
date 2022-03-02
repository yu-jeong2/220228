package Day02;

public class Day02_2 {//c s
	public static void main(String[] args) {//m s
		
		//; : 실행 단위 구분
		// 동일한 변수명은 사용할 수 없다.[이름이  중복되면 오류(구분불가)]
	
		
		//p40 byte : 1바이트(정수) +-128
		byte var1 = -128; System.out.println(var1);
		byte var2 = -30;  System.out.println(var2);
		byte var3 = 30;   System.out.println(var3);
		//byte var4 = 300;  System.out.println(var4);
			//오류 발생 : 128이상은 저장할 수 없다.
		byte var4 = 'j'; System.out.println(var4);
		//문자->정수로 변환 / 아스키코드 규칙 
		
	//p43 char : 2바이트[1문자] : 유니코드(2바이트:전세계모든문자)  vs아스키코드(128문자/알파벳+특문)
		char c1= 'a'; System.out.println(c1);
		char c2= 97; System.out.println(c2);   // 10진수 표현: 0~9
		//정수->문자로 변환
		char c3='\u0041'; System.out.println(c3); //16진수
		char c4='가'; System.out.println(c4);
		char c5=44032; System.out.println(c5);
		char c6='\uac00'; System.out.println(c6);
		//진법  - 왜?? : 컴퓨터가2진수만 사용하면  표현단위가 적음-->표현단위 다양성
			//2진수 : 0,1 /기계어(2진코드) / 용량(1비트)
			//8진수 : 0~7 /
			//10진수: 0~9
			//16진수: 0~9 a b c d e f
		
	//p44 short: 2바이트정수+- 3만정도
		short num1=30000; System.out.println(num1);
		//short num2=40000; System.out.println(num2);
			//오류발생, 3만정도 까지만 저장 가능하기 때문
		
	//p45 int :4바이트 정수 +-20억정도(기본타입)
		int num2=10;System.out.println(num2); 	//10진수
		int num3=013;System.out.println(num3);	//8진수앞에 0 붙이기
		int num4=0xc;System.out.println(num4);	//16진수는 앞에 0x붙이기
		
	//p46 long : 8바이트정수 +- 20억 이상[데이터 뒤에 L]
		long num5=10L;System.out.println(num5);
		long num6=10000000000L;System.out.println(num6);
					//int형 -> long형
		
	//p47~48 float[데이터 뒤에 f] : 4바이트 / double(실수 기본타입) : 8바이트
		double num10=3.14;System.out.println(num10);
		float num7=3.14f;System.out.println(num7);
		
		double num8=0.1234567890123456789;System.out.println(num8);//소숫점 이하 17자리까지 표현 가능
		float num9=0.12345678912345678f;System.out.println(num9);  //소숫점 이하 8자리까지 표현 가능
	
	//p48 boolean : 1비트[true 혹은 false]
		// 스위치 : on,off
		boolean bo1=true;System.out.println(bo1);
	
	//p49 타입 변환
		//           -------------자동형변환-------------->>
		//*크기 순서 : byte->short->int->long->float->double
		//           <<-----------강제형변환----------------
		//1.자동 형변환: 작은 상자에서 큰 상자로 이동 가능(반대 불가)
			byte 바이트=10;
			int 인트=바이트;//자동형변환O
			//short 쇼트= 인트;//자동형변환X오류발생
		
		//2.강제 형변환: 큰 상자에서작은 상자로 가능(데이터손실 발생)
			//(변경할자료형)변수명
			short 쇼트=(short)인트;
		
	//자료형 연산시 기본타입(정수끼리 inj, 실수끼리  double)로 변환
			//1. byte+ byte->int
			//2. int+byte  ->int =>int[자동형변환]
			//3. int+float-> int =>float[자동형변환]
			//4. int+double->int =>folat[자동형변환]
		
	}//m e
}//c e
