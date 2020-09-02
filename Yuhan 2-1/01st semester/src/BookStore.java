import java.util.Scanner;

public class BookStore {
	// �Ӽ�
	int grade; // �г�
	private String[][] bookType = { // �г⿡ ���� å�� �̸� ���� ����� ���ÿ� �ʱ�ȭ
			{ "HTML", "C���", "���α׷��ֳ�", "�����Ͻ���", "�����ͱ���", "�����ͺ��̽�����", "Python", "JavaScript" },
			{ "C++", "�������", "Linux", "Java", "DB����", "���ڰ���", "PHP", "JSP" },
			{ "C#", "ASP.NET", "�����ͺ��̽�", "Android", "����Ʈ�������", "��ǻ�ͳ�Ʈ��ũ", "JavaFramework", "��������" } };
	String book;	// ������ å�� ����
	private int[][] bookMoney = { // å�� ���� ���� ����� ���ÿ� �ʱ�ȭ
			{ 10400, 12000, 27000, 12000, 24000, 28000, 18000, 30000 },
			{ 22100, 22400, 13200, 15800, 17000, 27000, 13100, 27000 },
			{ 28000, 11000, 25400, 15600, 14000, 18200, 28000, 20000 } }; // å�� ���� ����
	int bookMoneyindex; // ������ å ����
	int paymentmethod; String pay;	// ������� 		
	String bookpayment = "";

	// ���
	public int getGrade() { // �г��� ���� ��ȯ
		return grade;
	}

	public void setGrade(int grade) { // �г��� ���� ����
		this.grade = grade;
	}

	public void setPaymentmethod(int paymentmethod) {
		this.paymentmethod = paymentmethod;
		payhan();
	}

	public String[][] getBookType() { // å�� ��ȯ
		return bookType;
	}

	public int[][] getBookMoney() { // å�� ���� ��ȯ
		return bookMoney;
	}

	public int getBookMoneyindex() {
		return bookMoneyindex;
	}

	public void setBookMoneyindex(int bookMoneyindex) {
		this.bookMoneyindex = bookMoneyindex;
	}
	
	public void setBookpayment(String bookpayment) {
		this.bookpayment = bookpayment;
	}

	public void displayBooks() { // �ϻ��� => �г� å ���ݿ� ���� �˷���
		System.out.println("=========================================================");
		System.out.println("���Ѵ��б� ITSOFTWORE �ϻ����� ���Ű� ȯ���մϴ�.");
		System.out.println("=========================================================");

		for (int i = 0; i < bookType.length; i++) {
			System.out.println();
			System.out.println("< " + (i + 1) + "�г�å >");
			for (int j = 0; j < bookMoney[i].length; j++) {
				System.out.printf("%d. %s å�� ������ %d�� �Դϴ�.\n",j, bookType[i][j], bookMoney[i][j]);
			}
		}
	}

	public void gradeBooks() { // ������ �г��� å�� ������ �˷���
		showTest();
		System.out.println(grade + "�г�å ");
		for (int i = 0; i < bookType[grade-1].length; i++) {
			System.out.printf("%d. %s å�� ������ %d�� �Դϴ�.\n",i, bookType[grade-1][i], bookMoney[grade-1][i]);
		}
	}
	
	// å�� ������ ����
	public void saveBooks(int bookcho) { 
		book = bookType[grade-1][bookcho];			// å�� ����
		bookMoneyindex = bookMoney[grade-1][bookcho];	// å ���� ����
		System.out.println(">> �����Ͻ� å�� " + book + "�̰� å�� ������ " + bookMoneyindex + "�� �Դϴ�.");
	}
	
	// ���� ����� ���� ���� �ѱ۷� ��ȯ
	public void payhan() {
		if(paymentmethod == 1) {
			pay = "���� ����";
		}else {
			pay = "ī�� ����";
		}
	}
	
	// �������� �����Ͽ��� ��� 
	public int payMoney(int money) {
		if(money > bookMoneyindex) {
			System.out.printf(">> ���Ű� �Ϸ�Ǿ����ϴ�.\n>> �ܵ��� %d�� �Դϴ�.\n", money-bookMoneyindex);
		}else if(money < bookMoneyindex) {
			System.out.println(">> �ܾ��� �����մϴ�.");
			return 0;
		}else {
			System.out.println(">> ���Ű� �Ϸ�Ǿ����ϴ�.");
		}
		return 1;
	}
	
	// ������ ����
	public void showInformation() {
		showTest();
		System.out.println(">> �г� : " + grade);
		System.out.println(">> ������ å : " + book);
		System.out.println(">> ������ ���� : " + bookMoneyindex + "��");
		System.out.println(">> ������� : " + pay);
		System.out.println(">> " + bookpayment);
	}
	
	public void showTest() {
		for (int i = 0; i < 50; ++i) {System.out.println();}
	}
}
