package Day13;

import java.util.Random;

public class Day13_1 {
	public static void main(String[] args) {
		//p. 534 : MathŬ����(java.lang��Ű��)[���а��� �޼ҵ� ����] :��ü���� ��� ����
		System.out.println("���밪 : "+Math.abs(-5));//���밪
		System.out.println("���밪 : "+Math.abs(-3.14));//���밪
		
		System.out.println("�ø��� : "+Math.ceil(5.3));//�ø� : �Ҽ��� ù°�ڸ����� �ø�.
		System.out.println("�ø��� : "+Math.ceil(-5.3));//�ø�[-5]
		
		System.out.println("������ : "+Math.floor(5.3));//����
		System.out.println("������ : "+Math.floor(-5.3));//����[-6]
		
		System.out.println("�ִ밪 : "+Math.max(5, 9));//�ִ밪(�� ���� �� ū �� ��)
		System.out.println("�ִ밪 : "+Math.max(5.3,2.5));//�ִ밪(�� ���� �� ū �� ��)
		
		System.out.println("�ּҰ� : "+Math.min(5, 9));//�ּҰ�(�� ���� �� ���� �� ��)
		System.out.println("�ּҰ� : "+Math.min(5.3, 3.5));
		
		System.out.println("���� : "+Math.random());//0~1�����ǳ��� �߻�
		
		System.out.println("����� ������ �Ǽ��� : "+Math.rint(5.3));//����� ������ �Ǽ��� ���ϱ�(�ݿø�)
		System.out.println("����� ������ �Ǽ��� : "+Math.rint(5.7));
		
		System.out.println("����� ������ ������ : "+Math.round(5.3));//����� ������ ������
		System.out.println("����� ������ ������ : "+Math.round(5.7));//����� ������ ������
		
		//Ư�� �Ҽ��� ��ġ���� �ݿø�
		double value=12.3456;//�Ҽ� ��°�ڸ����� �ݿø��ϱ�
		double temp1=value*100;//1234.56
		long temp2=Math.round(temp1);//round�� ������ �ݿø��ϱ�
		double v16=temp2/100.0;
				//temp2/100-> long/int ->�ڹٿ��� �⺻ �������� int�� ������ �ν���.
				//temp2/100.0 ->  long/double ->�⺻�Ǽ��� : double
		System.out.println("v16="+v16);
		
		System.out.println("0~1 ������ �Ǽ��� : "+Math.random());
		System.out.println(Math.random()*6);//0~1 *6 -> 0~6 ������ �Ǽ�
		System.out.println(Math.random()*6+1);//1~7������ �Ǽ�
		int num=(int)(Math.random()*6)+1;
			//(�⺻�ڷ���) ��/����=��������ȯ(ū����->�������� : �����ͼս�)
			//double -> ��������ȯ�ÿ� �Ҽ��� �� ©��
		System.out.println("1~6 ������ ���� : "+num);
		//RandomŬ���� ����
		Random random=new Random();
		System.out.println("1~6 ������ ���� : "+(random.nextInt(6)+1));
		
		
		
				
		
				

		
		
	}

}
