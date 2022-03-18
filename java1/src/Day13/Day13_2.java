package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2 {
	public static void main(String[] args) {
		//Date (java.util) : 시스템 날짜/시간
		Date date=new Date();
		System.out.println("현재 날짜/시간 :"+date);
		System.out.println("객체정보메소드 : "+date.toString());
		String strNow1=date.toString();
			//SimpleDateFormat 클래스 : 날짜/시간 포멧(형식=모양)변환
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//날짜에 형식 적용하기[Date형식->String형식으로 변환]
		String strNow2=sdf.format(date);//형식객체.format(날짜객체)
		System.out.println(strNow2);
				
		//calender 클래스: 운영체제 시간대의 날짜/시간에 대한 정보
		Calendar now=Calendar.getInstance();//Calendar 클래스 내 객체호출
				//이미 Calendar 클래스 내 객체가 존재함(별도로 객체생성X new사용안함.)
		System.out.println("연도 : "+now.get(Calendar.YEAR));
		System.out.println("월 : "+(now.get(Calendar.MONTH)+1));//0~11까지, 0=1월, 11=12월
		System.out.println("일 : "+now.get(Calendar.DAY_OF_MONTH));//일
		System.out.println("요일 : "+now.get(Calendar.DAY_OF_WEEK) );//요일
							//1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토
		int week=now.get(Calendar.DAY_OF_WEEK);
		String 요일=null;//한글 요일을 저장할 변수 사용할 예정
		switch(week){
			case 1 : 요일="일요일";break;
			case 2 : 요일="월요일";break;
			case 3 : 요일="화요일";break;
			case 4 : 요일="수요일";break;
			case 5 : 요일="목요일";break;
			case 6 : 요일="금요일";break;
			case 7 : 요일="토요일";break;
		}
		System.out.println("요일[한글] : "+요일);
		
		// 오전/오후
		System.out.println("오전/오후 : "+now.get(Calendar.AM_PM));//0이면 오전, 1이면 오후
		int ampm=now.get(Calendar.AM_PM);
		String 오전오후=null;
		if(ampm==0)오전오후="오전";
		else 오전오후="오후";
		System.out.println("오전/오후 : "+오전오후);
				
		//시간
		System.out.println("시 : "+now.get(Calendar.HOUR));
		System.out.println("분 : "+now.get(Calendar.MINUTE));
		System.out.println("초 : "+now.get(Calendar.SECOND));
		
		ZonedDateTime 협정시=ZonedDateTime.now(ZoneId.of("UTC"));//UTC : 협정시
			System.out.println("협정시 : "+협정시);//한국은 9시간 빠르니 -9 해야함.
		협정시=ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
			System.out.println("서울시간 : "+협정시);
		협정시=ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println("뉴욕시간 : "+협정시);
		
		
		
			
	}

}
