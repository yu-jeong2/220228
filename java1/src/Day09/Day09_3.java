package Day09;

public class Day09_3 {
	public static void main(String[] args) {
		//p294-295
			//super(): 부모 클래스 내 빈 생성자 호출: 생략시 자동추가
		//super(인수1,인수2) : 부모  클래스 내 [2개 인수]생성자호출
		//super(인수1,인수2,인수3) : 부모  클래스 내 [3개 인수]생성자호출
			
		//서브클레스로 객체 생성
		Student student=new Student("홍길동", "123456-1234567", 1);
		//서브클래스로 만든 객체로 슈퍼클래스 내 멤버 접근
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);
		
	}
	
	
}
