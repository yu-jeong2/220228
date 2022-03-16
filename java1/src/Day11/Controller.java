package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	//모든 메소드는 static
	
	//모든 게시물을  담는 리스트
	public static ArrayList<Board> boardlist=new ArrayList<>();
	
	
	//쓰기 메소드
	public static void write(String 제목, String 내용, String 작성자, String 비밀번호) {
		
		Board board=new Board(제목,내용,작성자, 비밀번호);//4개의 인수 ->1개로 객체화
		boardlist.add(board);//리스트에 저장
		save();//파일에 저장
	}
	//삭제 메소드
	public static boolean delete(int index,String password) {//현게시물번호[인덱스]와 비밀번호 받기
		if(password.equals(boardlist.get(index).getPassword())) {
			//입력받은 패스워드와 해당 인덱스 게시물 번호의 패스워드가동일하면
			boardlist.remove(index);//add(객체): 추가   get(인덱스):호출   remove(인덱스):삭제
			save();
			return true;//삭제성공
		}else {
			return  false;//삭제실패
		}
	}
	//수정 메소드
	public static boolean update(int index, String password, String title, String content) {
		if(password.equals(boardlist.get(index).getPassword())) {
			boardlist.get(index).setTitle(title);
			boardlist.get(index).setContent(content);
			save();//파일업데이트
			return true;
		}else {return false;}
	}
	//댓글쓰기 메소드
	public static void replywrite() {}
	//게시물 저장 메소드
	public static void save() {//리스트 내 모든 게시물을 파일에 저장
		try {
			//파일출력클래스
		FileOutputStream outputStream=new FileOutputStream("D:/javafile/게시물파일.txt");
				//파일에 작성할 내용[한줄씩]=게시물한개씩=객체1개
				for(Board board:boardlist) {
			String 작성내용=board.getTitle()+","+board.getContent()+","+
					board.getWriter()+","+board.getPassword()+","+
					board.getViewcount()+","+board.getDate()+"\n";
			outputStream.write(작성내용.getBytes());
				}

		}//내용[문자열] ->byte열 변환
		//내보내기 [write()]
		catch(Exception e) {
			System.err.println("파일저장 실패(관리자에게 문의)");
			}
	}
	//게시물 불러오기 메소드[프로그램시작시]
	public static void load() {//파일-->리스트
		try {
			FileInputStream inputStream=new FileInputStream("D:/javafile/게시물파일.txt");
			byte[]bytes=new byte[1000];//바이트배열 선언
			inputStream.read(bytes);//모든 바이트 읽어와서 바이트에 저장
			String file=new String(bytes);//바이트->문자열 변환
			String[] boards=file.split("\n");//문자열 자르기[한줄씩->1개객체]
			int i=0;
			for(String temp : boards){//배열 내 문자열 하나씩 꺼내기
				if(i==boards.length)break;//마지막인덱스[객체] 제외
				String[] field=temp.split(",");//문자열 자르기[한줄의 객체(,) ->각 필드로  분해]
				Board board = new Board( field[0], field[1],
						field[2], field[3], Integer.parseInt(field[4]),field[5], null);//객체화
			boardlist.add(board);//리스트에 담기
			i++;
			}
		}catch(Exception e){}
	}
	
}
