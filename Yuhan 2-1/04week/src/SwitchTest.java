import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		// �Է°��� ¦������ Ȧ������ �˾Ƹ��ߴ� ����

		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 ������ ���� �� �Է� : ");
		int su = sc.nextInt();

		// �������� ����Ͻ� switch��
		switch (su) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.printf("�Է��� ���� %d��(��) Ȧ���Դϴ�.\n", su);
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.printf("�Է��� ���� %d��(��) ¦���Դϴ�.\n", su);
			break;
		default :
			System.out.println("1~10������ ���� �Է¸� �����մϴ�.");
		}

		// ���� ������ switch�� : 1~10�� ���� �ƴϿ��� ¦���� Ȧ���� ���� ���� �� �ֽ��ϴ�.
		// switch() : ����, ����, ���ڿ�
		switch (su % 2) { // su�� 2�� ���� �������� ���� �ѱ�ڴ�.
		case 0: // �������� 0�� �� �� ¦���� ��
			System.out.printf("�Է��� ���� %d��(��) ¦���Դϴ�.\n", su);
			break;

		default: // �������� 1�� �� �� Ȧ�� �� ��
			System.out.printf("�Է��� ���� %d��(��) Ȧ���Դϴ�.\n", su);
			break;
		}
		

		sc.close();
	}
}
