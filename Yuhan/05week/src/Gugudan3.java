import java.util.Scanner;

public class Gugudan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("���� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		System.out.printf("������ %d�� �Դϴ�.\n", dan);
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\t", dan, i, (dan*i));
			if((i%3) == 0) {
				System.out.println();
			}
		}
		sc.close();
	}
}
