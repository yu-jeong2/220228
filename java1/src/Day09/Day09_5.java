package Day09;

public class Day09_5 {
	public static void main(String[] args) {
		//��ü����-�ڵ��� 1�� ����
		Car car = new Car();
			//Ŭ���� ��  Ÿ�̾� ��ü�� 4��->Car ����
		//�޼ҵ� ȣ��
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();//�ڵ���ȸ�� �޼ҵ� ȣ��->5��
			switch(problemLocation) { 
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire=new HankookTire("�տ���", 15);
				//����Ŭ���� ��ü��=new ����Ŭ����();
				//��� ������ ����!!!!!!!
				break;//switch Ż��
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire=new KumhoTire("�տ�����",13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.frontLeftTire=new HankookTire("�ڿ���",14);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.frontRightTire=new KumhoTire("�ڿ�����",17);
				break;
			}//switch end
			System.out.println("----------------------");//1ȸ���� ��µǴ³����� ����
		}//for end
	}//m e
}//c e