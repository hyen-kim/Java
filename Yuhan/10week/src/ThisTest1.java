
public class ThisTest1 {
	private double n;
	
	// ���������� ���ؼ� ������ �̸����� �������� ����� �� �ִ�.
	// �ʵ�� �Ű�����(��������)�� ������ �̸��� ��� ���θ� �����ϱ� ���ؼ� �ʵ�տ� this Ű���带 ���δ�.
	public void power(double n) {
		this.n =  n * n;
		System.out.println(n + "�� �������� " + this.n + "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		ThisTest1 tt = new ThisTest1();
		tt.power(3.0);
	}
}
