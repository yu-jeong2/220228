package Day07;

public class Car2 {
	
	//1.�ʵ�
	int speed;
	
	//2.������
		//������ �⺻ ������ �߰�
	//3.�޼ҵ�
		//1.���� �ʵ尪�� ��ȯ���ִ� �޼ҵ�
	int getSpeed() {//�μ�X��ȯO
		return speed;
	}
		//2.��¸޼ҵ�
	void  keyTurnOn() {//�μ�X��ȯX
		System.out.println("Ű�� �����ϴ�.");
	}
		//3.���ǵ� ���� �޼ҵ�[�ִ� 50����10�� ���� �ݺ�]
	void run() {//�μ�X��ȯX
		for(int i=10;i<=50;i+=10) {
			//i�� 10���� 50���� 10�� �����ϸ� �ݺ�->5ȸ
			speed=i;//i�� �ʵ忡 ����
			System.out.println("�޸��ϴ� (�ü� : "+speed+")");	
		}
		
	}

}
