import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 1���� �迭 �ǽ�
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];	// int�� �迭 5�� ����
		int total = 0;
		
		for (int i = 0; i < nums.length; i++) {	// .length : ����
			System.out.printf(">> %d. ���� �Է� : ", i+1);
			nums[i] = sc.nextInt();
			total += nums[i];
		}
		
		double avg = (double)total / nums.length;	
		// ���� �� ��ȯ
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf(nums[i] + "\t");
		}
		
		System.out.println();
		System.out.println(">> �հ� : " + total);
		System.out.printf(">> ��� : %.2f ", avg);
		sc.close();
	}
}
