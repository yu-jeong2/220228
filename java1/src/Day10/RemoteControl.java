package Day10;

public interface RemoteControl {
	
	//���[P.348]
	//����ʵ� : �����ȵ�����
	int MAX_VOLUM=10;//�ִ����
	int MIN_VOLUM=0;//��������
	//�߻�޼ҵ�-����O����X
	int MAX_VOLUME = 0;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolum(int volum);
	//����Ʈ �޼ҵ� : ����O����O
	default void setMute(boolean mute) {
		if(mute) System.out.println("���� ó���մϴ�.");
		else {System.out.println("���� �����մϴ�.");}
	}
	//�����޼ҵ� : ����O����O[��ü���� ����]
	static void changeBattery() {
		System.out.println("������ ��ü�մϴ�.");}
	void setVolume(int volume);
	}
