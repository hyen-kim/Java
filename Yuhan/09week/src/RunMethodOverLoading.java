
public class RunMethodOverLoading {
	public static void main(String[] args) {
		// ��ü ���� 
		MethodOverLoading mo = new MethodOverLoading();
		
		// �����ε� ���� (�Ű����� 2��, �Ű����� 3��)
		System.out.println("Calc(int n1, int n2) ȣ�� : " + mo.Calc(10, 20));
		System.out.println("Calc(double n1, double n2) ȣ�� : " + mo.Calc(10.1, 20.1));
		System.out.println("Calc(int n1, int n2, int n3) ȣ�� : " + mo.Calc(10, 20, 30));
	}
}
