import java.util.Scanner;

public class MutiIfElseTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ü���� �Է� : ");
		int weight = sc.nextInt();	// ���� �Է�
		
		if (weight >= 100) {
			System.out.println("�����Դϴ�.");
		}else if(weight >= 80) {
			System.out.println("���Դϴ�.");
		}else if(weight >= 60) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�̴��Դϴ�.");
		}
		
		sc.close();
	}
}
