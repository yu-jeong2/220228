package Day09;

public class Tire {

	//�ʵ�
	public int  maxRotation;//�ִ�ȸ����[ȸ�����ɼ�]
	public int accumulatedRotation;//����ȸ����
	public String location;//Ÿ�̾� ��ġ
		
	//������[��ü �������ʱⰪ]
	public Tire(String location, int maxRocation) {
		this.location=location;
		this.maxRotation=maxRocation;
	}
	//�޼ҵ�
	public boolean roll() {//Ÿ�̾� ȸ�� ���� �޼ҵ�
		accumulatedRotation++;//����ȸ����1 ����// Ÿ�̾�ȸ��
		if(accumulatedRotation<maxRotation){//���࿡ ����ȸ�������ִ� ȸ�������� ������[������]
			System.out.println(location+" Tirl���� : "+(maxRotation-accumulatedRotation)+"ȸ");
			return  true;
		}else {System.out.println("***"+location+"Tire ��ũ ***");
		return  false;
		}
	}
}

