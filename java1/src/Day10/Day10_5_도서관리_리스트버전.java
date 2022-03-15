package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_도서관리_리스트버전 {
	
	public static void main(String[] args) {
		//리스트[객체]생성
		ArrayList<Book>booklist=new ArrayList<>();
		//리스트 클래스<리스트 안에 저장할 클래스>
		//<클래스> : 해당  클래스의여러 객체를 리스트에 저장
		//길이는 가변[기본 : 10]
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("1.등록 2.목록 3.삭제 4.수정");
			int ch=scanner.nextInt();
			if (ch==1) {
				//입력받기
				System.out.println("도서명 : "); String 도서명=scanner.next();
				System.out.println("저자 : "); String 저자=scanner.next();
				//객체화[여러가지변수--> 1개의 객체]
				Book book = new Book(도서명,저자);				
				//배열저장
				booklist.add(book);
				// .add(객체명) : 마지막  인덱스에 자동적으로 객체가 추가
			}
			else if (ch==2){
				//배열 :공백제거
				System.out.println("도서명\t저자");
				for(Book book :booklist) {
					System.out.println(book.get도서명()+"\t"+book.get저자());
					
				}
			}
			else if (ch==3){
				System.out.println("삭제할 도서명 : "); String 도서명=scanner.next();
			for(Book book:booklist) {
				if (book.get도서명().equals(도서명))
					booklist.remove(book);break;
				}
			}
			else if (ch==4){
				System.out.println("수정할 도서명 : ");	String 도서명=scanner.next();
				for(Book book:booklist) {
					if(book.get도서명().equals(도서명)) {
						System.out.println("수정할 저자명 : "); String 저자=scanner.next();
						book.set저자(저자); break;
					}
				}
			}
		}//while
	}//m e 
}
