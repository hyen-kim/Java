import java.util.Scanner;

public class BreakTest {
	public static void main(String[] args) {
		// Ư�� �Է� ���� ������ ���α׷��� ���߰� �ۼ�
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		while (true) {
			System.out.printf("�����ϴ� ���� �Է� : ");
			msg = sc.nextLine();
			if(msg.equals("quit")) {	// ���ڸ� ���� ���� .equals
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
			System.out.println(msg + "�Դϴ�.");
		}
		sc.close();
	}
}
