package Day09;

public class Car {
	
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���",6);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backLeftTire=new Tire("�ڿ���",3);
	Tire backRightTire=new Tire("�ڿ�����",3);
	//Ŭ������ ��ü��=new ������(Ÿ�̾���ġ, Ÿ�̾����)
	//������
	//�޼ҵ�
	int run() {//�ڵ���ȸ��[���Ÿ�̾� ��ü�� 1��ȸ��]�޼ҵ�
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(backLeftTire.roll()==false) {stop();return 3;}
		if(backRightTire.roll()==false) {stop();return 4;}
		//Ÿ�̾ ȸ���� �ߴµ� ����� false�̸�  ��ũ
		//true�� ���� ����
		return 0;//������ 0�̸� ��ũX
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
