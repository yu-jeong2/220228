package Day07;



public class Book {//도서클래스
	
	//1.book
	//필드 : ISBN(도서번호), 도서명, 작가, 도서대여여부, 대여인
	//메소드 :1.도서검색 2.도서목록 3.도서대여 4.도서반납 / 1.도서등록 2.도서삭제
	
	//1.필드
	String ISBN;	//ISBN[도서번호=식별용]
	String bname;	//도서명
	String bwriter;	//작가
	Boolean brental;//도서대여여부
	String mid;		//대여인id
	
	//2.생성자
		//1.빈 생성자: 메소드호출용 (ctrl+스페이스바)
	public Book() {}//기본 생성자
		//2.풀생성자[모든필드를 받는 생성자]:도서등록
	
	public Book(String iSBN, String bname, String bwriter, Boolean brental, String mid) {
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	//3.메소드
	
		//1.도서검색
	void 도서검색() {
		System.out.println("------------도서검색 페이지------------");
	}//도서검색 종료
		//2.도서목록
	void 도서목록() {
		System.out.println("------------도서목록 페이지------------");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book temp:Day07_5_book.books) {
			if(temp!=null) {
				if(temp.brental)
					System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "대여가능");
				else
					System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "대여중");
			}
		}//for문 종료
	}//도서목록 종료
		//3.도서대여
	void 도서대여(String loginid) {
		System.out.println("------------도서대여 페이지------------");
		System.out.println("ISBN : "); String isbn=Day07_5_book.scanner.next();
		int i=0;
		for(Book temp:Day07_5_book.books) {
			//임시객체(배열이름 : 배열 내 0번 마지막인덱스 하나씩 임시 객체 대입
			if(temp!=null&&temp.ISBN.equals(isbn)&&temp.brental) {
				if(temp.brental) {
					System.out.println("알림))해당 도서를 대여합니다.");
					Day07_5_book.books[i].brental=false;
					Day07_5_book.books[i].mid=loginid;
					return;
				}else {
					System.out.println("알림)) 해당도서는 대여중입니다.");
					return;
				}	
			}
		}System.out.println("알림))동일한 대여 ISBN이 없습니다.");
	}//도서대여 종료
	
		//4.도서반납
	void 도서반납(String loginid) {
		System.out.println("------------도서반납 페이지------------");
		도서대여목록(loginid);
		System.out.println("도서 ISBN : ");ISBN=Day07_5_book.scanner.next();
		for(Book temp : Day07_5_book.books) {
			if(temp!=null&&temp.ISBN.equals(ISBN)) {//입력한isbn이 있으면
				if(temp.mid.equals(loginid)) {//대여인.id와현재로그인id 동일하면
					if(temp.brental) {//대여중이 아니면
						System.out.println("알림))현재 도서가 대여중이 아닙니다.");	
					}else {//대여중이면
						System.out.println("알림))반납을 완료하였습니다.");
						temp.brental=true;//대여중->대여가능
						temp.mid=null;
						return;
					}
				}else {
					System.out.println("알림))회원님이 대여한 도서가 아닙니다.");
				}
			}
		}System.err.println("알림))동일한 도서 ISBN이 없습니다.");
	}//도서반납 종료
	
		//현재 로그인 한 회원이 대여중인 도서 목록[내 도서목록]
	void 도서대여목록(String loginid) {
	System.out.println("------------도서목록 페이지------------");
	System.out.println("ISBN\t도서명\t작가\t대여가능여부");
	for(Book temp:Day07_5_book.books) {
		if(temp!=null&&temp.mid.equals(loginid)) {
			if(temp.brental)
				//도서가 존재하면서 대여인 id 현재 로그인 id가 같으면
				System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "대여중");
		}
	}//for문 종료
}
	
		//5.도서등록
	void 도서등록() {
		System.out.println("------------도서등록 페이지------------");
		//1.입력받아
		System.out.println("ISBN : "); String ISBN=Day07_5_book.scanner.next();
		System.out.println("도서명 : ");	String bwriter=Day07_5_book.scanner.next();
		System.out.println("작가 : ");	String bname=Day07_5_book.scanner.next();
			//중복체크
			for(Book temp:Day07_5_book.books) {
				if(temp!=null&&temp.ISBN.equals(ISBN)) {
					System.err.println("알림))현재 사용중인 도서 입니다[등록실패]");
					return;
				}
			}
		Book book=new Book(ISBN, bname,bwriter,true , null);
		//2.객체회를 시켜
		int i=0;
		for(Book temp:Day07_5_book.books) {
			if(temp==null) {
				Day07_5_book.books[i]=book;
				System.out.println("알림))도서등록이 되었습니다.");
				return;
			}//if종료
			i++; // 인덱스증가
		}//for문 종료
		//3.배열에 대입[넣기]
		
	}//도서등록 종료
		//6.도서삭제
	void 도서삭제() {
		System.out.println("------------도서삭제 페이지------------");
	}//도서삭제 종료
	
	
	
	
}
