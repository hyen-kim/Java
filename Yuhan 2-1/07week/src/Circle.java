
public class Circle {
	// �ʵ�	=> �⺻������ private���� ����
	private double circum, area;
	private int r;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	
	// ���� �ѷ� : 2*pi*r
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	
	// ���� ���� : pi * r * r
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);
	}
	
}
