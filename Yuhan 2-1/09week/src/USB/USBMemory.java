package USB;

public class USBMemory {
	// �ʵ� : �ʵ�� ���� ������ �ʰ� ĸ��ȭ
	private int capacity; // USB �޸�
	private String color; // USB ����
	private double version; // USB ����
	
	// �⺻������
	public USBMemory() {
	}
	// �ڵ����� �����ڸ� �����ϴ� ���
	// source -> Generate Constructor using Fields 
	// ������ -> void X
	public USBMemory(int capacity, String color, double version) {
		// ���� �ʵ��� ��쿡�� this�� ����
		// this : ���� ��ü�� �ʵ带 ����Ŵ
		// �ƹ��͵� ������ �ʾ��� ���� ���������� ����
		this.capacity = capacity;
		this.color = color;
		this.version = version;
	}
	
	// getter(�ʵ尪 ��ȯ���� ��), setter(�ʵ尪�� ������ ��) �޼ҵ� : private ���� ��� ���
	public int getCapacity() {
		return capacity;
	}

	public String getColor() {
		return color;
	}

	public double getVersion() {
		return version;
	}

	// ��� ����
	// USB �޸𸮸� �о��
	public void read() {
		// ������ this�� �ٿ��µ� ���⼭�� �� �Ⱥٿ��� ?
		// ������ �Ű������� �����Ϸ��� ���ΰǵ� ���⼭�� ������ �ʿ䰡 ���� ������ ������ ���� ����
		System.out.println(capacity + "GB, " + color + "������ USB Memory�� �����͸� �д´�.");
	}
	public void write() {
		System.out.println(capacity + "GB, " + color + "������ USB Memory�� �����͸� �����Ѵ�.");
	}
}
