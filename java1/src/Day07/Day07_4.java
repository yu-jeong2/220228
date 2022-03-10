package Day07;

public class Day07_4 {//c s
	public static void main(String[] args) {//m s
		
		//p.229 : 외부호출
		//객체 선언
		Car2 myCar=new Car2();
		//자동차 시동 걸기
		myCar.keyTurnOn();//인수X반환X
		//자동차 달리기
		myCar.run();//인수X반환X
		//현재 스피드
		int speed=myCar.getSpeed();//인수X반환O
		System.out.println("현재속도 : "+speed+"km/h");
		
		
		
		
		
	}//m e
}//c e
