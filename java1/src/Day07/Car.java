package Day07;

public class Car {
	//Ŭ���� ����
	
	//1. �ʵ�
	int gas;//���� ����
	
	//2. ������
		//������ ������ �⺻������ 
	//3. �޼ҵ�
		//gas�� �ܺηκ��� �޾Ƽ� ���ο� �����ϴ� �޼ҵ� ����
	void setGas(int gas) {//�μ�O ��ȯX
	//����X �޼ҵ��(�μ�1){���κ���=�ܺκ���}
		this.gas=gas;
		//���κ����� �ܺκ����� �̸���  ������ �� �����ϴ� ���!!!
			//this.�ʵ�� : ����(��Ŭ�������� ����)����
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;//���κ����� gas�� 0�̸� false
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;//���κ����� gas�� 0�� �ƴϸ� true
	}
		//3.gas 0�϶����� �����ϴµ� ������ ������ ���� 1�� ���� �޼ҵ�
		//gas 0�̸� �Լ� ����
	void run() {//�μ�X��ȯX
		while(true){//���ѷ���[���� : break, return, ����ġ����]
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�: "+gas+")");
				gas--;//gas���� 1�� ����
			}
			else {
				System.out.println("����ϴ�.(gas�ܷ�: "+gas+")");
				return;//(=break)�ݺ��� Ż��[����]
					   //return �Լ� Ż��[����]
			}
		}
	}
	
}
