import java.util.Scanner;

public class SimpleIfTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();	
	
		if(score >= 90) {
			// 90 �� �̻��� ������ score�� ���� ��쿡�� ����ȴ�.
			System.out.println(">> ����� �����Դϴ�.");
		}else {
			// ���� if���� ������ ��� ����
			System.out.println(">> �� �� ����Ͻø� ���� �� �����ϴ�.");
		}
		
		System.out.printf(">> ����� ������ %d�� �Դϴ�.", score);
		sc.close();	// ���� �ݾ��� �ʿ�� ������ �ݾ��ִ� ������ ���̴� ���� ����.
	}
}
