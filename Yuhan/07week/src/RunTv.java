
public class RunTv {
	public static void main(String[] args) {
		// Tv ��ü �����ϴ� ���
		// Tv Ŭ������ ����Ͽ� ������ ���� ��ü�� ������ �� �ִ�.
		
		// tv1 ��ü 
		TV tv1 = new TV();
		tv1.setColor("Silver");
		tv1.setSize(77);
		tv1.setChannel(1);
		tv1.setVolume(10);
		System.out.println("==============================");
		System.out.println("TV �𵨸� : " + TV.modelName);
		System.out.println("TV ũ�� : " + tv1.getSize());
		System.out.println("TV ���� : " + tv1.getColor());
		System.out.println("TV ���� : " + tv1.getVolume());
		System.out.println("TV ä�� : " + tv1.getChannel());
		System.out.println("==============================");
		
		tv1.powerOn();
		for (int i = 0; i < 5; i++) {
			tv1.upChannel();
		}
		for (int i = 0; i < 10; i++) {
			tv1.upVolume();
		}
		
		// tv2 ��ü
		TV tv2 = new TV();
		tv2.setColor("Black");
		tv2.setSize(55);
		
		System.out.println("==============================");
		System.out.println("TV �𵨸� : " + TV.modelName);
		System.out.println("TV ũ�� : " + tv2.getSize());
		System.out.println("TV ���� : " + tv2.getColor());
		System.out.println("TV ���� : " + tv2.getVolume());
		System.out.println("TV ä�� : " + tv2.getChannel());
		System.out.println("==============================");
		
		tv2.powerOn();
		tv2.powerOff();
	}
}
