
// �޼ҵ� �����ε� �ǽ�
public class MethodOverLoading {
// �ּ� ó���� ���� ctrl + /
	
	// �Ű� ������ 2���� Calc
	public int Calc(int n1, int n2) {
		return n1 * n2;
	}
	// �Ű������� int���� Calc�� �ּ�ó���ص� RunMethodOverLoading������ ������ �߻����� ����
	// �ֳ��ϸ� double���� �Ű������� ���� �޼ҵ尡 ȣ���� �ȴ�.
	// ���������� ���� �� �ִ� �޼ҵ尡 ���� ��쿡�� �ڵ����� ����ȯ���� �ؼ� double������ ȣ��

	// �Ű� ������ double�� 2���� Calc
	public double Calc(double n1, double n2) {
		return n1 * n2;
	}

	// �Ű� ������ 3���� Calc
	public int Calc(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

}
