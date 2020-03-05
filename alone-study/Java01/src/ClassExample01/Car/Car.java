package ClassExample01.Car;

public class Car {
	private String company;
	private String modelName;
	private int amount;//��ⷮ
	
	public Car() {
	}
	
	public Car(String company, String modelName, int amount) {
		super();//�θ� Ŭ������ �⺻������ ȣ��
		this.company = company;
		this.modelName = modelName;
		this.amount = amount;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company/*(�ʵ�)*/ = company;//�Ű�����
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	void start() {
		System.out.println(modelName + "�� �õ��� �Ǵ�.");
	}
	
	void drive() {
		System.out.println(modelName + "��(��) �����ϴ�.");
	}
	
	void stop() {
		System.out.println(modelName + "��(��) ���ߴ�.");
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", modelName=" + modelName + ", amount=" + amount + "]";
	}
}
