
public class ExceptionTest3 {
	public static void main(String[] args) {
		// int [] arr1 = {1, 2, 3, 4, 5}; // arr1�� ����� ���ÿ� �ʱ�ȭ �� �� ����
		int[] arr1 = new int[5];

		// arr1 �迭�� ���� ����
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		// �迭�� �ε��� ��ȣ�� 0~4���� ��� ����
		for (int i = 0; i <= arr1.length; i++) {
			try {
				System.out.print(arr1[i] + "\t");
			} catch (ArrayIndexOutOfBoundsException e) {
				// �ε��� ��ȣ�� �ʰ��Ͽ��� ��
				System.out.println("\n�迭�� �ε����� ������ ������ϴ�. : " + i);
			}
		}
	}
}
