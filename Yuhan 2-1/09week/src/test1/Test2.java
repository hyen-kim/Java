package test1;

public class Test2 {
	public static void main(String[] args) {
		AccessModifier3 am = new AccessModifier3();
		// AccessModifier3 Ŭ������ ���� ��Ű���� ���� ���
		System.out.println(am.a);	// public
		// System.out.println(am.b);	// private �����߻�
		System.out.println(am.c);	// protected
		System.out.println(am.d);	// default
		
	}
}
