package Day01;

import javax.swing.JOptionPane;

/* 1���� ����ڰ� �Է��� �������� �� ���ϱ�
 * 100�� �Է��ϸ� 1���� 100������ Ȧ�� �հ� ¦�� �հ� ���
 */

public class _1for01 {
	public static void main(String[] args) {
		int suinput = Integer.parseInt(JOptionPane.showInputDialog("�� �Է�"));
		int odd = 0, even = 0;
		
		for(int i = 1; i <= suinput; i++) {
			if (i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		
		System.out.println("Ȧ�� �հ� : " + odd);
		System.out.println("¦�� �հ� : " + even);

	}

}
