package Day11;

public class OrcalDao implements DateAccessObject {
	@Override
	public void select() {
		System.out.println("����Ŭ DB���� �˻�");
	}
	@Override
	public void update() {
		System.out.println("����Ŭ DB�� ����");
		
	}
	@Override
	public void delete() {
		System.out.println("����Ŭ DB�� ����");
	}
	@Override
	public void insert() {
		System.out.println("����Ŭ DB�� ����");
		
	}


}
