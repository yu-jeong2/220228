package Day07;

public class Cal2 {
	
	
	//1. �ʵ�
	//2.������
	//3.�޼ҵ�
		//- ����޼ҵ�
	void execute() {//�μ�X��ȯX
		double result =avg(7,10);
		println("������ : "+result);
	}
		//- ��ո޼ҵ�
	double  avg(int x,int y) {//�μ�O��ȯO
		double sum = plus(x,y);
		double result=sum/2;  return result;
		
	}
		//- ���ϱ�޼ҵ�
	int plus(int x, int y) {//�μ�O��ȯO
		int result =x+y;return result;
		
	}
		//- �����¸޼ҵ�
	void println(String message) {//�μ�O��ȯX
		System.out.println(message);
	}

}
