// ���ϰ��� �ִ� �޼ҵ�
public class ReturnMethod {
	public static int sum(int n1, int n2) {
		int sum = n1 + n2;
		return sum;	// sum���� ����
		// �پ缺���� ���� ������ �޼ҵ� �̸��� ������ ��������� ��� ����
	}
	
	
	public static void main(String[] args) {
		int n1, n2;
		n1 = 11; n2 = 66;
		
		int result = sum(n1, n2);	// sum �޼ҵ带 ȣ���Ͽ� n1�� n2���� ���Ѱ��� ���Ϲ���
		System.out.printf("%d + %d = %d\n", n1, n2, result);
		
		n1 = 222; n2 = 333;
		result = sum(n1, n2);
		System.out.printf("%d + %d = %d\n", n1, n2, result);
	}
}
