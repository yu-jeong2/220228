package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 {//c s
	public static void main(String[] args) {//m s
		/*로또판별기
			1. 사용자 6개 수 입력받기->배열저장
				1. 중복X 재입력
				2. 1~45사이 수만 입력받기 아니면 재입력
			2.추첨번호 : 컴퓨터 난수 6개 발생->배열저장
				1.1~45사이
				2.중복X
			3. 사용자 추첨번호와 컴퓨터 추첨번호와 동일수의 갯수
		
		*/
		Scanner scanner=new Scanner(System.in);

		int[] 사용자번호=new int[6];//사용자가 선택한 번호
		int[] 추첨번호=new int[6];//컴퓨터가 난수 번호 목록
		
		//사용자에게 입력받기
		for(int i=0;i<=5;i++) {
			//i는 0부터 5까지 1번씩 증가  반복=> 6회반복
			System.out.println("1~45  사이 입력 : ");
			int 번호=scanner.nextInt();
			
			boolean 통과 =  true;//스위치검사
			
			//조건1 : 유효성검사
			if(번호<1||번호>45) {
				System.err.println("알림) 선택 할 수 없는 번호입니다.[재입력]");
				//1보다 작거나 45보다크면 선택할 수 없는 번호 재입력
				i--;//현재 i는 정상입력X 재입력 횟수 늘리기.
				통과=false;//저장X
			}//if end
			//조건 2 : 중복체크
			
			for(int j=0;j<6;j++) {//1. 배열 내 모든 인덱스 호출
				if(번호==사용자번호[j]) {//2. 입력받은 값과 같은지 비교
					System.err.println("이미 선택한 번호 입니다.[재입력]");
					i--;
					통과=false;//저장X
				}//if end
				
			}//for2 end
			
			// 정상입력[true] 이면 배열에 저장하기
			if(통과==true)사용자번호[i]=번호;
			
			
		}//for end
		//사용자가  출력한 번호 확인
		System.out.print("\n사용자가 선택한 번호 : ");
		for(int temp:사용자번호) {
			System.out.print(temp +"  ");
		}
		
		
		//컴퓨터가  난수 생성

		for(int i=0;i<6;i++) {
			Random random = new Random();int 컴퓨터;
			int 추첨 =random.nextInt(45)+1; //nextInt(); : +- 20억 사이 중 난수발생
									//nextINT(수):0~수 사이중 난수 발생
									//nextInt(수)+시작번호:시작번호~수까지 난수 발생
			boolean 통과 =true;
			for(int temp:추첨번호) {
				if(추첨==temp) {//중복이 있을 경우, i 제외
					i--; 통과=false;//저장x
				}
			}
				if(통과)추첨번호[i]=추첨;
			}
			System.out.print("\n추첨 번호 : ");
			for(int temp:추첨번호) {
				System.out.print(temp +"  ");
			
			}//컴퓨터 난수end
			
			
			//비교=두배열간 동일한 수 찾기
				//3 5 2
				//8 3 1
					//3->8	5->8	2->8
					//3->3	5->3	2->3
					//3->1	5->1	2->1
			int 동일한수=0;
			//방법 1
			for(int i=0;i<사용자번호.length;i++) {
				//i가 비교 기준점
				for(int j=0;j<추첨번호.length;j++) {
					//j 비교대상
					if(사용자번호[i]==추첨번호[j]) {
						//i번째 인덱스와 j번째 인덱스 의 수가 동일하면
						동일한수++;
					}
				}
			}
			
			//방법2
			for(int 기준수:사용자번호) {
				//사용자번호 배열내 하나씩 비교기준 대입
				for(int 비교대상:추첨번호) {
					//추첨번호 배열내 하나씩 비교기준 대입
					if(기준수==비교대상) 동일한수++;
				}
			}
		System.out.println("\n동일한수의 갯수는 "+동일한수+"입니다.");
		
		
	}//m e

}//c e
