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
	
	public 학생(String name, int 국어, int 영어, int 수학) {
		super();
		this.이름 = name;
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
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get국어() {
		return 국어;
	}
	public void set국어(int 국어) {
		this.국어 = 국어;
	}
	public int get영어() {
		return 영어;
	}
	public void set영어(int 영어) {
		this.영어 = 영어;
	}
	public int get수학() {
		return 수학;
	}
	public void set수학(int 수학) {
		this.수학 = 수학;
	}

	public 학생[] get학생list() {
		return 학생list;
	}

	public void set학생list(학생[] 학생list) {
		this.학생list = 학생list;
	}

	public int get총점() {
		return 총점;
	}

	public void set총점(int 총점) {
		this.총점 = 총점;
	}

	public double get평균() {
		return 평균;
	}

	public void set평균(double 평균) {
		this.평균 = 평균;
	}

	public int get순번() {
		return 순번;
	}

	public void set순번(int 순번) {
		this.순번 = 순번;
	}


	
	

}
