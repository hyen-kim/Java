import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ��ü ����
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();	// �������� �Է� �ްڴٴ� ��
	
		// �ܼ� ���ǹ� ( if�� )
		if(score >= 90) {
			// 90 �� �̻��� ������ score�� ���� ��쿡�� ����ȴ�.
			System.out.println(">> ����� �����Դϴ�.");
		}
		
		System.out.printf(">> ����� ������ %d�� �Դϴ�.", score);
		sc.close();	// ���� �ݾ��� �ʿ�� ������ �ݾ��ִ� ������ ���̴� ���� ����.
	}
}
