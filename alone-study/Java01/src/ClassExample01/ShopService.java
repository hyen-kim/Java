package ClassExample01;
// �̱��� : �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ���
// Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ���.
// private ���� �����ڸ� �ٿ��ָ� �ȴ�.

public class ShopService {
	// ���� �ʵ�
	private static ShopService singleton = new ShopService();
	
	// ������
	private ShopService() {}
	
	// ���� �޼ҵ�
	static ShopService getInstance() {
		return singleton;
		
	}
}
