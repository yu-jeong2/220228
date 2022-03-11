package Day08;

public class Day08_1 {//c s
	public static void main(String[] args) {//m s
		
		//p.238 :static
			//정적변수
			//공용적인 데이터=프로그램  전반적으로 사용되는 메모리[필드]
		//* 클래스 내 필드 메소드 접근방법
			//(static 멤버가 아닐 때)1.객체 생성->객체.멤버
				//객체가 생성 될 때 new연산자로 객체 메모리 할당
		Cal cal=new Cal();
		System.out.println("객체를 이용한 멤버 접근 : "+cal.pi);
			//static 멤버일 때 : 클레스명.멤버
				//클레스 로딩 되고 메소드 영역에  static 변수를 저장
		System.out.println("객체없이 멤버 접근 : "+Cal.pi);
		
		double result1=10*10*Cal.pi;
		int result2=Cal.plus(10,5);
		int result3=Cal.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
	}//m e
}//c e
