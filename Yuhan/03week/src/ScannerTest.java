// Scanner�� ����Ϸ��� import�ؾ��Ѵ�.
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		// Scanner��� ��ü�� �����ϰ� �����ϴ� ������ s��.
		// System.in�� import�� �ʿ� X => lang ��Ű�� �ȿ� ����
		
		System.out.println("������ �Է��ϼ��� : ");
		String name = s.nextLine(); 
		// ���͸� �ľ� ���� �޾ƿ´�.
		
		System.out.println("����� �����ϴ� ������? (2�� ���鹮�ڷ� �����ؼ� �Է�) : ");
		String name2 = s.next();
		String name3 = s.next();
		// �������� ���� �޾ƿ´�.
		
		System.out.println("����� ������ " + name + "�Դϴ�.");
		System.out.printf("����� �����ϴ� ������ %s, %s �Դϴ�.\n", name2, name3);
	}

}
