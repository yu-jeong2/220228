package Day12;

import java.io.IOException;

public class Day12_3_�����˻� {
	public static void main(String[] args) throws IOException {
		
		//�����˻� ���α׷�
			//����
			//1. �Է¹ޱ�[System.in.read()]
			//2. String �迭��  �̿���  �������� ������ ����
				//String[]�������={"�ȴ�! ���̹� ��α�&����Ʈ", "��������Ʈ ���� Ȱ�� ������","Turcker�� Go ��� ���α׷���","ȥ�� �����ϴ� C���"}
			//3. �˻����, �������
				//�˻���� : Ư�� ���ڸ� �Է¹޾� ���� �� ���Ե� ���ڰ� ������ ��� ���
				//'���'�˻� : "Turcker�� Go ��� ���α׷���","ȥ�� �����ϴ� C���"
				//'����'���� : ������ ������ �Ϻθ� �Է¹޾� ���Ե� ������ �� ��ȣ�� ����
					//������ �������� �Ϻ� ������ ����/���ο� ���� �Է¹ޱ�->�����Ϸ�
			//4.
		
		String[]�������={"�ȴ�! ���̹� ��α�&����Ʈ", "��������Ʈ ���� Ȱ�� ������",
				"Turcker�� Go ��� ���α׷���","ȥ�� �����ϴ� C���"};
		
		
		while( true ) {
			System.out.println("----�����˻� ���α׷�----");
			System.out.println("1.�˻� 2.����");
			byte[] bytes = new byte[100];
			int count =  System.in.read(bytes); // Ű����κ��� [��Ʈ��] ����Ʈ�� �о���� // �Ϲݿ���!!!! [ ���� ���ѱ�� ]
			// �о�� ����Ʈ���� 
			
			String ch = new String( bytes , 0 , count-2 ); // ����Ʈ�迭 --> ���ڿ� ��ȯ [ -2 = \n\r ���� ]
			
			if( ch.equals("1") ) { 
				System.out.println(" *** �˻� *** ");
				System.out.println("�˻� : "); count = System.in.read(bytes);
				System.out.println("*** �˻� ���***");
				String search=new String(bytes,0,count-2);
				for(String temp : �������) {//���  �迭 �� ���ڿ��� �ϳ��� ��������
//					if(temp.indexOf(search)!=-1) {//�ش� ���ڿ� �� ã�� ������ �ε����� �����ϸ�
//						//indexOf �޼ҵ� -1��ȯ�Ǵ°��� ������ �ܾ  ���� ���[�˻�X]
//						System.out.println(temp);//�ش繮�ڿ� �� ã�� ���ڰ� ����
//					}
					
					if(temp.contains(search)) {
						//���ڿ�.contains("ã������") : ���ڿ� �� ã�� ���ڰ� true(�ִ�) false(����)
						System.out.println(temp);
					}
				}
			}else if( ch.equals("2") ) {
				System.out.println(" *** ���� *** ");
				System.out.println("�˻�[�Ϻ�] : "); 
				count = System.in.read(bytes);//Ű����κ��� ����Ʈ �о�ͼ� �迭�� ����
				System.out.println("*** �˻� ���***");
				String search=new String(bytes,0,count-2);//0���ε�������Ʈ���� -2�� ������ �ε���
				int i=0;//�ε��� ������ֱ�
				for(String temp : �������) {
					if(temp.indexOf(search)!=-1) {
						System.out.println("������ȣ : "+i+"�� /���� : "+temp);
					}i++;
				}
				System.out.println("������ ������ȣ �Է� : ");
				count = System.in.read(bytes);
				String ch2=new String(bytes,0,count-2);
				//ch2 ���ڿ��� �Է¹���-->�ε���[����] ��ȯ
				int index = Integer.parseInt(ch2);
				System.out.println("�������� : ");
				count=System.in.read(bytes); String oldstr=new String(bytes,0,count-2);
				System.out.println("���ο� ���� : ");
				count=System.in.read(bytes); String newstr=new String(bytes,0,count-2);
				//����ó��
				�������[index] = �������[index].replace(oldstr, newstr);
				//�迭 �� ������ = ������ ������   // ������ �������� �迭�� ������ ����ֱ�.
				System.out.println("����Ǿ����ϴ�.");
				
			}//else if end
			
		}//while end
	}//m e
}// c e
