package Day08;

public class Day08_3 {
	//p.267~268 : Setter,Getter �޼ҵ�
		//�ʵ�� private ���Ǵ� ��찡 ����.
		//�ܺο��� �ʵ忡 ������ �� ����.
		//���� : �ܺο��� �ʵ忡 �������� �����ϰ� �޼ҵ带 ���� �ʵ�����

	//- Setter �޼ҵ� : �ʵ� ������ ����
	//- Getter �޼ҵ� : �ʵ� ������ ȣ��
	public static void main(String[] args) {
		//��ü ����
		Car myCar=new Car();
		//��ü �� �޼ҵ� ȣ��[setter �޼ҵ�]
		myCar.setSpeed(-50);
		//��ü �� �޼ҵ�ȣ��[getter�޼ҵ�]
		System.out.println("����ӵ� : "+myCar.getSpeed());
		myCar.setSpeed(60);
		System.out.println("����ӵ� : "+myCar.getSpeed());
		//
		if(!myCar.isStop()) {//�������°� �ƴϸ�
			// ! :����������[true->false / false->true]
			myCar.setStop(true);
		}
		System.out.println("����ӵ� : "+myCar.getSpeed());
		
		
	}
}
