package ClassExample01;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memverService = new MemberService();

		boolean result = MemberService.login("hong", "12345");
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memverService.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}