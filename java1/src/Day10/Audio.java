package Day10;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {System.out.println("오디오 켭니다.");}
	@Override
	public void turnOff() {System.out.println("오디오 끕니다.");}
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
