package Day09;

public class Callphone {

	//1.�ʵ�
	String model;
	String  color;
	//2.������
	
	//3.�޼ҵ�[void : ��ȯŸ�� ����(return ���� ����)]
	void powerOn(){System.out.println("������ �մϴ�.");}
//��ȯX ��ȯŸ�� �޼ҵ��(�μ�) {�����ڵ�} //�μ�X��ȯX
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell(){System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�ڱ�: "+message);}
//��ȯX ��ȯŸ�� (�μ�) {�����ڵ�} //�μ�O��ȯX	
	void receiveVoice(String message) {System.out.println("���� : "+message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
}
