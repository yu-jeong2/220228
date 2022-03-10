package Day07;

public class Cal2 {
	
	
	//1. 필드
	//2.생성자
	//3.메소드
		//- 실행메소드
	void execute() {//인수X반환X
		double result =avg(7,10);
		println("실행결과 : "+result);
	}
		//- 평균메소드
	double  avg(int x,int y) {//인수O반환O
		double sum = plus(x,y);
		double result=sum/2;  return result;
		
	}
		//- 더하기메소드
	int plus(int x, int y) {//인수O반환O
		int result =x+y;return result;
		
	}
		//- 결과출력메소드
	void println(String message) {//인수O반환X
		System.out.println(message);
	}

}
