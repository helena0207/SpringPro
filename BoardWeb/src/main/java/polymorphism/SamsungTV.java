package polymorphism;

public class SamsungTV implements TV{
	public void powerOn() {
		System.out.println("SamsumgTV ---- ���� �Ҵ�");
	}
	public void powerOff() {
		System.out.println("SamsumgTV ---- ���� ����");
	}
	public void volumeUp() {
		System.out.println("SamsumgTV ---- �Ҹ� �ø���");
	}
	public void volumeDown() {
		System.out.println("SamsumgTV ---- �Ҹ� ������");
	}
}
