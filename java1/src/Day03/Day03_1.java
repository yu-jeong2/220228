package Day03;

public class Day03_1 {//c s
	public static void main(String[] args) {//m s
		//1일차 : 출력, 입력
		//2일차 : 저장(변수), 계산(연산)
		
		
		//제어문
			//컴퓨터의 판단력~~ =>경우의수
			//조건식이 true이면 실행문 처리
			//형태
				//IF(조건) {실행};
					//예제1
					if(3>1)System.out.println("예1) 3이 1보다크다.");//true. 출력나옴
						//만약에  3이 1보다크면 출력, 아니면 출력X
					//예제2
					if(3>5)System.out.println("예2)3이 5보다 크다"); //false. 출력 안나옴
						//만약에 3이 5보다 크면 출력,아니면 X
					
				//IF(조건식) 실행문[참];
				//ELSE실행문[거짓];
					//예제3
					if(3>1)System.out.println("예3_1)3이  1보다크다.");
					else System.out.println("예3_2)_3이 1보다  작다.");
						//만약에 3이 일보다 크면 3_1 출력
						//아니면 3이 1보다 작으면 3_2출력
				//실행문 2줄 이상이면 (;2개 이상이면) {} 중괄호처리하기.--true 실행문 구분위해
					if(3>2) {System.out.println("true"); System.out.println("3이2보다크다");}
					else //false실행문 시작
						{System.out.println("true"); System.out.println("3이 2보다작다.");}//false실행문 끝
					
			//경우의 수, 조건이다수일 때
			//IF(조건){실행문[참1];}
			//Else IF(조건2){실행문[참1]}
			//Else IF(조건3){실행문[참2]}	
			//Else IF(조건4){실행문[참3]}
			//Else IF(조건5){실행문[참5]}	
			//Else {실행문[거짓, 그 외]}
					
				//예제 5
					if(3>5)System.out.println("예5) 3이 5보다 크다");//실행X
					else if(3>4)System.out.println("예5)3이 4보다 크다.");//실행X
					else if(3>3)System.out.println("예5)3이 3보다 크다");//실행X
					else if(3>2)System.out.println("예5)3이 2보다 크다.");//실행O
					else System.out.println("true 없다.");//실행X
					
			//IF 중첩 가능
				//if(조건식)[
				//	 if(조건식){실행문;}
				//	 else{ 실행문;}
				//  }else{
				//		if(조건식){실행문;}
				//		else{실행문;}
				//	}
					
					
	}//m e
}// c e