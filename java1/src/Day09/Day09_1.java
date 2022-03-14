package Day09;

public class Day09_1 {

/*
	  p.277확인문제
	1. 3 : 하나의 클래스로 여러개 객체 생성 가능
	2. 4 : 로컬변수는 { }내에서 선언
	3. 4 : 반드시X
	4. 3 : 클래스의 멤버 선언 순서는 상관이 없음.
	5. 1
		1. 객체는 생성자X 인스턴스생성자O
		2. this.필드명
			 this.메소드명
			 this() : 빈생성자 호출
			 this(데이터,데이터) : 생성자
	6. void. : 메소드가 종료되면서 반환값이없다.
	4. Override : 동일한  메소드를 재 정의
	7. 2 
	8. 2  Stattic : 정적멤버
		객체없이 클레스를 통해 접근 가능<-------> new객체로 접근
	9. 2   final : 상수[수정불가]
	10. 4  단 이클립스, 인텔리제이같은 에디터는 자동변경
	11. 3  default : 해당 패키지 내부에서만  사용 허가
	12. 필드, 생성자,메소드
		{} 가 있으면 생성자 혹은 메소드
		클레스명과 이름이 동일하면 생성자
		클래스명과 이름이 동일하지 않으면 메소드
	13.
	String name;
	String id;
	String pw;
	int age;
	14. 생성자  선언시 : 클래스 이름 동일
	Member (String name, String id){
		this.name=name;
		this.id=id;
		}
	15.
	매개변수 : 인수=메소드 호출시 메소드로들어오는 데이터
	boolean login(String id,String pw){
	if(id.equals("hong")&& pw.equals("12345)){
		//아이디가 hong이면서 패스워드가 12345이면 true 반환
		 }
		return false;
	}
	**로그아웃	 메소드[반환타입 메소드명(인수1,인수2){ }]
	void logout(String id){
	system.out.print("로그아웃 되었습니다.");
	}
	16.객체를 통한  메소드호출 가능
	//동일한이름으로 메소드를 선언 가능(단 서로 다른 인수[매개변수] 사용)
	void print (int x){//외부로부터 int형 변수를 인수로 받아 출력 소드
		system.out.print(x)
	}
	void print (boolean x){
		system.out.print(x)
	}
	void print (double x){
		system.out.print(x)
	}
	void print (String x){
		system.out.print(x)
	}
	17.객체를 생성하지 않고 메소드를 호출하는 방법
	static void print (int x){//외부로부터 int형 변수를 인수로 받아 출력 소드
		system.out.print(x)
	}
	static void print (boolean x){
		system.out.print(x)
	}
	static void print (double x){
		system.out.print(x)
	}
	static void print (String x){
		system.out.print(x)
	}
	18.
	19. 모바일 뱅크 프로그램[2인 과제]대체
 	
 */
	
}
