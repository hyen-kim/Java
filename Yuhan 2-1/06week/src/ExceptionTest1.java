import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 �Է� : ");
		n1 = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		n2 = sc.nextInt();

		try {	// ���� ���ɼ��� �ִ� ����
			int result = n1 / n2;
			System.out.printf("%d / %d = %d\n", n1, n2, result);
		} catch (ArithmeticException e) { // ���ܰ� �ִٸ� ó������ ����
			// 0���� ���� �� �߻��ϴ� ����
			System.out.println("�и�� 0�̸� �ȵ˴ϴ�.");
		}
		
	}
}
