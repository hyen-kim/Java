package Day01;

import javax.swing.JOptionPane;

/*
 * ���� �˰���
 * : �� ���� �迭��Ҹ� ���Ͽ� ù ��° ��� ���� �� ��° ��Һ��� ������ �� ���� ��ȯ�Ͽ�
 *   ���� ū ���� ù ��° �迭 ��ҷ� �̵���Ų��.
 * 
 * ������ ���� 5���� Ű����� �Է� �޾Ƽ� �迭�� ������ ��,
 * ������������ �����Ͽ� ����Ͻÿ�.
 * */

public class _2array02 {
	public static void main(String[] args) {
		System.out.println("5���� ���ڸ� �Է��ϼ���");
		int[] array = new int[5];
		
		for (int i = 0; i < 5; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "��° ���� �Է�"));
		}
		
		// ���� : ���� ���� ���� ?
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// ���� �� ���
		System.out.println("======= �������� =======");
		for (int i = 0; i < 5; i++) {
			System.out.printf(array[i] + " ");
		}
		
	}
}
