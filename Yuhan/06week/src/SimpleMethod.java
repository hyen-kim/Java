// �Ű����� ���� �޼ҵ� ȣ��
public class SimpleMethod {
	// ���������� ����Ÿ�� �޼ҵ��̸�
	public static void printHead() {
		System.out.println("===============================");
	}
	// ���� static�� ����� �Ǹ� error �߻�

	public static void main(String[] args) {
		printHead(); // �޼ҵ� ȣ��
		System.out.println("Java Programming");
		printHead();
		System.out.println("Learning Method");
		printHead();
	}
}
