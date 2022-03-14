package Day09;

public class Com extends Cal{
	@Override//상속받은 부모가 가지고있는 메소드호출
	double areaCircal(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
}
