package thistest2;

public class RunCircle {
	public static void showResult(Circle c) {
		System.out.println("==================================");
		System.out.println("* ���� ������ : " + c.getR() + "��");
		System.out.println("* ���� �ѷ� : " + c.getCircum() + "��");
		System.out.println("* ���� ���� : " + c.getArea() + "��");
		System.out.println("==================================");
	}
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(20);
		
		c1.calcCircum();
		c1.calcArea();
		c1.printCircle();
	
		c2.calcCircum();
		c2.calcArea();
		c2.printCircle();
		
		c3.calcCircum();
		c3.calcArea();
		c3.printCircle();
		
	}
}
