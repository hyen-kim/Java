// �μ��� ���� ������
public class Construct1 {
	//�ʵ�
	int k;
	// ������
	public Construct1() {
		k = 10;	// k��� �ʵ��� ���� �ʱ�ȭ
		System.out.println("������ : �ʵ� k�� ���� " + k + "�� ������");
	}
	
	public static void main(String[] args) {
		Construct1 C;	// Construct1�� ã�Ƽ� �ֱ��޸𸮿� �����Ŵ
		C = new Construct1(); // �޸𸮿� �����س��� �ʵ� k�� 10���� �ʱ�ȭ
		System.out.println("������ ��ü�� ���� k�� ���� " + C.k + "�Դϴ�.");
	}
}
