package Day11;

import java.awt.Taskbar.State;

public class Day11_3 {
	
	//p.422 예외 던지기
		//목적 : 모든 메소드에서 try{ } catch{ } 사용시 코드 복잡함→한곳으로 예외 이동
	public static void main(String[] args) {
		try {
			findClass();
		}catch(Exception e) { }
		
		try {
			wtithdrar(30000);
		}catch(Exception e){System.out.println(e);}
		
	}//m e
		public static void findClass()throws Exception {
			
//		1.예외던지기[메소드명() throws예외 클레스명]
//			try {//예외가 발생할 것 같은 코드(실행예외) 혹은 일반예외[무조건]
			Class clazz=Class.forName("java.lang.String2");//클래스 찾기 메소드
//			}catch(Exception e) {//예외가 발생하면 실행되는 코드
//				//Exception : 예외클래스 중 슈퍼클래스 이므로 모든 예외를 저장 가능
//				System.out.println(e);
//			}
		}
		
		
		//p.444~445
		public static void wtithdrar(int money) throws Exception{
			if(20000<money) {  
				throw new Exception("잔고부족");
			}
		}
	
}//c e
