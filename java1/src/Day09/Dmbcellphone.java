package Day09;

public class Dmbcellphone extends Callphone{
//서브클래스가 슈퍼클래스선택 =>extends 슈퍼클래스
	//1.필드 
	int channel;
	//2.생성자
	Dmbcellphone(String model, String color,  int channel){
		this.model=model;
		this.color=color;
		//현재 클래스에없는 필드 이므로  슈퍼글래스 내 멤버  호출
		this.channel=channel;
	}
	//3.메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {System.out.println("DMB방송 수신을 멈춥니다.");}
}
