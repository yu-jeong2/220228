package Day09;

public class Day09_5 {
	public static void main(String[] args) {
		//객체생성-자동차 1대 생성
		Car car = new Car();
			//클래스 내  타이어 객체가 4개->Car 포함
		//메소드 호출
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();//자동차회전 메소드 호출->5번
			switch(problemLocation) { 
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire=new HankookTire("앞왼쪽", 15);
				//슈퍼클래스 객체명=new 서브클래스();
				//상속 받으면 가능!!!!!!!
				break;//switch 탈출
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire=new KumhoTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.frontLeftTire=new HankookTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.frontRightTire=new KumhoTire("뒤오른쪽",17);
				break;
			}//switch end
			System.out.println("----------------------");//1회전시 출력되는내용을 구분
		}//for end
	}//m e
}//c e