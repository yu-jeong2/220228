package Day09;

public class KumhoTire extends  Tire {//����Ŭ���� extends ����Ŭ����
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
		//����Ŭ���� �� ������ ȣ��[�ڵ����̱�]
	}
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" KumhoTire ���� : "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {System.out.println("*** "+location+"KumhoTire ��ũ***");
		return false;
		}
	}
}
