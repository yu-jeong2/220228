package Day00;

public class 학생 {
	
	//필드
	
	String 이름;
	int 국어;
	int 영어;
	int 수학;
	학생[] 학생list = new 학생[100];
	 int 총점=국어+영어+수학;
	 double 평균=총점/3;
	 int 순번;
	
	
	//생성값
	public 학생() {}
	
	public 학생(String 이름, int 국어, int 영어, int 수학) {
		super();
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
	}

	

	public 학생(String 이름, int 국어, int 영어, int 수학, 학생[] 학생list, int 총점, double 평균, int 순번) {
		super();
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.학생list = 학생list;
		this.총점 = 총점;
		this.평균 = 평균;
		this.순번 = 순번;
	}

	//메소드

}
