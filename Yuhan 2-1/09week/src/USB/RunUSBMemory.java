package USB;

public class RunUSBMemory {
	
	public static void main(String[] args) {
		USBMemory usb1 = new USBMemory(32, "Red", 2.0);
		usb1.read();
		usb1.write();
		USBMemory usb2 = new USBMemory(64, "Gold", 3.0);
		usb2.read();
		usb2.write();
		
		// USBMemory usb3 = new USBMemory();  // �⺻������ (default) : �Ű������� ���� ������
		// �⺻ �����ڷ� ������ ��� ���� �߻�
		// Ŭ������ �����ڰ� �ϳ��� ���� �Ǿ� �ִٸ�
		// ���� �Ǿ� �ִ� �����ڸ� ��� ����
		// �⺻ �����ڸ� ����ϰ� �ʹٸ� Ŭ�������� �⺻ �����ڸ� �����ϸ� �ȴ�.
	}
}
