package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	//�ֱ����ġ -�޸� : RAM -���α׷� ����ÿ��� ���� �޸�
	//���������ġ -C����̺�, USB, CD : (���α׷�) ����[��������]
	//����ó��[ java �� �޸𸮸�--> ���������ġ]
	//DBó��[ java �� �޸𸮸� --> DB ����[PC] ]
		//Stream : ���α׷��� �ܺ�[���α׷�,����,��Ʈ��ũ ��] ���
			//��Ŵ��� : byte
		//FileOutputStream : �������Ŭ����
			//��ü��.write(����Ʈ��);
		//FileInputStream : �����Է�Ŭ����
			//��ü��.read(����Ʈ�迭);
		//String Ŭ����
			//���ڿ�.equals() : ���ڿ�  �� �޼ҵ�
			//���ڿ�.getgetBytes() : ���ڿ�->����Ʈ�� ��ȯ
			//new  String(����Ʈ�迭) : ����Ʈ�迭->���ڿ��迭 ��ȯ
	public static void main(String[] args) throws IOException {
		
		//1. �������[����->�ڹ�]
		FileOutputStream �������=new FileOutputStream("D:/javafile/java1.txt");
		//FileOutputStream : ��������� Ŭ����
		//FileOutputStream(���ϰ��/���ϸ�.Ȯ����) txt :�޸���
		String ����="�ڹٿ��� �Էµ� ������";
		�������.write(����.getBytes());//����[����]
		//2. �����Է�[�ڹ�->����]
		FileInputStream �����Է�=new FileInputStream("D:/javafile/java1.txt");
		byte[] bytes =new byte[1000];
		�����Է�.read(bytes);
		System.out.println("���ϳ��� : "+new  String(bytes));
		
	}//m e
}
