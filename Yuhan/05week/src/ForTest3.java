import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;				// �հ踦 ������ ����
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",num, sum);
	}
}
