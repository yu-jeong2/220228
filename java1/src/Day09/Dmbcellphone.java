package Day09;

public class Dmbcellphone extends Callphone{
//����Ŭ������ ����Ŭ�������� =>extends ����Ŭ����
	//1.�ʵ� 
	int channel;
	//2.������
	Dmbcellphone(String model, String color,  int channel){
		this.model=model;
		this.color=color;
		//���� Ŭ���������� �ʵ� �̹Ƿ�  ���۱۷��� �� ���  ȣ��
		this.channel=channel;
	}
	//3.�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��"+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {System.out.println("DMB��� ������ ����ϴ�.");}
}
