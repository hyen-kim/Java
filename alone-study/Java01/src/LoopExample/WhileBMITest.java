package LoopExample;

import java.util.Scanner;

public class WhileBMITest {
	
	//Body Mass Index(BMI, ü��������)
			/* [�����м�]
			 * 1. �Է� : ����� ����(����, ü��, Ű)
			 * 2. ��� : ����� ����, BMI, BMI�� ü��
			 * 3. ó������ : BMI ���, BMI ���� �̿��ؼ� ü��(���� if)
			 * ���� ü��/Ű/Ű
			 * ��ü�� 18.5�̸�
			 * ���� 20�̻� 25�̸�
			 * ��ü�� 25�̻� 30�̸�
			 * �� 30�̻� 35�̸�
			 * ���� 35�̻�
			 */
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		while(true) {
			System.out.printf("�̸��� �Է��ϼ��� :");
			String name = s1.nextLine();

			System.out.printf("ü���� �Է��ϼ��� : ");
			double w = s2.nextDouble();
			
			System.out.printf("Ű�� �Է��ϼ���  : ");
			double h = s2.nextDouble();
			
			double bmi = w/Math.pow(h/100, 2);
			String result;

			if(bmi<18.6)
				result = "��ü��";
			else if(bmi<25)
				result = "����ü��";
			else if(bmi<30)
				result = "��ü��";
			else if(bmi<35)
				result = "��";
			else
				result = "����";
			
			System.out.printf("%s���� ü���� %.3fkg, Ű�� %.2fcm�̹Ƿ� BMI�� %.2f�Դϴ�.\n", name, w, h, bmi);
			System.out.printf("���� %s���� ü���� %s�Դϴ�.\n", name, result);
			
			System.out.println("* ��� �Ͻðڽ��ϱ�?(��� : 1, ���� :0)");
			int cont = s2.nextInt();
			if(cont==0)
				break;
		}
		
		
		s1.close();
		s2.close();
	}

}
