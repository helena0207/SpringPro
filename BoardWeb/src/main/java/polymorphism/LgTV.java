package polymorphism;

public class LgTV implements TV {
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("lg(1) 객체 생성");
	}
	public LgTV(Speaker speaker) {//SonySpeaker 객체가 먼저 생성된다.->LgTV객체가 생성된다
		System.out.println("lg(2) 객체 생성");
		this.speaker=speaker;
	}
	public LgTV(Speaker speaker, int price) {
		System.out.println("lg(3) 객체 생성");
		this.speaker=speaker;
		this.price=price;
	}
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리."); //xml설정파일: init-method 속성으로 지정
	}
	public void powerOn() {
		System.out.println("LgTV ---- 전원 켠다(가격 :"+price+")");
	}
	public void powerOff() {
		System.out.println("LgTV ---- 전원 끈다");
	}
	public void volumeUp() {
		//System.out.println("LgTV ---- 소리 올린다");
		speaker=new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown() {
		//System.out.println("LgTV ---- 소리 내린다");
		speaker=new SonySpeaker();
		speaker.volumeDown();
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리."); //xml설정파일 : destroy-method 속성으로 지정
	}
}
