package Day09;

public class HankookTire extends Tire {//서브클레스 extends 슈퍼클레스
	//필드
	//생성자
	public HankookTire(String location,int maxRotation) {
		super(location,maxRotation);//super(인수1, 인수2)// 슈퍼클래스 내[인수2개]생성자호출
	}
	//메소드
			//ctrl+스페이스바
	@Override//슈퍼클래스 내 메소드 재정의[수정]
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" HankookTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else{System.out.println("*** "+location+"HankookTire 펑크***");
		return false;
		}
	}
}
