package ClassExample01;

public class Member {
	
	//���Ǽ����� ȸ���� Member Ŭ������ �𵨸�.
	//ȸ���� �����ͷδ� �̸�, ���̵�, �н�����, ����
	//�����͵��� ������ Member Ŭ���� ����
	// �ʵ�
	String name;
	String id;
	String password;
	int age;
	

	// ���� �ۼ��� MemberŬ������ �����ڸ� �߰�
	// name�ʵ�� id�ʵ带 �ܺο��� ���� ������ �ʱ�ȭ
	// ������ 
	public Member(String name, String id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		Member member = new Member("ȫ�浿", "hong");
		System.out.println(member.id);
		System.out.println(member.name);
	}
}
