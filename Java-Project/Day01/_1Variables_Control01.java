package Day01;
import javax.swing.JOptionPane;

/*
 * ����, ź��ȭ��, �ܹ��� Į�θ��� �հ踦 ����ϴ� ���α׷�
 * -> ����, ź��ȭ��, �ܹ����� �׷��� Ű���� �Է� (Scanner ���)
 * -> �� Į�θ� ���ϱ�
 * 	���� 1�׷� : 9Į�θ�
 * 	�ܹ����� ź��ȭ�� 1�׷� : 4 Į�θ�
 * 	�� Į�θ� = ���� * 9 + �ܹ��� * 4 + ź��ȭ�� * 4
 * */

public class _1Variables_Control01 {

	public static void main(String[] args) {
		
		int fat = Integer.parseInt(JOptionPane.showInputDialog("������ �׷��� �Է��ϼ���."));
		int carbo = Integer.parseInt(JOptionPane.showInputDialog("ź��ȭ���� �׷��� �Է��ϼ���."));
		int pro = Integer.parseInt(JOptionPane.showInputDialog("�ܹ����� �׷��� �Է��ϼ���."));
		
		int sum = fat * 9 + carbo * 4 + pro * 4;
		
		System.out.println("�� Į�θ� : " + sum + " cal");

	}

}
