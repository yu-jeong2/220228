package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {
	public static void main(String[] args) throws InterruptedException {
		//DecimalFormat클래스
			//0 : 자릿수 [빈자리면 0으로 채움]
			//# : 자리수 [빈자리면채우기]
		double num=1234567.89;
		DecimalFormat df=new DecimalFormat("0");// -> 1234568(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("0.000"); //->1234567.890
		System.out.println(df.format(num));
		
		df= new DecimalFormat("0000000000.00000"); //->0001234567.89000
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#");// -> 1234568(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#.#");// -> 1234567.9(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("########.####");// -> 1234567.89(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#.0");// -> 1234567.9(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("+#.0");// -> +1234567.9(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("-#.0");// -> -1234567.9(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#,###.0");// -> 1,234,567.9(반올림)
		System.out.println(df.format(num));
		
		df= new DecimalFormat("0.0E0");// -> 1.2E6// E : 지수문자
		System.out.println(df.format(num));
		
		df= new DecimalFormat("+#,###;-#,###");// -> +1,234,568
		System.out.println(df.format(num));// 양수;음수
		
		df= new DecimalFormat("#.#%");// -> 123456789%
		System.out.println(df.format(num));//컴퓨터는 백분율을 모름.
				//[계산시 1:100%, 0.5:50% 0.05:5%]
		
		df= new DecimalFormat("#,###원");// 1,234,568원
		System.out.println(df.format(num));
		
		df= new DecimalFormat("#,##0원");// 0원
		System.out.println(df.format(0));
		
		df= new DecimalFormat("0,000원");// 0,000원
		System.out.println(df.format(0));
		
		df= new DecimalFormat("\u00A4 #,###");// -> ￦ 1,234,568
		System.out.println(df.format(num));
		
		//MessageFormat
		String id ="자바";
		String name="신용권";
		String tel="010-1234-5678";//{ } 변수가 들어가는 위치, 0부터 시작함.
		String text="회원 ID : {0} \n회원이름 : {1} \n회원 전화 : {2}";
		String result =MessageFormat.format(text,id,name,tel);
		System.out.println(result);		  //패턴  {0} {1} {2}	
		//데이터베이스에서 사용할 예정
		String sql="insert infomember valuse({0},{1},{2})";
		Object[] 배열= {id,name,tel};
		String result2=MessageFormat.format(sql,배열);
		System.out.println(result2);
		
		
		//JAVA 7버전 이전 Date, 이후에는 여러가지 날짜 API추가중
		LocalDate currDate=LocalDate.now();//날짜만 나옴
		System.out.println("현재날짜 : "+currDate);
		
		LocalTime currTime=LocalTime.now();//시간만 나옴
		System.out.println("현재시간 : "+currTime);
		
		//Date 현재날짜/시간 [조작이 안되거나 비교기능 불충분]
		
		LocalDateTime currDateTime=LocalDateTime.now();
		System.out.println("현재 시간/날짜 : "+currDateTime);
		
		LocalDateTime targetDateTime=LocalDateTime.of(2024,5,10,6,30,0,0);
		System.out.println("목표 날짜와 시간 : "+targetDateTime);
		
		//특정 시점의 타임스탬프 얻기
		Instant instant1=Instant.now();
		Thread.sleep(1000);//1초 대기[코드가 1초간 멈춤], 일반예외.(던지기)
		Instant instant2=Instant.now();//1초 멈춘 후 현재시간
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다.");//1초가 늦어져서 1이 더 빠름
		}else if(instant1.isAfter(instant2)){
			System.out.println("instant1이 늦습니다.");
		}else {
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(nanos): "+instant1.until(instant2, ChronoUnit.NANOS));
				
	
		
				
				
	}

}
