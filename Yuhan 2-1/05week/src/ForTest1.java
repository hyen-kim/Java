public class ForTest1 {
	public static void main(String[] args) {
		// for���� �ݺ�Ƚ���� ��Ȯ�� �� �� ����ϴ� ���� ����.
		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + "\t");	// Ư������ : tab
			if(((i+1) % 7) == 0) {
				System.out.println();
			}
		}
	}
}
