package Day03;

public class Day03_1 {//c s
	public static void main(String[] args) {//m s
		//1���� : ���, �Է�
		//2���� : ����(����), ���(����)
		
		
		//���
			//��ǻ���� �Ǵܷ�~~ =>����Ǽ�
			//���ǽ��� true�̸� ���๮ ó��
			//����
				//IF(����) {����};
					//����1
					if(3>1)System.out.println("��1) 3�� 1����ũ��.");//true. ��³���
						//���࿡  3�� 1����ũ�� ���, �ƴϸ� ���X
					//����2
					if(3>5)System.out.println("��2)3�� 5���� ũ��"); //false. ��� �ȳ���
						//���࿡ 3�� 5���� ũ�� ���,�ƴϸ� X
					
				//IF(���ǽ�) ���๮[��];
				//ELSE���๮[����];
					//����3
					if(3>1)System.out.println("��3_1)3��  1����ũ��.");
					else System.out.println("��3_2)_3�� 1����  �۴�.");
						//���࿡ 3�� �Ϻ��� ũ�� 3_1 ���
						//�ƴϸ� 3�� 1���� ������ 3_2���
				//���๮ 2�� �̻��̸� (;2�� �̻��̸�) {} �߰�ȣó���ϱ�.--true ���๮ ��������
					if(3>2) {System.out.println("true"); System.out.println("3��2����ũ��");}
					else //false���๮ ����
						{System.out.println("true"); System.out.println("3�� 2�����۴�.");}//false���๮ ��
					
			//����� ��, �����̴ټ��� ��
			//IF(����){���๮[��1];}
			//Else IF(����2){���๮[��1]}
			//Else IF(����3){���๮[��2]}	
			//Else IF(����4){���๮[��3]}
			//Else IF(����5){���๮[��5]}	
			//Else {���๮[����, �� ��]}
					
				//���� 5
					if(3>5)System.out.println("��5) 3�� 5���� ũ��");//����X
					else if(3>4)System.out.println("��5)3�� 4���� ũ��.");//����X
					else if(3>3)System.out.println("��5)3�� 3���� ũ��");//����X
					else if(3>2)System.out.println("��5)3�� 2���� ũ��.");//����O
					else System.out.println("true ����.");//����X
					
			//IF ��ø ����
				//if(���ǽ�)[
				//	 if(���ǽ�){���๮;}
				//	 else{ ���๮;}
				//  }else{
				//		if(���ǽ�){���๮;}
				//		else{���๮;}
				//	}
					
					
	}//m e
}// c e