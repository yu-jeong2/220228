package Day08;

public class Per {
	
	//static+final :프로그램 전반적으로 사용되는 상수
	static final double pi=3.14;
	//static :프로그램 전반적에서 사용되는 변수
	static double pi2=3.14;
	//final : 객체 내에서 사용되는 상수
	final double pi3=3.14;
	//1. 필드
	final String nation="Korea";//final고정값
	final String ssn;//final고정값
	String name;
	//2. 생성자
	public Per(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	//3. 메소드
}
