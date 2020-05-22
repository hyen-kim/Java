import java.util.Scanner;

public class RunBookStore {
	public static void main(String[] args) {
		int exit = 0; // ���Ḧ ���� ��
		Scanner sc = new Scanner(System.in); // �Է� ���� Scanner ��ü

		BookStore bs = new BookStore(); // ��ü ����
		bs.displayBooks(); // ó���� �ѹ��� display

		while (exit != 999) {

			// �г��� �Է¹޴� �κ�

			System.out.print(">> �г��� �Է��ϼ��� : ");
			int gradenu = sc.nextInt();

			// �г��� ����� �Է��ߴ��� Ȯ���ϴ� ���ǹ�
			if (gradenu == 1 || gradenu == 2 || gradenu == 3) {
				bs.setGrade(gradenu);
				// �г⿡ ���õ� å�� ������ ���
				bs.gradeBooks();

				// ���° å�� �����Ұ��� �Է��ϴ� �κ�
				System.out.print(">> ���° å�� �����Ұ��� �Է����ּ���.(0~7) : ");
				int bookcho = sc.nextInt();

				if (bookcho >= 0 && bookcho <= 7) {
					// ������ å�� ���� ��ȣ�� ����� �Է��ߴ���
					bs.saveBooks(bookcho);

					// ��������� ����� �κ�
					System.out.print(">> ��������� �����Ͽ��ּ���. (0: ī�����, 1: ���ݰ���) : ");
					int pay = sc.nextInt();

					if (pay == 0 || pay == 1) {
						bs.setPaymentmethod(pay);
						if (pay == 1) { // ���� ����� ���� �ΰ��
							System.out.print(">> �ݾ� �Է� : ");
							int money = sc.nextInt();
							int moneysuccess = bs.payMoney(money);
							if (moneysuccess == 0) { // ������ �����Ͽ��� ���
								bs.bookpayment = "���� ����";
							} else {
								bs.bookpayment = "���� ����";
							}
						} else { // ���� ����� ī�� �ΰ��
							bs.bookpayment = "���� ����";
							System.out.println(">> ������ �Ϸ�Ǿ����ϴ�.");
						}
					} else {
						System.out.printf(">> ���� ����� �߸� �Է��ϼ̽��ϴ�.\n>> �ٽ� �� �� �Է����ּ���.\n");
						continue;
					}

				} else {
					System.out.printf(">> �����ϰ��� �ϴ� å�� �������� �ʽ��ϴ�.\n>> Ȯ�� �� �ٽ� �� �� �Է����ּ���.\n");
					continue;
				}

			} else { // ����� �Է����� �ʾҴٸ� �ٽ� �Է� �ް�
				System.out.printf(">> �г��� �߸��Է��ϼ̽��ϴ�.\n>> �ٽ� �� �� �Է����ּ���.\n");
				continue;
			}
			// ���� ���� ����� ���ϴ��� ����� �κ�
			System.out.print(">> ���� ���� ����� ���Ͻʴϱ� ? (�� : 1, �ƴϿ� : �ƹ��ų�) : ");
			int show = sc.nextInt();
			if (show == 1) {
				bs.showInformation();
			}

			System.out.print(">> ���Ḧ ���Ͻʴϱ� ? (�� : 999, �ƴϿ� : �ƹ��ų� �Է�) : ");
			exit = sc.nextInt();

		}
		System.out.println("\n\n\n\n>> �̿����ּż� �����մϴ�.");
		sc.close();
	}

}
