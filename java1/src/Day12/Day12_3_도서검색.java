package Day12;

import java.io.IOException;

public class Day12_3_도서검색 {
	public static void main(String[] args) throws IOException {
		
		//도서검색 프로그램
			//조건
			//1. 입력받기[System.in.read()]
			//2. String 배열을  이용한  도서명을 여러개 저장
				//String[]도서목록={"된다! 네이버 블로그&포스트", "스프링부트 실전 활용 마스터","Turcker의 Go 언어 프로그래밍","혼자 공부하는 C언어"}
			//3. 검색기능, 수정기능
				//검색기능 : 특정 문자를 입력받아 도서 내 포함된 문자가 있으면 모두 출력
				//'언어'검색 : "Turcker의 Go 언어 프로그래밍","혼자 공부하는 C언어"
				//'수정'수정 : 수정할 도서명 일부를 입력받아 포함된 도서명 중 번호를 선택
					//수정할 도서명의 일부 수정할 문자/새로운 문자 입력받기->수정완료
			//4.
		
		String[]도서목록={"된다! 네이버 블로그&포스트", "스프링부트 실전 활용 마스터",
				"Turcker의 Go 언어 프로그래밍","혼자 공부하는 C언어"};
		
		
		while( true ) {
			System.out.println("----도서검색 프로그램----");
			System.out.println("1.검색 2.수정");
			byte[] bytes = new byte[100];
			int count =  System.in.read(bytes); // 키보드로부터 [스트림] 바이트를 읽어오기 // 일반예외!!!! [ 예외 떠넘기기 ]
			// 읽어온 바이트개수 
			
			String ch = new String( bytes , 0 , count-2 ); // 바이트배열 --> 문자열 변환 [ -2 = \n\r 제거 ]
			
			if( ch.equals("1") ) { 
				System.out.println(" *** 검색 *** ");
				System.out.println("검색 : "); count = System.in.read(bytes);
				System.out.println("*** 검색 결과***");
				String search=new String(bytes,0,count-2);
				for(String temp : 도서목록) {//모든  배열 내 문자열을 하나씩 꺼내오기
//					if(temp.indexOf(search)!=-1) {//해당 문자열 내 찾을 문자의 인덱스가 존재하면
//						//indexOf 메소드 -1반환되는경우는 동일한 단어가  없을 경우[검색X]
//						System.out.println(temp);//해당문자열 내 찾을 문자가 존재
//					}
					
					if(temp.contains(search)) {
						//문자열.contains("찾을문자") : 문자열 내 찾을 문자가 true(있다) false(없다)
						System.out.println(temp);
					}
				}
			}else if( ch.equals("2") ) {
				System.out.println(" *** 수정 *** ");
				System.out.println("검색[일부] : "); 
				count = System.in.read(bytes);//키보드로부터 바이트 읽어와서 배열에 저장
				System.out.println("*** 검색 결과***");
				String search=new String(bytes,0,count-2);//0번인덱스바이트부터 -2개 제외한 인덱스
				int i=0;//인덱스 만들어주기
				for(String temp : 도서목록) {
					if(temp.indexOf(search)!=-1) {
						System.out.println("도서번호 : "+i+"번 /교재 : "+temp);
					}i++;
				}
				System.out.println("수정할 도서번호 입력 : ");
				count = System.in.read(bytes);
				String ch2=new String(bytes,0,count-2);
				//ch2 문자열로 입력받음-->인덱스[숫자] 변환
				int index = Integer.parseInt(ch2);
				System.out.println("기존문자 : ");
				count=System.in.read(bytes); String oldstr=new String(bytes,0,count-2);
				System.out.println("새로운 문자 : ");
				count=System.in.read(bytes); String newstr=new String(bytes,0,count-2);
				//수정처리
				도서목록[index] = 도서목록[index].replace(oldstr, newstr);
				//배열 내 도서명 = 수정된 도서명   // 수정된 도서명을 배열내 도서로 집어넣기.
				System.out.println("변경되었습니다.");
				
			}//else if end
			
		}//while end
	}//m e
}// c e
