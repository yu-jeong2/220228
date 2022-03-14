package Day09;

public class DmbcellphoneExanple {
	public static void main(String[] args) {
		//Dmbcellphone(서브클래스) 객체 생성
		Dmbcellphone  dmbcellphone= new Dmbcellphone("자바폰","검정",10);
		
		//Cellphone으로부터상속받은 필드 -서브클래스로 만들어진 객체로 슈퍼플래스 내 멤버[필드] 접근
		System.out.println("모델 : "+dmbcellphone.model);
		System.out.println("색상 : "+dmbcellphone.color);
		
		//Dmbcellphone의 필드-  서브클래스로 만들어진 객체로 본인 멤버  접근
		System.out.println("채널 : "+dmbcellphone.channel);
		
		//Cellphone으로부터  상속받은 메소드호출-서브클래스로 만들어진 객체로 슈퍼클래스내 멤버[메소드]접근
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요");
		dmbcellphone.receiveVoice("안녕하세요! 저는홍길동인데요");
		dmbcellphone.sendVoice("아~예 반갑습니다.");
		dmbcellphone.hangUp();
		
		//Dmbcellphone의 메소드 호출- 서브클래스로 만들어진 객체로 본인 멤버접근
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
				
				
	}//m  e
}//c e
