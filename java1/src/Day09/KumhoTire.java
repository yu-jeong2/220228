package Day09;

public class KumhoTire extends  Tire {//서브클레스 extends 슈퍼클레스
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
		//슈퍼클래스 내 생성자 호출[코드줄이기]
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" KumhoTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {System.out.println("*** "+location+"KumhoTire 펑크***");
		return false;
		}
	}
}
