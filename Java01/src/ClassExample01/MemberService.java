package ClassExample01;

public class MemberService {
	// login() �޼ҵ�� logout() �޼ҵ� ����
	// login() �޼ҵ� : id�� password�� �Ű������� ����
	// logout() �޼ҵ� : id�� �Ű������� ����
	String id;
	String password;

	static boolean login(String id, String password) {
		// id�� hong�̰� password�� 12345�� ��쿡�� true��ȯ
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}

	static void logout(String id) {
		System.out.println(id + "���� �α׾ƿ��Ǽ̽��ϴ�.");
	}
}
