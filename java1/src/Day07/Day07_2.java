package Day07;

public class Day07_2 {//c s
	public static void main(String[] args) {//m s
		
		//p.223~224 : ���ϰ��� ������ �޼ҵ�(void)
		
		//1. ��ü ����[�������=�⺻������]
		Car mycar=new Car();
		//2. �޼ҵ� ȣ��[�μ�1��=5]
		mycar.setGas(5);
		
		boolean gasState=mycar.isLeftGas();
		//3. �޼ҵ� ȣ��[�μ�X��ȯ=trueȤ��false]
		if(gasState) {
			System.out.println("����մϴ�.");
		//4.�޼ҵ�ȣ��[�μ�x]
			mycar.run();
			}
		//5.�޼ҵ� ȣ��[�μ�X]
		if(mycar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {System.out.println("gas�� �����ϼ���.");}
	}//m e
}//c e
