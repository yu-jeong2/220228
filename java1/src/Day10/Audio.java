package Day10;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {System.out.println("����� �մϴ�.");}
	@Override
	public void turnOff() {System.out.println("����� ���ϴ�.");}
	@Override
	public void setVolum(int volum) {
		if(volume>RemoteControl.MAX_VOLUM) {
			this.volume=RemoteControl.MAX_VOLUM;
		}else if(volume<RemoteControl.MIN_VOLUM) {
			this.volume=RemoteControl.MIN_VOLUM;
		}else {this.volume=volume;}
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
