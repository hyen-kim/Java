package LoopExample;

public class ArrayTest2 {

	public static void main(String[] args) {
		//�ڹٴ� ���� �迭�� ����Ѵ�.(Dynamic Array)
		int[][] arr = new int[3][];
		int num = 1;
		
		for (int i = 0; i < arr.length; i++) {
			//arr.length ���� ũ�� arr[0].lenght ���� ũ��
			arr[i] = new int [4-i];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		//���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
