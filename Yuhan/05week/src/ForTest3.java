import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
		
		int sum = 0;				// �հ踦 ������ ����
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("�����հ踦 ���ϰ��� �ϴ� ������ ���� �Է¤� : ");
		int lastNum = sc.nextInt();
		
		for (int i = 1; i <= lastNum; i++) {
			sum += i;
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",lastNum, sum);
		
		sc.close();
	}
}
