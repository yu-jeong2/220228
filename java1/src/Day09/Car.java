package Day09;

public class Car {
	
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire=new Tire("뒤왼쪽",3);
	Tire backRightTire=new Tire("뒤오른쪽",3);
	//클래스명 객체명=new 생성자(타이어위치, 타이어수명)
	//생성자
	//메소드
	int run() {//자동차회전[모든타이어 객체가 1씩회전]메소드
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(backLeftTire.roll()==false) {stop();return 3;}
		if(backRightTire.roll()==false) {stop();return 4;}
		//타이어가 회전을 했는데 결과가 false이면  펑크
		//true면 수명 남음
		return 0;//리턴이 0이면 펑크X
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
