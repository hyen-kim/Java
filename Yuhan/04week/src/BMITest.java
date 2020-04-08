import java.util.Scanner;

public class BMITest {
	public static void main(String[] args) {
		// BMT : ü���� ����
		// BMI = ü��/Ű������ (��/��)

		// ü�߰� Ű�� ���� �Է�
		Scanner sc = new Scanner(System.in);

		System.out.print("ü�� �Է� (��) : ");
		double weight = sc.nextDouble();
		System.out.print("Ű �Է� (��) : ");
		double height = sc.nextDouble();

		// API = ���̺귯��
		// BMI�� ����ϴ� �κ�
		double bmi = weight / Math.pow(height / 100, 2);
		//								 cm -> m
		
		String bmiMsg;
		
		if(bmi < 18.5) {
			bmiMsg = "��";
		}else if(bmi < 23) {	// 18.5 �̻��̸鼭 23 �̸�
			bmiMsg = "����";
		}else if(bmi < 25) {	// 23 �̻� 25 �̸�
			bmiMsg = "��";
		}else if(bmi < 30) {	// 25 �̻� 30 �̸�
			bmiMsg = "��";
		}else {					// 30 �̻�
			bmiMsg = "��";
		}
		
		System.out.printf("������ ü���� %.2f��, Ű�� %.2f���Դϴ�.\n",weight, height);
		System.out.printf("BMI ������ %.3f�̰�, ���� ������ %sü���Դϴ�.\n", bmi, bmiMsg);
		
		sc.close();
	}
}
