// �ʵ� (�Ӽ�)   	: �𵨸�(modelName), ũ��(size), ����(color), ä��(channel), ����(volume)
// �޼ҵ� (���)  	: ������ �Ѵ�(powerOn), ����(powerOff), ä�οø���/������(up/down Channel), �����ø���/������(up/down Volume)

public class TV {
	// �ʵ�
	final static String modelName = "LGM00071Q";	// �𵨸��� ����� ����
	private String color;
	private int size, channel = 505, volume;
	
	// getter : ��ȯ / setter : ����
	
	
	
	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �Ѵ�.");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public static String getModelname() {
		return modelName;
	}

	void powerOff() {
		System.out.println("������ ����.");
	}

	void upChannel() {
		++channel;
		System.out.println("ä���� �ø���. ����ä�ι�ȣ : " + channel);
	}

	void downChannel() {
		--channel;
		System.out.println("ä���� ������. ����ä�ι�ȣ : " + channel);
	}

	void upVolume() {
		++volume;
		System.out.println("������ �ø���. ���纼����ȣ : " + volume);
	}

	void downVolume() {
		--volume;
		System.out.println("������ ������. ���纼����ȣ : " + volume);
	}

}
