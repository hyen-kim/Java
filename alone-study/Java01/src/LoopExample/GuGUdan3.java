// ������ ���� : �� �� �Է� �� ��� 

package LoopExample;

import java.util.Scanner;
public class GuGUdan3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("* �ܼ��� �Է��ϼ��� : ");
		int dan = s.nextInt();
		System.out.printf("===== %d���� ����մϴ�. =====\n", dan);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\t", dan, i, dan*i);
			if(i % 3 == 0)
				System.out.println();
		}
			System.out.println("* ��� �Ͻðڽ��ϱ�?(��� : 1, ���� :0)");
			int cont = s.nextInt();
			if(cont==0)
				break;
		}
s.close();
	}

}
