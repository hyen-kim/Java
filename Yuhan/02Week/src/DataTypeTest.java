
public class DataTypeTest {
	//		�ܾ �ٲ� ������ �ظ��ϸ� �빮�ڷ� ����
	public static void main(String[] args) {
		
		// Non-Numeric Type ( ���ڰ� �ƴ��� )
		
		boolean b = true;	// true, false�� �Է�
		char c = 'A';
		char c2 = 98;
		
		System.out.println("c2 = " + c2);	// b�� ����
		// 98�� �ش��ϴ� ���ڰ��� ���´ٴ� ��
		System.out.println("c2 = " + (c2+1));	// 99�� ����
		// ���������� �����ϸ鼭 ���������� ���������� �ٲ���� ������
		System.out.println("c2 = " + (char)(c2+1));	// c�� ����	// <-- ��������ȯ
		// �������� �ٽ� ���������� �� ��ȯ�� ��
		
		
		// Numeric Type ( ������ )
		
		// ������ : byte, short, int, long
		byte bb = 127;	// 2^-7 ~ 2^7 
		// byte bb = 128; �� ���� ���� �߻� 
		// why ? �ڷ����� ������ �ʰ��Ͽ��� ������ 
		// ���� ����� ����ǥ�� �ߴ� ������ ������ �س��� ���� �ʾҴٴ� �ǹ�
		short s = bb;		// <-- ������ ����ȯ
		s = 128;
		
		int i = s;
		i = 1000000;
		
		long l = i;			// <-- ������ ����ȯ ( ������ -> ū�� )
		l = 1000000000;
		
		// �Ǽ��� : float, double
		float f = l;	// ��Ȯ�ϰ� long�� ���� �ƴ϶� �߷��� ��
		System.out.println(f);
		// f = 3.14; => 3.14�� f�� ���� �ʾƼ� double������ �νĵǾ ���� ������ ���� ����	
		f = 3.14f;
		
		double d = 6.17;
		
		d = 300/3;
		System.out.println("300 / 3 = " + d); // 100.0
		// why ? �ڵ��� ��ȯ�� �Ͼ�� ������ d�� �ڷ����� double�̱� ������
	}
}
