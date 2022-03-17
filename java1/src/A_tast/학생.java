package A_tast;

import java.util.Scanner;


public class 학생 {
	
	//생필드
	String 이름;
	int 번호;
	int 국어;
	int 영어;
	int 수학;
	int 총점=국어+수학+영어;
	double 평균=총점/3;
	//풀생성자 필드
	public 학생(String 이름, int 번호, int 국어, int 영어, int 수학, int 총점, double 평균) {
		this.이름 = 이름;
		this.번호 = 번호;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.총점 = 총점;
		this.평균 = 평균;
	}
	//빈생성자
	public 학생() {}
	//입력받을생성자
	public 학생(String 이름, int 번호, int 국어, int 영어, int 수학) {
		super();
		this.이름 = 이름;
		this.번호 = 번호;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
	}
	
	
	//메소드

	

}
