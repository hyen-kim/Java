
public class ArrayTest3 {
	public static void main(String[] args) {
		// 3�� 4���� 2���� �����迭 (�ึ�� ���� ���̰� �ٸ� �迭)
		int[][] nums = new int[3][];
		
		int cnt = 1;
		
		// [0]�� 1 
		// [1]�� 2 3
		// [2]�� 4 5 6

		for (int i = 0; i < nums.length; i++) {
			nums[i] = new int[i+1];	// ���� ���̸� ������
			// �����迭������ �� �࿡ ���� ���� ��ü ������ �ʿ�
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = cnt++;
			}
		}
		
		// 2���� �迭�� �� ������ ���
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
