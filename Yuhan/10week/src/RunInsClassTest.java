
public class RunInsClassTest {
	
	public static void main(String[] args) {
		InsClassTest ic1 = new InsClassTest();	// ��ü ���� 1
		InsClassTest ic2 = new InsClassTest();	// ��ü ���� 2
		
		ic1.ins = 20;
		ic2.ins = 50;
		
		ic1.stc = 300;	
		ic2.stc = 500;	// 300���� �Ҵ�Ǿ������� �����ϰ� �ֱ� ������ 500���� ���� �ٲ�
		
		// �̰� å�� �ִ� ���� ���
		// System.out.println("�ν��Ͻ� ������ ���� " + ic1.ins + "," + ic2.ins + "�Դϴ�.");
		// �ν��Ͻ� ������ ���� 20,50�Դϴ�.
		// System.out.println("Ŭ���� ������ ���� " + ic1.stc + "," + ic2.stc + "�Դϴ�.");
		// Ŭ���� ������ ���� 500,500�Դϴ�.
		// ���� �����ϰ� �ֱ� ������ -> static
		
		System.out.printf("ic1.ins = %d\n", ic1.ins);
		System.out.printf("ic2.ins = %d\n", ic2.ins);
		
		System.out.printf("ic1.stc = %d\n", ic1.stc);
		System.out.printf("ic2.stc = %d\n", ic2.stc);
		System.out.printf("InsClassTest.stc = %d\n", InsClassTest.stc);
	
	}
}
