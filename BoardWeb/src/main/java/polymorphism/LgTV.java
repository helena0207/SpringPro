package polymorphism;

public class LgTV implements TV {
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("lg(1) ��ü ����");
	}
	public LgTV(Speaker speaker) {//SonySpeaker ��ü�� ���� �����ȴ�.->LgTV��ü�� �����ȴ�
		System.out.println("lg(2) ��ü ����");
		this.speaker=speaker;
	}
	public LgTV(Speaker speaker, int price) {
		System.out.println("lg(3) ��ü ����");
		this.speaker=speaker;
		this.price=price;
	}
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��."); //xml��������: init-method �Ӽ����� ����
	}
	public void powerOn() {
		System.out.println("LgTV ---- ���� �Ҵ�(���� :"+price+")");
	}
	public void powerOff() {
		System.out.println("LgTV ---- ���� ����");
	}
	public void volumeUp() {
		//System.out.println("LgTV ---- �Ҹ� �ø���");
		speaker=new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown() {
		//System.out.println("LgTV ---- �Ҹ� ������");
		speaker=new SonySpeaker();
		speaker.volumeDown();
	}
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��."); //xml�������� : destroy-method �Ӽ����� ����
	}
}
