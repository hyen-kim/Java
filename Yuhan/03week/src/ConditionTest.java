
public class ConditionTest {
	public static void main(String[] args) {
		
		int age = 15;	// ������ age ����
		String msg;		// ���ڿ��� ���� �� �ִ� msg���� ���� 
		
		// ���׿����� 
		// msg = age >= 20 ? "����" : "û�ҳ�";

		// ���ǹ� (if~else)
		if (age >= 20) // age�� 20���� ũ�ų� ���� ���
			msg = "����";
		
		else			// ���� ������ ���� �ƴ� ��� 
			msg = "û�ҳ�";
		
		// ���� ���ǹ��� ���̵� �����̵� ��µǴ� ����
		System.out.println("����� " + msg + " �Դϴ�.");
	}

}
