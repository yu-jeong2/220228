package Day09;

public class DmbcellphoneExanple {
	public static void main(String[] args) {
		//Dmbcellphone(����Ŭ����) ��ü ����
		Dmbcellphone  dmbcellphone= new Dmbcellphone("�ڹ���","����",10);
		
		//Cellphone���κ��ͻ�ӹ��� �ʵ� -����Ŭ������ ������� ��ü�� �����÷��� �� ���[�ʵ�] ����
		System.out.println("�� : "+dmbcellphone.model);
		System.out.println("���� : "+dmbcellphone.color);
		
		//Dmbcellphone�� �ʵ�-  ����Ŭ������ ������� ��ü�� ���� ���  ����
		System.out.println("ä�� : "+dmbcellphone.channel);
		
		//Cellphone���κ���  ��ӹ��� �޼ҵ�ȣ��-����Ŭ������ ������� ��ü�� ����Ŭ������ ���[�޼ҵ�]����
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("��������");
		dmbcellphone.receiveVoice("�ȳ��ϼ���! ����ȫ�浿�ε���");
		dmbcellphone.sendVoice("��~�� �ݰ����ϴ�.");
		dmbcellphone.hangUp();
		
		//Dmbcellphone�� �޼ҵ� ȣ��- ����Ŭ������ ������� ��ü�� ���� �������
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
				
				
	}//m  e
}//c e
