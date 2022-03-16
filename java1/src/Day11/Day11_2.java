package Day11;

public class Day11_2 {
	
	//P.422
		//컴퓨터 하드웨어 문제를 에러[실행 불가능]
		//사용자의 잘못된 조작 혹은, 개발자의  잘못된 코딩의 오류→예외
		//종류 1.일반예외 2.실행예외
			//일반예외 : 컴파일[실행]전에 예외검사 -개발자에게 강제 예외처리(외부통신)
			//실행예외 : 컴파일[실행]후에 예외검사 -개발자 경험으로 판단해서 예외처리
		//예외처리
			//목적 : 에러가발생하면 프로그램은 종료된다.[안정성의 문제 생김]
			//만약에 에러가 발생하면 대체코드가 실행[프로그램 종료되지 않게]
	
	public static void main(String[] args) {
		try {
			String date=null;
			System.out.println(date.toString());//실행 전에는 에러 없다.
			//toString() : object 클래스 메소드 ->객체정보출력
			//에러가 발생하는 이유 : null은 메모리가 없기 때문에[NullPointerException]
			
		}//try end
		catch(NullPointerException 객체명) {
			System.out.println("예외 발생 : "+객체명);
		}
		try {//왠지 예외가 발생할 것 같은 코드
		String[] 배열=new String[2]; //String 2개를 저장할 수 있는 배열 
		배열[0]="a";배열[1]="b";배열[2]="c";//ArrayIndexOutOfBoundsException
		}catch(Exception e) {//만약에 예외가 발생하면 실행되는코드
			System.out.println("예외발생 : "+e);//예외가 발생하면 실행할 코드
		}
		try {
		String date1="100";
		String date2="a100";
		int value1=Integer.parseInt(date1);
		int value2=Integer.parseInt(date2);//NumberFormatException
		//오류 발생 이유 : 문자열 내 숫자형식은 변환이 가능하지만 문자열 내 문자형식 변환이 불가능
		//오류가발생하면 catch이동[오류 발생 이후 코드실행X]
		int result=value1+value2;
		System.out.println(date1+"+"+date2+"="+result);
		}catch(NumberFormatException e) {System.out.println("오류발생 : "+e);}

		String 문자열="유재석";//자바 클래스 중 하나
		Object 슈퍼객체; //자바 클래스 내 최상위 클래스
		슈퍼객체=문자열;  //자식->부모 [가능]
		문자열=(String)슈퍼객체;}//부모->자식[불가능]
			//강제형변환, 실행중에 형변환
		//예외처리 판단
		//입출력 관련 코드[무조건 예외처리]
	
	
	
		
		
	}//m e
}//c e
