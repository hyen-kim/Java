import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2_1 {

	public static void main(String[] args) {
		Scanner sc = null;
		int num1, num2;
		
		try {
			System.out.print(">> ���� �Է�(����) : ");
			num1 = sc.nextInt();
			System.out.print(">> ���� �Է�(�и�) : ");
			num2 = sc.nextInt();
			System.out.printf("%d �� %d = %d\n", num1, num2, num1/num2);
		}catch (ArithmeticException e) {
			// �и� 0�� ���
			System.out.println("�и� 0�� �Է��� �� �����ϴ�.");
		}catch (InputMismatchException e) {
			// �Է��� ���� ���ڰ� �� ���
			System.out.println("������ �Է��Ͽ��ּ���.");
		}catch (NullPointerException e) {
			System.out.println("scanner ��ü�� �������� �ʰ� ����߽��ϴ�.");
		}finally { 
			// ������ ����
			System.out.println("���α׷��� �����մϴ�.");
		}
		
		sc.close();
		
	}
}
