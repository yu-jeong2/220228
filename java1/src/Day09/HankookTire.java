package Day09;

public class HankookTire extends Tire {//����Ŭ���� extends ����Ŭ����
	//�ʵ�
	//������
	public HankookTire(String location,int maxRotation) {
		super(location,maxRotation);//super(�μ�1, �μ�2)// ����Ŭ���� ��[�μ�2��]������ȣ��
	}
	//�޼ҵ�
			//ctrl+�����̽���
	@Override//����Ŭ���� �� �޼ҵ� ������[����]
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" HankookTire ���� : "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else{System.out.println("*** "+location+"HankookTire ��ũ***");
		return false;
		}
	}
}
