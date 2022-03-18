package Day13;

import java.util.Random;

public class Day13_1 {
	public static void main(String[] args) {
		//p. 534 : Math클래스(java.lang패키지)[수학관련 메소드 제공] :객체없이 사용 가능
		System.out.println("절대값 : "+Math.abs(-5));//절대값
		System.out.println("절대값 : "+Math.abs(-3.14));//절대값
		
		System.out.println("올림값 : "+Math.ceil(5.3));//올림 : 소수점 첫째자리에서 올림.
		System.out.println("올림값 : "+Math.ceil(-5.3));//올림[-5]
		
		System.out.println("버림값 : "+Math.floor(5.3));//내림
		System.out.println("버림값 : "+Math.floor(-5.3));//내림[-6]
		
		System.out.println("최대값 : "+Math.max(5, 9));//최대값(두 숫자 중 큰 수 고름)
		System.out.println("최대값 : "+Math.max(5.3,2.5));//최대값(두 숫자 중 큰 수 고름)
		
		System.out.println("최소값 : "+Math.min(5, 9));//최소값(두 숫자 중 작은 수 고름)
		System.out.println("최소값 : "+Math.min(5.3, 3.5));
		
		System.out.println("난수 : "+Math.random());//0~1사이의난수 발생
		
		System.out.println("가까운 정수의 실수값 : "+Math.rint(5.3));//가까운 정수의 실수값 구하기(반올림)
		System.out.println("가까운 정수의 실수값 : "+Math.rint(5.7));
		
		System.out.println("가까운 정수의 정수값 : "+Math.round(5.3));//가까운 정수의 정수값
		System.out.println("가까운 정수의 정수값 : "+Math.round(5.7));//가까운 정수의 정수값
		
		//특정 소숫점 위치에서 반올림
		double value=12.3456;//소수 셋째자리에서 반올림하기
		double temp1=value*100;//1234.56
		long temp2=Math.round(temp1);//round로 정수로 반올림하기
		double v16=temp2/100.0;
				//temp2/100-> long/int ->자바에서 기본 정수형은 int라 정수로 인식함.
				//temp2/100.0 ->  long/double ->기본실수형 : double
		System.out.println("v16="+v16);
		
		System.out.println("0~1 사이의 실수형 : "+Math.random());
		System.out.println(Math.random()*6);//0~1 *6 -> 0~6 사이의 실수
		System.out.println(Math.random()*6+1);//1~7까지의 실수
		int num=(int)(Math.random()*6)+1;
			//(기본자료형) 값/변수=강제형변환(큰상자->작은상자 : 데이터손실)
			//double -> 강제형변환시에 소수점 다 짤림
		System.out.println("1~6 사이의 난수 : "+num);
		//Random클래스 사용시
		Random random=new Random();
		System.out.println("1~6 사이의 난수 : "+(random.nextInt(6)+1));
		
		
		
				
		
				

		
		
	}

}
