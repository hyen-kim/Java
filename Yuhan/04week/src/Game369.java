import java.util.Random;
import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		// �������� �� �ڵ�

		Scanner sc = new Scanner(System.in);
		int me = 0;
		int cnt = 1;

		int gamesu = 0;
		int jinsu = 10;
		int jin = 1;

		boolean game = true;
		
		System.out.println("������ ������ ������ ������ ! ���� !");
		// ���ӽ���
		while (game) {
			gamesu++; // ���Ӽ��� ����
			// 10, 20, 30 �ڸ����� �Ѿ ������ ���ٷ��� ������.
			if (gamesu >= jinsu) {
				jin = jinsu;
				jinsu += 10;
			}

			if ((cnt % 2) == 0) { // ��ǻ�Ϳ� ���� �ݺ��Ͽ�
				System.out.print("�� ���� �Է� : ");
				me = sc.nextInt();
				
				if (me == gamesu) { // ���� �Է��� ���ڰ� �´��� Ȯ���ϴ� �κ�
					System.out.println("-----------------");
				} else if (((gamesu % jin) == 3) || ((gamesu % jin) == 6) || ((gamesu % jin) == 9)) {
					System.out.println("-----------------");
				} else {
					System.out.println("���� OVER ------");
					game = false;
				}
			} else { // ��ǻ�� ���� 
				System.out.println("��ǻ�� ���� �Է� : " + gamesu);
			}
			cnt++;

		}
		sc.close();
	}
}
/*
 * error ?
 * ���� �ڸ� 6�� �ν����� ����...
 * ���ʺ��� �ڵ� ��ü�� ������
 * ���߿� ����� ����..
 * */
