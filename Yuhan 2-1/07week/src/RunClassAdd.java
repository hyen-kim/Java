
public class RunClassAdd {
	public static void main(String[] args) {	

		ClassAdd c1 = new ClassAdd();	// ��ü ���� -> ���������ڷ� ����
		ClassAdd c2 = new ClassAdd();
		// �ٸ� �޸𸮰����� ����
		
		int result1 = c1.addNum(12, 7);
		int result2 = c2.addNum(128, 534);
		// ���� �ٸ� �޸𸮿� �ִ� �޼ҵ��̴�.	=> ���� �ٸ� ���� �Ҵ�Ǿ� ����
		
		System.out.printf("c1.addNum(12, 7)�� %d\n", result1);
		System.out.printf("c2.addNum(128, 534)�� %d\n", result2);
		// ���� �ٸ� ��ü�̹Ƿ� ���� �ٸ� �޼ҵ带 �̿��Ͽ� ����� Ȯ��
	}
}
