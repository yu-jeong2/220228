package Day08;

public class Day08_2 {
	public static void main(String[] args) {
		


	//p.245 : final
	//- 최종적 뜻
	//- 고정값 만들기
	//- 사용되는 방법
	    //1. 필드 호출시
	    //2. 생성자에서 주는 방법
	
	Per p1=new Per("123123-1231234","계백");
	//p1.nation="USA";//final 필드가 아니면 수정가능
	//p1.ssn="343434-343434";//수정 불가능
	p1.name="유재석";//final필드가 아닌 경우 수정 가능
	
	}	
}
