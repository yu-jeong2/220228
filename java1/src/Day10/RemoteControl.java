package Day10;

public interface RemoteControl {
	
	//멤버[P.348]
	//상수필드 : 고정된데이터
	int MAX_VOLUM=10;//최대소음
	int MIN_VOLUM=0;//최저소음
	//추상메소드-선언O구현X
	int MAX_VOLUME = 0;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolum(int volum);
	//디폴트 메소드 : 선언O구현O
	default void setMute(boolean mute) {
		if(mute) System.out.println("무음 처리합니다.");
		else {System.out.println("무음 해제합니다.");}
	}
	//정적메소드 : 선언O구현O[객체없이 가능]
	static void changeBattery() {
		System.out.println("건전지 교체합니다.");}
	void setVolume(int volume);
	}
