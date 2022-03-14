package Day09;

public class Tire {

	//필드
	public int  maxRotation;//최대회전수[회전가능수]
	public int accumulatedRotation;//누적회전수
	public String location;//타이어 위치
		
	//생성자[객체 생성시초기값]
	public Tire(String location, int maxRocation) {
		this.location=location;
		this.maxRotation=maxRocation;
	}
	//메소드
	public boolean roll() {//타이어 회전 구현 메소드
		accumulatedRotation++;//누적회전수1 증가// 타이어회전
		if(accumulatedRotation<maxRotation){//만약에 누적회전수가최대 회전수보다 작으면[수명남음]
			System.out.println(location+" Tirl수명 : "+(maxRotation-accumulatedRotation)+"회");
			return  true;
		}else {System.out.println("***"+location+"Tire 펑크 ***");
		return  false;
		}
	}
}

