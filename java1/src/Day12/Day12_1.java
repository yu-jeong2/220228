package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1 {
	public static void main(String[] args) throws IOException {
		
	
	//p.496
		/*
		  - String Ŭ����
   			- String���ڿ� Ŭ����
        	1. java.lang ��Ű��[import]�Ҽ�
        	2. ��ü�ε� �ڵ� ���͸�[��ü�� �ڵ�����]
        	3. 13���� ������[���ڿ�, ����Ʈ�� ��]
        	
		 */
		
		//����Ʈ->���� ��ȯ ���� ����
			//1.����Ʈ => +-127 ǥ������
			//2.�ƽ�Ű�ڵ� �� 0 or 1 ���յ� 7�ڸ� �� 2�� 7��(7�ڸ�)->128���� ǥ������
				//�ƽ�Ű�ڵ� -����/Ư������ 1byte , �ѱ� 2byte
		
		//���� 0 or 1
		//7�ڸ� ���� : �ƽ�Ű�ڵ�[1000001 �� A]
		
		//������ ����Ʈ ������ �� �ִ� �迭 ����
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		//����Ʈ �迭 -> ���ڿ��� ��ȯ [new String(�迭��)
		String str1=new String(bytes); // String ����Ʈ-> �ƽ�Ű��� ��ȯ
		//ȣ��
		System.out.println("����Ʈ�迭->���ڿ���ȯ : "+str1);
		
		//Ư�� ��ġ���� ��ȯ[new ,�迭��, �����ε���, ����]
		String str2=new String(bytes,6,4);
		
		//System.out : �ý��� Ŭ���� �� ����ʵ�
		byte[] bytes2=new byte[100];
		System.out.println(" �Է� : ");//����ʵ� �� print �޼ҵ� ȣ��
		int readByteNo=System.in.read(bytes2);
		//�ܺ���� : �ڹ����α׷� ��[Ű����,����,��Ʈ��ũ ��] ����� �Ϲݿ���
		//Ű���忡 �Է� -> ��Ʈ��[���:����Ʈ] -> ��ǻ��
		//�Ϲݿ��� ->������ or  try catch
		System.out.println("�Է¹��� ����Ʈ: " +Arrays.toString(bytes2));
		String str=new String(bytes2,0,readByteNo-2);// \r\n (��������Ʈ��)�ΰ� ����
		System.out.println("�Է¹��� ����Ʈ-> ���� : " +str);
				
		//Scanner [system.in ���� ���� �Է¹��� ����Ʈ����ü�� ����]
		Scanner scanner = new Scanner(System.in);
		scanner.next(); //����Ʈ->���ڿ� ��ȯ
		scanner.nextInt();//����Ʈ->������ ��ȯ
		scanner.nextDouble();//����Ʈ->�Ǽ��� ��ȯ
		
		
		
		
	}//m e 
}
