
public class ContinueTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			if ((i % 2) == 1) {
				// i�� Ȧ���� �ؿ� ������ �������� �ʰ� ���� �ö󰣴�.
				continue;
			}
			System.out.printf("%d\t", i);
		}
		System.out.println("\n¦���� ����� �Ǿ��׿� ~");
	}
}
