// Ŭ�������� �������̽��� ��ӹ��� ���� implements
public class IPhone11 implements SmartPhone {

	// �ؿ��� �ڵ����� @Override
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Ǵ�.");
	}

	@Override
	public void rcvCall() {
		System.out.println("��ȭ�� �޴´�.");
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� ������.");

	}

	@Override
	public void rcvSMS() {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �޴´�.");

	}

	@Override
	public void searchMusic() {
		// TODO Auto-generated method stub
		System.out.println("������ �˻��Ѵ�.");

	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("������ ����Ѵ�.");

	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("������ �����.");

	}

	@Override
	public void installApp() {
		// TODO Auto-generated method stub
		System.out.println("���� ��ġ�Ѵ�.");

	}

	@Override
	public void runApp() {
		// TODO Auto-generated method stub
		System.out.println("���� �����Ѵ�.");

	}
	
	// �������̽� ���� ������ �߰� --> �������̽��� ��ӿ��� �޼ҵ� �߰� ����
	// �Ϲ����� �޼ҵ带 ��������� �߰�
	public void callSiri() {
		System.out.println("�ø��� �θ���.");
	}
	
}
