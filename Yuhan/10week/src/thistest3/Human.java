package thistest3;

public class Human {
	
	String name;
	double weight, height;
	
	// this()�� ���� Ŭ���������� �����ڸ� ȣ���ϴ� �뵵
	
	public Human(String name) {
		this.name = name;
		System.out.println("Human(String name) ȣ��");
	}

	public Human(String name, double weight) {
		this(name);
		this.weight = weight;
		System.out.println("Human(String name, double weight) ȣ��");
	}
	
	public Human(String name, double weight, double height) {
		this(name, weight);
		this.height = height;
		System.out.println("this(name, weight) ȣ��");
	}
}
