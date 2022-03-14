package Day09;

public class Student extends People{
			//서브클래스 extends 슈퍼클래스
	//생성자
	public int studentNo;//학생번호
	
	//필드
	public Student(String name, String ssn, int studentNo) {
		//부모클래스 내 멤버 필드초기화[값넣기]
		//1. 필드에접근
		//2. 생성자에 접근
		super(name,ssn);
		this.studentNo=studentNo;
	}
	//메소드

}
