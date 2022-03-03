package Day02;

import java.util.Scanner;

public class Day02_6 {//c s
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		System.out.println("7의 배수인지 확인 위해 숫자를 입력하시오"); int 숫자  = scanner.nextInt();
		System.out.println("입력한 정수는 7의 배수 판단 : "+(숫자%7==0));
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		System.out.println("홀, 짝을 위해 숫자를 입력하세요"); int 홀짝  = scanner.nextInt();
		System.out.println("당신이 입력한 숫자는 : "+(홀짝%2>=1));
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		System.out.println("숫자를 입력하세요"); int 문제4  = scanner.nextInt();
		System.out.println("당신이 입력한 숫자는 : "+(문제4%7/2==0)); //문제4/7==0 && 문제4/2==0
		
		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		System.out.println("문제6.숫자1을 입력하세요"); int 숫자1 = scanner.nextInt();
		System.out.println("문제6.숫자2를 입력하세요"); int 숫자2 = scanner.nextInt();
		int 큰수=숫자1>숫자2?숫자1:숫자2;
		System.out.println("두 수중 큰 수는"+큰수);
		

		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
		System.out.println("반지름을 입력하시오"); int 반지름 = scanner.nextInt();
		System.out.println("원의 넓이는 : "+반지름*반지름*3.14+"입니다");
												   
										   
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5   84.3 이면    64.285714%
//		System.out.println("문제8.숫자 하나 입력하세요"); double 숫자1 = scanner.nextDouble();
//		System.out.println("문제8.숫자 하나 더 입력하세요"); double 숫자2 = scanner.nextDouble();
		System.out.println("답 : "+숫자1/숫자2*100+"%입니다");
		double 비율=숫자1/숫자2*100;
		
		System.out.printf("실수1의실수2 백분율 : %.2f%%",비율);
				
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
		//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2		
		System.out.println("문제8.밑변의 길이를 입력하시오"); int 밑변 = scanner.nextInt();
		System.out.println("문제8.윗변의 길이를 입력하시오"); int 윗변 = scanner.nextInt();
		System.out.println("문제8.높이의 길이를 입력하시오"); int 길이 = scanner.nextInt();
		System.out.println("사다리꼴의 넓이는"+밑변*윗변*길이/2+"입니다");
		
		
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
		//표준체중 계산식 = > (키 - 100) * 0.9
		System.out.println("키를 입력하세요."); float 키=scanner.nextFloat();
		System.out.println("표준체중은 "+(키-100/0.9f)+"입니다");
	
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
		//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		
		System.out.println("키 : ");int 키2 =scanner.nextInt();
		System.out.println("몸무게 : ");int 몸무게=scanner.nextInt();
		System.out.printf("BMI : %.2f\n"+몸무게/((키2/100.0)*(키2/100.0)));
	
		
		
		
		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
		System.out.println("/n인치를 입력하세요"); float 인치=scanner.nextFloat();
		System.out.println("입력하신 인치는"+인치*2.54+"cm입니다.");
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
		//소수 둘째 자리 까지 점수 출력하기
		//중간고사 반영비율 => 30 %
		//기말고사 반영비율 => 30 %
		//수행평가 반영비율 => 40 %
		System.out.println("중간고사 점수를 입력하세요"); double 중간고사=scanner.nextDouble();
		System.out.println("기말고사 점수를 입력하세요"); double 기말고사=scanner.nextDouble();
		System.out.println("수행평가 점수를 입력하세요"); double 수행평가=scanner.nextDouble();
		double 총점수=(중간고사*30/100)+(기말고사*30/100)+(수행평가*40/100);
		System.out.printf("총 점수는 %.2f\n",총점수);
				
//		문제14 :  연산 순서 나열 하고 x와 y값 예측하기
//	 	int x = 10; // (10)
//		int y = x-- + 5 + --x; //(23)x-- +5+ --x;
//		printf(" x의 값 : %d , y의값 :  %d ", x, y)
//			1. x-- +5 -> 감소  먼저 + =>10+5
//			2. x-- -> x는 감소[x=9]
//			3. 15+ --x -> 감소 먼저 [x=8]
//			4. 15+8 =>y=23
			
		
		//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
		System.out.println("나이를 입력하세요"); int 나이=scanner.nextInt();
		String 연령대 = 나이 >= 40?"중년":나이<=20?"학생":"성인";
  		System.out.println("연령대는 "+연령대+"입니다.");
		

		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
		System.out.println("정수1을 입력하세요"); int 정수1 = scanner.nextInt();
		System.out.println("정수2을 입력하세요"); int 정수2 = scanner.nextInt();
		System.out.println("정수3을 입력하세요"); int 정수3 = scanner.nextInt();
	
		if(정수1>정수2) {int temp =정수1;정수1 = 정수2;	정수2=temp;	}	
		if(정수1>정수3) {int temp=정수1;정수1=정수3;정수3=temp;}
		if(정수2>정수3) {int temp=정수2;정수2=정수3;정수3=temp;}
		System.out.printf("입력한 값 오른차순 : %d %d %d", 정수1,정수2,정수3);
		

		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		
		System.out.println("문제17) 정수 1 입력 : "); int 정수4=scanner.nextInt();
		System.out.println("문제17) 정수 2 입력 : "); int 정수5=scanner.nextInt();
		System.out.println("문제17) 정수 3 입력 : "); int 정수6=scanner.nextInt();
		System.out.println("문제17) 정수 4 입력 : "); int 정수7=scanner.nextInt();
		if (정수4<정수5) {int temp=정수4;정수4=정수5;정수5=temp;}
		if (정수4<정수6) {int temp=정수4;정수4=정수6;정수6=temp;}
		if (정수4<정수7) {int temp=정수4;정수4=정수7;정수7=temp;}
		if (정수5<정수6) {int temp=정수5;정수5=정수6;정수6=temp;}
		if (정수5<정수7) {int temp=정수5;정수5=정수7;정수7=temp;}
		if (정수6<정수7) {int temp=정수6;정수6=정수7;정수7=temp;}
		System.out.printf("입력한 값 내림차순 : %d %d %d %d", 정수4,정수5,정수6,정수7);
		
		
		
		
		
	}//m e
}//c e
