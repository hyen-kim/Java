import java.util.Scanner;

public class RunTicketBox {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		TicketBox tb = new TicketBox();	// ��ü ����
		tb.displayMovies();
		System.out.print("* ��ȭ ���� : ");
		int titleNum = s.nextInt();
		tb.choiceMoive(titleNum);
		
		s.close();
	}
}
