package ClassExample01;

public class UseObjectTest {
	
	// ��ȯ�� (void)�� �����Ƿ� return�� ���� �ʿ䰡 ����.
	// ȣ��Ǹ� ��¸� ���ִ� class.
	void printMsg() {
		System.out.println("Java ������");
		System.out.println("����Ŵϴ�.");
		System.out.println("�ڰ�ͽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		UseObjectTest uot = new UseObjectTest();
		uot.printMsg();
	}

}
