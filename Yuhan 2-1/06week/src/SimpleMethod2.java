// �Ű����� �ְ� �޼ҵ� ȣ��
public class SimpleMethod2 {
	// ���������� ����Ÿ�� �޼ҵ��̸�
	public static void printHead(char ch) {
		for (int i = 0; i < 15; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}


	public static void main(String[] args) {
		printHead('��'); // �޼ҵ� ȣ��
		System.out.println("Java Programming");
		printHead('��');
		System.out.println("Learning Method");
		printHead('��');
	}
}
