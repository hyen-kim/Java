import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
//		����ڰ� ���� �˰� �ִ� ���¿��� �ݺ��� ������
//		int i = 0;
//		
//		while(i < 5) {	// 0 ~ 4 => 5�� ����
//			System.out.println(">> �ݺ��� ����");
//			i ++;	//i�� ������
//		}

		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		// ����ڰ� ���� ���Ƿ� ���� �Է��ϰ� �ؼ� �ݺ��� ������
		while(true) {	// ���ѷ���
			System.out.print("������ �Է� : ");
			num = sc.nextInt();
			System.out.printf(">> �Է��� ���� %d �Դϴ�.\n", num);
			
			if(num == 0) {
				System.out.println(">> 0�� �Է������Ƿ� ���α׷��� ����˴ϴ�.");
				break;	// while�� �������´ٴ� ��
			}
		}// �̷������� �ݺ�Ƚ���� �� �� while���� ����ϴ� ���� ����.
		
		sc.close();
	}
}
