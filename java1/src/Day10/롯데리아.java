package Day10;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class �Ե����� extends ���� {
	//�ʵ�
	private String ����;
	private ArrayList<��ǰ> ��ǰ����Ʈ=new ArrayList<>();
	//������
	public �Ե�����() {}
	
	public �Ե�����(String ����, ArrayList<��ǰ> ��ǰ����Ʈ) {
		super();
		this.���� = ����;
		this.��ǰ����Ʈ = ��ǰ����Ʈ;
	}

	@Override
	public void ��ǰ���(){
		System.out.println("*** �Ե����� ��ǰ ��� ***");
		int i=1;
		for(��ǰ temp: ��ǰ����Ʈ) {
			System.out.print(i+"."+temp.get��ǰ��()+"("+temp.get����()+")  ");
			i++;
		}
		System.out.println();
	}
	@Override
	public void ��ǰ�߰�() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("*** �Ե����� ��ǰ�߰� ***");
		System.out.println("��ǰ�� : "); String ��ǰ��=scanner.next();
		System.out.println("��� : "); int ��� = scanner.nextInt();
		System.out.println("���� : "); int ���� = scanner.nextInt();
		��ǰ ��ǰ = new ��ǰ(��ǰ��,���,����);
		��ǰ����Ʈ.add(��ǰ);
		//����ó��
		try {//������ �߻��� �� ���� �ڵ� ����
		FileOutputStream outputStream = new FileOutputStream("D:/javafile/�Ե��������.txt",true);
		String �������� = ��ǰ��+","+���+","+����+"\n";
		outputStream.write(��������.getBytes());
		}catch(Exception e) {//���� ó�� : Exception 	
		}
		System.out.println("�˸�)) ��ǰ ���� �Ϸ� ~~~");
	}
	

}
