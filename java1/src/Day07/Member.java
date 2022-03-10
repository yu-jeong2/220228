package Day07;

import java.util.Scanner;

public class Member {//멤버클래스
	//1.필드
	int mno;		//회원번호[자동번호,중복X]
	String id;		//아이디[중복X]
	String pw;		//비밀번호
	String name; 	//이름
	String Phone;	//연락처
	//2.생성자[생성자명==클레스명]
		//1.빈 생성자[기본생성자] : 메소드호출용 객체 생성시
	public Member() {}
		//2.모든 필드를 받는 생성자 : 회원가입용 객체 생성시
	public Member(int mno, String id, String pw, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		Phone = phone;
	}
	//3.메소드
		//1.회원가입 메소드[인수X반환O] : 가입성공True/가입실패false
	boolean 회원가입() {
		System.out.println("-----------------회원가입 페이지-----------------");
		//1. 입력받는다[id,pw,name,phone]
		System.out.println("아이디 : ");	String id = Day07_5_book.scanner.next();
		//아이디중복체크
		for(Member temp : Day07_5_book.member) {//아이디중복체크
			if(temp!=null&&temp.id.equals(id)) {
				System.err.println("알림))사용 중인 아이디 입니다.");
				return false;//아이디가 중복되었기 때문에 가입실패
			}//if문 종료
		}//for문종료
		System.out.println("비밀번호 : ");	String pw = Day07_5_book.scanner.next();
		System.out.println("이름 : ");	String name=Day07_5_book.scanner.next();
		System.out.println("연락처 : ");	String phone=Day07_5_book.scanner.next();
			//scanner 객체가 다른 클래스 내 static 선언되어있음.// 클레스명.필드명.함수명();
			//static 필드,메소드는  객체없이 호출 가능[클래스명.필드명/메소드명]
		
			
			//회원번호 자동 주입[마지막 회원(가장 최근에 가입한회원의 번호)의 회원번호+1]
			int bno=0;//회원번호  저장하는 변수
			int j=0;//인덱스
			for(Member temp:Day07_5_book.member) {
				if(temp==null) {//null찾기[null찾았을 때 null-1=마지막회원]
					if(j==0) {
						bno=1;//첫번째 인덱스가 null=>첫회원=>1부터 시작
						break;//끝내기
					}else {bno=Day07_5_book.member[j-1].mno+1;//if종료2
										//null 앞[마지막회원]번호에 +1
						break;
					}
				}//if 종료
				j++;
			}//for문종료
		
		
		//2. 4개변수->객체화->1개로 저장
		Member member=new Member(0,id,pw,name,phone);//모든 필드를 받는 생성자로 객체생성
		int i=0;
		//3. 배열 내 빈 공간을 찾아서 새로운 회원[객체]넣기
		for(Member temp:Day07_5_book.member) {
			if(temp==null) {
				Day07_5_book.member[i]=member;
				System.out.println(" 알림)) 회원님의 회원번호 : " + bno);
				return true;//빈 인덱스에 새로운 회원 대입
			}//if종료
			i++;
		}//for종료
		return false;
		//4. 가입 성공시 true, 반환 실패시false 반환
		
	}//boolean 종료
			
		//2.로그인 메소드[인수X반환O] 로그인성공시 아이디반환, 실패시 null반환
	String 로그인() {
		System.out.println("-----------------로그인 페이지-----------------");
		//1. 입력받기
		System.out.println("아이디 : ");	String id=Day07_5_book.scanner.next();
		System.out.println("비밀번호 : ");	String pw=Day07_5_book.scanner.next();
		//2.배열 내 객체 id와 pw가 입력한 값과 동일하면
		for(Member temp:Day07_5_book.member) {
			if(temp!=null&&temp.id.equals(id)&&
					temp.pw.equals(pw)) {
				return temp.id;
			}//if종료
		}//for문종료
		return null;//실패시 null반환
	}//로그인 종료
		//3.아이디 찾기 메소드[인수X반환X]
	void 아이디찾기() {
		System.out.println("-----------------아이디 찾기 페이지-----------------");
		//1. 입력받기
		System.out.println("이름 : ");	String name=Day07_5_book.scanner.next();
		System.out.println("연락처 : ");	String phone=Day07_5_book.scanner.next();
		//2.입력받은 값을 배열에 찾기
		for(Member temp:Day07_5_book.member) {
			if(temp!=null&&temp.name.equals(name)&&
					temp.Phone.equals(phone)) {
				//공백이 아니면서 해당 객체 내 name,phone 이 입력받은 값과 동일하면
				System.out.println("회원님의 아이디 : "+temp.id);//찾은 id 안내
				return;//동일한 값을 찾았으면 해당 메소드 종료
			}//if종료
			//3.찾았으면 찾은 아이디 출력하고 못찾았으면 없음 출력
			System.out.println("알림))일치하는 회원이 없습니다.");
		}//for문종료
		return;//실패시 null반환
	}//아이디찾기
		//4.비밀번호 찾기 메소드[인수X반환X]
	void 비밀번호찾기() {
		System.out.println("-----------------비밀번호 찾기 페이지-----------------");
		System.out.println("아이디 : ");	String id=Day07_5_book.scanner.next();
		System.out.println("연락처 : ");	String phone=Day07_5_book.scanner.next();
		for(Member temp:Day07_5_book.member) {
			if(temp!=null&&temp.id.equals(id)&&
					temp.Phone.equals(phone)) {
				System.out.println("회원님의 비밀번호 : "+temp.pw);
				return;//동일한 값을 찾았으면 해당 메소드 종료
			}
			System.out.println("알림))일치하는 회원이 없습니다.");
			return;
		}
		
	}//비밀번호찾기
		//5.회원탈퇴 메소드
		//6.회원수정 메소드
	
	
}
