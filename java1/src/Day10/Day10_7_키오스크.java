package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_Ű����ũ {
	//��� : ����
	//Ŭ���� : �Ե�����, ����ŷ
	//�������̽� : Ű����ũ
	//����ó�� : ��ǰ ������
	public static void main(String[] args) {
		ArrayList<��ǰ>��ǰ����Ʈ=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		
		//���� �Է�
		//�����Է°�ü
		try {
			FileInputStream inputStream= new FileInputStream("D:/javafile/�Ե��������.txt");
			//���� �о����[����--->��Ʈ��(����Ʈ��)--->�ڹ�]
				//����Ʈ �迭 ����
			byte[] bytes=new byte[1024];
			//�о�ͼ� �迭�� ����
			inputStream.read(bytes);
			//����
			String ���ϳ���=new String(bytes);//����Ʈ��->���ڿ�
			//String���� �޼ҵ� : splint("����") ;
			String[]��ǰ��� =���ϳ���.split("\n");
			
			for(String temp:��ǰ���) {
				String[]�ʵ��� =temp.split(",");
				��ǰ ��ǰ=new ��ǰ(�ʵ���[0],Integer.parseInt(�ʵ���[1]),Integer.parseInt(�ʵ���[2]));
							//Integer.parseInt() ���ڿ� -->������ ��ȯ
				��ǰ����Ʈ.add(��ǰ);
			}
			
		}catch(Exception e){}
		Ű����ũ �Ե�����=new �Ե�����("���缮",��ǰ����Ʈ);
		while(true) {
			�Ե�����.��ǰ���();
			int ch= scanner.nextInt();
			if(ch==-1) {
				�Ե�����.��ǰ�߰�();
			}
			else {
				�Ե�����.��ٱ���(ch);
				}
			
			
		}//while	
	}//m e
}
