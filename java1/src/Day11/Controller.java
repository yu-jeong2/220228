package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	//��� �޼ҵ�� static
	
	//��� �Խù���  ��� ����Ʈ
	public static ArrayList<Board> boardlist=new ArrayList<>();
	
	
	//���� �޼ҵ�
	public static void write(String ����, String ����, String �ۼ���, String ��й�ȣ) {
		
		Board board=new Board(����,����,�ۼ���, ��й�ȣ);//4���� �μ� ->1���� ��üȭ
		boardlist.add(board);//����Ʈ�� ����
		save();//���Ͽ� ����
	}
	//���� �޼ҵ�
	public static boolean delete(int index,String password) {//���Խù���ȣ[�ε���]�� ��й�ȣ �ޱ�
		if(password.equals(boardlist.get(index).getPassword())) {
			//�Է¹��� �н������ �ش� �ε��� �Խù� ��ȣ�� �н����尡�����ϸ�
			boardlist.remove(index);//add(��ü): �߰�   get(�ε���):ȣ��   remove(�ε���):����
			save();
			return true;//��������
		}else {
			return  false;//��������
		}
	}
	//���� �޼ҵ�
	public static boolean update(int index, String password, String title, String content) {
		if(password.equals(boardlist.get(index).getPassword())) {
			boardlist.get(index).setTitle(title);
			boardlist.get(index).setContent(content);
			save();//���Ͼ�����Ʈ
			return true;
		}else {return false;}
	}
	//��۾��� �޼ҵ�
	public static void replywrite() {}
	//�Խù� ���� �޼ҵ�
	public static void save() {//����Ʈ �� ��� �Խù��� ���Ͽ� ����
		try {
			//�������Ŭ����
		FileOutputStream outputStream=new FileOutputStream("D:/javafile/�Խù�����.txt");
				//���Ͽ� �ۼ��� ����[���پ�]=�Խù��Ѱ���=��ü1��
				for(Board board:boardlist) {
			String �ۼ�����=board.getTitle()+","+board.getContent()+","+
					board.getWriter()+","+board.getPassword()+","+
					board.getViewcount()+","+board.getDate()+"\n";
			outputStream.write(�ۼ�����.getBytes());
				}

		}//����[���ڿ�] ->byte�� ��ȯ
		//�������� [write()]
		catch(Exception e) {
			System.err.println("�������� ����(�����ڿ��� ����)");
			}
	}
	//�Խù� �ҷ����� �޼ҵ�[���α׷����۽�]
	public static void load() {//����-->����Ʈ
		try {
			FileInputStream inputStream=new FileInputStream("D:/javafile/�Խù�����.txt");
			byte[]bytes=new byte[1000];//����Ʈ�迭 ����
			inputStream.read(bytes);//��� ����Ʈ �о�ͼ� ����Ʈ�� ����
			String file=new String(bytes);//����Ʈ->���ڿ� ��ȯ
			String[] boards=file.split("\n");//���ڿ� �ڸ���[���پ�->1����ü]
			int i=0;
			for(String temp : boards){//�迭 �� ���ڿ� �ϳ��� ������
				if(i==boards.length)break;//�������ε���[��ü] ����
				String[] field=temp.split(",");//���ڿ� �ڸ���[������ ��ü(,) ->�� �ʵ��  ����]
				Board board = new Board( field[0], field[1],
						field[2], field[3], Integer.parseInt(field[4]),field[5], null);//��üȭ
			boardlist.add(board);//����Ʈ�� ���
			i++;
			}
		}catch(Exception e){}
	}
	
}
