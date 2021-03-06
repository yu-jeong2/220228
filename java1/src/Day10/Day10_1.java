package Day10;

public class Day10_1 {
	
	public static void main(String[] args) {
		
		// 인터페이스 [ 추상메소드 ]
			// 목적 : 동일한 목적하에 동일한 기능을 수행
				// 서로 다른 클래스들간의 객체들을 동일한목적으로 조작 
			// 추상 : 선언[O] 정의[X]
				// 인터페이스에서 선언하고 각 클래스들이 구현한다. [ 다형성 ] 
			// 예)  인터페이스 : 방향키 , A버튼 , B버튼
			// 		철권게임 클래스	
					// A버튼 : 공격 
					// B버튼 : 방어 
			//		축구게임 클래스 
					// A버튼 : 슛
					// B버튼 : 방어
		
		// 1. 인터페이스 객체 선언 
		RemoteControl rc;
		//인터페이스명  객체명
		// 2. 인터페이스에 텔레비전클래스 메모리 할당
		rc = new Television();
		// 3. 인터페이스 실행 
		rc.turnOn(); // tv 실행 메소드 
		rc.turnOff(); // tv 종료 메소드 
		rc.setVolume(10); // tv 소음 변경 메소드
		
		rc=new Audio();//오디오로 변경
		System.out.println("오디오로 변경");
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		RemoteControl rc2 = new RemoteControl() {
			//인터페이스명 객체명= new 인터페이스명
			@Override
			public void turnOn() {
				System.out.println("리모콘 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("리모콘 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 소음 : "+ volume);
			}
			
			
		};
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(5);
		
		//디폴트 메소드 호출
		rc2.setMute(true);//인터페이스에서 이미구현되었던 메소드
		RemoteControl.changeBattery();//객체없이
		
		
		//메모리 할당 받는 방법
			//메모리 할당 해야하는 이유 : 외부 클래스/인터페이스 내 필드(저장), 메소드(저장) 사용시
			//1.new 연산자[객체생성]
			//2.static 연산자[전역변수]
		
		
	}

}
