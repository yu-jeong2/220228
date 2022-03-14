package Day09;

public class Day09_4 {
	public static void main(String[] args) {
		
	
	//p294-295
	
	//@Oberride : 재정의
	//동일한 인수의 메소드명 불가능
	//목적 : 동일한메소드를 재정의[수정]
	
	int r=10;//슈퍼클레스로객체생성
	Cal cal=new Cal();
	System.out.println("원 면적 : "+cal.areaCircal(r));
	System.out.println();
	
	//서브클래스로 객체 생성
	Com com=new Com();
	//서브클래스로 만든 객체로 메소드호출
	System.out.println("원면적 : "+com.areaCircal(r));
	//슈퍼클래스와 서브클래스 내 메소드는 다르다
	
	}
}
