// �μ��� �ִ� ������
public class Construct2 {
	int k;
	// �Ű������� ����
	public Construct2(int n) {
		k = n;
		System.out.println("������ : �ʵ� k�� ���� " + k + "�� ������");
	}
	
	public static void main(String[] args) {
		Construct2 C1, C2;	// ��ü C1, C2 ����
		// ��ü�� ������ �� ���� �ٸ� ���� ���� -> 10
		// C1�� n�� 10�� �ְ� k�� 10�� �����ϴ� ���
		C1 = new Construct2(10);
		// ��ü�� ������ �� ���� �ٸ� ���� ���� -> 20
		C2 = new Construct2(20);
		// ���̶�� ������ ����
		
		System.out.println("������ ��ü C1�� ���� k�� ���� " + C1.k + "�Դϴ�.");
		System.out.println("������ ��ü C2�� ���� k�� ���� " + C2.k + "�Դϴ�.");
	}
}
