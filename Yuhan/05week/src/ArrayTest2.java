
public class ArrayTest2 {
	public static void main(String[] args) {
		// 3�� 4���� 2���� �迭
		int[][] nums = new int[3][4];
		int cnt = 1;
		// [0]�� 1 2 3 4
		// [1]�� 5 6 7 8
		// [2]�� 9 10 11 12

		for (int i = 0; i < nums.length; i++) {
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
