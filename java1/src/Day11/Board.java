package Day11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {//게시물

	
	//필드
	private String title;
	private String content;
	private String password;
	private String writer;
	private int viewcount;
	private String date;
	private ArrayList<Reply> replylist=new ArrayList<>();//댓글목록
	//생성자
		//빈생성자
	public Board() {}
		//게시물 등록시 사용되는 생성자[날짜 자동주입]
	public Board(String title, String content, String password, String writer) {
		this.title = title;
		this.content = content;
		this.password = password;
		this.writer = writer;
			//날짜클래스=>Date클래스(java.util)
		Date date=new Date();
			//날짜 형식  클래스 : SimpleDateFormat(java.text)
		SimpleDateFormat format=new SimpleDateFormat("yy-MM-dd"); //y 년도, M 월, d일, h시, m분, s초 
		this.date=format.format(date);//객체명.format(날짜) : 해당 날짜가 format설정한 문자형 패턴으로 변환
	}
		//풀생성자
	public Board(String title, String content, String password, String writer, int viewcount, String date,
			ArrayList<Reply> replylist) {
		this.title = title;
		this.content = content;
		this.password = password;
		this.writer = writer;
		this.viewcount = viewcount;
		this.date = date;
		this.replylist = replylist;
	}

	//메소드[private 필드 사용시, 백터, 섹터 생성하기]
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<Reply> getReplylist() {
		return replylist;
	}
	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}
	
	
	
	
}
