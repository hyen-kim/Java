
public class RunWeapon2 {
	public static void main(String[] args) {
		// Weapon2 w = new Weapon2();
		// �߻�ȭ Ŭ�����̱� ������ new �����ڷ� ��ü ���� �Ұ���
		
		Soldier s = new Soldier();
		Tank t = new Tank();
		Fighter f = new Fighter();
		
		s.fire();
		s.walk();
		s.test();
		
		t.fire();
		t.forward();
		t.test();
		
		f.fire();
		f.fly();
		f.test();
	}
}
