package Day09;

public class Callphone {

	//1.필드
	String model;
	String  color;
	//2.생성자
	
	//3.메소드[void : 반환타입 없다(return 생략 가능)]
	void powerOn(){System.out.println("전원을 켭니다.");}
//반환X 반환타입 메소드명(인수) {실행코드} //인수X반환X
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell(){System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기: "+message);}
//반환X 반환타입 (인수) {실행코드} //인수O반환X	
	void receiveVoice(String message) {System.out.println("상대방 : "+message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
}
