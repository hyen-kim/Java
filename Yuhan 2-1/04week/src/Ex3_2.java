import java.util.Scanner;

public class Ex3_2 {
	public static void main(String[] args) {
		// ������ �Է� �޴� �κ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();

		// ������ ���� ������ ����ϴ� if��
		char scoreMsg;

		if (score >= 90) {
			scoreMsg = 'A';
		} else if (score >= 80) {
			scoreMsg = 'B';
		} else if (score >= 70) {
			scoreMsg = 'C';
		} else if (score >= 60) {
			scoreMsg = 'D';
		} else {
			scoreMsg = 'F';
		}
		
		// ���� ������ ������ ����ϴ� �κ�
		System.out.printf("���� %d �� ������ %c �Դϴ�.", score, scoreMsg);
	}
}
