package Day02;

import java.util.Scanner;

public class Day02_4 {//c s
	public static void main(String[] args) {//m s
		
	//����2 : ���󼼱�
	//[�Է�����]�ݾ�
	//[����] �ʸ��� ���� ��������� ���� ����
	//[�������] ��)356700 �Է½� �ʸ��� 3��, ���� 5�� ... 100�� 7��

	Scanner scanner =new Scanner(System.in);
	System.out.println("�ݾ��� �Է��Ͻÿ�"); int �ݾ�  = scanner.nextInt();
	System.out.println("�ʸ��� : "+(�ݾ�/100000)+"��");
	�ݾ�=�ݾ�-(�ݾ�/100000)*100000;
	System.out.println("���� : "+(�ݾ�/10000)+"��");
	�ݾ�-=(�ݾ�/10000)*10000;
	System.out.println("õ�� : "+(�ݾ�/1000)+"��");
	�ݾ�-=(�ݾ�/1000)*1000;
	System.out.println("��� : "+(�ݾ�/100)+"��");

}//m e
}//c e